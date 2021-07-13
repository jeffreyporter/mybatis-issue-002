package com.jeff.porter.testservice.data.valueobjects;

import java.io.Serializable;
import java.math.BigInteger;

public class PriceVO implements Serializable
{

  private BigInteger productId;

  public BigInteger getProductId()
  {
    return productId;
  }

  public void setProductId(BigInteger productId)
  {
    this.productId = productId;
  }

}
