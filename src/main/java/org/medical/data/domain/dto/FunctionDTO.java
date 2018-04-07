package org.medical.data.domain.dto;

import java.io.Serializable;

public class FunctionDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

    private long functionid;
    private String internalfunctionname;
    private String scope;
    
	public long getFunctionid() {
		return functionid;
	}
	public void setFunctionid(long functionid) {
		this.functionid = functionid;
	}
	public String getInternalfunctionname() {
		return internalfunctionname;
	}
	public void setInternalfunctionname(String internalfunctionname) {
		this.internalfunctionname = internalfunctionname;
	}
	public String getScope() {
		return scope;
	}
	public void setScope(String scope) {
		this.scope = scope;
	}

}
