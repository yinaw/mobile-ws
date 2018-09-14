package com.yinawu.app.ws.shared.dto;

import com.yinawu.app.ws.Validation.Custom;
import com.yinawu.app.ws.Validation.UserValidator;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * Created by ywu on 7/21/18.
 */

@Custom(validator = UserValidator.class)
public class UserDTO implements Serializable {

    @Getter
    @Setter
    private static final long serialVersionUID = 1L;
    @Getter
    @Setter
    private long id;
    @Getter
    @Setter
    private String firstName;
    @Getter
    @Setter
    private String lastName;
}
