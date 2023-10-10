package org.ulpgc.is1.model;

public abstract class Contact {
    private String phone;
    public String email;

    private Address address;

    public Contact(String phone, String email, String street, int number, int floor, String city) {
        this.phone = phone;
        this.email = email;
        this.address = new Address(street, number, floor, city);
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAddress(String street, int number, int floor, String city) {
        this.address = new Address(street, number, floor, city);
    }

    public String getPhone() {
        return this.phone;
    }

    public String getEmail() {
        return this.email;
    }

    public Address getAddress() {
        return this.address;
    }

    public abstract String getName();

}
