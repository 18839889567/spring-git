package com.zy.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "t_test")
public class Test {
    @Id
    private Long tid;
    @Column(name = "tname")
    private String name;
    private String email;
    private Data birthday;
}
