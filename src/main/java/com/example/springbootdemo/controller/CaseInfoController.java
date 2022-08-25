package com.example.springbootdemo.controller;


import com.alibaba.fastjson.JSONObject;
import com.example.springbootdemo.entity.TcsmCourtDic;
import com.example.springbootdemo.service.CaseInfoService;
import com.example.springbootdemo.vo.CaseinfobyzjhResVO;
import com.example.springbootdemo.vo.QureycaselistReqVO;
import com.example.springbootdemo.vo.QureycaselistResVO;
import com.example.springbootdemo.vo.WkorderExterVO;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;


/**
 * Created by draven on 2021/6/1.
 */
@Slf4j
@RestController
@RequestMapping("/sp/caseinfo")
public class CaseInfoController {
    private static final Logger LOG = LoggerFactory.getLogger(CaseInfoController.class);

    @Resource
    private CaseInfoService caseInfoService;

    /**
     * 案件号查询
     */
    @PostMapping("/ahquerycaseinfo")
    public List<Map<String, String>> cases(@RequestBody WkorderExterVO para) throws Exception {
        LOG.info("案件号查询para:{}", para.toString());
        //审判信息
        return caseInfoService.ahquerycaseinfo(para.getSand(), para.getFydm(), para.getAjlx(), para.getAjbh());
    }

    /**
     * 案件号查询
     */
    @PostMapping("/v2/ahquerycaseinfo")
    public List<QureycaselistResVO> casesV2(@RequestBody QureycaselistReqVO para) throws Exception {
        LOG.info("案件号查询----v2---para:{}", para.toString());
        //审判
        List<QureycaselistResVO> list = caseInfoService.qureycaselist(para);
        for (QureycaselistResVO qureycaselistResVO : list) {
            //根据案号代码查询开庭时间和法庭名称
            JSONObject selectKtrq = caseInfoService.selectKtsj(qureycaselistResVO.getAHDM());
            if (selectKtrq != null) {
                qureycaselistResVO.setKTSJ(selectKtrq.getString("KTSJ"));//开庭时间
                qureycaselistResVO.setFTMC(selectKtrq.getString("FTMC"));//法庭名称
            }
        }

        //执行
        List<QureycaselistResVO> listZx = caseInfoService.qureycaselistZx(para);
        for (QureycaselistResVO qureycaselistResVO : listZx) {
            //根据案号代码查询开庭时间和法庭名称
            JSONObject selectKtrq = caseInfoService.selectKtsj(qureycaselistResVO.getAHDM());
            if (selectKtrq != null) {
                qureycaselistResVO.setKTSJ(selectKtrq.getString("KTSJ"));//开庭时间
                qureycaselistResVO.setFTMC(selectKtrq.getString("FTMC"));//法庭名称
            }
        }
        list.addAll(listZx);
        log.info("案件号查询---v2---返回结果：{}", list.toString());
        return list;
    }

    /**
     * 身份证号查询案件
     */
    @GetMapping("/caseinfobyzjh")
    public List<Map<String, String>> caseCert(@RequestParam(value = "ssrq") String ssrq,
                                              @RequestParam(value = "sfzhm") String sfzhm,
                                              @RequestParam(value = "fydm") String fydm) throws Exception {
        LOG.info("证件号码和法院代码查询案件para:ssrq---{},sfzhm---{},Fydm---{}", ssrq, sfzhm, fydm);

        return caseInfoService.caseCert(ssrq, sfzhm, fydm);
    }

    /**
     * 身份证号查询案件
     */
    @GetMapping("/v2/caseinfobyzjh")
    public List<CaseinfobyzjhResVO> caseCertV2(@RequestParam(value = "ssrq") String ssrq,
                                               @RequestParam(value = "sfzhm") String sfzhm,
                                               @RequestParam(value = "fydm") String fydm) throws Exception {
        LOG.info("证件号码和法院代码查询案件---v2---para:ssrq---{},sfzhm---{},fydm---{}", ssrq, sfzhm, fydm);

        //审判
        List<CaseinfobyzjhResVO> list = caseInfoService.caseinfobyzjh(sfzhm, ssrq, fydm);
        for (CaseinfobyzjhResVO caseinfobyzjhResVO : list) {
            //根据案号代码查询开庭时间和法庭名称
            JSONObject selectKtrq = caseInfoService.selectKtsj(caseinfobyzjhResVO.getAHDM());
            if (selectKtrq != null) {
                caseinfobyzjhResVO.setKTSJ(selectKtrq.getString("KTSJ"));//开庭时间
                caseinfobyzjhResVO.setFTMC(selectKtrq.getString("FTMC"));//法庭名称
            }
        }

        //执行
        TcsmCourtDic tcsmCourtDic = caseInfoService.selectByCourtCode(fydm);//根据法院代码获取 发标代码+分级码 1300B00
        List<CaseinfobyzjhResVO> listZx = null;
        if (tcsmCourtDic != null) {
            listZx = caseInfoService.caseinfobyzjhZx(sfzhm, ssrq, tcsmCourtDic.getFydm() + tcsmCourtDic.getFjm());
        }
        if (listZx == null) {
            listZx = new ArrayList<>();
        }
        for (CaseinfobyzjhResVO caseinfobyzjhResVO : listZx) {
            //根据案号代码查询开庭时间和法庭名称
            JSONObject selectKtrq = caseInfoService.selectKtsj(caseinfobyzjhResVO.getAHDM());
            if (selectKtrq != null) {
                caseinfobyzjhResVO.setKTSJ(selectKtrq.getString("KTSJ"));//开庭时间
                caseinfobyzjhResVO.setFTMC(selectKtrq.getString("FTMC"));//法庭名称
            }
        }
        list.addAll(listZx);
        log.info("证件号码和法院代码查询案件---v2---返回结果：{}", list.toString());
        return list;
    }

    /**
     * 案件号查询
     */
    @PostMapping("/test")
    public List<Map<String, Object>> test() throws Exception {
        //审判信息
        return caseInfoService.test();
    }
}
