package com.kone.mxl.controller;

import com.kone.mxl.entity.BPSUsers;
import com.kone.mxl.utils.ResultVO;
import com.sun.org.glassfish.gmbal.ParameterNames;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;

/**
 * @author Kone.wang
 * @date 2020-05-09 14:57
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @PostMapping("")
    public String addUser(@RequestBody @Valid BPSUsers users){
        return "OKOKOK!";
    }
    @GetMapping("/{ids}")
    public ResultVO<BPSUsers> getUser(@PathVariable("ids") int ids){
        BPSUsers user=new BPSUsers();
        user.setId(ids);
        user.setAccount("kone.wang");
        user.setPassword("xjbxdmm");
        user.setEmail("kone.wang@164.cn");
        return new ResultVO(user);
    }
    @GetMapping("getUser/{ids}")
    public BPSUsers getUser2(@PathVariable("ids") int ids){
        BPSUsers user=new BPSUsers();
        user.setId(ids);
        user.setAccount("kone.wang");
        user.setPassword("xjbxdmm");
        user.setEmail("kone.wang@164.cn");
        return user;
    }
}
