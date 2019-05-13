/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unmsm.panamericanos.utils.cast;

import com.unmsm.panamericanos.model.Post;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author diego
 */
public class CastPost implements ICast<Post>{

    @Override
    public Map<String, Object> getMap(Post o) {
        Map<String, Object> documentMap = new HashMap<>();
        documentMap.put("comment", o.getComment());
        documentMap.put("likes", o.getLikes());
        documentMap.put("User", o.getUser().getId());
        return documentMap;
    }
    
}
