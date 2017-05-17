package com.okean.service.serviceImpl;

import com.okean.dao.UserDao;
import com.okean.entity.User;
import com.okean.service.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Admin on 5/12/2017.
 */
@Service
public class UserServicesImpl implements UserServices{
    @Autowired
    private UserDao userDao;
    @Override
    public void persist(User user) {
        userDao.persist(user);
    }

    @Override
    public void update(User user) {

    }

    @Override
    public User findById(int id) {
        User user =  userDao.findById(id);
        return user;
    }

    @Override
    public List<User> getAll() {
        List<User> listUsers =  userDao.findAll();
        return listUsers;
    }

    @Override
    public void delete(User user) {
        userDao.delete(user);
    }

    @Override
    public void deleteByID(int userID) {
        userDao.deleteByID(userID);
    }
}
