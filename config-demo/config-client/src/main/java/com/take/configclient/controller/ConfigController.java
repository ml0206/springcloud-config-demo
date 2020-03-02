package com.take.configclient.controller;

import com.take.configclient.service.PeopleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ml
 * @date 2020/2/26
 */
@RestController
@RefreshScope  // 使用该注解的类，会在接到SpringCloud配置中心配置刷新的时候，自动将新的配置更新到该类对应的字段中。
public class ConfigController {

    @Value("${config}")
    private String config;

    @RequestMapping("config")
    public String config(){
        return this.config;
    }

    @Autowired
//    @Qualifier("girlServiceImpl")
    private PeopleService peopleService;

    @RequestMapping("work")
    public String work(){
        return peopleService.work();

    }

}
