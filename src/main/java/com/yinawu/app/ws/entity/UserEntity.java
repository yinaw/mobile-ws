package com.yinawu.app.ws.entity;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import javax.persistence.*;


@Entity
@Table(name="users")
public class UserEntity implements Serializable {
    @Id
    @Getter
    @Setter
    @Column(name = "id")
    private int id;
    @Getter
    @Setter
    @Column(name = "firstName")
    private String firstName;
    @Getter
    @Setter
    @Column(name = "lastName")
    private String lastName;
}