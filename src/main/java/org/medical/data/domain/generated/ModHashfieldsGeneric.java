/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.medical.data.domain.generated;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Table;

/**
 *
 * @author alvesdarocha
 */
@MappedSuperclass
@Table(name = "mod_hashfields")
public class ModHashfieldsGeneric implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "hashid")
    private Integer hashid;
    @Column(name = "deptid")
    private Integer deptid;
    @Column(name = "clinicid")
    private Integer clinicid;
    @Basic(optional = false)
    @Column(name = "hashcolumnname")
    private String hashcolumnname;
    @Basic(optional = false)
    @Column(name = "hashtablename")
    private String hashtablename;
    @Basic(optional = false)
    @Column(name = "hashtableprimarykeyname")
    private String hashtableprimarykeyname;
    @Basic(optional = false)
    @Column(name = "hashtablefields")
    private String hashtablefields;
    @Basic(optional = false)
    @Column(name = "hashmandatoryfieldids")
    private String hashmandatoryfieldids;
    @Column(name = "hashadditionalfieldids")
    private String hashadditionalfieldids;
    @Basic(optional = false)
    @Column(name = "usesalt")
    private String usesalt;
    @Basic(optional = false)
    @Column(name = "recreate")
    private String recreate;
    @Basic(optional = false)
    @Column(name = "activated")
    private String activated;

    public ModHashfieldsGeneric() {
    }

    public ModHashfieldsGeneric(Integer hashid) {
        this.hashid = hashid;
    }

    public ModHashfieldsGeneric(Integer hashid, String hashcolumnname, String hashtablename, String hashtableprimarykeyname, String hashtablefields, String hashmandatoryfieldids, String usesalt, String recreate, String activated) {
        this.hashid = hashid;
        this.hashcolumnname = hashcolumnname;
        this.hashtablename = hashtablename;
        this.hashtableprimarykeyname = hashtableprimarykeyname;
        this.hashtablefields = hashtablefields;
        this.hashmandatoryfieldids = hashmandatoryfieldids;
        this.usesalt = usesalt;
        this.recreate = recreate;
        this.activated = activated;
    }

    public Integer getHashid() {
        return hashid;
    }

    public void setHashid(Integer hashid) {
        this.hashid = hashid;
    }

    public Integer getDeptid() {
        return deptid;
    }

    public void setDeptid(Integer deptid) {
        this.deptid = deptid;
    }

    public Integer getClinicid() {
        return clinicid;
    }

    public void setClinicid(Integer clinicid) {
        this.clinicid = clinicid;
    }

    public String getHashcolumnname() {
        return hashcolumnname;
    }

    public void setHashcolumnname(String hashcolumnname) {
        this.hashcolumnname = hashcolumnname;
    }

    public String getHashtablename() {
        return hashtablename;
    }

    public void setHashtablename(String hashtablename) {
        this.hashtablename = hashtablename;
    }

    public String getHashtableprimarykeyname() {
        return hashtableprimarykeyname;
    }

    public void setHashtableprimarykeyname(String hashtableprimarykeyname) {
        this.hashtableprimarykeyname = hashtableprimarykeyname;
    }

    public String getHashtablefields() {
        return hashtablefields;
    }

    public void setHashtablefields(String hashtablefields) {
        this.hashtablefields = hashtablefields;
    }

    public String getHashmandatoryfieldids() {
        return hashmandatoryfieldids;
    }

    public void setHashmandatoryfieldids(String hashmandatoryfieldids) {
        this.hashmandatoryfieldids = hashmandatoryfieldids;
    }

    public String getHashadditionalfieldids() {
        return hashadditionalfieldids;
    }

    public void setHashadditionalfieldids(String hashadditionalfieldids) {
        this.hashadditionalfieldids = hashadditionalfieldids;
    }

    public String getUsesalt() {
        return usesalt;
    }

    public void setUsesalt(String usesalt) {
        this.usesalt = usesalt;
    }

    public String getRecreate() {
        return recreate;
    }

    public void setRecreate(String recreate) {
        this.recreate = recreate;
    }

    public String getActivated() {
        return activated;
    }

    public void setActivated(String activated) {
        this.activated = activated;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (hashid != null ? hashid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ModHashfieldsGeneric)) {
            return false;
        }
        ModHashfieldsGeneric other = (ModHashfieldsGeneric) object;
        if ((this.hashid == null && other.hashid != null) || (this.hashid != null && !this.hashid.equals(other.hashid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "test.ModHashfields[ hashid=" + hashid + " ]";
    }
    
}
