package com.swifta.sub.mats.serviceinterface;

public class Setparent {

	public String childuserresourceid;
	public String parentuserresourceid;

	public Setparent() {
		super();
	}

	public Setparent(String childuserresourceid, String parentuserresourceid) {
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

	public class Linkaccount {
		public String linkchildresourceid;
		public String linkparentaccountresourceid;

		public Linkaccount() {
			super();
		}

		public Linkaccount(String linkchildresourceid,
				String linkparentaccountresourceid) {
			super();
			this.linkchildresourceid = linkchildresourceid;
			this.linkparentaccountresourceid = linkparentaccountresourceid;
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

	}

	public class setdefaultaccount {
		public String dchilduserresourceid;
		public String dparentaccountresourceid;

		public setdefaultaccount() {
			super();
		}

		public setdefaultaccount(String dchilduserresourceid,
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

}
