package com.example.springbootdemo.enums;

public class CustomEnum {

    /**
     * 学习状态
     */
    public enum SF_STATUS{
        FAIL(-1,"失败"),
        LEARN(0,"学习中"),
        YES(1,"成功");
        private final Integer code;
        private final String value;
        SF_STATUS(Integer code,String value){
            this.code = code;
            this.value = value;
        }
        public Integer getCode() {
            return code;
        }
        public String getValue() {
            return value;
        }
    }

    /**
     * 文件状态
     */
    public enum SF_FILE_STATUS{
        FAIL(-1,"失效"),
        YES(1,"正常");
        private final Integer code;
        private final String value;
        SF_FILE_STATUS(Integer code,String value){
            this.code = code;
            this.value = value;
        }
        public Integer getCode() {
            return code;
        }
        public String getValue() {
            return value;
        }
    }

    /**
     * 状态 默认0
     */
    public enum STATUS{
        FAIL(-1,"失效"),
        YES(0,"有效");
        private final Integer code;
        private final String value;
        STATUS(Integer code,String value){
            this.code = code;
            this.value = value;
        }
        public Integer getCode() {
            return code;
        }
        public String getValue() {
            return value;
        }
    }

    /**
     * 状态 默认0
     */
    public enum DEL_STATUS{
        DELETE(-1,"失效"),
        NORMAL(0,"有效");
        private final Integer code;
        private final String value;
        DEL_STATUS(Integer code,String value){
            this.code = code;
            this.value = value;
        }
        public Integer getCode() {
            return code;
        }
        public String getValue() {
            return value;
        }
    }

    /**
     * 热词类型：0-普通热词，1-人名热词，2-地名热词
     */
    public enum HY_TYPE{
        ordinary(0,"普通热词"),
        NAME(1,"人名热词"),
        PLACE (2,"地名热词");
        private final Integer code;
        private final String value;
        HY_TYPE(Integer code,String value){
            this.code = code;
            this.value = value;
        }
        public Integer getCode() {
            return code;
        }
        public String getValue() {
            return value;
        }
    }

    //能力类型：0-语音识别,1-语音合成,2-OCR,3-声纹
    public enum AB_TYPE{
        SPEECH_RECOGNITION(0,"语音识别"),
        SPEECH_SYNTHESIS(1,"语音合成"),
        OCR(2,"OCR"),
        VOICEPRINT (3,"声纹"),
        INTERPRET (4,"翻译");
        private final Integer code;
        private final String value;
        AB_TYPE(Integer code,String value){
            this.code = code;
            this.value = value;
        }
        public Integer getCode() {
            return code;
        }
        public String getValue() {
            return value;
        }
    }

    public enum OCR_TYPE{
        IMG_TEXT(0,"图文识别"),
        CARD(1,"卡证识别");

        private final Integer code;
        private final String value;
        OCR_TYPE(Integer code,String value){
            this.code = code;
            this.value = value;
        }
        public Integer getCode() {
            return code;
        }
        public String getValue() {
            return value;
        }
    }

    public enum ABILITY{
        AB_01(1,"实时语音识别"),
        AB_02(2,"一句话识别"),
        AB_03(3,"音频文件转写"),
        AB_04(4,"语音合成"),
        AB_05(5,"图文识别"),
        AB_06(6,"卡证识别"),
        AB_07(7,"声纹注册"),
        AB_08(8,"声纹比对"),
        AB_09(9,"声纹识别"),
        AB_10(10,"翻译");

        private final Integer code;
        private final String value;
        ABILITY(Integer code,String value){
            this.code = code;
            this.value = value;
        }
        public Integer getCode() {
            return code;
        }
        public String getValue() {
            return value;
        }

        public static ABILITY getByCode(Integer code) {
            ABILITY[] systemRoles = values();
            for (ABILITY bo : systemRoles) {
                if (bo.getCode().equals(code)) {
                    return bo;
                }
            }
            return null;
        }
        public static String getByCodeValue(Integer code) {
            ABILITY[] systemRoles = values();
            for (ABILITY bo : systemRoles) {
                if (bo.getCode().equals(code)) {
                    return bo.getValue();
                }
            }
            return null;
        }
    }

    public enum HOT_TYPE{
        ORDINARY_HOT(0,"普通热词"),
        NAME_HOT(1,"人名热词"),
        PLACE_HOT(2,"地名热词");

        private final Integer code;
        private final String value;
        HOT_TYPE(Integer code,String value){
            this.code = code;
            this.value = value;
        }
        public Integer getCode() {
            return code;
        }
        public String getValue() {
            return value;
        }

        public static String getByCodeValue(Integer code) {
            HOT_TYPE[] systemRoles = values();
            for (HOT_TYPE bo : systemRoles) {
                if (bo.getCode().equals(code)) {
                    return bo.getValue();
                }
            }
            return null;
        }
    }
    public enum TRANSLATION_TYPE{
        EN_TO_ZH(0,"英译中"),
        ZH_TO_EN(1,"中译英");
        private final Integer code;
        private final String value;
        TRANSLATION_TYPE(Integer code,String value){
            this.code = code;
            this.value = value;
        }
        public Integer getCode() {
            return code;
        }
        public String getValue() {
            return value;
        }

        public static String getByCodeValue(Integer code) {
            TRANSLATION_TYPE[] systemRoles = values();
            for (TRANSLATION_TYPE bo : systemRoles) {
                if (bo.getCode().equals(code)) {
                    return bo.getValue();
                }
            }
            return null;
        }
    }


}
