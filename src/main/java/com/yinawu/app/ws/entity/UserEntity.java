package com.yinawu.app.ws.entity;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import javax.persistence.*;


@Entity( name="Users")
@Table(name="users")
public class UserEntity implements Serializable {
    @Id
    @Getter
    @Setter
    private int id;
    @Getter
    @Setter
    private String firstName;
    @Getter
    @Setter
    private String lastName;
}