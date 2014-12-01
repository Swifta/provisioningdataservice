package com.swifta.sub.mats.serviceinterface;

public class RegistrationdataModel {

	public String Primarycontactname;
	public String Primarycontactmobilenumber;
	public String Primarycontactphonenumber;
	public String Primarycontactemail;
	public String Secondarycontactname;
	public String Secondarycontactmobilenumber;
	public String Secondarycontactphonenumber;
	public String Secondarycontactemail;
	public String Identificationnumber;
	public int Identificationtypeid;
	public String Expirydate;
	public String Isssuer;
	public String IssueDate;
	public String Streetaddress;
	public String PostalCode;
	public String City;
	public String Province;
	public String Firstname;
	public String Lastname;
	public String Middlename;
	public String Suffix;
	public String Prefix;
	public int Genderid;
	public int Countryid;
	public int Countrystateid;
	public int Countrystatelgaid;
	public int Languageid;
	public String Occupation;
	public String Employer;
	public String Dateofbirth;
	public String Username;
	public String Msisdn;
	public String Email;
	public int Profileid;
	public int Bankcodeid;
	public String Bankaccount;
	public String Clearingnumber;
	public int Currencyid;
	public String Termscondition;
	public String Securityquestions;
	public String Securityquestionanswer;
	public String StatusMessage;
	private int Currency;

	public RegistrationdataModel() {
		super();
	}

	public RegistrationdataModel(String primarycontactname,
			String primarycontactmobilenumber,
			String primarycontactphonenumber, String primarycontactemail,
			String secondarycontactname, String secondarycontactmobilenumber,
			String secondarycontactphonenumber, String secondarycontactemail,
			String identificationnumber, int identificationtypeid,
			String expirydate, String isssuer, String issueDate,
			String streetaddress, String postalCode, String city,
			String province, String firstname, String lastname,
			String middlename, String suffix, String prefix, int genderid,
			int countryid, int countrystateid, int countrystatelgaid,
			int languageid, String occupation, String employer,
			String dateofbirth, String username, String msisdn, String email,
			int profileid, int bankcodeid, String bankaccount,
			String clearingnumber, int currencyid, String termscondition,
			String securityquestions, String securityquestionanswer,
			String statusMessage, int currency) {
		super();
		Primarycontactname = primarycontactname;
		Primarycontactmobilenumber = primarycontactmobilenumber;
		Primarycontactphonenumber = primarycontactphonenumber;
		Primarycontactemail = primarycontactemail;
		Secondarycontactname = secondarycontactname;
		Secondarycontactmobilenumber = secondarycontactmobilenumber;
		Secondarycontactphonenumber = secondarycontactphonenumber;
		Secondarycontactemail = secondarycontactemail;
		Identificationnumber = identificationnumber;
		Identificationtypeid = identificationtypeid;
		Expirydate = expirydate;
		Isssuer = isssuer;
		IssueDate = issueDate;
		Streetaddress = streetaddress;
		PostalCode = postalCode;
		City = city;
		Province = province;
		Firstname = firstname;
		Lastname = lastname;
		Middlename = middlename;
		Suffix = suffix;
		Prefix = prefix;
		Genderid = genderid;
		Countryid = countryid;
		Countrystateid = countrystateid;
		Countrystatelgaid = countrystatelgaid;
		Languageid = languageid;
		Occupation = occupation;
		Employer = employer;
		Dateofbirth = dateofbirth;
		Username = username;
		Msisdn = msisdn;
		Email = email;
		Profileid = profileid;
		Bankcodeid = bankcodeid;
		Bankaccount = bankaccount;
		Clearingnumber = clearingnumber;
		Currencyid = currencyid;
		Termscondition = termscondition;
		Securityquestions = securityquestions;
		Securityquestionanswer = securityquestionanswer;
		StatusMessage = statusMessage;
		Currency = currency;
	}

	public String getPrimarycontactname() {
		return Primarycontactname;
	}

	public void setPrimarycontactname(String primarycontactname) {
		Primarycontactname = primarycontactname;
	}

	public String getPrimarycontactmobilenumber() {
		return Primarycontactmobilenumber;
	}

	public void setPrimarycontactmobilenumber(String primarycontactmobilenumber) {
		Primarycontactmobilenumber = primarycontactmobilenumber;
	}

	public String getPrimarycontactphonenumber() {
		return Primarycontactphonenumber;
	}

	public void setPrimarycontactphonenumber(String primarycontactphonenumber) {
		Primarycontactphonenumber = primarycontactphonenumber;
	}

	public String getPrimarycontactemail() {
		return Primarycontactemail;
	}

	public void setPrimarycontactemail(String primarycontactemail) {
		Primarycontactemail = primarycontactemail;
	}

	public String getSecondarycontactname() {
		return Secondarycontactname;
	}

	public void setSecondarycontactname(String secondarycontactname) {
		Secondarycontactname = secondarycontactname;
	}

	public String getSecondarycontactmobilenumber() {
		return Secondarycontactmobilenumber;
	}

	public void setSecondarycontactmobilenumber(
			String secondarycontactmobilenumber) {
		Secondarycontactmobilenumber = secondarycontactmobilenumber;
	}

	public String getSecondarycontactphonenumber() {
		return Secondarycontactphonenumber;
	}

