package com.cloud.security.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author abc
 */
@RestController
@RequestMapping("/api")
@Api(tags = "系统：菜单路由")
public class AdminController {
    @GetMapping(value = "/index")
    @ResponseBody
    @ApiOperation(value = "通过用户id获取菜单")
    public String getMenu() {
        return "console/console1";
    }
}
