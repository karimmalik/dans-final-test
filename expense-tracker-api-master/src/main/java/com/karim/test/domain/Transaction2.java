package com.karim.test.domain;

public class Transaction2 {

	private String transaction_id;
	private String channel;
	private String status_code;
	private String status_desc;
	
	public Transaction2() {
		// TODO Auto-generated constructor stub
	}

	public Transaction2(String transaction_id, String channel, String status_code, String status_desc) {
		super();
		this.transaction_id = transaction_id;
		this.channel = channel;
		this.status_code = status_code;
		this.status_desc = status_desc;
	}

	/**
	 * @return the transaction_id
	 */
	public String getTransaction_id() {
		return transaction_id;
	}

	/**
	 * @param transaction_id the transaction_id to set
	 */
	public void setTransaction_id(String transaction_id) {
		this.transaction_id = transaction_id;
	}

	/**
	 * @return the channel
	 */
	public String getChannel() {
		return channel;
	}

	/**
	 * @param channel the channel to set
	 */
	public void setChannel(String channel) {
		this.channel = channel;
	}

	/**
	 * @return the status_code
	 */
	public String getStatus_code() {
		return status_code;
	}

	/**
	 * @param status_code the status_code to set
	 */
	public void setStatus_code(String status_code) {
		this.status_code = status_code;
	}

	/**
	 * @return the status_desc
	 */
	public String getStatus_desc() {
		return status_desc;
	}

	/**
	 * @param status_desc the status_desc to set
	 */
	public void setStatus_desc(String status_desc) {
		this.status_desc = status_desc;
	}

	@Override
	public String toString() {
		return "Transaction2 [transaction_id=" + transaction_id + ", channel=" + channel + ", status_code="
				+ status_code + ", status_desc=" + status_desc + "]";
	}
	
	
	
}
