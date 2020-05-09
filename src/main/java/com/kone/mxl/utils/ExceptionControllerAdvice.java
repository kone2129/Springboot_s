package com.kone.mxl.utils;

import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
/**
 * 全局异常处理
 * @author Kone.wang
 * @date 2020-05-09 15:07
 */
@RestControllerAdvice
public class ExceptionControllerAdvice {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResultVO MethodArgumentNotValidException(MethodArgumentNotValidException e){
        // 从异常对象中拿到ObjectError对象
        ObjectError objectError = e.getBindingResult().getAllErrors().get(0);
        // 然后提取错误提示信息进行返回
        //return objectError.getDefaultMessage();
        return new ResultVO(ResultCode.VALIDATE_FAILED,objectError.getDefaultMessage());
    }
    @ExceptionHandler(APIException.class)
    public ResultVO APIExceptionHandler(APIException e) {
        //return e.getMsg();
        return new ResultVO(ResultCode.FAILED,e.getMsg());
    }

}
