package com.kone.mxl.utils;

import lombok.Data;

/**
 * 统一响应体
 * @author Kone.wang
 * @date 2020-05-09 15:22
 */
@Data
public class ResultVO<T> {
    private int code;

    private String msg;

    private T data;

    public ResultVO(T data) {
        this(ResultCode.SUCCESS, data);
    }

    public ResultVO(ResultCode resultCode, T data) {
        this.code = resultCode.getCode();
        this.msg = resultCode.getMsg();
        this.data = data;
    }
}
