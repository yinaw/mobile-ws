package com.yinawu.app.ws.dao;

import com.yinawu.app.ws.entity.UserEntity;
import com.yinawu.app.ws.shared.dto.UserDTO;


public interface DAO {

    public UserEntity saveOrUpdate(UserEntity userEntity);

}
