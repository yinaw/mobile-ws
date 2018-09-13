package com.yinawu.app.ws.dao;

import com.yinawu.app.ws.entity.UserEntity;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Repository
public class MySQLDAO implements DAO {

    @PersistenceContext
    public EntityManager entityManager;


    @Transactional
    public UserEntity saveOrUpdate(UserEntity userEntity) {
        Query query  = entityManager.createQuery("SELECT user FROM UserEntity user WHERE user.id=:userId");
        query.setParameter("userId", 1);
        List userEntityList = query.getResultList();

        return (UserEntity)userEntityList.get(0);
    }

}


