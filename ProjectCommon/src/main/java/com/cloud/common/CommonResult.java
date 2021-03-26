package com.cloud.common;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author abc
 */
@Data
@NoArgsConstructor
public class CommonResult<T> {

    private Integer code;
    private String message;
    private T data;

    public CommonResult(Integer code){
        this.code=code;

    }

    public CommonResult(Integer code, String message){
        this.code=code;
        this.message=message;
    }

    public CommonResult(Integer code, String message, T o) {
        this.code = code;
        this.message = message;
        this.data = (T) o;
    }
}
