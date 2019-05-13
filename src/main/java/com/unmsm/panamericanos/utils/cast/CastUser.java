/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unmsm.panamericanos.utils.cast;

import com.unmsm.panamericanos.model.User;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author diego
 */
public class CastUser implements ICast<User> {
    
    @Override
    public Map<String, Object> getMap(User o) {
        Map<String, Object> documentMap = new HashMap<>();
        documentMap.put("email", o.getEmail());
        documentMap.put("password", o.getPassword());
        documentMap.put("name", o.getName());
        documentMap.put("last_name", o.getLast_name());
        documentMap.put("photo", o.getPhoto());
        return documentMap;
    }
}
