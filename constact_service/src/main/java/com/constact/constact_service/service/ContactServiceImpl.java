package com.constact.constact_service.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.constact.constact_service.entity.Contact;

@Service
public class ContactServiceImpl implements ContactService {
	
	
	//fake data
	List<Contact>list = List.of(
	
	new Contact(1L,"amit@gmail.com","Amit", 121L),
	new Contact(1L,"amit2@gmail.com","Amit2", 121L),
	new Contact(2L,"bhaskar@gmail.com","Bhaskar", 122L),
	new Contact(2L,"bhaskar2@gmail.com","Bhaskar2", 122L),
	new Contact(3L,"chiku@gmail.com","Chiku", 123L),
	new Contact(4L,"daya@gmail.com","Daya", 124L)
			);
	

	@Override
	public List<Contact> getContactsOfUser(Long userId) {
		// TODO Auto-generated method stub
		return list.stream().filter(contact -> contact.getUserId().equals(userId)).collect(Collectors.toList());
	}
	
	

}
