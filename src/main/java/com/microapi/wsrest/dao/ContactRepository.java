package com.microapi.wsrest.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microapi.wsrest.dto.Contact;

public interface ContactRepository extends JpaRepository<Contact, Long> {

}
