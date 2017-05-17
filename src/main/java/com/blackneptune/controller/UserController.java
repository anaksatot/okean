package com.blackneptune.controller;

import com.blackneptune.entity.User;
import com.blackneptune.service.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Admin on 5/12/2017.
 */
@RestController
@RequestMapping(value = "/user")
public class UserController {
    @Autowired
    private UserServices userService;

    @RequestMapping(value="/createUser")
    public String createUser(String name,String password) {
        try {
            userService.create(new User(name,password));
        }
        catch (Exception ex) {
            return "Error creating the user: " + ex.toString();
        }
        return "User succesfully created!";
    }

    @RequestMapping(value = "/getAllUsers", method = RequestMethod.GET)
    public ResponseEntity<List<User>> getAllGoods() {
        return new ResponseEntity<List<User>>(userService.getAll(), HttpStatus.OK);
    }

    @RequestMapping(value = "/getUserByID", method = RequestMethod.GET)
    public ResponseEntity<User> getGoodByID(Integer goodID) {
        User good = userService.findById(goodID);
        return new ResponseEntity<User>(good, HttpStatus.OK);
    }

    @RequestMapping(value="/deleteUserByID")
    public String deleteGoodByID(Integer userID) {
        try {
            userService.deleteByID(userID);
        }
        catch (Exception ex) {
            return "Error deleting the user by ID: " + ex.toString();
        }
        return "User succesfully deleting by ID!";
    }

}
