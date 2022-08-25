package com.example.springbootdemo.service.impl;

//import com.example.caseinfo.mapper.CaseInfoMapper;
import com.alibaba.fastjson.JSONObject;
import com.example.springbootdemo.entity.TcsmCourtDic;
import com.example.springbootdemo.mapper.CaseInfoMapper;
import com.example.springbootdemo.service.CaseInfoService;
import com.example.springbootdemo.vo.CaseinfobyzjhResVO;
import com.example.springbootdemo.vo.QureycaselistReqVO;
import com.example.springbootdemo.vo.QureycaselistResVO;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;


@Service
public class CaseInfoServiceImpl implements CaseInfoService {

    @Resource
    private CaseInfoMapper caseInfoMapper;

    @Override
    public List<Map<String, String>> ahquerycaseinfo(String sand, String fydm,
                                                     String ajlx, String ajbh) {
       return caseInfoMapper.ahquerycaseinfo(sand,fydm,ajlx,ajbh);
    }

    @Override
    public List<Map<String, String>> caseCert(String ssrq, String sfzhm, String fydm) {
        return caseInfoMapper.caseCert(ssrq,sfzhm,fydm);
//        return null;
    }

    @Override
    public List<Map<String, String>> ahquerycaseinfoV2(String sand, String fydm, String ajlx, String ajbh) {
        return caseInfoMapper.ahquerycaseinfoV2(sand,fydm,ajlx,ajbh);
    }

    @Override
    public List<QureycaselistResVO> qureycaselist(QureycaselistReqVO para) {
        List list = caseInfoMapper.qureycaselist(para);
        return list == null?new ArrayList<>() :list;
    }

    @Override
    public JSONObject selectKtsj(String ahdm) {
        JSONObject obj = caseInfoMapper.selectKtsj(ahdm);
        return obj == null?new JSONObject():obj;
    }

    @Override
    public List<QureycaselistResVO> qureycaselistZx(QureycaselistReqVO para) {
        List list = caseInfoMapper.qureycaselistZx(para);
        return list == null?new ArrayList<>() :list;
    }

    @Override
    public List<CaseinfobyzjhResVO> caseinfobyzjh(String sfzhm, String ssrq, String fydm) {
        List list = caseInfoMapper.caseinfobyzjh(sfzhm,ssrq,fydm);
        return list == null?new ArrayList<>() :list;
    }

    @Override
    public TcsmCourtDic selectByCourtCode(String fydm) {
        if (StringUtils.isNotBlank(TcsmCourtDic.COURT_DIC_MAP.get(fydm))) {
            TcsmCourtDic tcsmCourtDic = new TcsmCourtDic();
            tcsmCourtDic.setFydm(fydm);
            tcsmCourtDic.setFjm(TcsmCourtDic.COURT_DIC_MAP.get(fydm));
            return tcsmCourtDic;
        } else {
            return null;
        }
    }

    @Override
    public List<CaseinfobyzjhResVO> caseinfobyzjhZx(String sfzhm, String ssrq, String fydm) {
        List list = caseInfoMapper.caseinfobyzjhZx(sfzhm, ssrq, fydm);
        return list == null?new ArrayList<>() :list;
    }

    @Override
    public List<Map<String, Object>> test() {
        return caseInfoMapper.selectGoods();
    }
}


