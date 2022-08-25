package com.example.springbootdemo.mapper;

import com.alibaba.fastjson.JSONObject;
import com.example.springbootdemo.vo.CaseinfobyzjhResVO;
import com.example.springbootdemo.vo.QureycaselistReqVO;
import com.example.springbootdemo.vo.QureycaselistResVO;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
public interface CaseInfoMapper {
//    @Select("select * from cart limit 1,5;")
    List<Map<String, String>> ahquerycaseinfo(@Param("sand") String sand,@Param("fydm") String fydm,
                                              @Param("ajlx") String ajlx,@Param("ajbh") String ajbh);

    List<Map<String, String>> ahquerycaseinfoV2(@Param("sand") String sand,@Param("fydm") String fydm,
                                              @Param("ajlx") String ajlx,@Param("ajbh") String ajbh);

//    @Select("select * from cart limit 1,5;")
    List<Map<String, String>> caseCert(@Param("ssrq") String ssrq,@Param("sfzhm") String sfzhm,@Param("fydm") String fydm);

    /**
     * 查询案件列表--审判
     *
     * @param reqVO 申请签证官
     * @return {@link List<QureycaselistResVO>}
     */
    List<QureycaselistResVO> qureycaselist(QureycaselistReqVO reqVO);

    /**
     * 根据案号代码查询开庭日期
     *
     * @param ahdm 案号代码
     * @return {@link JSONObject}
     */
    JSONObject selectKtsj(@Param("ahdm")String ahdm);

    /**
     * 查询案件列表--执行
     *
     * @param reqVO 申请签证官
     * @return {@link List<QureycaselistResVO>}
     */
    List<QureycaselistResVO> qureycaselistZx(QureycaselistReqVO reqVO);

    /**
     * 根据证件号查询案件-审判
     *
     * @param sfzhm sfzhm
     * @param ssrq  ssrq
     * @param fydm  fydm
     * @return {@link List<CaseinfobyzjhResVO>}
     */
    List<CaseinfobyzjhResVO> caseinfobyzjh(@Param("sfzhm")String sfzhm, @Param("ssrq")String ssrq, @Param("fydm")String fydm);

    /**
     * 根据证件号查询案件-执行
     *
     * @param sfzhm sfzhm
     * @param ssrq  ssrq
     * @param fydm  fydm
     * @return {@link List<CaseinfobyzjhResVO>}
     */
    List<CaseinfobyzjhResVO> caseinfobyzjhZx(@Param("sfzhm") String sfzhm, @Param("ssrq") String ssrq,@Param("fydm") String fydm);


    List<Map<String, Object>> selectGoods();
}
