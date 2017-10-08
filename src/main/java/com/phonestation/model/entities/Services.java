package com.phonestation.model.entities;

import lombok.*;

@Getter
@Setter
@Builder
@EqualsAndHashCode
@ToString
public class Services {
    private int id;
    private String name;
    private String description;
    private int duration;
    private int price;
}
