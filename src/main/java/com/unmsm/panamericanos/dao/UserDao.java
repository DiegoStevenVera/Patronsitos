/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unmsm.panamericanos.dao;

import com.mongodb.BasicDBObject;
import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import java.util.ArrayList;
import java.util.List;
import com.unmsm.panamericanos.entity.User;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.bson.Document;
/**
 *
 * @author diego
 */
public class UserDao {
    private static String db_name = "patrones", db_collection_name = "user";
    
    private static MongoClient getConnection() {
        int port_no = 27017;
        String url = "localhost";
 
        MongoClient mongoClntObj = new MongoClient(url, port_no);
        return mongoClntObj;
    }
    
    private static Map<String, Object> mapUser(User user) {
        Map<String, Object> documentMap = new HashMap<String, Object>();
        documentMap.put("email", user.getEmail());
        documentMap.put("password", user.getPassword());
        documentMap.put("name", user.getName());
        documentMap.put("last_name", user.getLast_name());
        documentMap.put("photo", user.getPhoto());
        return documentMap;
    }
    
    public static void insert(User user) {
        MongoDatabase db = getConnection().getDatabase(db_name);
        MongoCollection col = db.getCollection(db_collection_name);
        
        col.insertOne(mapUser(user));
    }
    
    public static User login(String email, String password) {
        User user = null;
        MongoDatabase db = getConnection().getDatabase(db_name);
        MongoCollection col = db.getCollection(db_collection_name);
 
        List obj = new ArrayList();
        obj.add(new BasicDBObject("email", email));
        obj.add(new BasicDBObject("password", password));
 
        BasicDBObject whereQuery = new BasicDBObject();
        whereQuery.put("$and", obj);
        System.out.println("Sql query is?= " + whereQuery.toString());
 
        FindIterable cursor = col.find(whereQuery);
        for (Iterator it = cursor.iterator(); it.hasNext();) {
            Document doc = (Document) it.next();
            Object id = doc.get("_id");
            user = new User(id.toString(),
                            (String) doc.get("email"),
                            (String) doc.get("password"));
            System.out.println("Found?= " + doc);
        }
        return user;
    }
}
