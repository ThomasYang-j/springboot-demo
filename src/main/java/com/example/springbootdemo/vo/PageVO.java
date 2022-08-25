package com.example.springbootdemo.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * @author guanjian
 * @date 2022/4/13 20:44
 */
@Data
public class PageVO<T> implements Serializable {
    private Integer pageSize;
    private Integer pageNum;
    private T data;
    private String sort;
    private String sortMode;
}
