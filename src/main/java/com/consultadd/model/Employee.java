package com.consultadd.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
@Builder
@Entity
public class Employee {
    @Id
    private String id;
    private String name;
    private int age;


    private String city;


}
