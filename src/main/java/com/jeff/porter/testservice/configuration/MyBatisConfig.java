package com.jeff.porter.testservice.configuration;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@MapperScan(value= {
        "com.jeff.porter.testservice.data.mapper"
})
@ComponentScan(
        value = {
                "com.jeff.porter.testservice"},
        excludeFilters = {
        @ComponentScan.Filter(type= FilterType.REGEX, pattern="com.jeff.porter.dead*.*")
        })

public class MyBatisConfig
{
}
