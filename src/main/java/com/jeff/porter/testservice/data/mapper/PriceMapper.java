package com.jeff.porter.testservice.data.mapper;

import com.jeff.porter.testservice.data.valueobjects.PriceVO;

import java.util.List;
import java.util.Map;

public interface PriceMapper
{

  List<PriceVO> getPrices(Map<String, Object> params);

}
