package com.itmuch.cloud.study.entity;


import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;


@Entity
@Data
//@NoArgsConstructor
//@AllArgsConstructor
//@Table(name = "user")
public class User {

    public User(Long id, String username, String name, Integer age, BigDecimal balance) {
        this.id = id;
        this.username = username;
        this.name = name;
        this.age = age;
        this.balance = balance;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column
    private String username;
    @Column
    private String name;
    @Column
    private Integer age;
    @Column
    private BigDecimal balance;

}
