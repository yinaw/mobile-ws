package com.yinawu.app.ws.utils;

import com.sun.org.apache.xalan.internal.xsltc.runtime.ErrorMessages;
import com.yinawu.app.ws.shared.dto.UserDTO;

/**
 * Created by ywu on 7/22/18.
 */
public class UserProfileUtils {

    public void validateRequiredFields(UserDTO userDto) throws Exception {
        if (userDto.getFirstName() == null
                || userDto.getFirstName().isEmpty()
                || userDto.getLastName() == null
                || userDto.getLastName().isEmpty()
                || userDto.getEmail() == null
                || userDto.getEmail().isEmpty()
                || userDto.getPassword() == null
                || userDto.getPassword().isEmpty()) {
            throw new Exception("Missing Field");
        }
    }
}
