package com.ztf.test.service.impl;

import com.ztf.test.service.TestService;
import org.springframework.stereotype.Service;

/**
 * @author zhang·tengfei
 * @version 1.0
 * @time 2018-1-10
 */
@Service("testService")
public class TestServiceImpl implements TestService {

    @Override
    public String getName() {
        return "tengfei";
    }
}
