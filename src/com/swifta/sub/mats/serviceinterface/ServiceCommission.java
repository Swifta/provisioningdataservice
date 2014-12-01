package com.swifta.sub.mats.serviceinterface;

import java.math.BigDecimal;

public class ServiceCommission {
	public String servicecommissioncondition;
	public String servicecommissionmodeltype;
	public int transactiontypeid;
	public BigDecimal minimumamount;
	public BigDecimal maximumamount;
	public BigDecimal commissionfee;
	public String commissionfeetype;

	public ServiceCommission() {
		super();
	}

	public ServiceCommission(String servicecommissioncondition,
			String servicecommissionmodeltype, int transactiontypeid,
			BigDecimal minimumamount, BigDecimal maximumamount,
			BigDecimal commissionfee, String commissionfeetype) {
		super();
		this.servicecommissioncondition = servicecommissioncondition;
		this.servicecommissionmodeltype = servicecommissionmodeltype;
		this.transactiontypeid = transactiontypeid;
		this.minimumamount = minimumamount;
		this.maximumamount = maximumamount;
		this.commissionfee = commissionfee;
		this.commissionfeetype = commissionfeetype;
	}

	public String getServicecommissioncondition() {
		return servicecommissioncondition;
	}

	public void setServicecommissioncondition(String servicecommissioncondition) {
		this.servicecommissioncondition = servicecommissioncondition;
	}

	public String getServicecommissionmodeltype() {
		return servicecommissionmodeltype;
	}

	public void setServicecommissionmodeltype(String servicecommissionmodeltype) {
		this.servicecommissionmodeltype = servicecommissionmodeltype;
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

	public BigDecimal getCommissionfee() {
		return commissionfee;
	}

	public void setCommissionfee(BigDecimal commissionfee) {
		this.commissionfee = commissionfee;
	}

	public String getCommissionfeetype() {
		return commissionfeetype;
	}

	public void setCommissionfeetype(String commissionfeetype) {
		this.commissionfeetype = commissionfeetype;
	}

}
