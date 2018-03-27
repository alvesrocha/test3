package org.medical.data.domain.source;

import org.medical.data.domain.generated.*;
import javax.persistence.*;


@Embeddable
public class ModNewsletterlangPK extends ModNewsletterlangPKGeneric {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ModNewsletterlangPK() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ModNewsletterlangPK(int newsletterid, String langused) {
		super(newsletterid, langused);
		// TODO Auto-generated constructor stub
	}

}