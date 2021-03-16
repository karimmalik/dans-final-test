package com.karim.test.domain;

public class PackageActivationConfirmationRequest2 {

	private String msisdn;
	private String productId;
	private String pin;
	
	public PackageActivationConfirmationRequest2() {
		// TODO Auto-generated constructor stub
	}

	public PackageActivationConfirmationRequest2(String msisdn, String productId, String pin) {
		super();
		this.msisdn = msisdn;
		this.productId = productId;
		this.pin = pin;
	}

	/**
	 * @return the msisdn
	 */
	public String getMsisdn() {
		return msisdn;
	}

	/**
	 * @param msisdn the msisdn to set
	 */
	public void setMsisdn(String msisdn) {
		this.msisdn = msisdn;
	}

	/**
	 * @return the productId
	 */
	public String getProductId() {
		return productId;
	}

	/**
	 * @param productId the productId to set
	 */
	public void setProductId(String productId) {
		this.productId = productId;
	}

	/**
	 * @return the pin
	 */
	public String getPin() {
		return pin;
	}

	/**
	 * @param pin the pin to set
	 */
	public void setPin(String pin) {
		this.pin = pin;
	}
	
	
	
}
