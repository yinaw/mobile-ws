package com.yinawu.app.ws.ui.entrypoints;

import com.yinawu.app.ws.service.UserService;
import com.yinawu.app.ws.service.UserServiceImpl;
import com.yinawu.app.ws.shared.dto.UserDTO;
import com.yinawu.app.ws.ui.model.CreateUserRequestModel;
import com.yinawu.app.ws.ui.model.UserProfileRest;
import org.springframework.beans.BeanUtils;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Created by ywu on 7/19/18.
 */
@Path("/users")
public class UsersEntryPoint {

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public UserProfileRest createUser(CreateUserRequestModel requestObject) {

        UserProfileRest returnValue = new UserProfileRest();

        UserDTO userDTO = new UserDTO();

        BeanUtils.copyProperties(requestObject, userDTO);

        UserService userService = new UserServiceImpl();

        UserDTO createdUserProfile = userService.createUser(userDTO);

        BeanUtils.copyProperties(createdUserProfile, returnValue);

        return returnValue;
    }
}
