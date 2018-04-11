package org.medical.data.domain.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
@JsonAutoDetect(fieldVisibility = Visibility.ANY)
public class LazyUserDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Getter
	@Setter
	private long userid;
	@Getter
	@Setter
	private String userloginid;
	@Getter
	@Setter
	private String firstname;
	@Getter
	@Setter
	private String lastname;
	@Getter
	@Setter
	private String email;
	@Getter
	@Setter
	private Date lastlogin;
	@Getter
	@Setter
	private Date expiration;
	@Getter
	@Setter
	private boolean locked;
	@Getter
	@Setter
	private Date lockdate;
	@Getter
	@Setter
	private String lockreason;
	@Getter
	@Setter
	private Date dateofbirth;
	@Getter
	@Setter
	private Date firstlogin;
	@Getter
	@Setter
	private Date created;
	@Getter
	@Setter
	private Date lastfailedlogin;
	@Getter
	@Setter
	private String langid;
	@Getter
	@Setter
	private boolean withProfiles;
	@Getter
	@Setter
	private List<FieldDataDTO> userFieldDataList;
}
