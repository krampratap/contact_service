package com.contact.service;

import com.contact.entity.Contact;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ContactService implements IContactService {

    //list of contacts
    List<Contact> contacts = List.of(
            new Contact(11L, "virat@gmail.com", "Virat", 1L),
            new Contact(12L, "sachin@gmail.com", "Sachin", 2L),
            new Contact(13L, "jind@gmail.com", "Jind", 3L),
            new Contact(14L, "kane@gmail.com", "Kane", 4L),
            new Contact(15L, "virat1234@gmail.com", "Virat", 1L)
    );


    @Override
    public List<Contact> getContactsOfUser(Long userId) {
        return contacts.stream().filter(contact -> contact.getUserId().equals(userId)).collect(Collectors.toList());
    }
}
