package com.example.springbootdemo.vo;

import com.alibaba.fastjson.annotation.JSONField;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * @author Qwx
 * @Date 2021/12/20 14:23
 */
public class CaseinfobyzjhResVO {
    private String DSR;
    private String KTSJ;
    private String SJY;
    private String FTMC;
    private String AH;
    private String FYMC;
    private String SARQ;
    private String CBFGID;
    private String AHDM;
    private String CBBM;
    private String LARQ;
    private String AJZT;
    private String FYDM;
    private String BMMC;
    private String CBFG;

    private String MC;
    private String JARQ;
    private String YHXM;

    @JsonProperty("DSR")
    public String getDSR() {
        return DSR;
    }

    public void setDSR(String DSR) {
        this.DSR = DSR;
    }

    @JsonProperty("KTSJ")
    public String getKTSJ() {
        return KTSJ;
    }

    public void setKTSJ(String KTSJ) {
        this.KTSJ = KTSJ;
    }

    @JsonProperty("SJY")
    public String getSJY() {
        return SJY;
    }

    public void setSJY(String SJY) {
        this.SJY = SJY;
    }

    @JsonProperty("FTMC")
    public String getFTMC() {
        return FTMC;
    }

    public void setFTMC(String FTMC) {
        this.FTMC = FTMC;
    }

    @JsonProperty("AH")
    public String getAH() {
        return AH;
    }

    public void setAH(String AH) {
        this.AH = AH;
    }

    @JsonProperty("FYMC")
    public String getFYMC() {
        return FYMC;
    }

    public void setFYMC(String FYMC) {
        this.FYMC = FYMC;
    }

    @JsonProperty("SARQ")
    public String getSARQ() {
        return SARQ;
    }

    public void setSARQ(String SARQ) {
        this.SARQ = SARQ;
    }

    @JsonProperty("CBFGID")
    public String getCBFGID() {
        return CBFGID;
    }

    public void setCBFGID(String CBFGID) {
        this.CBFGID = CBFGID;
    }

    @JsonProperty("AHDM")
    public String getAHDM() {
        return AHDM;
    }

    public void setAHDM(String AHDM) {
        this.AHDM = AHDM;
    }

    @JsonProperty("CBBM")
    public String getCBBM() {
        return CBBM;
    }

    public void setCBBM(String CBBM) {
        this.CBBM = CBBM;
    }

    @JsonProperty("LARQ")
    public String getLARQ() {
        return LARQ;
    }

    public void setLARQ(String LARQ) {
        this.LARQ = LARQ;
    }

    @JsonProperty("AJZT")
    public String getAJZT() {
        return AJZT;
    }

    public void setAJZT(String AJZT) {
        this.AJZT = AJZT;
    }

    @JsonProperty("FYDM")
    public String getFYDM() {
        return FYDM;
    }

    public void setFYDM(String FYDM) {
        this.FYDM = FYDM;
    }

    @JsonProperty("BMMC")
    public String getBMMC() {
        return BMMC;
    }

    public void setBMMC(String BMMC) {
        this.BMMC = BMMC;
    }

    @JsonProperty("CBFG")
    public String getCBFG() {
        return CBFG;
    }

    public void setCBFG(String CBFG) {
        this.CBFG = CBFG;
    }

    @JsonProperty("MC")
    public String getMC() {
        return MC;
    }

    public void setMC(String MC) {
        this.MC = MC;
    }

    @JsonProperty("JARQ")
    public String getJARQ() {
        return JARQ;
    }

    public void setJARQ(String JARQ) {
        this.JARQ = JARQ;
    }

    @JsonProperty("YHXM")
    public String getYHXM() {
        return YHXM;
    }

    public void setYHXM(String YHXM) {
        this.YHXM = YHXM;
    }
}
