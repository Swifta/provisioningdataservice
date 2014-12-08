package com.swifta.sub.mats.operation.data;

import java.rmi.RemoteException;

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
import com.swifta.sub.mats.operation.data.MatsdataserviceStub.Setupservicecommissionfeeresponse;
import com.swifta.sub.mats.operation.data.MatsdataserviceStub.Setupservicecommissionrequest;
import com.swifta.sub.mats.operation.data.MatsdataserviceStub.Setupservicecommissionresponses;
import com.swifta.sub.mats.operation.data.MatsdataserviceStub.SetupservicecommissionresponsesE;
import com.swifta.sub.mats.operation.data.MatsdataserviceStub.Setupservicefeerequest;
import com.swifta.sub.mats.operation.data.MatsdataserviceStub.Setupservicefeeresponse;
import com.swifta.sub.mats.operation.data.MatsdataserviceStub.Setupservicefeeresponses;
import com.swifta.sub.mats.operation.data.MatsdataserviceStub.SetupservicefeeresponsesE;
import com.swifta.sub.mats.operation.provisioning.v1.ServiceCommission;
import com.swifta.sub.mats.operation.provisioning.v1.ServiceFeeModel;
import com.swifta.sub.mats.operation.provisioning.v1.ServiceFees;
import com.swifta.sub.mats.serviceinterface.ActivationdataModel;
import com.swifta.sub.mats.serviceinterface.DataResponse;
import com.swifta.sub.mats.serviceinterface.LinkaccountModel;
import com.swifta.sub.mats.serviceinterface.RegistrationdataModel;
import com.swifta.sub.mats.serviceinterface.SetdefaultaccountModel;
import com.swifta.sub.mats.serviceinterface.SetparentModel;

public class Provisioningclient {

	private static String OS = System.getProperty("os.name").toLowerCase();

	static String endpoint;

	public static void setOs() {

		if (isWindows()) {
			System.out.println("This is Windows");
		} else if (isMac()) {
			endpoint = "54.173.157.210";
		} else if (isUnix()) {
			endpoint = "localhost";
		} else if (isSolaris()) {
			endpoint = "54.173.157.210";
		} else {
			endpoint = "localhost";
		}
	}

	// public static void main(String args[]) throws RemoteException,
	// DataServiceFault {
	//
	// Client.registration();
	//
	// }

	public DataResponse registration(RegistrationdataModel registrationdataModel)
			throws RemoteException, DataServiceFault {

		Provisioningclient.setOs();

		MatsdataserviceStub matsdataserviceStub = new MatsdataserviceStub(
				"http://" + endpoint + ":9767/services/matsdataservice/");

		Registration registration = new Registration();

		registration.setPrimarycontactname(registrationdataModel
				.getPrimarycontactname());
		registration.setPrimarycontactmobilenumber(registrationdataModel
				.getPrimarycontactmobilenumber());
		registration.setPrimarycontactphonenumber(registrationdataModel
				.getPrimarycontactphonenumber());
		registration.setPrimarycontactemail(registrationdataModel
				.getPrimarycontactemail());

		registration.setSecondarycontactname(registrationdataModel
				.getSecondarycontactname());
		registration.setSecondarycontactmobilenumber(registrationdataModel
				.getSecondarycontactmobilenumber());
		registration.setSecondarycontactphonenumber(registrationdataModel
				.getSecondarycontactphonenumber());
		registration.setSecondarycontactemail(registrationdataModel
				.getSecondarycontactemail());

		registration.setIdentificationnumber(registrationdataModel
				.getIdentificationnumber());
		registration.setIdentificationtypeid(registrationdataModel
				.getIdentificationtypeid());
		registration.setExpirydate(registrationdataModel.getExpirydate());
		registration.setIsssuer(registrationdataModel.getIsssuer());
		registration.setIssueDate(registrationdataModel.getIssueDate());

		registration.setStreetaddress(registrationdataModel.getStreetaddress());
		registration.setPostalCode(registrationdataModel.getPostalCode());
		registration.setCity(registrationdataModel.getCity());
		registration.setProvince(registrationdataModel.getProvince());

		registration.setFirstname(registrationdataModel.getFirstname());
		registration.setLastname(registrationdataModel.getLastname());
		registration.setMiddlename(registrationdataModel.getMiddlename());
		registration.setSuffix(registrationdataModel.getSuffix());
		registration.setPrefix(registrationdataModel.getPrefix());
		registration.setGenderid(registrationdataModel.getGenderid());
		registration.setCountryid(registrationdataModel.getCountryid());
		registration.setCountrystateid(registrationdataModel
				.getCountrystateid());
		registration.setCountrystatelgaid(registrationdataModel
				.getCountrystatelgaid());
		registration.setLanguageid(registrationdataModel.getLanguageid());
		registration.setOccupation(registrationdataModel.getOccupation());
		registration.setEmployer(registrationdataModel.getEmployer());
		registration.setDateofbirth(registrationdataModel.getDateofbirth());
		registration.setUsername(registrationdataModel.getUsername());
		registration.setMsisdn(registrationdataModel.getMsisdn());
		registration.setEmail(registrationdataModel.getEmail());
		registration.setProfileid(registrationdataModel.getProfileid());
		registration.setBankcodeid(registrationdataModel.getBankcodeid());
		registration.setBankaccount(registrationdataModel.getBankaccount());
		registration.setClearingnumber(registrationdataModel
				.getClearingnumber());
		registration.setCurrencyid(registrationdataModel.getCurrency());
		registration.setTermscondition(registrationdataModel
				.getTermscondition());
		registration.setSecurityquestions(registrationdataModel
				.getSecurityquestions());
		registration.setSecurityquestionanswer(registrationdataModel
				.getSecurityquestionanswer());
		registration.setStatusMessage("1");

		RegistrationresponsesE registrationresponsesE = matsdataserviceStub
				.registration(registration);

		Registrationresponses registrationresponses = registrationresponsesE
				.getRegistrationresponses();

		DataResponse dataResponse = new DataResponse();

		for (Registrationresponse registrationresponse : registrationresponses
				.getRegistrationresponse()) {
			dataResponse.setStatusMessage(registrationresponse
					.getStatusMessage());
		}

		// for (Registrationresponse registrationresponse :
		// registrationresponses
		// .getRegistrationresponse()) {
		// System.out.println(registrationresponse.getStatusMessage());
		// }

		return dataResponse;

	}

