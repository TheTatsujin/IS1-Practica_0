package org.ulpgc.is1.model;

import java.util.ArrayList;
import java.util.List;

public class Group {
    private final String name;

    private List<Contact> contacts;

    public Group(String name) {
        this.name = name;
        this.contacts = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    public List<Contact> getContacts() {
        return this.contacts;
    }

    public void addContact(Contact newContact){
        this.contacts.add(newContact);
    }

    public void removeContact(Contact delContact){
        this.contacts.remove(delContact);
    }

    public void removeContact(int index){
        if (index < this.contacts.size()){
            this.contacts.remove(index-1);
        }
    }
}
