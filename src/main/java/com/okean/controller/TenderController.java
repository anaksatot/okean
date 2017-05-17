package com.okean.controller;

import com.okean.entity.Tender;
import com.okean.service.TenderServices;
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
        List<Tender> tenders = tenderService.getAll();
        return new ResponseEntity<List<Tender>>(tenders, HttpStatus.OK);
    }

    @RequestMapping(value = "/getTenderByID", method = RequestMethod.GET)
    public ResponseEntity<Tender> getTenderByID(Integer goodID) {
        // goodID = 14; for test
        Tender good = tenderService.findById(goodID);
        return new ResponseEntity<Tender>(good, HttpStatus.OK);
    }

    @RequestMapping(value="/createTender")
    public String createTender(String desription) {
        try {
            desription = "najpershyj";
            Tender tender = new Tender(desription);
            tenderService.persist(tender);
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
