package org.ulpgc.is1.model;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
    private List<Contact> contacts;
    private List<Group> groups;

    public Agenda() {
        this.contacts = new ArrayList<>();
        this.groups = new ArrayList<>();
    }

    public void addPerson(String firstName, String lastName,
                          String phone, String email,
                          String street, int number, int floor, String city){

        Person newPerson = new Person(firstName, lastName, phone, email, street, number, floor, city);
        this.contacts.add(newPerson);
    }

    public void addCompany(String name, String description,
                           String phone, String email,
                           String street, int number, int floor, String city){

        Company newCompany = new Company(name, description, phone, email, street, number, floor, city);
        this.contacts.add(newCompany);
    }

    public void addGroup(String name){
        //TODO: Create instance before adding
        Group newGroup = new Group(name);
        this.groups.add(newGroup);
    }

    public Person getPerson(String firstName, String lastName){
        for (Contact i: this.contacts) {
            if (i instanceof Person && i.getName().equals(firstName + " " + lastName)){
                return (Person) i;
            }
        }
        return null;
    }

    public Company getCompany(String name){
        for (Contact i: this.contacts) {
            if (i instanceof Company && i.getName().equals(name)){
                return (Company) i;
            }
        }
        return null;
    }

    public Group getGroup(String name){
        for (Group i: this.groups) {
            if (i.getName().equals(name)){
                return i;
            }
        }
        return null;
    }

    public List<Contact> getContacts(){
        return this.contacts;
    }

    public List<Group> getGroups(){
        return this.groups;
    }

}
