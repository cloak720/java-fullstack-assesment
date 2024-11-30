package com.marian.demo.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marian.demo.model.Contact;
import com.marian.demo.repository.ContactRepository;

@Service
public class ContactService {

    @Autowired
    public ContactRepository contactRepo;

    public List<Contact> getAllAddresses() {
        return contactRepo.findAll();
    }


    public Contact saveAddress(Contact contact) {
        return contactRepo.save(contact);
    }

 
    public Contact getAddressById(int id) {
        return contactRepo.findById(id).orElse(null);
        }

    public void deleteAddress(int id) {
        contactRepo.deleteById(id);
    }
}
