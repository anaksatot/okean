package com.blackneptune.controller;

import com.blackneptune.entity.Good;
import com.blackneptune.service.GoodServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/good")
public class GoodController {
    @Autowired
    private GoodServices goodService;

    @RequestMapping(value = "/getAllGoods", method = RequestMethod.GET)
    public ResponseEntity<List<Good>> getAllGoods() {
        return new ResponseEntity<List<Good>>(goodService.getAll(), HttpStatus.OK);
    }

    @RequestMapping(value = "/getGoodByID", method = RequestMethod.GET)
    public ResponseEntity<Good> getGoodByID(Integer goodID) {
        return new ResponseEntity<Good>(goodService.findById(goodID), HttpStatus.OK);
    }

    @RequestMapping(value="/createGood")
    public String createGood(String name) {
        try {
            goodService.create(new Good(name));
        }
        catch (Exception ex) {
            return "Error creating the good: " + ex.toString();
        }
        return "Good succesfully created!";
    }

    @RequestMapping(value="/deleteGoodByID")
    public String deleteGoodByID(Integer goodID) {
        try {
            goodService.deleteByID(goodID);
        }
        catch (Exception ex) {
            return "Error deleting the good by ID: " + ex.toString();
        }
        return "Good succesfully deleting by ID!";
    }

}