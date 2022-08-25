package com.example.springbootdemo.entity;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

@Data
public class TcsmCourtDic implements Serializable {
    private String fydm;

    private String courtCode;

    private String fjm;

    private String pFydm;

    private String fymc;

    private String fyjc;

    private String city;

    private static final long serialVersionUID = 1L;

    public static final Map<String, String> COURT_DIC_MAP = new HashMap<String, String>();

    static {
        COURT_DIC_MAP .put("1345", "B46");
        COURT_DIC_MAP .put("1347", "B60");
        COURT_DIC_MAP .put("1348", "B61");
        COURT_DIC_MAP .put("1349", "B62");
        COURT_DIC_MAP .put("1350", "B63");
        COURT_DIC_MAP .put("1351", "B64");
        COURT_DIC_MAP .put("1403", "B65");
        COURT_DIC_MAP .put("5036", "B66");
    }


}