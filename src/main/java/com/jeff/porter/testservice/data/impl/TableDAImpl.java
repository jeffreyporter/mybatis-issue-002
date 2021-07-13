package com.jeff.porter.testservice.data.impl;

import java.util.HashMap;
import java.util.List;

import com.jeff.porter.testservice.data.mapper.PriceMapper;
import com.jeff.porter.testservice.data.valueobjects.PriceVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component("tableAImpl")
public class TableDAImpl
{

  @Autowired
  private PriceMapper priceMapper;

  public List<PriceVO> getPrices()
  {
    try
    {
      return priceMapper.getPrices(new HashMap<>());
    }
    catch (Exception e)
    {
      e.printStackTrace();
    }
    return null;
  }
  
}
