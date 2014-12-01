package com.swifta.sub.mats.serviceinterface;

public class SetdefaultaccountModel {

	public String dchilduserresourceid;
	public String dparentaccountresourceid;

	public SetdefaultaccountModel() {
		super();
	}

	public SetdefaultaccountModel(String dchilduserresourceid,
			String dparentaccountresourceid) {
		super();
		this.dchilduserresourceid = dchilduserresourceid;
		this.dparentaccountresourceid = dparentaccountresourceid;
	}

	public String getDchilduserresourceid() {
		return dchilduserresourceid;
	}

	public void setDchilduserresourceid(String dchilduserresourceid) {
		this.dchilduserresourceid = dchilduserresourceid;
	}

	public String getDparentaccountresourceid() {
		return dparentaccountresourceid;
	}

	public void setDparentaccountresourceid(String dparentaccountresourceid) {
		this.dparentaccountresourceid = dparentaccountresourceid;
	}

}
