/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unmsm.panamericanos.connection;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

/**
 *
 * @author diego
 */
public class Connection {
    private static Connection connection = new Connection();
    private static String db_name = "patrones";
    private static int port_no = 27017;
    private static String url = "192.168.1.37";
    
    private Connection() {}
    
    public MongoCollection getCollection(String db_collection_name) {
        MongoClient mongoClntObj = new MongoClient(url, port_no);
        MongoDatabase db = mongoClntObj.getDatabase(db_name);
        MongoCollection col = db.getCollection(db_collection_name);
        return col;
    }
    
    public static Connection getConnection() {
        return connection;
    }
}
