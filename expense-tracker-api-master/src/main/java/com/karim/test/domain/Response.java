package com.karim.test.domain;

import org.springframework.http.HttpStatus;

public class Response {

	private HttpStatus status;
	
	public Response() {
		// TODO Auto-generated constructor stub
	}

	public Response(HttpStatus status) {
		super();
		this.status = status;
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
