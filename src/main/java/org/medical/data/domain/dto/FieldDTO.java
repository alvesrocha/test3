package org.medical.data.domain.dto;

import java.io.Serializable;

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
public class FieldDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Getter
	@Setter
	private long fieldid;
	@Getter
	@Setter
    private int lengthmin;
	@Getter
	@Setter
    private int lengthmax;
	@Getter
	@Setter
    private String fieldtype;
	@Getter
	@Setter
    private String additionalchar;
	@Getter
	@Setter
    private boolean usetime;
	@Getter
	@Setter
    private String validationexp;
	@Getter
	@Setter
    private int fieldposition;
	@Getter
	@Setter
    private String fixedfieldtype;
	@Getter
	@Setter
    private boolean activated;
	@Getter
	@Setter
    private boolean editable;
	@Getter
	@Setter
    private boolean searchmask;
	@Getter
	@Setter
    private boolean allowvalidationdeactivation;
	@Getter
	@Setter
    private int groupnumber;
	@Getter
	@Setter
    private int columnspan;
	@Getter
	@Setter
    private boolean readonly;
	@Getter
	@Setter
    private boolean autocomplete;
	@Getter
	@Setter
    private String fieldname;
}
