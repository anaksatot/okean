package com.okean.dao.daoImpl;

import com.okean.dao.TenderDao;
import com.okean.entity.Tender;
import com.okean.entity.TenderStatus;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by Admin on 5/5/2017.
 */
@Transactional
@Repository
public class TenderDaoImpl implements TenderDao {
    EntityManager entityManager;

    public TenderDaoImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public void persist(Tender tender) {
        entityManager.persist(tender);
    }

    public void update(Tender tender) {

    }

    public Tender findById(int tenderId) {
        return entityManager.find(Tender.class, tenderId);
    }

    public List<Tender> findByProposal(Tender tender) {
        return null;
    }

    public List<Tender> findByStatus(TenderStatus tenderStatus) {
        return null;
    }

    public List<Tender> findAll() {
        String hql = "FROM Tender as tender";
        return (List<Tender>) entityManager.createQuery(hql).getResultList();
    }

    public void delete(Tender tender) {

    }
}
