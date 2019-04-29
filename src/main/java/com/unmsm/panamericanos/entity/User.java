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
public class User extends Person{
    private String id;
    private String email;
    private String password;

    public User(String id, String email, String password, String name, String last_name, String photo) {
        super(name, last_name, photo);
        this.id = id;
        this.email = email;
        this.password = password;
    }
    
    public User(String email, String password, String name, String last_name, String photo) {
        super(name, last_name, photo);
        this.email = email;
        this.password = password;
    }

    public User(String id, String email, String password) {
        super("","","");
        this.id = id;
        this.email = email;
        this.password = password;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" + "id=" + id + ", email=" + email + ", password=" + password + '}';
    }

}
