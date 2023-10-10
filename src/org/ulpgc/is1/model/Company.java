package org.ulpgc.is1.model;

public class Company extends Contact{
    private String name;
    private String description;

    public Company(String name, String description,
                   String phone, String email,
                   String street, int number, int floor, String city) {
        super(phone, email, street, number, floor, city);
        this.name = name;
        this.description = description;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String getName(){
        return this.name;
    }
}
