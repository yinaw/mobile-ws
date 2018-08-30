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
    @Getter
    @Setter
    private String email;
    @Getter
    @Setter
    private String password;
    @Getter
    @Setter
    private String salt;
    @Getter
    @Setter
    private String encryptedPassword;
    @Getter
    @Setter
    private String userId;
    @Getter
    @Setter
    private String token;
    @Getter
    @Setter
    private String emailVerificationToken;
    @Getter
    @Setter
    private Boolean emailVerificationStatus;
}
