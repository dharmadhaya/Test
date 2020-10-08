package com.trainings.library.repo.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

/**
 *
 * @author Dharma
 */
@Entity
@Table(name = "mas_author")
public class MasAuthor implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @Column(name = "uid")
    private int uid;
    @Basic(optional = false)
    @Column(name = "ent_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date entDate;
    @Basic(optional = false)
    @Column(name = "is_blocked")
    private int isBlocked;
    @Basic(optional = false)
    @Column(name = "blocked_uid")
    private int blockedUid;
    @Column(name = "blocked_date")
    private String blockedDate;

    public MasAuthor() {
    }

    public MasAuthor(Integer id) {
        this.id = id;
    }

    public MasAuthor(Integer id, String name, int uid, Date entDate, int isBlocked, int blockedUid) {
        this.id = id;
        this.name = name;
        this.uid = uid;
        this.entDate = entDate;
        this.isBlocked = isBlocked;
        this.blockedUid = blockedUid;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public Date getEntDate() {
        return entDate;
    }

    public void setEntDate(Date entDate) {
        this.entDate = entDate;
    }

    public int getIsBlocked() {
        return isBlocked;
    }

    public void setIsBlocked(int isBlocked) {
        this.isBlocked = isBlocked;
    }

    public int getBlockedUid() {
        return blockedUid;
    }

    public void setBlockedUid(int blockedUid) {
        this.blockedUid = blockedUid;
    }

    public String getBlockedDate() {
        return blockedDate;
    }

    public void setBlockedDate(String blockedDate) {
        this.blockedDate = blockedDate;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MasAuthor)) {
            return false;
        }
        MasAuthor other = (MasAuthor) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.mavenproject3.MasClassification[ id=" + id + " ]";
    }
    
}
