/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unmsm.panamericanos.service.impl;

import com.unmsm.panamericanos.dao.IRepositoryUser;
import com.unmsm.panamericanos.dao.impl.UserDaoImpl;
import com.unmsm.panamericanos.model.User;
import com.unmsm.panamericanos.service.IUserService;

/**
 *
 * @author diego
 */
public class UserService implements IUserService {

    private IRepositoryUser repositoryUser;
    
    public UserService() {
        repositoryUser = new UserDaoImpl();
    }
    
    @Override
    public void insertUser(User user) {
        repositoryUser.insert(user);
    }

    @Override
    public User login(String email, String password) {
        return repositoryUser.login(email, password);
    }
    
}
