package com.karim.test.domain;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Offer {

	
	private Long id;
	
	private String name;
	
	private String highlight;
	
	private String menu_id;
	
	private String short_desc;
	
	private String long_desc;
	
	private String stock_type;
	
	private String terms;
	
	private long price;
	
	private int transfer_price;
	
	private boolean campaign_flag;
	
	private String product_length;
	
	private int offer_priority;
	
	private String promotional_flag;
	
	private String category;
	
	private String subcategory;
	
	private int adn;
	
	private String tag;
	
	private String product_family;
	@JsonIgnore
	private List<Bonus> bonus;
	@JsonIgnore
	private price_list price_List;
	
	public Offer() {
		// TODO Auto-generated constructor stub
	}

	public Offer(Long id, String name, String highlight, String menu_id, String short_desc, String long_desc,
			String stock_type, String terms, long price, int transfer_price, boolean campaign_flag,
			String product_length, int offer_priority, String promotional_flag, String category, String subcategory,
			int adn, String tag, String product_family, List<Bonus> bonus, price_list price_List) {
		super();
		this.id = id;
		this.name = name;
		this.highlight = highlight;
		this.menu_id = menu_id;
		this.short_desc = short_desc;
		this.long_desc = long_desc;
		this.stock_type = stock_type;
		this.terms = terms;
		this.price = price;
		this.transfer_price = transfer_price;
		this.campaign_flag = campaign_flag;
		this.product_length = product_length;
		this.offer_priority = offer_priority;
		this.promotional_flag = promotional_flag;
		this.category = category;
		this.subcategory = subcategory;
		this.adn = adn;
		this.tag = tag;
		this.product_family = product_family;
		this.bonus = bonus;
		this.price_List = price_List;
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
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
	 * @return the highlight
	 */
	public String getHighlight() {
		return highlight;
	}

	/**
	 * @param highlight the highlight to set
	 */
	public void setHighlight(String highlight) {
		this.highlight = highlight;
	}

	/**
	 * @return the menu_id
	 */
	public String getMenu_id() {
		return menu_id;
	}

	/**
	 * @param menu_id the menu_id to set
	 */
	public void setMenu_id(String menu_id) {
		this.menu_id = menu_id;
	}

	/**
	 * @return the short_desc
	 */
	public String getShort_desc() {
		return short_desc;
	}

	/**
	 * @param short_desc the short_desc to set
	 */
	public void setShort_desc(String short_desc) {
		this.short_desc = short_desc;
	}

	/**
	 * @return the long_desc
	 */
	public String getLong_desc() {
		return long_desc;
	}

	/**
	 * @param long_desc the long_desc to set
	 */
	public void setLong_desc(String long_desc) {
		this.long_desc = long_desc;
	}

	/**
	 * @return the stock_type
	 */
	public String getStock_type() {
		return stock_type;
	}

	/**
	 * @param stock_type the stock_type to set
	 */
	public void setStock_type(String stock_type) {
		this.stock_type = stock_type;
	}

	/**
	 * @return the terms
	 */
	public String getTerms() {
		return terms;
	}

	/**
	 * @param terms the terms to set
	 */
	public void setTerms(String terms) {
		this.terms = terms;
	}

	/**
	 * @return the price
	 */
	public long getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(long price) {
		this.price = price;
	}

	/**
	 * @return the transfer_price
	 */
	public int getTransfer_price() {
		return transfer_price;
	}

	/**
	 * @param transfer_price the transfer_price to set
	 */
	public void setTransfer_price(int transfer_price) {
		this.transfer_price = transfer_price;
	}

	/**
	 * @return the campaign_flag
	 */
	public boolean isCampaign_flag() {
		return campaign_flag;
	}

	/**
	 * @param campaign_flag the campaign_flag to set
	 */
	public void setCampaign_flag(boolean campaign_flag) {
		this.campaign_flag = campaign_flag;
	}

	/**
	 * @return the product_length
	 */
	public String getProduct_length() {
		return product_length;
	}

	/**
	 * @param product_length the product_length to set
	 */
	public void setProduct_length(String product_length) {
		this.product_length = product_length;
	}

	/**
	 * @return the offer_priority
	 */
	public int getOffer_priority() {
		return offer_priority;
	}

	/**
	 * @param offer_priority the offer_priority to set
	 */
	public void setOffer_priority(int offer_priority) {
		this.offer_priority = offer_priority;
	}

	/**
	 * @return the promotional_flag
	 */
	public String getPromotional_flag() {
		return promotional_flag;
	}

	/**
	 * @param promotional_flag the promotional_flag to set
	 */
	public void setPromotional_flag(String promotional_flag) {
		this.promotional_flag = promotional_flag;
	}

	/**
	 * @return the category
	 */
	public String getCategory() {
		return category;
	}

	/**
	 * @param category the category to set
	 */
	public void setCategory(String category) {
		this.category = category;
	}

	/**
	 * @return the subcategory
	 */
	public String getSubcategory() {
		return subcategory;
	}

	/**
	 * @param subcategory the subcategory to set
	 */
	public void setSubcategory(String subcategory) {
		this.subcategory = subcategory;
	}

	/**
	 * @return the adn
	 */
	public int getAdn() {
		return adn;
	}

	/**
	 * @param adn the adn to set
	 */
	public void setAdn(int adn) {
		this.adn = adn;
	}

	/**
	 * @return the tag
	 */
	public String getTag() {
		return tag;
	}

	/**
	 * @param tag the tag to set
	 */
	public void setTag(String tag) {
		this.tag = tag;
	}

	/**
	 * @return the product_family
	 */
	public String getProduct_family() {
		return product_family;
	}

	/**
	 * @param product_family the product_family to set
	 */
	public void setProduct_family(String product_family) {
		this.product_family = product_family;
	}

	/**
	 * @return the bonus
	 */
	public List<Bonus> getBonus() {
		return bonus;
	}

	/**
	 * @param bonus the bonus to set
	 */
	public void setBonus(List<Bonus> bonus) {
		this.bonus = bonus;
	}

	/**
	 * @return the price_List
	 */
	public price_list getPrice_List() {
		return price_List;
	}

	/**
	 * @param price_List the price_List to set
	 */
	public void setPrice_List(price_list price_List) {
		this.price_List = price_List;
	}

	

	

	

	
	
	
}
