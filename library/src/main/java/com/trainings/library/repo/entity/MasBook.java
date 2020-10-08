package com.trainings.library.repo.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 *
 * @author Dharma
 */
@Entity
@Table(name = "mas_book")
public class MasBook implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "title")
    private String title;
    @Basic(optional = false)
    @Column(name = "code")
    private String code;
    @Basic(optional = false)
    @Column(name = "author_id")
    private int authorId;
    @Basic(optional = false)
    @Column(name = "volume")
    private String volume;
    @Basic(optional = false)
    @Column(name = "publish_id")
    private int publishId;
    @Basic(optional = false)
    @Column(name = "uid")
    private int uid;
    @Column(name = "ent_date_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date entDateTime;
    @Basic(optional = false)
    @Column(name = "is_blocked")
    private boolean isBlocked;
    @Column(name = "blocked_date_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date blockedDateTime;
    @Basic(optional = false)
    @Column(name = "blocked_uid")
    private int blockedUid;

    public MasBook() {
    }

    public MasBook(Integer id) {
        this.id = id;
    }

    public MasBook(Integer id, String title, String code, int authorId, String volume, int publishId, int uid, boolean isBlocked, int blockedUid) {
        this.id = id;
        this.title = title;
        this.code = code;
        this.authorId = authorId;
        this.volume = volume;
        this.publishId = publishId;
        this.uid = uid;
        this.isBlocked = isBlocked;
        this.blockedUid = blockedUid;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getAuthorId() {
        return authorId;
    }

    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    public int getPublishId() {
        return publishId;
    }

    public void setPublishId(int publishId) {
        this.publishId = publishId;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public Date getEntDateTime() {
        return entDateTime;
    }

    public void setEntDateTime(Date entDateTime) {
        this.entDateTime = entDateTime;
    }

    public boolean getIsBlocked() {
        return isBlocked;
    }

    public void setIsBlocked(boolean isBlocked) {
        this.isBlocked = isBlocked;
    }

    public Date getBlockedDateTime() {
        return blockedDateTime;
    }

    public void setBlockedDateTime(Date blockedDateTime) {
        this.blockedDateTime = blockedDateTime;
    }

    public int getBlockedUid() {
        return blockedUid;
    }

    public void setBlockedUid(int blockedUid) {
        this.blockedUid = blockedUid;
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
        if (!(object instanceof MasBook)) {
            return false;
        }
        MasBook other = (MasBook) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.mavenproject3.MasBook[ id=" + id + " ]";
    }
    
}
