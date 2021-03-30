package com.cloud.redis.service;


import com.cloud.mybatisPlus.entity.Users;

import java.util.List;

/**
 * 服务接口
 *
 * @author kancy
 * @since 2021-03-26 14:49:03
 * @description 由 Mybatisplus Code Generator 创建
 */
public interface UsersService {

    Users getUser(String id);

    List<Users>getAll();
}
