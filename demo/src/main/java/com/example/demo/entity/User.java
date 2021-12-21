package com.example.demo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
//import com.baomidou.mybatisplus.annotation.TableName;
//import lombok.Data;


@Data
public class User {
        @TableId(
                value = "id",
                type = IdType.AUTO
        )

        public Integer id;
        public String name;
        public Integer age;
        public String email;

//        public Long getId() {
//                return id;
//        }
//
//        public void setId(Long id) {
//                this.id = id;
//        }
//
//        public String getName() {
//                return name;
//        }
//
//        public void setName(String name) {
//                this.name = name;
//        }
//
//        public Integer getAge() {
//                return age;
//        }
//
//        public void setAge(Integer age) {
//                this.age = age;
//        }
//
//        public String getEmail() {
//                return email;
//        }
//
//        public void setEmail(String email) {
//                this.email = email;
//        }
//
//        @Override
//        public String toString() {
//                return "User{" +
//                        "id=" + id +
//                        ", name='" + name + '\'' +
//                        ", age=" + age +
//                        ", email='" + email + '\'' +
//                        '}';
//        }
}
