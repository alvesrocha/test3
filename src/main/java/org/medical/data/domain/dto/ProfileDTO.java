package org.medical.data.domain.dto;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@JsonAutoDetect(fieldVisibility = Visibility.ANY)
public class ProfileDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Getter
	@Setter
	private long profileid;
	@Getter
	@Setter
	private int profilelevel;
	@Getter
	@Setter
	private boolean	 hidden;
	@Getter
	@Setter
	private boolean permanent;
	@Getter
	@Setter
	private boolean enabled;
	@Getter
	@Setter
	private boolean valid;
	@Getter
	@Setter
	private List<FunctionDTO> functionList;
}
