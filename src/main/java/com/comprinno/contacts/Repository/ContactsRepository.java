package com.comprinno.contacts.Repository;

import com.comprinno.contacts.Entity.Contacts;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactsRepository extends JpaRepository<Contacts, Long> {
}
