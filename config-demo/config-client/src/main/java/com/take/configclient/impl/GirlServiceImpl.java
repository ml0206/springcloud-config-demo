package com.take.configclient.impl;

import com.take.configclient.service.PeopleService;
import org.springframework.stereotype.Service;

/**
 * @author ml
 * @date 2020/2/28
 */
@Service("girlServiceImpl")
public class GirlServiceImpl implements PeopleService {

    @Override
    public String work() {
        return "我是女生！！";
    }
}
