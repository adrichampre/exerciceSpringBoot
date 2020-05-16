package com.exercice.exo.model;

import javax.persistence.*;
import java.util.Date;

@javax.persistence.Entity
public class Device extends Entity{

    private String uuid;
    private Date LastEmit;
    private Long countEmit;
    private Boolean disableTag;
    private String addressIp;
    @ManyToOne
    @JoinColumn(name = "id_company")
    private Company company;

    public Device() {
    }

    public Device(Long id, Date createdAt, String uuid, Date lastEmit, Long countEmit, Boolean disableTag, String addressIp, Company company) {
        super(id, createdAt);
        this.uuid = uuid;
        this.LastEmit = lastEmit;
        this.countEmit = countEmit;
        this.disableTag = disableTag;
        this.addressIp = addressIp;
        this.company = company;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public Date getLastEmit() {
        return LastEmit;
    }

    public void setLastEmit(Date lastEmit) {
        LastEmit = lastEmit;
    }

    public Long getCountEmit() {
        return countEmit;
    }

    public void setCountEmit(Long countEmit) {
        this.countEmit = countEmit;
    }

    public Boolean getDisableTag() {
        return disableTag;
    }

    public void setDisableTag(Boolean disableTag) {
        this.disableTag = disableTag;
    }

    public String getAddressIp() {
        return addressIp;
    }

    public void setAddressIp(String addressIp) {
        this.addressIp = addressIp;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return "Device{" +
                "uuid='" + uuid + '\'' +
                ", LastEmit=" + LastEmit +
                ", countEmit=" + countEmit +
                ", disableTag=" + disableTag +
                ", addressIp='" + addressIp + '\'' +
                ", company=" + company +
                '}';
    }
}
