package com.okean.service.serviceImpl;

import java.util.ArrayList;
import java.util.List;
import com.okean.dao.GoodDao;
import com.okean.entity.Good;
import com.okean.service.GoodServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * Created by Admin on 5/5/2017.
 */
@Service
public class GoodServiceImpl implements GoodServices{

    @Autowired
    private GoodDao goodDao;

    public GoodServiceImpl() {
    }

    public GoodServiceImpl(GoodDao goodDao) {

        this.goodDao = goodDao;
    }

    @Override
    public void persist(Good good) {
        goodDao.persist(good);
    }

    @Override
    public void update(Good good) {

    }

    @Override
    public Good findById(int id) {
        Good good =  goodDao.findById(id);
        return good;
    }

    @Override
    public List<Good> getAll() {
        List<Good> listGood =  goodDao.findAll();
        return listGood;
    }

    @Override
    public void delete(Good good) {
        goodDao.delete(good);
    }

    @Override
    public void deleteByID(int goodID) {
        goodDao.deleteByID(goodID);
    }
}
