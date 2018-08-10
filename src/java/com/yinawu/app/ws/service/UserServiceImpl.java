package com.yinawu.app.ws.service;

import com.yinawu.app.ws.Validation.Validator;
import com.yinawu.app.ws.shared.dto.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by ywu on 7/22/18.
 */
public class UserServiceImpl extends AbstractServiceImpl<UserDTO> {

    @Autowired
    Validator<UserDTO> validator;

    public UserDTO create(UserDTO userDTO) {

        UserDTO result = new UserDTO();

        // Validate the required fields

        validator.validate(userDTO);

        // Check if user already exists

        // Generate secure public user id

        // Generate salt

        // Generate secure password

        // Record data into a database


        // Return back the user profile

        return result;
    }
}
