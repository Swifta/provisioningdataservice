package com.swifta.sub.mats.serviceinterface;

public class LinkaccountModel {
	public String linkchildresourceid;
	public String linkparentaccountresourceid;
	public int profileid;
	public String reason;

	public LinkaccountModel() {
		super();
	}

	public LinkaccountModel(String linkchildresourceid,
			String linkparentaccountresourceid, int profileid, String reason) {
		super();
		this.linkchildresourceid = linkchildresourceid;
		this.linkparentaccountresourceid = linkparentaccountresourceid;
		this.profileid = profileid;
		this.reason = reason;

	}

	public String getLinkchildresourceid() {
		return linkchildresourceid;
	}

	public void setLinkchildresourceid(String linkchildresourceid) {
		this.linkchildresourceid = linkchildresourceid;
	}

	public String getLinkparentaccountresourceid() {
		return linkparentaccountresourceid;
	}

	public void setLinkparentaccountresourceid(
			String linkparentaccountresourceid) {
		this.linkparentaccountresourceid = linkparentaccountresourceid;
	}

	public int getProfileid() {
		return profileid;
	}

	public void setProfileid(int profileid) {
		this.profileid = profileid;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

}
