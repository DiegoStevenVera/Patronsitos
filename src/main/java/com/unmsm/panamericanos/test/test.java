/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unmsm.panamericanos.test;

import com.unmsm.panamericanos.dao.UserDao;
import com.unmsm.panamericanos.entity.User;

/**
 *
 * @author diego
 */
public class test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        UserDao udao = new UserDao();
        udao.insert(new User("dvera1096@gmail.com", "12345", "diego", "vera", "photo.jpg"));
    }
    
}
