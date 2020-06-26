package com.github.zywx.mvclearn.controller;

import com.alibaba.fastjson.JSONObject;
import com.github.zywx.mvclearn.service.impl.HelloServiceImpl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * demo
 *
 * author fsnail.wang@gmail.com
 * date 2018/1/28 下午7:23
 */
@Controller
@RequestMapping(value = "/hello")
public class HelloController {
    private Logger logger = LoggerFactory.getLogger(HelloController.class);

    @Resource
    private HelloServiceImpl helloService;

    @RequestMapping(value = "/index")
    @ResponseBody
    public JSONObject index() {

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("index", helloService.demo());


        System.out.println("action:index!!!");
        logger.info("action:index!!!2222");

        return jsonObject;
    }
}
