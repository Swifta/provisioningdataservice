package com.swifta.sub.mats.operation.data;

import java.math.BigDecimal;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

import org.apache.axis2.AxisFault;

import com.swifta.sub.mats.operation.data.MatsdataserviceStub.Activationrequest;
import com.swifta.sub.mats.operation.data.MatsdataserviceStub.Activationresponse;
import com.swifta.sub.mats.operation.data.MatsdataserviceStub.Activationresponses;
import com.swifta.sub.mats.operation.data.MatsdataserviceStub.ActivationresponsesE;
import com.swifta.sub.mats.operation.data.MatsdataserviceStub.Linkaccountresponse;
import com.swifta.sub.mats.operation.data.MatsdataserviceStub.Linkaccountresponses;
import com.swifta.sub.mats.operation.data.MatsdataserviceStub.LinkaccountresponsesE;
import com.swifta.sub.mats.operation.data.MatsdataserviceStub.Linkccountrequest;
import com.swifta.sub.mats.operation.data.MatsdataserviceStub.Registration;
import com.swifta.sub.mats.operation.data.MatsdataserviceStub.Registrationresponse;
import com.swifta.sub.mats.operation.data.MatsdataserviceStub.Registrationresponses;
import com.swifta.sub.mats.operation.data.MatsdataserviceStub.RegistrationresponsesE;
import com.swifta.sub.mats.operation.data.MatsdataserviceStub.Setdefaultaccountrequest;
import com.swifta.sub.mats.operation.data.MatsdataserviceStub.Setdefaultaccountresponse;
import com.swifta.sub.mats.operation.data.MatsdataserviceStub.Setdefaultaccountresponses;
import com.swifta.sub.mats.operation.data.MatsdataserviceStub.SetdefaultaccountresponsesE;
import com.swifta.sub.mats.operation.data.MatsdataserviceStub.Setparentrequest;
import com.swifta.sub.mats.operation.data.MatsdataserviceStub.Setparentresponse;
import com.swifta.sub.mats.operation.data.MatsdataserviceStub.Setparentresponses;
import com.swifta.sub.mats.operation.data.MatsdataserviceStub.SetparentresponsesE;
import com.swifta.sub.mats.operation.provisioning.v1.ServiceCommission;
import com.swifta.sub.mats.operation.provisioning.v1.ServiceCommissionConditionTypes;
import com.swifta.sub.mats.operation.provisioning.v1.ServiceCommissionModelTypes;
import com.swifta.sub.mats.operation.provisioning.v1.ServiceFeeModel;
import com.swifta.sub.mats.operation.provisioning.v1.ServiceFeematrix;
import com.swifta.sub.mats.operation.provisioning.v1.ServiceFees;
import com.swifta.sub.mats.serviceinterface.ActivationdataModel;
import com.swifta.sub.mats.serviceinterface.DataResponse;
import com.swifta.sub.mats.serviceinterface.IdentificationType;
import com.swifta.sub.mats.serviceinterface.LinkaccountModel;
import com.swifta.sub.mats.serviceinterface.SetparentModel;

public class Client {
	MatsdataserviceStub matsdataserviceStub = null;

