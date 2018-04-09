package org.medical.data.domain.dto;

import java.io.Serializable;
import java.util.Date;

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
public class FieldDataDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Getter
	@Setter
	private long fieldid;
	@Getter
	@Setter
	private String charvalue;
	@Getter
	@Setter
	private Date datevalue;
	@Getter
	@Setter
	private FieldDTO field;
}
