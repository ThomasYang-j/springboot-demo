package com.example.springbootdemo.controller;

import com.example.springbootdemo.response.BaseResponse;
import com.example.springbootdemo.utils.GetLiveUrlUtil;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;


@Slf4j
@RestController
@RequestMapping("/getLiveUrl")
@Api(tags = {"大屏视频-视频相关接口"})
public class GetLiveUrlController {

    private static final Logger LOG = LoggerFactory.getLogger(GetLiveUrlController.class);

    @GetMapping("/url")
    public BaseResponse<String> url() {
        String liveUrl = GetLiveUrlUtil.getLiveUrl();
        return BaseResponse.success(liveUrl);
    }
}
