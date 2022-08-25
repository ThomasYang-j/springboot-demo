package com.example.springbootdemo.vo;

import lombok.Data;

/**
 * @author Qwx
 * @Date 2021/12/20 15:28
 */
@Data
public class QureycaselistReqVO {
    /**
     * 案件编号，对应ob的序号xh
     */
    private String ajbh;

    /**
     * 案件类型，对应ob的代字,dz
     */
    private String ajlx;

    /**
     * 法院简称
     */
    private String fyjc;

    /**
     * 年度，对应ob的nd
     */
    private String sand;
}
