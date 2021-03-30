package com.cloud.redis.mapper;


import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.cloud.mybatisPlus.entity.Users;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * (users)数据Mapper
 *
 * @author kancy
 * @since 2021-03-26 14:49:03
 * @description 由 Mybatisplus Code Generator 创建
*/
@Mapper
public interface UsersMapper extends BaseMapper<Users> {

}
