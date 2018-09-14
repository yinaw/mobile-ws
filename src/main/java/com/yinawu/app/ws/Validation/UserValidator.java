package com.yinawu.app.ws.Validation;

import com.yinawu.app.ws.shared.dto.UserDTO;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

/**
 * Created by ywu on 7/28/18.
 */
@Component
public class UserValidator extends Validator<UserDTO> {

    public String validate(UserDTO userDto) {
        if (StringUtils.isEmpty(userDto.getFirstName())
                || StringUtils.isEmpty(userDto.getLastName())) {
            return "Missing Required Field";
        }
        return null;
    }

}