	public static void main(String args[]) throws RemoteException,
			DataServiceFault {

		Provisioningclient provisioningclient = new Provisioningclient();

		ActivationdataModel activationdataModel = new ActivationdataModel();
		activationdataModel.setConfirmpassword("");
		activationdataModel.setCurrency("");
		activationdataModel.setFirstpassword("");
		activationdataModel.setIdentificationno("");

		SetparentModel setparentModel = new SetparentModel();

		setparentModel.setChilduserresourceid("823782323");
		setparentModel.setParentuserresourceid("2334");

		LinkaccountModel linkaccountModel = new LinkaccountModel();
		linkaccountModel.setLinkchildresourceid("2323434");
		linkaccountModel.setLinkparentaccountresourceid("233435");
		linkaccountModel.setProfileid(1);

		// provisioningclient.setparent(setparentModel);

		// DataResponse dataResponse = provisioningclient
		// .setparent(setparentModel);
		//
		// DataResponse dataResponse = provisioningclient
		// .linkaccountrequest(linkaccountModel);

		ServiceFeeModel serviceFeeModel = new ServiceFeeModel();
		serviceFeeModel.setSpaccountholderid(4);
		serviceFeeModel.setServicefeecondition("TRANSACTIONTYPE");
		serviceFeeModel.setServicefeemodel("TIERED");

		List<ServiceFees> servicefees = new ArrayList<ServiceFees>();

		List<ServiceCommission> serviceCommissions = new ArrayList<ServiceCommission>();

		ServiceFees serviceFees1 = new ServiceFees(5, new BigDecimal("400.00"),
				new BigDecimal("10000.00"), new BigDecimal("50.00"),
				ServiceFeematrix.FIXED);
		servicefees.add(serviceFees1);

		ServiceFees serviceFees2 = new ServiceFees(5,
				new BigDecimal("10001.00"), new BigDecimal("20000.00"),
				new BigDecimal("100.00"), ServiceFeematrix.FIXED);

		servicefees.add(serviceFees2);

		ServiceFees serviceFees3 = new ServiceFees(5,
				new BigDecimal("20001.00"), new BigDecimal("40000.00"),
				new BigDecimal("1.00"), ServiceFeematrix.PERCENT);

		servicefees.add(serviceFees3);

		serviceFeeModel.setServicefees(servicefees);

		ServiceCommission serviceCommission1 = new ServiceCommission(
				ServiceCommissionConditionTypes.FEE,
				ServiceCommissionModelTypes.NOTAPPLICABLE, 5, new BigDecimal(
						"0.00"), new BigDecimal("0.00"),
				new BigDecimal("25.00"), "PERCENT");

		serviceCommissions.add(serviceCommission1);

		// ServiceCommission serviceCommission2 = new
		// ServiceCommission("AMOUNT",
		// "NOTAPPLICABLE", 5, new BigDecimal("501.00"), new BigDecimal(
		// "1000.00"), new BigDecimal("20.00"), "PERCENT");
		//
		// serviceCommissions.add(serviceCommission2);
		//
		// ServiceCommission serviceCommission3 = new
		// ServiceCommission("AMOUNT",
		// "NOTAPPLICABLE", 5, new BigDecimal("1001.00"), new BigDecimal(
		// "3000.00"), new BigDecimal("30.00"), "PERCENT");
		//
		// serviceCommissions.add(serviceCommission3);

		serviceFeeModel.setServicecommissions(serviceCommissions);

		DataResponse daResponse = provisioningclient
				.setupfeesandcommission(serviceFeeModel);

		System.out.println(daResponse.getStatusMessage());
		System.out.println(daResponse.getStatusDescription());

		// Client client = new Client();
		// client.registration();

	}

	public void registration() throws AxisFault {
		// matsdataserviceStub = new
		// MatsdataserviceStub("http://54.164.96.105:9767/services/matsdataservice/");

		try {
			MatsdataserviceStub matsdataserviceStub = new MatsdataserviceStub(
					"http://54.173.157.210:9767/services/matsdataservice/");
			Registration registration = new Registration();
			registration.setPrimarycontactname("daddy");
			registration.setPrimarycontactmobilenumber("08032249455");
			registration.setPrimarycontactphonenumber("23");
			registration.setPrimarycontactemail("we");

			registration.setSecondarycontactname("232");
			registration.setSecondarycontactmobilenumber("23");
			registration.setSecondarycontactphonenumber("23");
			registration.setSecondarycontactemail("23");

			registration.setIdentificationnumber("09827273");
			registration.setIdentificationtypeid(IdentificationType.NRIN
					.returnIntvalue());
			registration.setExpirydate("2014-01-24");
			registration.setIsssuer("IKOYI");
			registration.setIssueDate("01-09-1983");

			registration
					.setStreetaddress("No 1 Prince Aladejebi Close Iju station agege");
			registration.setPostalCode("232");
			registration.setCity("Lagos");
			registration.setProvince("Ifako");

			registration.setFirstname("Modupe");
			registration.setLastname("Aladeojebi");
			registration.setMiddlename("Adedokun");
			registration.setSuffix("");
			registration.setPrefix("MR");
			registration.setGenderid(1);
			registration.setCountryid(162);
			registration.setCountrystateid(30);
			registration.setCountrystatelgaid(621);
			registration.setLanguageid(2);
			registration.setOccupation("IT CONSULTANT");
			registration.setEmployer("Ecrisson");
			registration.setDateofbirth("01-09-84");
			registration.setUsername("oniru");
			registration.setMsisdn("08032249989");
			registration.setEmail("baadoo@swifta.com");
			registration.setProfileid(7);
			registration.setBankcodeid(1);
			registration.setBankaccount("099392393493");
			registration.setClearingnumber("2334");
			registration.setCurrencyid(175);
			registration.setTermscondition("wewe");
			registration.setSecurityquestions("2334");
			registration.setSecurityquestionanswer("2334");

			RegistrationresponsesE registrationresponsesE = matsdataserviceStub
					.registration(registration);

			Registrationresponses registrationresponses = registrationresponsesE
					.getRegistrationresponses();

			// for (Registrationresponse registrationresponse :
			// registrationresponses
			// .getRegistrationresponse()) {
			// dataResponse.setStatusMessage(registrationresponse
			// .getStatusMessage());
			// }

			for (Registrationresponse registrationresponse : registrationresponses
					.getRegistrationresponse()) {
				System.out.println(registrationresponse.getStatusMessage());
			}
		} catch (Exception e) {
			System.out.println(e.getStackTrace());
			// throw new DataServiceFault(e.getMessage());
		}

	}

