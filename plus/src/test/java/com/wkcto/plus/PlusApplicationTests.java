package com.wkcto.plus;

import com.wkcto.plus.entity.User;
import com.wkcto.plus.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SuppressWarnings("all")
@SpringBootTest

class PlusApplicationTests {

    @Autowired
    private UserMapper userDao;
//
//    @Test
//    void contextLoads(){
//        List<User> users = userDao.selectList(null);
//        users.forEach(System.out::println);
//    }

    @ Test
    public void testUserInsert(){
        User user = new User();
        user.setName("李白8");
        user.setAge(38);
        user.setEmail("libai@tangchao.com");
        int rows = userDao.insert(user);
        System.out.println("insert 的结果是："+rows);
    }

}
