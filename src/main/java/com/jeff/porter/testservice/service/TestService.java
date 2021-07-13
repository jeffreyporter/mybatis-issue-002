package com.jeff.porter.testservice.service;

import com.jeff.porter.testservice.data.impl.TableDAImpl;
import com.jeff.porter.testservice.data.valueobjects.PriceVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.Collection;

@Slf4j
@Service
public class TestService
{
    @Autowired
    TableDAImpl tableDA;

    public Collection<PriceVO> callDB()
    {
        return tableDA.getPrices();
    }
}
