package com.example.demo.Utils;

import com.example.demo.Pojo.Result;

public class ResultUtil {
    public static Result success(Object object) {
        Result result = new Result();
        result.setStatus(0);
        result.setMsg("success");
        result.setData(object);
        return result;
    }

    public static Result success() {
        return success(null);
    }

    public static Result error(Integer code, String msg) {
        Result result = new Result();
        result.setStatus(code);
        result.setMsg(msg);
        result.setData(null);
        return result;
    }

    public static Result error(ExceptionEnum exceptionEnum) {
        Result result = new Result();
        result.setStatus(exceptionEnum.getCode());
        result.setMsg(exceptionEnum.getMsg());
        result.setData(null);
        return result;
    }
}
