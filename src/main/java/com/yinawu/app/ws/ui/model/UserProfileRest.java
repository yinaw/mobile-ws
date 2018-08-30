package com.yinawu.app.ws.ui.model;

import lombok.Getter;
import lombok.Setter;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by ywu on 7/20/18.
 */
@XmlRootElement
public class UserProfileRest {
    @Getter
    @Setter
    private String userId;
    @Getter
    @Setter
    private String firstName;
    @Getter
    @Setter
    private String lastName;
    @Getter
    @Setter
    private String href;

}
