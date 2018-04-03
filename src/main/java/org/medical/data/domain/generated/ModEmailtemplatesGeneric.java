/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.medical.data.domain.generated;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.MappedSuperclass;
import javax.persistence.Table;

import org.medical.data.domain.source.ModEmailtemplatesPK;

/**
 *
 * @author alvesdarocha
 */
@MappedSuperclass
@Table(name = "mod_emailtemplates")
public class ModEmailtemplatesGeneric implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ModEmailtemplatesPK modEmailtemplatesPK;
    @Basic(optional = false)
    @Column(name = "template",columnDefinition = "text")
    private String template;
    @Column(name = "subject")
    private String subject;
    @Column(name = "type")
    private String type;
    @Column(name = "headerimage")
    private String headerimage;
    @Column(name = "headerimageleft")
    private String headerimageleft;
    @Column(name = "headerimageright")
    private String headerimageright;
    @Column(name = "footerimage")
    private String footerimage;
    @Column(name = "footerimageleft")
    private String footerimageleft;
    @Column(name = "footerimageright")
    private String footerimageright;

    public ModEmailtemplatesGeneric() {
    }

    public ModEmailtemplatesGeneric(ModEmailtemplatesPK modEmailtemplatesPK) {
        this.modEmailtemplatesPK = modEmailtemplatesPK;
    }

    public ModEmailtemplatesGeneric(ModEmailtemplatesPK modEmailtemplatesPK, String template) {
        this.modEmailtemplatesPK = modEmailtemplatesPK;
        this.template = template;
    }

    public ModEmailtemplatesGeneric(String templatename, String langid) {
        this.modEmailtemplatesPK = new ModEmailtemplatesPK(templatename, langid);
    }

    public ModEmailtemplatesPK getModEmailtemplatesPK() {
        return modEmailtemplatesPK;
    }

    public void setModEmailtemplatesPK(ModEmailtemplatesPK modEmailtemplatesPK) {
        this.modEmailtemplatesPK = modEmailtemplatesPK;
    }

    public String getTemplate() {
        return template;
    }

    public void setTemplate(String template) {
        this.template = template;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getHeaderimage() {
        return headerimage;
    }

    public void setHeaderimage(String headerimage) {
        this.headerimage = headerimage;
    }

    public String getHeaderimageleft() {
        return headerimageleft;
    }

    public void setHeaderimageleft(String headerimageleft) {
        this.headerimageleft = headerimageleft;
    }

    public String getHeaderimageright() {
        return headerimageright;
    }

    public void setHeaderimageright(String headerimageright) {
        this.headerimageright = headerimageright;
    }

    public String getFooterimage() {
        return footerimage;
    }

    public void setFooterimage(String footerimage) {
        this.footerimage = footerimage;
    }

    public String getFooterimageleft() {
        return footerimageleft;
    }

    public void setFooterimageleft(String footerimageleft) {
        this.footerimageleft = footerimageleft;
    }

    public String getFooterimageright() {
        return footerimageright;
    }

    public void setFooterimageright(String footerimageright) {
        this.footerimageright = footerimageright;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (modEmailtemplatesPK != null ? modEmailtemplatesPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ModEmailtemplatesGeneric)) {
            return false;
        }
        ModEmailtemplatesGeneric other = (ModEmailtemplatesGeneric) object;
        if ((this.modEmailtemplatesPK == null && other.modEmailtemplatesPK != null) || (this.modEmailtemplatesPK != null && !this.modEmailtemplatesPK.equals(other.modEmailtemplatesPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "test.ModEmailtemplates[ modEmailtemplatesPK=" + modEmailtemplatesPK + " ]";
    }
    
}
