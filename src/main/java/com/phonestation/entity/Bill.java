package com.phonestation.entity;

import lombok.*;

import java.util.Date;

@Getter
@Setter
@Builder
@EqualsAndHashCode
@ToString
public class Bill {
    private int id;
    private int userId;
    private Date date;
    private String desription;
    private int price;
}
