package com.github.zywx.mvclearn.service.impl;

import com.github.zywx.mvclearn.service.HelloService;

import org.springframework.stereotype.Service;

/**
 * A simple class desc
 *
 * author fsnail.wang@gmail.com
 * date 2018/2/10 下午4:07
 */
@Service
public class HelloServiceImpl implements HelloService {

    @Override
    public String demo() {
        return "Hello SpringMvc Demo";
    }
}
