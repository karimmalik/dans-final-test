package com.karim.test.domain;

public class price_list {
	private Long amount;
	private Long transfer_price;
	private String payment_method;
	private String price_description;
	
	public price_list() {
		// TODO Auto-generated constructor stub
	}
	
	public price_list(Long amount, Long transfer_price, String payment_method, String price_description) {
		super();
		this.amount = amount;
		this.transfer_price = transfer_price;
		this.payment_method = payment_method;
		this.price_description = price_description;
	}

	/**
	 * @return the amount
	 */
	public Long getAmount() {
		return amount;
	}

	/**
	 * @param amount the amount to set
	 */
	public void setAmount(Long amount) {
		this.amount = amount;
	}

	/**
	 * @return the transfer_price
	 */
	public Long getTransfer_price() {
		return transfer_price;
	}

	/**
	 * @param transfer_price the transfer_price to set
	 */
	public void setTransfer_price(Long transfer_price) {
		this.transfer_price = transfer_price;
	}

	/**
	 * @return the payment_method
	 */
	public String getPayment_method() {
		return payment_method;
	}

	/**
	 * @param payment_method the payment_method to set
	 */
	public void setPayment_method(String payment_method) {
		this.payment_method = payment_method;
	}

	/**
	 * @return the price_description
	 */
	public String getPrice_description() {
		return price_description;
	}

	/**
	 * @param price_description the price_description to set
	 */
	public void setPrice_description(String price_description) {
		this.price_description = price_description;
	}
	
	
	
	
}