	public void setSecondarycontactphonenumber(
			String secondarycontactphonenumber) {
		Secondarycontactphonenumber = secondarycontactphonenumber;
	}

	public String getSecondarycontactemail() {
		return Secondarycontactemail;
	}

	public void setSecondarycontactemail(String secondarycontactemail) {
		Secondarycontactemail = secondarycontactemail;
	}

	public String getIdentificationnumber() {
		return Identificationnumber;
	}

	public void setIdentificationnumber(String identificationnumber) {
		Identificationnumber = identificationnumber;
	}

	public int getIdentificationtypeid() {
		return Identificationtypeid;
	}

	public void setIdentificationtypeid(int identificationtypeid) {
		Identificationtypeid = identificationtypeid;
	}

	public String getExpirydate() {
		return Expirydate;
	}

	public void setExpirydate(String expirydate) {
		Expirydate = expirydate;
	}

	public String getIsssuer() {
		return Isssuer;
	}

	public void setIsssuer(String isssuer) {
		Isssuer = isssuer;
	}

	public String getIssueDate() {
		return IssueDate;
	}

	public void setIssueDate(String issueDate) {
		IssueDate = issueDate;
	}

	public String getStreetaddress() {
		return Streetaddress;
	}

	public void setStreetaddress(String streetaddress) {
		Streetaddress = streetaddress;
	}

	public String getPostalCode() {
		return PostalCode;
	}

	public void setPostalCode(String postalCode) {
		PostalCode = postalCode;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

	public String getProvince() {
		return Province;
	}

	public void setProvince(String province) {
		Province = province;
	}

	public String getFirstname() {
		return Firstname;
	}

	public void setFirstname(String firstname) {
		Firstname = firstname;
	}

	public String getLastname() {
		return Lastname;
	}

	public void setLastname(String lastname) {
		Lastname = lastname;
	}

	public String getMiddlename() {
		return Middlename;
	}

	public void setMiddlename(String middlename) {
		Middlename = middlename;
	}

	public String getSuffix() {
		return Suffix;
	}

	public void setSuffix(String suffix) {
		Suffix = suffix;
	}

	public String getPrefix() {
		return Prefix;
	}

	public void setPrefix(String prefix) {
		Prefix = prefix;
	}

	public int getGenderid() {
		return Genderid;
	}

	public void setGenderid(int genderid) {
		Genderid = genderid;
	}

	public int getCountryid() {
		return Countryid;
	}

	public void setCountryid(int countryid) {
		Countryid = countryid;
	}

	public int getCountrystateid() {
		return Countrystateid;
	}

	public void setCountrystateid(int countrystateid) {
		Countrystateid = countrystateid;
	}

	public int getCountrystatelgaid() {
		return Countrystatelgaid;
	}

	public void setCountrystatelgaid(int countrystatelgaid) {
		Countrystatelgaid = countrystatelgaid;
	}

	public int getLanguageid() {
		return Languageid;
	}

	public void setLanguageid(int languageid) {
		Languageid = languageid;
	}

	public String getOccupation() {
		return Occupation;
	}

	public void setOccupation(String occupation) {
		Occupation = occupation;
	}

	public String getEmployer() {
		return Employer;
	}

	public void setEmployer(String employer) {
		Employer = employer;
	}

	public String getDateofbirth() {
		return Dateofbirth;
	}

	public void setDateofbirth(String dateofbirth) {
		Dateofbirth = dateofbirth;
	}

	public String getUsername() {
		return Username;
	}

	public void setUsername(String username) {
		Username = username;
	}

	public String getMsisdn() {
		return Msisdn;
	}

	public void setMsisdn(String msisdn) {
		Msisdn = msisdn;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public int getProfileid() {
		return Profileid;
	}

	public void setProfileid(int profileid) {
		Profileid = profileid;
	}

	public int getBankcodeid() {
		return Bankcodeid;
	}

	public void setBankcodeid(int bankcodeid) {
		Bankcodeid = bankcodeid;
	}

	public String getBankaccount() {
		return Bankaccount;
	}

	public void setBankaccount(String bankaccount) {
		Bankaccount = bankaccount;
	}

	public String getClearingnumber() {
		return Clearingnumber;
	}

	public void setClearingnumber(String clearingnumber) {
		Clearingnumber = clearingnumber;
	}

	public int getCurrencyid() {
		return Currencyid;
	}

	public void setCurrencyid(int currencyid) {
		Currencyid = currencyid;
	}

	public String getTermscondition() {
		return Termscondition;
	}

	public void setTermscondition(String termscondition) {
		Termscondition = termscondition;
	}

	public String getSecurityquestions() {
		return Securityquestions;
	}

	public void setSecurityquestions(String securityquestions) {
		Securityquestions = securityquestions;
	}

	public String getSecurityquestionanswer() {
		return Securityquestionanswer;
	}

	public void setSecurityquestionanswer(String securityquestionanswer) {
		Securityquestionanswer = securityquestionanswer;
	}

	public String getStatusMessage() {
		return StatusMessage;
	}

	public void setStatusMessage(String statusMessage) {
		StatusMessage = statusMessage;
	}

	public int getCurrency() {
		return Currency;
	}

	public void setCurrency(int currency) {
		Currency = currency;
	}

}
