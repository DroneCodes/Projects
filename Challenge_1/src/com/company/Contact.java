package com.company;

import java.util.ArrayList;

public class Contact {
    private String name;
    private String number;
    private String Email;
    private ArrayList<Message> messages;

    public Contact(String name, String number, String email, ArrayList<Message> messages) {
        this.name = name;
        this.number = number;
        Email = email;
        this.messages = messages;
    }
            // Contacts doesn't have any messages when just created so we would create a constructor that doesn't accept messages
    public Contact(String name, String number, String email) {
        this.name = name;
        this.number = number;
        Email = email;
        this.messages = new ArrayList<>();// so the ArrayList won't be null

        // at the tim of creating the Contacts the message arralist would be empty
    }

    public void getDetails() {
        System.out.println("Name: " + this.name + "" +
                "\nNumber: " + this.number + "" +
                "\nEmail: " + this.Email);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public ArrayList<Message> getMessages() {
        return messages;
    }

    public void setMessages(ArrayList<Message> messages) {
        this.messages = messages;
    }
}
