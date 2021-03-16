package com.karim.test.domain;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class PackageActivationRequest implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
//	@JsonIgnore
	private String token;
	private String msisdn;
	private String productId;
	
	public PackageActivationRequest() {
		// TODO Auto-generated constructor stub
	}

	public PackageActivationRequest(String token, String msisdn, String productId) {
		super();
		this.token = token;
		this.msisdn = msisdn;
		this.productId = productId;
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

	@Override
	public String toString() {
		return "InitiatePackageActivationRequest [token=" + token + ", msisdn=" + msisdn + ", productId=" + productId
				+ "]";
	}	
	
}
