package com.constact.constact_service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.constact.constact_service.entity.Contact;
import com.constact.constact_service.service.ContactService;

@RestController
@RequestMapping("/contact")
public class contactController {

	@Autowired
	private ContactService contactService;
	
	@RequestMapping("/user/{userId}")
	public List<Contact> getContacts(@PathVariable("userId") Long userId){
		return this.contactService.getContactsOfUser(userId);
	}
	
	
	
}
