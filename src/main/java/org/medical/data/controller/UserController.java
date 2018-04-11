package org.medical.data.controller;

import java.security.Principal;
import java.util.List;
import java.util.stream.Collectors;

import org.medical.data.domain.dto.LazyUserDTO;
import org.medical.data.domain.dto.UserDTO;
import org.medical.data.domain.source.ModUser;
import org.medical.data.service.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	private UserService userService;
	
	@Autowired
    private ModelMapper modelMapper;
	
	@RequestMapping("/user")
	@ResponseBody
	public Principal user(Principal user) {
		return user;
	}
	
	@RequestMapping(value="/list", method = RequestMethod.GET)
    public List<LazyUserDTO> listUser(){
		List<ModUser> listUser = userService.findAll();
		System.out.println(listUser);
		return listUser.stream().map(u -> modelMapper.map(u, LazyUserDTO.class)).collect(Collectors.toList());
    }
	
	@RequestMapping(value="/lazyuser/{id}", method = RequestMethod.GET)
    public LazyUserDTO getLazyUser(@PathVariable(value = "id") Long id){
		ModUser modUser = userService.findByUserid(id);
		return modelMapper.map(modUser, LazyUserDTO.class);
    }
	
	@RequestMapping(value="/user/{id}", method = RequestMethod.GET)
    public UserDTO getUser(@PathVariable(value = "id") Long id){
		ModUser modUser = userService.findByUserid(id);
		return modelMapper.map(modUser, UserDTO.class);
    }

    @RequestMapping(value = "/user", method = RequestMethod.POST)
    public ModUser create(@RequestBody ModUser user){
        return userService.save(user);
    }

    @RequestMapping(value = "/user/{id}", method = RequestMethod.DELETE)
    public String delete(@PathVariable(value = "id") Long id){
        userService.delete(id);
        return "success";
    }
}
