package com.example.springbootdemo.response;

import lombok.Builder;
import lombok.Data;

/**
 * @author guanjian
 * @date 2022/4/13 19:38
 */
@Data
@Builder
public class BaseResponse<T> {
    private Integer code;
    private String msg;
    private T data;

    public BaseResponse() {
    }

    public BaseResponse(Integer code, String msg, T data) {
        super();
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public BaseResponse(Integer code, String msg) {
        super();
        this.code = code;
        this.msg = msg;
    }

    public static <T> BaseResponse<T> success() {
        return BaseResponse.<T>builder().code(200).msg("success").build();
    }

    public static <T> BaseResponse<T> success(T t) {
        return BaseResponse.<T>builder().code(200).msg("success").data(t).build();
    }

    public static <T> BaseResponse<T> fail() {
        return BaseResponse.<T>builder().code(400).msg("fail").build();
    }


    public static <T> BaseResponse<T> fail(int code, String msg) {
        return BaseResponse.<T>builder().code(code).msg(msg).build();
    }

    public static <T> BaseResponse<T> fail(T t) {
        return BaseResponse.<T>builder().code(400).msg("fail").data(t).build();
    }

    public static <T> BaseResponse<T> failMsg(String msg) {
        return BaseResponse.<T>builder().code(400).msg(msg).build();
    }

}
