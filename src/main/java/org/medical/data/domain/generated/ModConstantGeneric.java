package org.medical.data.domain.generated;

import java.io.Serializable;
import javax.persistence.*;
import javax.persistence.MappedSuperclass;
import org.medical.data.domain.source.*;


/**
 * The persistent class for the mod_constant database table.
 * 
 */
@MappedSuperclass
public class ModConstantGeneric implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="constant_key", unique=true, nullable=false, length=40)
	private String constantKey;

	@Column(name="constant_value", nullable=false, length=255)
	private String constantValue;

	public ModConstantGeneric() {
	}

	public String getConstantKey() {
		return this.constantKey;
	}

	public void setConstantKey(String constantKey) {
		this.constantKey = constantKey;
	}

	public String getConstantValue() {
		return this.constantValue;
	}

	public void setConstantValue(String constantValue) {
		this.constantValue = constantValue;
	}

}
