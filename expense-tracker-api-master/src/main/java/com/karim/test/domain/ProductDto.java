package com.karim.test.domain;
public class ProductDto {
	
	private String id;
	private String name;
	private String price;
	
	public ProductDto() {
		// TODO Auto-generated constructor stub
	}

	public ProductDto(String id, String name, String price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the price
	 */
	public String getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(String price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "ProductDto [id=" + id + ", name=" + name + ", price=" + price + "]";
	}

	
	
}
