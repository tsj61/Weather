package org.example.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Weather {
    private String main;
    private String description;
    private String icon;
}
