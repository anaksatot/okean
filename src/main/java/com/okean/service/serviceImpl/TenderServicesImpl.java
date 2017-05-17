package com.okean.service.serviceImpl;

import com.okean.dao.TenderDao;
import com.okean.entity.Tender;
import com.okean.service.TenderServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Admin on 5/13/2017.
 */
@Service
public class TenderServicesImpl implements TenderServices {
    @Autowired
    private TenderDao tenderDao;
    @Override
    public void persist(Tender tender) {
        tenderDao.persist(tender);
    }

    @Override
    public void update(Tender tender) {

    }

    @Override
    public Tender findById(int id) {
        return null;
    }

    @Override
    public List<Tender> getAll() {
        return tenderDao.findAll();
    }

    @Override
    public void delete(Tender tender) {

    }

    @Override
    public void deleteByID(int goodID) {

    }
}
