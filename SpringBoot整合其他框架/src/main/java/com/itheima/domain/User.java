package com.itheima.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;
@Data
@AllArgsConstructor
public class User implements Serializable {
    private Integer id;
    private String username;
    private String password;

}
