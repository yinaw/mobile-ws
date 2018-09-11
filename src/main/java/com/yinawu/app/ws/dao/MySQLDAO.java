package com.yinawu.app.ws.dao;

import com.yinawu.app.ws.entity.UserEntity;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

@Repository
public class MySQLDAO implements DAO {

//    @Autowired
//    private SessionFactory sessionFactory;

    @PersistenceContext
    public EntityManager entityManager;
//    public MySQLDAO() {
//
//    }
//
//    public MySQLDAO(SessionFactory sessionFactory) {
//        this.sessionFactory = sessionFactory;
//    }

    @Transactional
    public UserEntity saveOrUpdate(UserEntity userEntity) {
        Query query  = entityManager.createQuery("select user from User user where user.userId=:userId");
        query.setParameter("userId", 1);
        return (UserEntity)query.getSingleResult();
    }

}


