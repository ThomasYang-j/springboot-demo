package com.example.springbootdemo.service;

import com.alibaba.fastjson.JSONObject;
import com.example.springbootdemo.entity.TcsmCourtDic;
import com.example.springbootdemo.vo.CaseinfobyzjhResVO;
import com.example.springbootdemo.vo.QureycaselistReqVO;
import com.example.springbootdemo.vo.QureycaselistResVO;

import java.util.List;
import java.util.Map;

public interface CaseInfoService {
    List<Map<String, String>> ahquerycaseinfo(String sand, String fydm, String ajlx, String ajbh);

    List<Map<String, String>> caseCert(String ssrq, String sfzhm, String fydm);

    List<Map<String, String>> ahquerycaseinfoV2(String sand, String fydm, String ajlx, String ajbh);

    List<QureycaselistResVO> qureycaselist(QureycaselistReqVO para);

    JSONObject selectKtsj(String ahdm);

    List<QureycaselistResVO> qureycaselistZx(QureycaselistReqVO para);

    List<CaseinfobyzjhResVO> caseinfobyzjh(String sfzhm, String ssrq, String fydm);

    /**
     * 根据法院代码（6位）查询
     * @param fydm
     * @return
     */
    TcsmCourtDic selectByCourtCode(String fydm);

    List<CaseinfobyzjhResVO> caseinfobyzjhZx(String sfzhm, String ssrq, String fydm);

    List<Map<String, Object>> test();
}
