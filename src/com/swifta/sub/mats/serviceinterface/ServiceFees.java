package com.swifta.sub.mats.serviceinterface;

import java.math.BigDecimal;

import com.swifta.sub.mats.serviceinterface.ServiceFeematrix;
import com.swifta.sub.mats.serviceinterface.ServiceFeesInterface;

public class ServiceFees extends ServiceFeesInterface {
	
	public int transactiontypeid;
	public BigDecimal minimumamount;
	public BigDecimal maximumamount;
	public BigDecimal servicefee;
	public ServiceFeematrix servicefeetype;

	public ServiceFees(int transactiontypeid, BigDecimal minimumamount,
			BigDecimal maximumamount, BigDecimal servicefee,
			ServiceFeematrix servicefeetype) {
		super();
		this.transactiontypeid = transactiontypeid;
		this.minimumamount = minimumamount;
		this.maximumamount = maximumamount;
		this.servicefee = servicefee;
		this.servicefeetype = servicefeetype;
	}

	public int getTransactiontypeid() {
		return transactiontypeid;
	}

	public void setTransactiontypeid(int transactiontypeid) {
		this.transactiontypeid = transactiontypeid;
	}

	public BigDecimal getMinimumamount() {
		return minimumamount;
	}

	public void setMinimumamount(BigDecimal minimumamount) {
		this.minimumamount = minimumamount;
	}

	public BigDecimal getMaximumamount() {
		return maximumamount;
	}

	public void setMaximumamount(BigDecimal maximumamount) {
		this.maximumamount = maximumamount;
	}

	public BigDecimal getServicefee() {
		return servicefee;
	}

	public void setServicefee(BigDecimal servicefee) {
		this.servicefee = servicefee;
	}

	public ServiceFeematrix getServicefeetype() {
		return servicefeetype;
	}

	public void setServicefeetype(ServiceFeematrix servicefeetype) {
		this.servicefeetype = servicefeetype;
	}

}
