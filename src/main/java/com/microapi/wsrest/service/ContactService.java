package com.microapi.wsrest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microapi.wsrest.dao.ContactRepository;
import com.microapi.wsrest.dto.Contact;

@Service
public class ContactService {

	@Autowired
	ContactRepository dao;

	public Contact save(Contact contact) {
		return dao.saveAndFlush(contact);

	}
}
