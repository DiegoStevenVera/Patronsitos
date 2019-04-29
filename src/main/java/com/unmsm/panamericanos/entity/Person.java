/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unmsm.panamericanos.entity;

/**
 *
 * @author diego
 */
public class Person {
    private String name;
    private String last_name;
    private String photo;

    public Person(String name, String last_name, String photo) {
        this.name = name;
        this.last_name = last_name;
        this.photo = photo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", last_name=" + last_name + ", photo=" + photo + '}';
    }
    
}