	public void activation() throws RemoteException, DataServiceFault {

		MatsdataserviceStub matsdataserviceStub = new MatsdataserviceStub();

		Activationrequest activationrequest = new Activationrequest();

		activationrequest.setUsername("oniru");
		activationrequest.setFirstpassword("23we");
		activationrequest.setConfirmpassword("2334");
		activationrequest.setIdentificationno("09827273");
		activationrequest.setIbankdomainid("1");
		activationrequest.setSecurityquestionanswer("82383434");
		activationrequest.setStatusMessage("2334");
		activationrequest.setCurrencyid("175");

		ActivationresponsesE activationresponsesE = matsdataserviceStub
				.activationrequest(activationrequest);

		Activationresponses activationresponses = activationresponsesE
				.getActivationresponses();

		// for (Registrationresponse registrationresponse :
		// registrationresponses
		// .getRegistrationresponse()) {
		// dataResponse.setStatusMessage(registrationresponse
		// .getStatusMessage());
		// }

		for (Activationresponse activationresponse : activationresponses
				.getActivationresponse()) {
			System.out.println(activationresponse.getStatusMessage());
		}

	}

	public void setparent() throws RemoteException, DataServiceFault {

		MatsdataserviceStub matsdataserviceStub = new MatsdataserviceStub();
		Setparentrequest setparentrequest = new Setparentrequest();

		setparentrequest.setChilduserresourceid("oniru");
		setparentrequest.setParentuserresourceid("dare");

		SetparentresponsesE setparentresponsesE = matsdataserviceStub
				.setparentrequest(setparentrequest);

		Setparentresponses setparentresponses = setparentresponsesE
				.getSetparentresponses();

		// for (Registrationresponse registrationresponse :
		// registrationresponses
		// .getRegistrationresponse()) {
		// dataResponse.setStatusMessage(registrationresponse
		// .getStatusMessage());
		// }

		for (Setparentresponse setparentresponse : setparentresponses
				.getSetparentresponse()) {
			System.out.println(setparentresponse.getStatusMessage());
		}

	}

	public void linkaccount() {

		try {

			MatsdataserviceStub matsdataserviceStub = new MatsdataserviceStub();

			Linkccountrequest linkaccountrequest = new Linkccountrequest();

			linkaccountrequest.setChilduserresourceid("oniru");
			linkaccountrequest.setParentaccountresourceid("dare");
			linkaccountrequest.setProfileid(1);
			linkaccountrequest.setReason("friends");

			LinkaccountresponsesE linkaccountresponsesE = matsdataserviceStub
					.linkccountrequest(linkaccountrequest);

			Linkaccountresponses linkaccountresponses = linkaccountresponsesE
					.getLinkaccountresponses();

			// for (Registrationresponse registrationresponse :
			// registrationresponses
			// .getRegistrationresponse()) {
			// dataResponse.setStatusMessage(registrationresponse
			// .getStatusMessage());
			// }

			for (Linkaccountresponse linkaccountresponse : linkaccountresponses
					.getLinkaccountresponse()) {
				System.out.println(linkaccountresponse.getStatusMessage());
			}

		} catch (DataServiceFault | RemoteException e) {
			DataServiceFault dataservicefault = new DataServiceFault();

			com.swifta.sub.mats.operation.data.MatsdataserviceStub.DataServiceFault dataServiceFault2 = new com.swifta.sub.mats.operation.data.MatsdataserviceStub.DataServiceFault();
			dataServiceFault2 = dataservicefault.getFaultMessage();
			System.out.println(dataServiceFault2.getNested_exception());
		}

	}

	public void setdefaultaccount() throws RemoteException, DataServiceFault {

		MatsdataserviceStub matsdataserviceStub = new MatsdataserviceStub();

		Setdefaultaccountrequest setdefaultaccountrequest = new Setdefaultaccountrequest();

		setdefaultaccountrequest.setChilduserresourceid("oniru");
		setdefaultaccountrequest.setParentaccountresourceid("0000001");

		SetdefaultaccountresponsesE setdefaultaccountresponsesE = matsdataserviceStub
				.setdefaultaccountrequest(setdefaultaccountrequest);

		Setdefaultaccountresponses setdefaultaccountresponses = setdefaultaccountresponsesE
				.getSetdefaultaccountresponses();

		// for (Registrationresponse registrationresponse :
		// registrationresponses
		// .getRegistrationresponse()) {
		// dataResponse.setStatusMessage(registrationresponse
		// .getStatusMessage());
		// }

		for (Setdefaultaccountresponse setdefaultaccountresponse : setdefaultaccountresponses
				.getSetdefaultaccountresponse()) {
			System.out.println(setdefaultaccountresponse.getStatusMessage());
		}

	}
}
