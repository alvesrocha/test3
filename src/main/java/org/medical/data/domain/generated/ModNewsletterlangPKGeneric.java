/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.medical.data.domain.generated;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

/**
 *
 * @author alvesdarocha
 */
@MappedSuperclass
public class ModNewsletterlangPKGeneric implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Basic(optional = false)
    @Column(name = "newsletterid")
    private int newsletterid;
    @Basic(optional = false)
    @Column(name = "langused")
    private String langused;

    public ModNewsletterlangPKGeneric() {
    }

    public ModNewsletterlangPKGeneric(int newsletterid, String langused) {
        this.newsletterid = newsletterid;
        this.langused = langused;
    }

    public int getNewsletterid() {
        return newsletterid;
    }

    public void setNewsletterid(int newsletterid) {
        this.newsletterid = newsletterid;
    }

    public String getLangused() {
        return langused;
    }

    public void setLangused(String langused) {
        this.langused = langused;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) newsletterid;
        hash += (langused != null ? langused.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ModNewsletterlangPKGeneric)) {
            return false;
        }
        ModNewsletterlangPKGeneric other = (ModNewsletterlangPKGeneric) object;
        if (this.newsletterid != other.newsletterid) {
            return false;
        }
        if ((this.langused == null && other.langused != null) || (this.langused != null && !this.langused.equals(other.langused))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "test.ModNewsletterlangPK[ newsletterid=" + newsletterid + ", langused=" + langused + " ]";
    }
    
}
