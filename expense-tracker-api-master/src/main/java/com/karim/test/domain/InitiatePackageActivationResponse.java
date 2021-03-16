package com.karim.test.domain;

public class InitiatePackageActivationResponse {

	private String token;
	private String status;
	
	public InitiatePackageActivationResponse() {
		// TODO Auto-generated constructor stub
	}

	public InitiatePackageActivationResponse(String token, String status) {
		super();
		this.token = token;
		this.status = status;
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
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}
	
	
	
}
