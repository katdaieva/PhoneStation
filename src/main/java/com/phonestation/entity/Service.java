package com.phonestation.entity;

import lombok.*;

@Getter
@Setter
@Builder
@EqualsAndHashCode
@ToString
public class Service {
    private int id;
    private String name;
    private String description;
    private int duration;
    private int price;
}
