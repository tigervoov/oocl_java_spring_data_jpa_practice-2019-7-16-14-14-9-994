package com.tw.apistackbase.core;

import javax.persistence.CascadeType;
import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Profile {


    @Id
    private String certId;

    private Long registeredCapital;

    public Profile() {
    }

    public String getCertId() {
        return certId;
    }

    public void setCertId(String certId) {
        this.certId = certId;
    }

    public Long getRegisteredCapital() {
        return registeredCapital;
    }

    public void setRegisteredCapital(Long registeredCapital) {
        this.registeredCapital = registeredCapital;
    }

    public Profile(String certId, Long registeredCapital) {
        this.certId = certId;
        this.registeredCapital = registeredCapital;
    }
}
