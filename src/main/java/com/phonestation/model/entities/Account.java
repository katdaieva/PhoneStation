package com.phonestation.model.entities;

import lombok.*;

@Getter
@Setter
@Builder
@EqualsAndHashCode
@ToString
public class Account {
    private int id;
    private String login;
    private String password;
    private Role role;
}
