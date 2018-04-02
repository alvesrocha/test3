package org.medical.data.config;

import org.medical.data.service.UserServiceCustom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.authentication.dao.ReflectionSaltSource;
import org.springframework.security.authentication.encoding.PasswordEncoder;
import org.springframework.security.authentication.encoding.ShaPasswordEncoder;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.oauth2.provider.token.TokenStore;
import org.springframework.security.oauth2.provider.token.store.InMemoryTokenStore;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class SecurityConfig {
	

	@Autowired
	private UserServiceCustom userDetailsService;
	
	@Autowired
    public void globalUserDetails(AuthenticationManagerBuilder auth) throws Exception {
		ReflectionSaltSource rss = new ReflectionSaltSource();
		DaoAuthenticationProvider provider = new DaoAuthenticationProvider();
		rss.setUserPropertyToUse("salt");
		provider.setSaltSource(rss);
		provider.setUserDetailsService(userDetailsService);
		provider.setPasswordEncoder(passwordEncoder());
        auth.authenticationProvider(provider);
    }
	
	@Bean
	public PasswordEncoder passwordEncoder() {
		return new ShaPasswordEncoder(256);
	}
	
    @Bean
    public TokenStore tokenStore() {
        return new InMemoryTokenStore();
    }

}
