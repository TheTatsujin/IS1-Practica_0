package org.ulpgc.is1.model;

public class Address {
    private String street;
    private int number;
    private int floor;

    private String city;

    //TODO: Is contact an attribute here?
    private Contact contact;

    public Address(String street, int number, int floor, String city, Contact contact) {
        this.street = street;
        this.number = number;
        this.floor = floor;
        this.city = city;
        this.contact = contact;
    }

    public Address(String street, int number, int floor, String city) {
        this.street = street;
        this.number = number;
        this.floor = floor;
        this.city = city;
    }

    // Setters
    public void setStreet(String street) {
        this.street = street;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    // Getters
    public String getStreet() {
        return street;
    }

    public int getNumber() {
        return number;
    }

    public int getFloor() {
        return floor;
    }

    public String getCity() {
        return this.city;
    }

    public Contact getContact() {
        return contact;
    }
}
