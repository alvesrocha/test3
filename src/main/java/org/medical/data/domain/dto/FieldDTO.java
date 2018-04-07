package org.medical.data.domain.dto;

import java.io.Serializable;

public class FieldDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private long fieldid;
    private int lengthmin;
    private int lengthmax;
    private String fieldtype;
    private String additionalchar;
    private boolean usetime;
    private String validationexp;
    private int fieldposition;
    private String fixedfieldtype;
    private boolean activated;
    private boolean editable;
    private boolean searchmask;
    private boolean allowvalidationdeactivation;
    private int groupnumber;
    private int columnspan;
    private boolean readonly;
    private boolean autocomplete;
    private String fieldname;
    
	public long getFieldid() {
		return fieldid;
	}
	public void setFieldid(long fieldid) {
		this.fieldid = fieldid;
	}
	public int getLengthmin() {
		return lengthmin;
	}
	public void setLengthmin(int lengthmin) {
		this.lengthmin = lengthmin;
	}
	public int getLengthmax() {
		return lengthmax;
	}
	public void setLengthmax(int lengthmax) {
		this.lengthmax = lengthmax;
	}
	public String getFieldtype() {
		return fieldtype;
	}
	public void setFieldtype(String fieldtype) {
		this.fieldtype = fieldtype;
	}
	public String getAdditionalchar() {
		return additionalchar;
	}
	public void setAdditionalchar(String additionalchar) {
		this.additionalchar = additionalchar;
	}
	public boolean isUsetime() {
		return usetime;
	}
	public void setUsetime(boolean usetime) {
		this.usetime = usetime;
	}
	public String getValidationexp() {
		return validationexp;
	}
	public void setValidationexp(String validationexp) {
		this.validationexp = validationexp;
	}
	public int getFieldposition() {
		return fieldposition;
	}
	public void setFieldposition(int fieldposition) {
		this.fieldposition = fieldposition;
	}
	public String getFixedfieldtype() {
		return fixedfieldtype;
	}
	public void setFixedfieldtype(String fixedfieldtype) {
		this.fixedfieldtype = fixedfieldtype;
	}
	public boolean isActivated() {
		return activated;
	}
	public void setActivated(boolean activated) {
		this.activated = activated;
	}
	public boolean isEditable() {
		return editable;
	}
	public void setEditable(boolean editable) {
		this.editable = editable;
	}
	public boolean isSearchmask() {
		return searchmask;
	}
	public void setSearchmask(boolean searchmask) {
		this.searchmask = searchmask;
	}
	public boolean isAllowvalidationdeactivation() {
		return allowvalidationdeactivation;
	}
	public void setAllowvalidationdeactivation(boolean allowvalidationdeactivation) {
		this.allowvalidationdeactivation = allowvalidationdeactivation;
	}
	public int getGroupnumber() {
		return groupnumber;
	}
	public void setGroupnumber(int groupnumber) {
		this.groupnumber = groupnumber;
	}
	public int getColumnspan() {
		return columnspan;
	}
	public void setColumnspan(int columnspan) {
		this.columnspan = columnspan;
	}
	public boolean isReadonly() {
		return readonly;
	}
	public void setReadonly(boolean readonly) {
		this.readonly = readonly;
	}
	public boolean isAutocomplete() {
		return autocomplete;
	}
	public void setAutocomplete(boolean autocomplete) {
		this.autocomplete = autocomplete;
	}
	public String getFieldname() {
		return fieldname;
	}
	public void setFieldname(String fieldname) {
		this.fieldname = fieldname;
	}
}
