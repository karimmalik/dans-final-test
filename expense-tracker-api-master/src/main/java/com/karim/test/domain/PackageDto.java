package com.karim.test.domain;

public class PackageDto {

	private String activationId;
	private String msisdn;
	private String productId;
	private String productName;
	private String productPrice;
	
	public PackageDto() {
		// TODO Auto-generated constructor stub
	}

	public PackageDto(String activationId, String msisdn, String productId, String productName, String productPrice) {
		super();
		this.activationId = activationId;
		this.msisdn = msisdn;
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
	}

	/**
	 * @return the activationId
	 */
	public String getActivationId() {
		return activationId;
	}

	/**
	 * @param activationId the activationId to set
	 */
	public void setActivationId(String activationId) {
		this.activationId = activationId;
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
	 * @return the productName
	 */
	public String getProductName() {
		return productName;
	}

	/**
	 * @param productName the productName to set
	 */
	public void setProductName(String productName) {
		this.productName = productName;
	}

	/**
	 * @return the productPrice
	 */
	public String getProductPrice() {
		return productPrice;
	}

	/**
	 * @param productPrice the productPrice to set
	 */
	public void setProductPrice(String productPrice) {
		this.productPrice = productPrice;
	}

	@Override
	public String toString() {
		return "PackageDto [activationId=" + activationId + ", msisdn=" + msisdn + ", productId=" + productId
				+ ", productName=" + productName + ", productPrice=" + productPrice + "]";
	}
	
	
}
