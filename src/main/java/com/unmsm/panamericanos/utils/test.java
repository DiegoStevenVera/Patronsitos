/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unmsm.panamericanos.utils;

import com.unmsm.panamericanos.model.User;
import com.unmsm.panamericanos.utils.cast.CastUser;
import com.unmsm.panamericanos.utils.cast.ICast;
import java.util.Map;

/**
 *
 * @author diego
 */
public class test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ICast cast = new CastUser();
        Map<String, Object> map= cast.getMap(new User("asdfasdf", "diego@gmail.com", "12345"));
        System.out.println(map);
    }
    
}
