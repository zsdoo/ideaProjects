package com.wkcto.plus;

import org.mybatis.spring.annotation.MapperScan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @ MapperScan  是一个扫描器，用于指定Mapper类所在在包名
 */
@SpringBootApplication
@MapperScan(value = "com.wkcto.plus.mapper")
public class PlusApplication {

    public static void main(String[] args) {
        SpringApplication.run(PlusApplication.class, args);
    }

}
