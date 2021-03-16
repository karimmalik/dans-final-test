package com.pairlearning.expensetracker.domain;

import java.util.Date;

public class User {

	private Long id;
	private String name;
	private String login_code;
	private String password;
	private Date created_at;
	private Long created_by;
	private Date updated_at;
	private Long updated_by;
	
	public User() {
		// TODO Auto-generated constructor stub
	}

	public User(Long id, String name, String login_code, String password, Date created_at, Long created_by,
			Date updated_at, Long updated_by) {
		super();
		this.id = id;
		this.name = name;
		this.login_code = login_code;
		this.password = password;
		this.created_at = created_at;
		this.created_by = created_by;
		this.updated_at = updated_at;
		this.updated_by = updated_by;
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
	 * @return the login_code
	 */
	public String getLogin_code() {
		return login_code;
	}

	/**
	 * @param login_code the login_code to set
	 */
	public void setLogin_code(String login_code) {
		this.login_code = login_code;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the created_at
	 */
	public Date getCreated_at() {
		return created_at;
	}

	/**
	 * @param created_at the created_at to set
	 */
	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}

	/**
	 * @return the created_by
	 */
	public Long getCreated_by() {
		return created_by;
	}

	/**
	 * @param created_by the created_by to set
	 */
	public void setCreated_by(Long created_by) {
		this.created_by = created_by;
	}

	/**
	 * @return the updated_at
	 */
	public Date getUpdated_at() {
		return updated_at;
	}

	/**
	 * @param updated_at the updated_at to set
	 */
	public void setUpdated_at(Date updated_at) {
		this.updated_at = updated_at;
	}

	/**
	 * @return the updated_by
	 */
	public Long getUpdated_by() {
		return updated_by;
	}

	/**
	 * @param updated_by the updated_by to set
	 */
	public void setUpdated_by(Long updated_by) {
		this.updated_by = updated_by;
	}
	
	
	
//    private Integer userId;
//    private String firstName;
//    private String lastName;
//    private String email;
//    private String password;
//
//    public User(Integer userId, String firstName, String lastName, String email, String password) {
//        this.userId = userId;
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.email = email;
//        this.password = password;
//    }
//
//    public Integer getUserId() {
//        return userId;
//    }
//
//    public void setUserId(Integer userId) {
//        this.userId = userId;
//    }
//
//    public String getFirstName() {
//        return firstName;
//    }
//
//    public void setFirstName(String firstName) {
//        this.firstName = firstName;
//    }
//
//    public String getLastName() {
//        return lastName;
//    }
//
//    public void setLastName(String lastName) {
//        this.lastName = lastName;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public String getPassword() {
//        return password;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }
}
