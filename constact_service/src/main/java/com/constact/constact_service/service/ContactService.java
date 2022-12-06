package com.constact.constact_service.service;

import java.util.List;

import com.constact.constact_service.entity.Contact;

public interface ContactService {
	
	public List<Contact> getContactsOfUser(Long userId);
	
	

}
