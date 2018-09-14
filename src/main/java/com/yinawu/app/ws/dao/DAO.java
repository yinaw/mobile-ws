package com.yinawu.app.ws.dao;

import com.yinawu.app.ws.entity.UserEntity;
import com.yinawu.app.ws.shared.dto.UserDTO;


public interface DAO<T> {

    public void merge (T entity);
    public void save (T entity);
    public T find(long id);

}
