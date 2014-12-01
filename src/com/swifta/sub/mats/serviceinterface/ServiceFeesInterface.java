package com.swifta.sub.mats.serviceinterface;

import java.math.BigDecimal;


public abstract class ServiceFeesInterface {
	public int transactiontypeid;
	public BigDecimal minimumamount;
	public BigDecimal maximumamount;
	public BigDecimal servicefee;
	public ServiceFeematrix servicefeetype;

}
