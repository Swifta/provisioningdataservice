package com.swifta.sub.mats.serviceinterface;

import java.util.List;

public class ServiceFeeModel {

	public int spaccountholderid;
	public String servicefeecondition;
	public String servicefeemodel;
	public List<ServiceFees> servicefees;
	public List<ServiceCommission> servicecommissions;

	public ServiceFeeModel() {
		super();
	}

	public ServiceFeeModel(int spaccountholderid, String servicefeecondition,
			String servicefeemodel, List<ServiceFees> servicefees,
			List<ServiceCommission> servicecommissions) {
		super();
		this.spaccountholderid = spaccountholderid;
		this.servicefeecondition = servicefeecondition;
		this.servicefeemodel = servicefeemodel;
		this.servicefees = servicefees;
		this.servicecommissions = servicecommissions;
	}

	public int getSpaccountholderid() {
		return spaccountholderid;
	}

	public void setSpaccountholderid(int spaccountholderid) {
		this.spaccountholderid = spaccountholderid;
	}

	public String getServicefeecondition() {
		return servicefeecondition;
	}

	public void setServicefeecondition(String servicefeecondition) {
		this.servicefeecondition = servicefeecondition;
	}

	public String getServicefeemodel() {
		return servicefeemodel;
	}

	public void setServicefeemodel(String servicefeemodel) {
		this.servicefeemodel = servicefeemodel;
	}

	public List<ServiceFees> getServicefees() {
		return servicefees;
	}

	public void setServicefees(List<ServiceFees> servicefees) {
		this.servicefees = servicefees;
	}

	public List<ServiceCommission> getServicecommissions() {
		return servicecommissions;
	}

	public void setServicecommissions(List<ServiceCommission> servicecommissions) {
		this.servicecommissions = servicecommissions;
	}

}
