package com.yinawu.app.ws.Validation;

import com.yinawu.app.ws.shared.dto.UserDTO;
import org.springframework.stereotype.Component;

/**
 * Created by ywu on 7/28/18.
 */
@Component
public class UserValidator extends Validator<UserDTO> {

    public String validate(UserDTO userDto) {
        if (userDto.getFirstName() == null
                || userDto.getFirstName().isEmpty()
                || userDto.getLastName() == null
                || userDto.getLastName().isEmpty()
                || userDto.getEmail() == null
                || userDto.getEmail().isEmpty()
                || userDto.getPassword() == null
                || userDto.getPassword().isEmpty()) {
            return "Missing Required Field";
        }
        return null;
    }

}
