package com.blackneptune.service;

import com.blackneptune.entity.User;

import java.util.List;

/**
 * Created by Admin on 5/12/2017.
 */
public interface UserServices {
    public void create(User user);

    public void update(User user);

    public User findById(int id);

    public List<User> getAll();

    public void delete(User user);

    public void deleteByID(int userID);
}
