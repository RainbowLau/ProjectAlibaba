/*
package com.cloud.mybatisPlus.entity;

import java.io.Serializable;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

*/
/**
 * (users)实体类
 *
 * @author kancy
 * @since 2021-03-26 14:49:03
 * @description 由 Mybatisplus Code Generator 创建
 *//*

@Data
@NoArgsConstructor
@Accessors(chain = true)
@TableName("users")
public class Users extends Model<Users> implements Serializable {
    private static final long serialVersionUID = 1L;

    */
/**
     * 主键ID
     *//*

    @TableId
	private Long id;
    */
/**
     * 姓名
     *//*

    private String name;
    */
/**
     * 年龄
     *//*

    private Integer age;
    */
/**
     * 邮箱
     *//*

    private String email;

}*/
