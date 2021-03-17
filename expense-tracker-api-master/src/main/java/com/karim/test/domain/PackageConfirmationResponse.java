package com.karim.test.domain;

public class PackageConfirmationResponse {

	private Transaction transaction;
	private boolean iseligible;
	private String service_id_a;
	private String notification;
	
	public PackageConfirmationResponse() {
		// TODO Auto-generated constructor stub
	}

	public PackageConfirmationResponse(Transaction transaction, boolean iseligible, String service_id_a,
			String notification) {
		super();
		this.transaction = transaction;
		this.iseligible = iseligible;
		this.service_id_a = service_id_a;
		this.notification = notification;
	}

	/**
	 * @return the transaction
	 */
	public Transaction getTransaction() {
		return transaction;
	}

	/**
	 * @param transaction the transaction to set
	 */
	public void setTransaction(Transaction transaction) {
		this.transaction = transaction;
	}

	/**
	 * @return the iseligible
	 */
	public boolean isIseligible() {
		return iseligible;
	}

	/**
	 * @param iseligible the iseligible to set
	 */
	public void setIseligible(boolean iseligible) {
		this.iseligible = iseligible;
	}

	/**
	 * @return the service_id_a
	 */
	public String getService_id_a() {
		return service_id_a;
	}

	/**
	 * @param service_id_a the service_id_a to set
	 */
	public void setService_id_a(String service_id_a) {
		this.service_id_a = service_id_a;
	}

	/**
	 * @return the notification
	 */
	public String getNotification() {
		return notification;
	}

	/**
	 * @param notification the notification to set
	 */
	public void setNotification(String notification) {
		this.notification = notification;
	}
	
	
	
}
