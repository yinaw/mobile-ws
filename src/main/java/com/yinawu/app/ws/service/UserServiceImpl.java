package com.yinawu.app.ws.service;

import com.yinawu.app.ws.Validation.UserValidator;
import com.yinawu.app.ws.Validation.Validator;
import com.yinawu.app.ws.dao.MySQLDAO;
import com.yinawu.app.ws.entity.UserEntity;
import com.yinawu.app.ws.shared.dto.UserDTO;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * Created by ywu on 7/22/18.
 */
@Component
@AllArgsConstructor
@NoArgsConstructor
public class UserServiceImpl extends AbstractServiceImpl<UserDTO> implements UserService  {

    @Autowired
    public UserValidator validator;

    @Autowired
    public MySQLDAO mySQLDAO;

    public UserDTO create(UserDTO userDTO) {

        UserDTO result = new UserDTO();

        // Validate the required fields

        validate(userDTO);

        UserEntity userEntity = new UserEntity();
        userEntity.setFirstName("Yina");

        mySQLDAO.saveOrUpdate(userEntity);
        //validator.validate(userDTO);

        // Check if user already exists

        // Generate secure public user id

        // Generate salt

        // Generate secure password

        // Record data into a database


        // Return back the user profile

        return result;
    }

    public String validate(UserDTO userDTO) {
        return super.validate(userDTO);
    }
}
