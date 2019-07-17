package com.tw.apistackbase.core;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jdk.nashorn.internal.ir.annotations.Ignore;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employees {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long employId;


    private String name;

    public Employees() {
    }


    public Long getEmployId() {
        return employId;
    }

    public void setEmployId(Long employId) {
        this.employId = employId;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
