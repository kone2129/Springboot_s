package com.kone.mxl.utils;
import lombok.Getter;
/**
 * 自定义异常
 * @author Kone.wang
 * @date 2020-05-09 15:19
 */
@Getter //只要getter方法，无需setter
public class APIException extends RuntimeException {
    private int code;
    private String msg;
    public APIException() {
        this(1001, "接口错误");
    }
    public APIException(String msg) {
        this(1001, msg);
    }
    public APIException(int code, String msg) {
        super(msg);
        this.code = code;
        this.msg = msg;
    }
}
