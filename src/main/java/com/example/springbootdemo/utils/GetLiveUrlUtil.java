package com.example.springbootdemo.utils;

import com.alibaba.fastjson.JSONObject;
import com.allcam.acs.core.AcsConfig;
import com.allcam.acs.core.AcsService;

public class GetLiveUrlUtil {

    public static String getLiveUrl(){
        try
        {
            // 配置平台信息(输入对接IP、端口、账号和密码)
            AcsConfig config = new AcsConfig.Builder()
                    .host("112.13.167.212")
                    .port(10002)
                    .username("nbxsybdd")
                    .password("Nbxs123@")
                    .httpTimeout(60)
                    .build();

            // 获取平台服务的实例对象
            AcsService service = AcsService.getInstance();

            // 初始化平台配置
            service.init(config);

            //接口调用(request(url,请求Json报文体))，其中url在/api前如果没有加/uas/v1则需补齐。
            String response = service.request("/uas/v1/api/media/live","{\"cameraId\":\"00000000000105040103000001909458\",\"streamType\":1,\"urlType\":1,\"agentType\":1}");
//            String response = service.request("/uas/v1/api/media/live","{\"cameraId\":\"33022523102505040301020001449657\",\"streamType\":1,\"urlType\":1,\"agentType\":1}");
//            String response = service.request("/uas/v1/api/dev/list","{}");

            JSONObject jsonObject = JSONObject.parseObject(response);
            String url = jsonObject.getString("url");
            System.out.println(response);
//            System.out.println(url);
            System.out.println("");
            return url;
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {
        getLiveUrl();
    }
}
