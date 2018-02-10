package com.xfs.learn.controller;

import com.alibaba.fastjson.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * A simple class desc
 * <p>
 * author wangzhongyou
 * date 2018/1/28 下午7:23
 */
@Controller
@RequestMapping(value = "/hello")
public class HelloController {
    private Logger logger = LoggerFactory.getLogger(HelloController.class);

    @RequestMapping(value = "/index")
    @ResponseBody
    public JSONObject index() {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("index","test");

        logger.info("action:index!!!");

        return jsonObject;
    }
}
