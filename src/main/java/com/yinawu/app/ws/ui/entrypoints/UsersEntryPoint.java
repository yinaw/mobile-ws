package com.yinawu.app.ws.ui.entrypoints;

import com.yinawu.app.ws.service.UserService;
import com.yinawu.app.ws.service.UserServiceImpl;
import com.yinawu.app.ws.shared.dto.UserDTO;
import com.yinawu.app.ws.ui.model.CreateUserRequestModel;
import com.yinawu.app.ws.ui.model.UserProfileRest;
import jdk.nashorn.internal.objects.annotations.Setter;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

/**
 * Created by ywu on 7/19/18.
 */
@Path("/users")
@Component
public class UsersEntryPoint {

    @Autowired
    UserService userService;

    @Autowired
    UserServiceImpl userServiceImp;

    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces({MediaType.APPLICATION_JSON})
    public UserProfileRest createUser(CreateUserRequestModel requestObject) {

        UserProfileRest userProfileRest = new UserProfileRest();
        userProfileRest.setFirstName("Yina");
        return userProfileRest;
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces({ MediaType.APPLICATION_JSON} )
    public UserProfileRest createUser2(CreateUserRequestModel requestObject) {
        UserProfileRest returnValue = new UserProfileRest();

        // Prepare UserDTO
        UserDTO userDto = new UserDTO();
        BeanUtils.copyProperties(requestObject, userDto);

        userService.create(userDto);


        return returnValue;
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public UserProfileRest getUser() {

        UserProfileRest userProfileRest = new UserProfileRest();
        userProfileRest.setFirstName("Yina");
        return userProfileRest;
    }
}
