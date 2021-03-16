package com.karim.test.domain;

public class PackageActivationConfirmationRequest {

	private String token;
	private String pin;
	
	public PackageActivationConfirmationRequest() {
		// TODO Auto-generated constructor stub
	}

	public PackageActivationConfirmationRequest(String token, String pin) {
		super();
		this.token = token;
		this.pin = pin;
	}

	/**
	 * @return the token
	 */
	public String getToken() {
		return token;
	}

	/**
	 * @param token the token to set
	 */
	public void setToken(String token) {
		this.token = token;
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
