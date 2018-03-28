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
@Table(name = "mod_profile")
public class ModProfileGeneric implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "PROFILEID")
    private Integer profileid;
    @Column(name = "PROFILELEVEL")
    private Integer profilelevel;
    @Column(name = "HIDDEN")
    private String hidden;
    @Column(name = "PERMANENT")
    private String permanent;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "modProfile")
    private List<ModUserprofile> modUserprofileList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "modProfile")
    private List<ModProfilefunction> modProfilefunctionList;

    public ModProfileGeneric() {
    }

    public ModProfileGeneric(Integer profileid) {
        this.profileid = profileid;
    }

    public Integer getProfileid() {
        return profileid;
    }

    public void setProfileid(Integer profileid) {
        this.profileid = profileid;
    }

    public Integer getProfilelevel() {
        return profilelevel;
    }

    public void setProfilelevel(Integer profilelevel) {
        this.profilelevel = profilelevel;
    }

    public String getHidden() {
        return hidden;
    }

    public void setHidden(String hidden) {
        this.hidden = hidden;
    }

    public String getPermanent() {
        return permanent;
    }

    public void setPermanent(String permanent) {
        this.permanent = permanent;
    }

    public List<ModUserprofile> getModUserprofileList() {
        return modUserprofileList;
    }

    public void setModUserprofileList(List<ModUserprofile> modUserprofileList) {
        this.modUserprofileList = modUserprofileList;
    }

    public List<ModProfilefunction> getModProfilefunctionList() {
        return modProfilefunctionList;
    }

    public void setModProfilefunctionList(List<ModProfilefunction> modProfilefunctionList) {
        this.modProfilefunctionList = modProfilefunctionList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (profileid != null ? profileid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ModProfileGeneric)) {
            return false;
        }
        ModProfileGeneric other = (ModProfileGeneric) object;
        if ((this.profileid == null && other.profileid != null) || (this.profileid != null && !this.profileid.equals(other.profileid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "test.ModProfile[ profileid=" + profileid + " ]";
    }
    
}
