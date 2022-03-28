package com.contact.service;

import com.contact.entity.Contact;

import java.util.List;

public interface IContactService {
     public List<Contact> getContactsOfUser(Long userId);
}
