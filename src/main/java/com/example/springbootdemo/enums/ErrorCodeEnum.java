package com.example.springbootdemo.enums;

/**
 * @author guanjian
 * @date 2022/4/13 19:40
 */
public enum ErrorCodeEnum {
    SUCCESS(200, "成功"),
    PARAM_ERR(301, "参数错误"),
    DATA_NOT_EXIST(302, "数据不存在"),
    DATA_ALREADY_EXIST(303, "数据已存在"),
    DATA_STATUS_ERR(304,"数据状态错误"),
    DATA_ILLEGAL_ERR(305,"数据不满足要求"),
    THIRD_PART_RETURN_FALSE_ERR(401, "第三方返回失败"),
    THIRD_PART_RETURN_NULL_ERR(402, "第三方返回结果为空"),
    LGOIN_EXPIRED(403,"登录过期"),
    SYSTEM_ERR(500, "系统异常"),
    EXCEL_ERR(501,"处理excel异常"),
    XR_ERR(502, "信任登录失败：用户不存在。"),
    SAVEFILE_ERR(601,"文件保存异常"),
    AUDIOFILE_NOT_EXIST(602,"文件不存在"),
    NOT_SUPPORT_FORMAT(603,"不支持的格式"),
    FILE_TTANSFER_ERR(701, "文件转换异常"),
    DOWNLOAD_ERR(801, "下载文件异常"),
    UPLOAD_ERR(802, "上传文件失败"),
    DETELE_ERR(803, "删除文件失败"),
    UNKNOWN(-1, "未知"),
    MODEL_STATUS(900, "模型失效"),

    // 声纹相关错误 code:20xx
    VOICEPRINT_NO_TAG(2001,"用户未注册"),
    VOICEPRINT_USER_ALREADY_REGISTER(2002,"用户已注册")
    ;

    private Integer code;

    private String description;

    /**
     * 构造函数
     */
    ErrorCodeEnum(Integer code, String description) {
        this.code = code;
        this.description = description;
    }

    public Integer getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }

    public static ErrorCodeEnum findByValue(Integer code) {
        if (code == null) {
            return UNKNOWN;
        }
        for (ErrorCodeEnum obj : ErrorCodeEnum.values()) {
            Integer value = obj.code;
            if (value.equals(code)) {
                return obj;
            }
        }
        return UNKNOWN;
    }
}
