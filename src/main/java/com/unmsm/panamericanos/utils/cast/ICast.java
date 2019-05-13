/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unmsm.panamericanos.utils.cast;

import java.util.Map;

/**
 *
 * @author diego
 * @param <T>
 */
public interface ICast<T> {
    public Map<String, Object> getMap(T o);
}
