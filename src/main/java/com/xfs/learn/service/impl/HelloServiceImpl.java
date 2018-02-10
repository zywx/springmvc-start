package com.xfs.learn.service.impl;

import com.xfs.learn.service.HelloService;
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
