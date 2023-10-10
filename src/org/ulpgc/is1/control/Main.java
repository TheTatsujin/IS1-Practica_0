package org.ulpgc.is1.control;

import org.ulpgc.is1.model.Agenda;

public class Main {
    public static void main(String[] args) {
        //TODO: DUDAS
        /*
        *  -La Implementación es correcta?
        *  Agenda: Es una Composicion ----> No deberia de existir instancias vacias?
        *  Main: Es un correcto uso de las clases?
        *       A - Los Grupos no se pueden alamcenar como instancias de grupo fuera de agenda
        *       B - Lo mismo con los Contactos
        *       C - Los Address tampoco, solo como instancias dentro de Contactos
        *
        *       A, B, C ----> La unica forma de acceder y modficarlos es encadenando gets, no?
        *
        *
        * */

        Agenda test = new Agenda();
        test.addPerson("John", "Doe", "65589544", "johnDoe@gmail.com",
                "Sesame street", 14, 4, "San Francisco");

        test.addPerson("Jane", "Smith", "12345678", "janeSmith@gmail.com",
                "Maple Avenue", 21, 8, "Los Angeles");

        test.addGroup("Trabajo");
        test.getGroup("Trabajo").addContact(test.getPerson("Jane", "Smith"));
        test.getGroup("Trabajo").addContact(test.getPerson("John", "Doe"));

        System.out.println(test.getContacts().size());
        System.out.println(test.getGroup("Trabajo").getContacts().size());

        test.getGroup("Trabajo").removeContact(1);

        System.out.println(test.getGroup("Trabajo").getContacts().size());

    }
}