	public DataResponse activation(ActivationdataModel activationdataModel)
			throws RemoteException, DataServiceFault {

		Provisioningclient.setOs();

		MatsdataserviceStub matsdataserviceStub = new MatsdataserviceStub(
				"http://" + endpoint + ":9767/services/matsdataservice/");

		Activationrequest activationrequest = new Activationrequest();

		activationrequest.setConfirmpassword(activationdataModel
				.getConfirmpassword());
		activationrequest.setCurrencyid(activationdataModel.getCurrency());
		activationrequest.setFirstpassword(activationdataModel
				.getFirstpassword());
		activationrequest.setIdentificationno(activationdataModel
				.getIdentificationno());
		activationrequest.setSecurityquestionanswer(activationdataModel
				.getSecurityquestionanswer());
		activationrequest.setStatusMessage(activationdataModel
				.getStatusMessage());
		activationrequest.setUsername(activationdataModel.getUsername());

		ActivationresponsesE activationresponsesE = matsdataserviceStub
				.activationrequest(activationrequest);

		Activationresponses activationresponses = activationresponsesE
				.getActivationresponses();

		DataResponse dataResponse = new DataResponse();

		for (Activationresponse activationresponse : activationresponses
				.getActivationresponse()) {
			dataResponse
					.setStatusMessage(activationresponse.getStatusMessage());
		}

		return dataResponse;

		// for (Activationresponse activationresponse : activationresponses
		// .getActivationresponse()) {
		// return activationresponse.getStatusMessage();
		// System.out.println(activationresponse.getStatusMessage());
		// }
	}

	public DataResponse setparent(SetparentModel setparent)
			throws RemoteException, DataServiceFault {

		Provisioningclient.setOs();

		MatsdataserviceStub matsdataserviceStub = new MatsdataserviceStub(
				"http://" + endpoint + "9767/services/matsdataservice/");

		Setparentrequest setparentrequest = new Setparentrequest();

		setparentrequest.setChilduserresourceid(setparent
				.getChilduserresourceid());
		setparentrequest.setParentuserresourceid(setparent
				.getParentuserresourceid());

		SetparentresponsesE setparentresponsesE = matsdataserviceStub
				.setparentrequest(setparentrequest);

		Setparentresponses setparentresponses = setparentresponsesE
				.getSetparentresponses();

		DataResponse dataResponse = new DataResponse();

		for (Setparentresponse setparentresponse : setparentresponses
				.getSetparentresponse()) {
			dataResponse.setStatusMessage(setparentresponse.getStatusMessage());
		}

		return dataResponse;

		// for (Activationresponse activationresponse : activationresponses
		// .getActivationresponse()) {
		// return activationresponse.getStatusMessage();
		// System.out.println(activationresponse.getStatusMessage());
		// }
	}

