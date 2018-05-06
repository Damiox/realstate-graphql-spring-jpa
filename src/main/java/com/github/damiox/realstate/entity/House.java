package com.github.damiox.realstate.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * A House is describing a type of property that belongs to a neighbourhood.
 *
 * @author dnardelli
 */
@Entity
@Table(name = "app_house")
public class House extends AbstractEntity {

    @Column(name = "beds", nullable = false)
    private Integer beds;

    @Column(name = "baths", nullable = false)
    private Integer baths;

    @Column(name = "sqft", nullable = false)
    private Integer squareFeet;

    @Column(name = "age", nullable = false)
    private Integer age;

    @ManyToOne
    @JoinColumn(name = "neighbourhoodid", nullable = false, updatable = false)
    private Neighbourhood neighbourhood;

    public Integer getBeds() {
        return beds;
    }

    public void setBeds(Integer beds) {
        this.beds = beds;
    }

    public Integer getBaths() {
        return baths;
    }

    public void setBaths(Integer baths) {
        this.baths = baths;
    }

    public Integer getSquareFeet() {
        return squareFeet;
    }

    public void setSquareFeet(Integer squareFeet) {
        this.squareFeet = squareFeet;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Neighbourhood getNeighbourhood() {
        return neighbourhood;
    }

    public void setNeighbourhood(Neighbourhood neighbourhood) {
        this.neighbourhood = neighbourhood;
    }

}
