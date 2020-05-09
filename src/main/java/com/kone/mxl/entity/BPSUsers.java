package com.kone.mxl.entity;

import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * @author Kone.wang
 * @date 2020-05-09 14:50
 */
@Data
public class BPSUsers {

    @NotNull(message = "用户id不能为空啊")
    private long id;

    @NotEmpty(message = "账号可能不能为空啊")
    //@Size(min = 6,max = 18,message = "账号长度6-18")
    private String account;

    @NotNull(message = "密码也不能空啊")
    @Size(min = 6,max = 18,message = "密码长度6-18")
    private String password;

    @Email(message = "邮箱格式不正确")
    private String email;
}
