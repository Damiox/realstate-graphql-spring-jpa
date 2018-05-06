package com.github.damiox.realstate.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * A Neighbourhood is describing a location in a city.
 *
 * @author dnardelli
 */
@Entity
@Table(name = "app_neighbourhood")
public class Neighbourhood extends AbstractEntity {

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "city", nullable = false)
    private String city;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
