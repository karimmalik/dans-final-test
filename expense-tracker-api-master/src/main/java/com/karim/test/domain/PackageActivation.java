package com.karim.test.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "package_activation")
public class PackageActivation {

	@Id
	private Long activation_id;
	private String transaction_id;
	private String msisdn;
	private String product_id;
	private int product_price;
	private String product_name;
	private String created_at;
	private int created_by;
	private String updated_at;
	private int updated_by;
	
	public PackageActivation() {
		// TODO Auto-generated constructor stub
	}

	public PackageActivation(Long activation_id, String transaction_id, String msisdn, String product_id,
			int product_price, String product_name, String created_at, int created_by, String updated_at,
			int updated_by) {
		super();
		this.activation_id = activation_id;
		this.transaction_id = transaction_id;
		this.msisdn = msisdn;
		this.product_id = product_id;
		this.product_price = product_price;
		this.product_name = product_name;
		this.created_at = created_at;
		this.created_by = created_by;
		this.updated_at = updated_at;
		this.updated_by = updated_by;
	}

	/**
	 * @return the activation_id
	 */
	public Long getActivation_id() {
		return activation_id;
	}

	/**
	 * @param activation_id the activation_id to set
	 */
	public void setActivation_id(Long activation_id) {
		this.activation_id = activation_id;
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
	 * @return the product_id
	 */
	public String getProduct_id() {
		return product_id;
	}

	/**
	 * @param product_id the product_id to set
	 */
	public void setProduct_id(String product_id) {
		this.product_id = product_id;
	}

	/**
	 * @return the product_price
	 */
	public int getProduct_price() {
		return product_price;
	}

	/**
	 * @param product_price the product_price to set
	 */
	public void setProduct_price(int product_price) {
		this.product_price = product_price;
	}

	/**
	 * @return the product_name
	 */
	public String getProduct_name() {
		return product_name;
	}

	/**
	 * @param product_name the product_name to set
	 */
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}

	/**
	 * @return the created_at
	 */
	public String getCreated_at() {
		return created_at;
	}

	/**
	 * @param created_at the created_at to set
	 */
	public void setCreated_at(String created_at) {
		this.created_at = created_at;
	}

	/**
	 * @return the created_by
	 */
	public int getCreated_by() {
		return created_by;
	}

	/**
	 * @param created_by the created_by to set
	 */
	public void setCreated_by(int created_by) {
		this.created_by = created_by;
	}

	/**
	 * @return the updated_at
	 */
	public String getUpdated_at() {
		return updated_at;
	}

	/**
	 * @param updated_at the updated_at to set
	 */
	public void setUpdated_at(String updated_at) {
		this.updated_at = updated_at;
	}

	/**
	 * @return the updated_by
	 */
	public int getUpdated_by() {
		return updated_by;
	}

	/**
	 * @param updated_by the updated_by to set
	 */
	public void setUpdated_by(int updated_by) {
		this.updated_by = updated_by;
	}

	
	
	
	
}
