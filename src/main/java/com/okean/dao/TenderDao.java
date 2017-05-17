package com.okean.dao;

import com.okean.entity.Tender;
import com.okean.entity.TenderStatus;

import java.util.List;

/**
 * Created by Admin on 5/5/2017.
 */
public interface TenderDao {

    public void persist(Tender tender);

    public void update(Tender tender);

    public Tender findById(int id);

    public List<Tender> findByProposal(Tender tender);

    public List<Tender> findByStatus(TenderStatus tenderStatus);

    public List<Tender> findAll();

    public void delete(Tender tender);
}
