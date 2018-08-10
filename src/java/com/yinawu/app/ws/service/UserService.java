package com.yinawu.app.ws.service;

import com.yinawu.app.ws.shared.dto.UserDTO;

/**
 * Created by ywu on 7/22/18.
 */
public interface UserService extends AbstractService<UserDTO> {

    public UserDTO create(UserDTO userDTO);
}
