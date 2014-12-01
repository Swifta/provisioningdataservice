package com.swifta.sub.mats.serviceinterface;

public class SetparentModel {

	public String childuserresourceid;
	public String parentuserresourceid;

	public SetparentModel() {
		super();
	}

	public SetparentModel(String childuserresourceid, String parentuserresourceid) {
		super();
		this.childuserresourceid = childuserresourceid;
		this.parentuserresourceid = parentuserresourceid;
	}

	public String getChilduserresourceid() {
		return childuserresourceid;
	}

	public void setChilduserresourceid(String childuserresourceid) {
		this.childuserresourceid = childuserresourceid;
	}

	public String getParentuserresourceid() {
		return parentuserresourceid;
	}

	public void setParentuserresourceid(String parentuserresourceid) {
		this.parentuserresourceid = parentuserresourceid;
	}

	
	
}
