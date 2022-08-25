package com.example.springbootdemo.response;


import lombok.Data;

import java.util.List;

/**
 * @Description 部门范围实体
 * @Author tong
 * @Date 2022/6/17
 */
@Data
public class DeptScopesVO {

    /**
     * 部门名称
     */
    private String name;

    /**
     * 部门code
     */
    private String code;

    /**
     * 子级部门集合
     */
    private List<DeptScopesVO> childList;
}
