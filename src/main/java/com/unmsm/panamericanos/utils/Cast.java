/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unmsm.panamericanos.utils;

import com.unmsm.panamericanos.model.User;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author diego
 */
public class Cast {
    public static Map<String, Object> mapUser(User user) {
        Map<String, Object> documentMap = new HashMap<>();
        documentMap.put("email", user.getEmail());
        documentMap.put("password", user.getPassword());
        documentMap.put("name", user.getName());
        documentMap.put("last_name", user.getLast_name());
        documentMap.put("photo", user.getPhoto());
        return documentMap;
    }
}
