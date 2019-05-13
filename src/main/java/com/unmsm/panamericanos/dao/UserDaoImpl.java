/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unmsm.panamericanos.dao;

import com.mongodb.BasicDBObject;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.unmsm.panamericanos.connection.Connection;
import com.unmsm.panamericanos.dao.read.IReadUser;
import com.unmsm.panamericanos.dao.repository.IRepositoryUser;
import java.util.ArrayList;
import java.util.List;
import com.unmsm.panamericanos.model.User;
import com.unmsm.panamericanos.utils.cast.CastUser;
import com.unmsm.panamericanos.utils.cast.ICast;
import java.util.Iterator;
import org.bson.Document;
/**
 *
 * @author diego
 */
public class UserDaoImpl implements IRepositoryUser, IReadUser {
    private static String db_collection_name = "user";
    private ICast<User> cast = new CastUser();
    
    @Override
    public void insert(User user) {
        MongoCollection col = Connection.getConnection().getCollection(db_collection_name);
        col.insertOne(cast.getMap(user));
    }
    
    @Override
    public User login(String email, String password) {
        User user = null;
        MongoCollection col = Connection.getConnection().getCollection(db_collection_name);
 
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
