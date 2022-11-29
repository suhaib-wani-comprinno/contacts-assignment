package com.comprinno.contacts.Service;

import com.comprinno.contacts.Entity.Contacts;
import com.comprinno.contacts.Repository.ContactsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactsService {

    private final ContactsRepository contactsRepository;

    @Autowired
    public ContactsService(ContactsRepository contactsRepository) {
        this.contactsRepository = contactsRepository;
    }

    public void add(Contacts contacts){
        contactsRepository.save(contacts);
    }

    public List<Contacts> list(){
        return contactsRepository.findAll();
    }

    public void delete(long id){
        contactsRepository.deleteById(id);
    }
}