package com.wkcto.plus.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wkcto.plus.entity.User;
// 自定义Mapper , 就是DAO接口
// 1要求：实现BaseMapper
//2 指定实体类
// BaseMapper 是MP框架中的对象，它定义了17个方法（18年），现在已经18个多了
public interface UserMapper extends BaseMapper<User> {
}
