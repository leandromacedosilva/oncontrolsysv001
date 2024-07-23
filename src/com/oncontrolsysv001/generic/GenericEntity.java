package com.oncontrolsysv001.generic;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author leandro
 */
public abstract class GenericEntity implements Serializable {
    public Boolean active;
    @Temporal(TemporalType.TIMESTAMP)
    public Date dateRegister;
    @Temporal(TemporalType.TIMESTAMP)
    public Date dateUpdate;
    
    public GenericEntity() {
        active = Boolean.TRUE;
        dateRegister = new Date();
        dateUpdate = new Date();
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public Date getDateRegister() {
        return dateRegister;
    }

    public void setDateRegister(Date dateRegister) {
        this.dateRegister = dateRegister;
    }

    public Date getDateUpdate() {
        return dateUpdate;
    }

    public void setDateUpdate(Date dateUpdate) {
        this.dateUpdate = dateUpdate;
    }
    
    
}
