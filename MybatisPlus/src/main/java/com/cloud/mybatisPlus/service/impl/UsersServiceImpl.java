package com.cloud.mybatisPlus.service.impl;

import com.cloud.mybatisPlus.entity.Users;
import com.cloud.mybatisPlus.mapper.UsersMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import com.cloud.mybatisPlus.service.UsersService;
import org.springframework.stereotype.Service;

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

    @Override
    public Users getUser(String id) {
        return usersMapper.selectById(id);
    }
}