	public DataResponse linkaccountrequest(LinkaccountModel linkaccountModel)
			throws RemoteException, DataServiceFault {

		Provisioningclient.setOs();

		MatsdataserviceStub matsdataserviceStub = new MatsdataserviceStub(
				"http://" + endpoint + ":9767/services/matsdataservice/");

		Linkccountrequest linkaccountrequest = new Linkccountrequest();

		linkaccountrequest.setChilduserresourceid(linkaccountModel
				.getLinkchildresourceid());
		linkaccountrequest.setParentaccountresourceid(linkaccountModel
				.getLinkparentaccountresourceid());
		linkaccountrequest.setProfileid(linkaccountModel.getProfileid());
		linkaccountrequest.setReason(linkaccountModel.getReason());

		LinkaccountresponsesE linkaccountresponsesE = matsdataserviceStub
				.linkccountrequest(linkaccountrequest);

		Linkaccountresponses linkaccountresponses = linkaccountresponsesE
				.getLinkaccountresponses();

		DataResponse dataResponse = new DataResponse();

		for (Linkaccountresponse linkaccountresponse : linkaccountresponses
				.getLinkaccountresponse()) {
			dataResponse.setStatusMessage(linkaccountresponse
					.getStatusMessage());
		}

		return dataResponse;

		// for (Activationresponse activationresponse : activationresponses
		// .getActivationresponse()) {
		// return activationresponse.getStatusMessage();
		// System.out.println(activationresponse.getStatusMessage());
		// }
	}

	public DataResponse setdefaultaccount(
			SetdefaultaccountModel setdefaultaccountModel)
			throws RemoteException, DataServiceFault {

		Provisioningclient.setOs();

		MatsdataserviceStub matsdataserviceStub = new MatsdataserviceStub(
				"http://" + endpoint + ":9767/services/matsdataservice/");

		Setdefaultaccountrequest setdefaultaccountrequest = new Setdefaultaccountrequest();

		setdefaultaccountrequest.setChilduserresourceid(setdefaultaccountModel
				.getDchilduserresourceid());
		setdefaultaccountrequest
				.setParentaccountresourceid(setdefaultaccountModel
						.getDparentaccountresourceid());

		SetdefaultaccountresponsesE setdefaultaccountresponsesE = matsdataserviceStub
				.setdefaultaccountrequest(setdefaultaccountrequest);

		Setdefaultaccountresponses setdefaultaccountresponses = setdefaultaccountresponsesE
				.getSetdefaultaccountresponses();

		DataResponse dataResponse = new DataResponse();

		for (Setdefaultaccountresponse setdefaultaccountresponse : setdefaultaccountresponses
				.getSetdefaultaccountresponse()) {
			dataResponse.setStatusMessage(setdefaultaccountresponse
					.getStatusMessage());
		}

		return dataResponse;

		// for (Activationresponse activationresponse : activationresponses
		// .getActivationresponse()) {
		// return activationresponse.getStatusMessage();
		// System.out.println(activationresponse.getStatusMessage());
		// }
	}

