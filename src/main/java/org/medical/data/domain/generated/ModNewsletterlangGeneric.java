/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.medical.data.domain.generated;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;
import javax.persistence.Table;

import org.medical.data.domain.source.ModLang;
import org.medical.data.domain.source.ModNewsletter;
import org.medical.data.domain.source.ModNewsletterlangPK;

/**
 *
 * @author alvesdarocha
 */
@MappedSuperclass
@Table(name = "mod_newsletterlang")
public class ModNewsletterlangGeneric implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ModNewsletterlangPK modNewsletterlangPK;
    @Column(name = "newslettertitle")
    private String newslettertitle;
    @Column(name = "newsletter")
    private String newsletter;
    @JoinColumn(name = "langused", referencedColumnName = "langid", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private ModLang modLang;
    @JoinColumn(name = "newsletterid", referencedColumnName = "newsletterid", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private ModNewsletter modNewsletter;

    public ModNewsletterlangGeneric() {
    }

    public ModNewsletterlangGeneric(ModNewsletterlangPK modNewsletterlangPK) {
        this.modNewsletterlangPK = modNewsletterlangPK;
    }

    public ModNewsletterlangGeneric(int newsletterid, String langused) {
        this.modNewsletterlangPK = new ModNewsletterlangPK(newsletterid, langused);
    }

    public ModNewsletterlangPK getModNewsletterlangPK() {
        return modNewsletterlangPK;
    }

    public void setModNewsletterlangPK(ModNewsletterlangPK modNewsletterlangPK) {
        this.modNewsletterlangPK = modNewsletterlangPK;
    }

    public String getNewslettertitle() {
        return newslettertitle;
    }

    public void setNewslettertitle(String newslettertitle) {
        this.newslettertitle = newslettertitle;
    }

    public String getNewsletter() {
        return newsletter;
    }

    public void setNewsletter(String newsletter) {
        this.newsletter = newsletter;
    }

    public ModLang getModLang() {
        return modLang;
    }

    public void setModLang(ModLang modLang) {
        this.modLang = modLang;
    }

    public ModNewsletter getModNewsletter() {
        return modNewsletter;
    }

    public void setModNewsletter(ModNewsletter modNewsletter) {
        this.modNewsletter = modNewsletter;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (modNewsletterlangPK != null ? modNewsletterlangPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ModNewsletterlangGeneric)) {
            return false;
        }
        ModNewsletterlangGeneric other = (ModNewsletterlangGeneric) object;
        if ((this.modNewsletterlangPK == null && other.modNewsletterlangPK != null) || (this.modNewsletterlangPK != null && !this.modNewsletterlangPK.equals(other.modNewsletterlangPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "test.ModNewsletterlang[ modNewsletterlangPK=" + modNewsletterlangPK + " ]";
    }
    
}
