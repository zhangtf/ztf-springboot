package com.ztf.test.controller;

import com.ztf.test.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

/**
 * @author zhang·tengfei
 * @version 1.0
 * @time 2018-1-10
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private TestService testService;
    @GetMapping("/hello1")
    public String hello1() {
        return "Hello World";
    }
    @GetMapping("/getName")
    public String getName() {
        return testService.getName();
    }

    @RequestMapping("/hello2")
    public List<String> hello2() {
        return Arrays.asList(new String[] { "A", "B", "C" });
    }
}
