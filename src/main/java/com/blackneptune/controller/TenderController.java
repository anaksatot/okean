package com.blackneptune.controller;

import com.blackneptune.entity.Tender;
import com.blackneptune.service.TenderServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Admin on 5/13/2017.
 */
@RestController
@RequestMapping(value = "/tender")
public class TenderController {
    @Autowired
    private TenderServices tenderService;

    @RequestMapping(value = "/getAllTenders", method = RequestMethod.GET)
    public ResponseEntity<List<Tender>> getAllTenders() {
        return new ResponseEntity<List<Tender>>(tenderService.getAll(), HttpStatus.OK);
    }

    @RequestMapping(value = "/getTenderByID", method = RequestMethod.GET)
    public ResponseEntity<Tender> getTenderByID(Integer goodID) {
        return new ResponseEntity<Tender>(tenderService.findById(goodID), HttpStatus.OK);
    }

    @RequestMapping(value="/createTender")
    public String createTender(String desription) {
        try {
            desription = "najpershyj";
            tenderService.create(new Tender(desription));
        }
        catch (Exception ex) {
            return "Error creating the good: " + ex.toString();
        }
        return "Good succesfully created!";
    }

    @RequestMapping(value="/deleteTenderByID")
    public String deleteGoodByID(Integer goodID) {
        try {
            tenderService.deleteByID(goodID);
        }
        catch (Exception ex) {
            return "Error deleting the good by ID: " + ex.toString();
        }
        return "Good succesfully deleting by ID!";
    }
}
