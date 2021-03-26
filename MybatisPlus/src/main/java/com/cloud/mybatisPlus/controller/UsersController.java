package com.cloud.mybatisPlus.controller;

import com.cloud.common.CommonResult;
import com.cloud.mybatisPlus.entity.Users;
import com.cloud.mybatisPlus.service.UsersService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.catalina.User;
import org.springframework.web.bind.annotation.*;

/**
 * @author abc
 */
@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping("/users")
public class UsersController {

    private final UsersService usersService;

    /**
     * 路径的方式
     * localhost:9090/users/getUser/1
     * @param id
     * @return
     */
    @GetMapping("/getUser/{id}")
    public Users getUser(@PathVariable(required = true) String id){
        log.info("id:"+id);
        return usersService.getUser(id);
    }


    /**
     * 通过？的方式
     * 尽在restful风格下
     * get请求使用 @RequestParam，使用@RequestBody会报错
     *  post请求下，后台接收参数的注解为RequestParam时也会报错
     * localhost:9090/users/getUser2?id=1
     * @param id
     * @return
     */
    @GetMapping("getUser2")
    public Users getUser2(String id){
        log.debug("id"+id);
        return usersService.getUser(id);
    }

    @GetMapping("getUser3")
    public CommonResult getUser3(String id){
        log.debug("id"+id);
        return new CommonResult(200,"success",usersService.getUser(id));
        //return usersService.getUser(id);
    }
}
