package com.phonestation.entity;

import lombok.*;

import java.util.List;

@Getter
@Setter
@Builder
@EqualsAndHashCode
@ToString
public class User {
    private int id;
    private int accountId;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private int balance;
    private List<Service> services;
    private List<Bill> bills;
    private boolean isConnected;
    private boolean isBlocked;
}
