package com.example.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * user
 * @author 
 */
@Data
public class User implements Serializable {
    private Integer id;

    /**
     * 账号
     */
    private String name;

    /**
     * 昵称
     */
    private String email;

    /**
     * 密码
     */
    private String age;

    private static final long serialVersionUID = 1L;
}