package com.user.entity;

public class Contact {
	
	private Long cid;
	private String email;
	private String contactname;
	private Long userId;
	public Contact(Long cid, String email, String contactname, Long userId) {
		super();
		this.cid = cid;
		this.email = email;
		this.contactname = contactname;
		this.userId = userId;
	}
	public Contact() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getCid() {
		return cid;
	}
	public void setCid(Long cid) {
		this.cid = cid;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContactname() {
		return contactname;
	}
	public void setContactname(String contactname) {
		this.contactname = contactname;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}

	
	
	
	
}
