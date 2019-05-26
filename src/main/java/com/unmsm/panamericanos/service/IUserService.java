/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unmsm.panamericanos.service;

import com.unmsm.panamericanos.model.User;

/**
 *
 * @author diego
 */
public interface IUserService {
    public void insertUser(User user);
    public User login(String email, String password);
}
