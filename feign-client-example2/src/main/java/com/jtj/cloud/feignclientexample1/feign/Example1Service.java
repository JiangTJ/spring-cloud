package com.jtj.cloud.feignclientexample1.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by jiang (jiang.taojie@foxmail.com)
 * 2017/8/2 22:56 End.
 */
@FeignClient(value = "feign-client-example1",fallback = Example1Service.class)
public interface Example1Service {

    @GetMapping("show")
    String show();

}
