package com.example.springbootdemo.enums;

/**
 * @Description 响应码常量
 * @Author tong
 * @Date 2022/6/16
 */
public enum CodeEnum {

    SUCCESS(200, "成功"),
    NO_DATA_FOUND(401,"未查询到结果"),
    SYSTEM_ERR(500, "系统异常");




     CodeEnum(Integer code, String description) {
        this.code = code;
        this.description = description;
    }

    private Integer code;

    private String description;


    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
