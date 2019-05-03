/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unmsm.panamericanos.model;

/**
 *
 * @author diego
 */
public class Post {
    private String comment;
    private int likes;
    private User user;

    public Post(String comment, int likes, User user) {
        this.comment = comment;
        this.likes = likes;
        this.user = user;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Post{" + "comment=" + comment + ", likes=" + likes + ", user=" + user + '}';
    }
    
}
