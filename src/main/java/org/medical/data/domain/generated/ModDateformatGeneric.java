/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.medical.data.domain.generated;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.medical.data.domain.source.*;

/**
 *
 * @author alvesdarocha
 */
@MappedSuperclass
@Table(name = "mod_dateformat")
public class ModDateformatGeneric implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "dateformatid")
    private Integer dateformatid;
    @Basic(optional = false)
    @Column(name = "dateformat")
    private String dateformat;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "dateformatid")
    private List<ModCountry> modCountryList;

    public ModDateformatGeneric() {
    }

    public ModDateformatGeneric(Integer dateformatid) {
        this.dateformatid = dateformatid;
    }

    public ModDateformatGeneric(Integer dateformatid, String dateformat) {
        this.dateformatid = dateformatid;
        this.dateformat = dateformat;
    }

    public Integer getDateformatid() {
        return dateformatid;
    }

    public void setDateformatid(Integer dateformatid) {
        this.dateformatid = dateformatid;
    }

    public String getDateformat() {
        return dateformat;
    }

    public void setDateformat(String dateformat) {
        this.dateformat = dateformat;
    }

    public List<ModCountry> getModCountryList() {
        return modCountryList;
    }

    public void setModCountryList(List<ModCountry> modCountryList) {
        this.modCountryList = modCountryList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (dateformatid != null ? dateformatid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ModDateformatGeneric)) {
            return false;
        }
        ModDateformatGeneric other = (ModDateformatGeneric) object;
        if ((this.dateformatid == null && other.dateformatid != null) || (this.dateformatid != null && !this.dateformatid.equals(other.dateformatid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "test.ModDateformat[ dateformatid=" + dateformatid + " ]";
    }
    
}