	public DataResponse setupfeesandcommission(ServiceFeeModel serviceFeeModel)
			throws RemoteException, DataServiceFault {

		Provisioningclient.setOs();

		DataResponse dataResponse = new DataResponse();

		MatsdataserviceStub matsdataserviceStub = new MatsdataserviceStub(
				"http://" + endpoint + ":9767/services/matsdataservice/");

		Setupservicefeerequest setupservicefeerequest = new Setupservicefeerequest();

		// List<ServiceFees> serviceFees = new ArrayList<ServiceFees>();

		setupservicefeerequest.setMomoaccountholderid(serviceFeeModel
				.getSpaccountholderid());
		setupservicefeerequest.setServicefeecondition(serviceFeeModel
				.getServicefeecondition());
		setupservicefeerequest.setServicefeemodeltype(serviceFeeModel
				.getServicefeemodel());

		dupsy_loop: for (int i = 0; i < serviceFeeModel.getServicefees().size(); i++) {
			ServiceFees serviceFees = serviceFeeModel.getServicefees().get(i);

			setupservicefeerequest.setTransactiontypeid(serviceFees
					.getTransactiontypeid());
			setupservicefeerequest.setMinimumamount(serviceFees
					.getMinimumamount().doubleValue());
			setupservicefeerequest.setMaximumamount(serviceFees
					.getMaximumamount().doubleValue());
			setupservicefeerequest.setServicefee(serviceFees.getServicefee()
					.doubleValue());
			setupservicefeerequest.setServicefeetype(serviceFees
					.getServicefeetype().toString());

			setupservicefeerequest.setStatusMessage("0");
			setupservicefeerequest.setServicefeepropertiesid(0);
			setupservicefeerequest.setOservicefeecondition("0");
			setupservicefeerequest.setReason("0");

			SetupservicefeeresponsesE setupservicefeeresponsesE = matsdataserviceStub
					.setupservicefeerequest(setupservicefeerequest);

			Setupservicefeeresponses setupservicefeeresponses = setupservicefeeresponsesE
					.getSetupservicefeeresponses();

			for (Setupservicefeeresponse setupservicefeeresponse : setupservicefeeresponses
					.getSetupservicefeeresponse()) {

				dataResponse.setStatusMessage(setupservicefeeresponse
						.getStatusMessage());
				dataResponse.setStatusDescription(setupservicefeeresponse
						.getReason());
				// System.out.println(setupservicefeeresponse.getStatusMessage());
				// System.out.println(setupservicefeeresponse
				// .getServicefeecondition());
				// System.out.println(setupservicefeeresponse
				// .getServicefeepropertiesid());
				if (setupservicefeeresponse.getStatusMessage().equals("FAILED")) {
					break dupsy_loop;
				}

				if (i == (serviceFeeModel.getServicefees().size() - 1)) {
					if (dataResponse.getStatusMessage().equals("COMPLETED")) {

						Setupservicecommissionrequest setupservicecommissionrequest = new Setupservicecommissionrequest();

						for (int j = 0; j < serviceFeeModel
								.getServicecommissions().size(); j++) {

							setupservicecommissionrequest
									.setServicefeepropertiesid(new Integer(
											setupservicefeeresponse
													.getServicefeepropertiesid()));
							setupservicecommissionrequest
									.setServicefeecondition(setupservicefeeresponse
											.getServicefeecondition());

							ServiceCommission serviceCommission = serviceFeeModel
									.getServicecommissions().get(j);

							setupservicecommissionrequest
									.setTransactiontypeid(serviceCommission
											.getTransactiontypeid());
							setupservicecommissionrequest
									.setServicecommissioncondition(serviceCommission
											.getServicecommissioncondition()
											.toString());
							setupservicecommissionrequest
									.setServicecommissionmodeltype(serviceCommission
											.getServicecommissionmodeltype()
											.toString());
							setupservicecommissionrequest
									.setMinimumamount(serviceCommission
											.getMinimumamount().doubleValue());
							setupservicecommissionrequest
									.setMaximumamount(serviceCommission
											.getMaximumamount().doubleValue());
							setupservicecommissionrequest
									.setCommissionfee(serviceCommission
											.getCommissionfee().doubleValue());
							setupservicecommissionrequest
									.setCommissionfeetype(serviceCommission
											.getCommissionfeetype());

							SetupservicecommissionresponsesE setupservicecommissionresponsesE = matsdataserviceStub
									.setupservicecommissionrequest(setupservicecommissionrequest);

							Setupservicecommissionresponses setupservicecommissionresponses = setupservicecommissionresponsesE
									.getSetupservicecommissionresponses();

							for (Setupservicecommissionfeeresponse setupservicecommissionfeeresponse : setupservicecommissionresponses
									.getSetupservicecommissionfeeresponse()) {

								dataResponse
										.setStatusMessage(setupservicecommissionfeeresponse
												.getStatusMessage());
								dataResponse
										.setStatusDescription(setupservicecommissionfeeresponse
												.getReason());
								if (setupservicefeeresponse.getStatusMessage()
										.equals("FAILED")) {
									break dupsy_loop;
								}
							}
						}
					}
				}

			}
		}

		return dataResponse;

	}

	public static boolean isWindows() {

		return (OS.indexOf("win") >= 0);

	}

	public static boolean isMac() {

		return (OS.indexOf("mac") >= 0);

	}

	public static boolean isUnix() {

		return (OS.indexOf("nix") >= 0 || OS.indexOf("nux") >= 0 || OS
				.indexOf("aix") > 0);

	}

	public static boolean isSolaris() {

		return (OS.indexOf("sunos") >= 0);

	}

}
