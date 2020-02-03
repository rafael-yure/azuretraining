package com.mastercard.azuretraining.model;

import javax.persistence.*;

@Entity
@Table(name = "Hero", schema = "mcapp")
public class Hero {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String name;
    private String superpower;

    public Hero() {
    }

    public Hero(String name, String superpower) {
        this.name = name;
        this.superpower = superpower;
    }

    public Hero(long Id, String name, String superpower) {
        this.id = id;
        this.name = name;
        this.superpower = superpower;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSuperpower() {
        return superpower;
    }

    public void setSuperpower(String superpower) {
        this.superpower = superpower;
    }
}
