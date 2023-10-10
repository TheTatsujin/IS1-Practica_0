package org.ulpgc.is1.model;

public class Person extends Contact{
    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName,
                  String phone, String email,
                  String street, int number, int floor, String city) {

        super(phone, email, street, number, floor, city);
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String getName(){
        StringBuilder sb = new StringBuilder();
        sb.append(this.firstName);
        sb.append(" ");
        sb.append(this.lastName);
        return sb.toString();
    }
}
