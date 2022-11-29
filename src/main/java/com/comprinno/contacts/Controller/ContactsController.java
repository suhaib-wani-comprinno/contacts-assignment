package com.comprinno.contacts.Controller;

import com.comprinno.contacts.Entity.Contacts;
import com.comprinno.contacts.Service.ContactsService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/contacts")
public class ContactsController {

    private final ContactsService contactsService;

    public ContactsController(ContactsService contactsService) {
        this.contactsService = contactsService;
    }

    @GetMapping("list")
    public List<Contacts> list(){
        return contactsService.list();
    }

    @PostMapping("add")
    public String add(@RequestBody Contacts contact){
        contactsService.add(contact);
        return "Added successfully.";
    }
}
