package com.karim.test.domain;

import org.springframework.http.HttpStatus;

public class PackageActivationResponse {

	private String token;
	private HttpStatus status;
	
	public PackageActivationResponse() {
		// TODO Auto-generated constructor stub
	}

	public PackageActivationResponse(String token, HttpStatus status) {
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
	public HttpStatus getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(HttpStatus status) {
		this.status = status;
	}
	
	
	
}
