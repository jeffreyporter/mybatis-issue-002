package com.jeff.porter.testservice.controllers;

import com.jeff.porter.testservice.data.valueobjects.PriceVO;
import com.jeff.porter.testservice.service.TestService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@Slf4j
@RequestMapping(value = "/prices")
public class TestController
{
    @Autowired
    TestService testService;

    @GetMapping("/test")
    public Collection<PriceVO> test()
    {
        return testService.callDB();
    }


}
