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
public class StaffDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Getter
	@Setter
	private long staffid;
	@Getter
	@Setter
    private String externaluserid;
	@Getter
	@Setter
    private String phone1;
	@Getter
	@Setter
    private String phone2;
	@Getter
	@Setter
    private String academicrank;
	@Getter
	@Setter
    private String title;
	@Getter
	@Setter
    private String activated;
	@Getter
	@Setter
    private long deptid;
	@Getter
	@Setter
    private List<ProfileDTO> profileList;
	@Getter
	@Setter
    private List<FieldDataDTO> staffFieldDataList;
}
