package com.blackneptune.service;

import com.blackneptune.entity.Tender;

import java.util.List;

/**
 * Created by Admin on 5/13/2017.
 */
public interface TenderServices {
    public void create(Tender tender);

    public void update(Tender tender);

    public Tender findById(int id);

    public List<Tender> getAll();

    public void delete(Tender tender);

    public void deleteByID(int goodID);
}
