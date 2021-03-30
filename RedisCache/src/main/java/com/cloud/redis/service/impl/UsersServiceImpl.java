package com.cloud.redis.service.impl;

import com.cloud.redis.tools.RedisUtil;
import com.cloud.mybatisPlus.entity.Users;
import com.cloud.redis.mapper.UsersMapper;
import com.cloud.redis.service.UsersService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 服务接口实现
 *
 * @author kancy
 * @since 2021-03-26 14:49:03
 * @description 由 Mybatisplus Code Generator 创建
 */
@Slf4j
@RequiredArgsConstructor
@Service
public class UsersServiceImpl implements UsersService {
    private final UsersMapper usersMapper;

    @Resource
    private RedisUtil redisUtil;

    @Override
    public Users getUser(String id) {
        Users users = usersMapper.selectById(id);
        redisUtil.set(id, users);
        return users;
    }

    @Override
    public List<Users> getAll() {
        return usersMapper.selectList(null);
    }
}