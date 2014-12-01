package com.swifta.sub.mats.serviceinterface;

import java.math.BigDecimal;

public abstract class ServiceCommissionInterface {
	public ServiceCommissionConditionTypes servicecommissioncondition;
	public ServiceCommissionModelTypes servicecommissionmodeltype;
	public int transactiontypeid;
	public BigDecimal minimumamount;
	public BigDecimal maximumamount;
	public BigDecimal commissionfee;
	public String commissionfeetype;
}
