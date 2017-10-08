package com.phonestation.model.entities;

import lombok.*;

import java.util.List;

@Getter
@Setter
@Builder
@EqualsAndHashCode //{exclude = {"id", "services", "bills"}}
@ToString
public class User {
    private int id;
    private int accountId;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private int balance;
    private List<Services> services;
    private List<Bill> bills;
    private boolean isConnected;
    private boolean isBlocked;
}
