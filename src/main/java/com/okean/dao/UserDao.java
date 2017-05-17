package com.okean.dao;

import com.okean.entity.Role;
import com.okean.entity.User;

import java.util.List;

/**
 * Created by Admin on 5/5/2017.
 */
public interface UserDao {

    public void persist(User user);

    public void update(User user);

    public User findById(int id);

    public List<User> findByRole(Role role);

    public List<User> findAll();

    public boolean delete(User user);

    public boolean deleteByID(int userID);
}
