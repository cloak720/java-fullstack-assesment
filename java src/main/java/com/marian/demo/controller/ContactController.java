package com.marian.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.marian.demo.model.Contact;
import com.marian.demo.service.ContactService;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class ContactController {
    
    @Autowired
    public ContactService contactService;
    
    @GetMapping("/api/address")
    public List<Contact> showAllAddresses() {
        return contactService.getAllAddresses();
    }

    @PostMapping("/api/address")
    public Contact addNewAddress(@RequestBody Contact contact) {
        return contactService.saveAddress(contact);
    }
}
