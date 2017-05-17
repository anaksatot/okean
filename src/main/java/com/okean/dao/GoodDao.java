package com.okean.dao;

import com.okean.entity.Good;

import java.util.List;

/**
 * Created by Admin on 5/5/2017.
 */
public interface GoodDao {

    public void persist(Good good);

    public void update(Good good);

    public Good findById(int id);

    public List<Good> findAll();

    public boolean delete(Good good);

    public boolean deleteByID(int goodID);

}
