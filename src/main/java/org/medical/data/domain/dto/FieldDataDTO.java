package org.medical.data.domain.dto;

import java.io.Serializable;
import java.util.Date;

public class FieldDataDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

    private long fieldid;
    private String charvalue;
    private Date datevalue;
    private FieldDTO field;
    
	public long getFieldid() {
		return fieldid;
	}
	public void setFieldid(long fieldid) {
		this.fieldid = fieldid;
	}
	public String getCharvalue() {
		return charvalue;
	}
	public void setCharvalue(String charvalue) {
		this.charvalue = charvalue;
	}
	public Date getDatevalue() {
		return datevalue;
	}
	public void setDatevalue(Date datevalue) {
		this.datevalue = datevalue;
	}
	public FieldDTO getField() {
		return field;
	}
	public void setField(FieldDTO field) {
		this.field = field;
	}
    
}
