package com.company;

/**
 * Simulate your phone contacts and message applications
 *
 * Greet the user
 * show these 3 options: 1. Menage Contacts     2. Messages      3. Quit
 * In case of selecting 1 ---> show these options
 *      1. Show all contacts
 *      2. Add a new contact
 *      3. Search for a contact
 *      4. Delete a contact
 *      5. Go back to the previous menu
 *
 * In case of 2 ----> show these options
 *      1. See the list of all messages
 *      2. Send a new message
 *      3. Go back to the previous menu
 *
 * In case of 3 ---> Quit the application
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    // we would be defining our array List of different contacts here because we would be having multiple contacts and we would need to have access to them

    private static ArrayList<Contact> contacts;
    private static Scanner scanner;
    //To have a unique Serial Number for Each message
    private static int sn =0;

    public static void main(String[] args) {

        contacts = new ArrayList<>();

        System.out.println("Welcome to Fisayo Contact and Messaging Services");

        // to have a clean code we would have the options in a new method

        showInitialOptions();

    }

    private static void showInitialOptions() {
        System.out.println("Please choose an option:" +
                "\n\t1. Manage Contacts" +
                "\n\t2. Messages" +
                "\n\t3. Quit");
        // initialise your scanner
        scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        // create a switch statement for the choices
        switch (choice) {
            case 1:
                manageContacts();
                break;
            case 2:
                manageMessages();
                break;
            default:
                break;

        }
    }

    private static void manageMessages() {
        //Show a list of options
        System.out.println("Please select one:" +
                "\n\t1. Show all Messages" +
                "\n\t2. Send a new Message" +
                "\n\t3. Go Back");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                showAllMessages();
                break;
            case 2:
                sendNewMessage();
                break;
            default:
                showInitialOptions();
                break;
        }
    }

    private static void sendNewMessage() {
        //Getting te contacts and recipient name
        System.out.println("Name of Recipient?");
        String name = scanner.next();
        // to check if name is empty or not
        if (name.equals("")) {
            System.out.println("Please re-enter the name of the Contact");
            sendNewMessage();
        }else {
            // we are going to check if the Contact exist
            boolean doesExist = false;
            for (Contact c: contacts) {
                if (c.getName().equals(name)) {
                    doesExist = true;
                }
            }

            if (doesExist) {
                // if we have such contact, we would ask for the message
                System.out.println("You can now type in your Message");
                String text = scanner.next();
                if (text.equals("")) {
                    System.out.println("Please enter your Message again");
                    sendNewMessage();
                }else {
                    //here the message would be saved and added to the contact
                    // Check Line 32 //TODO check line 32 for more information
                    sn++; // a unique serial number
                    Message newMessage = new Message(text, name, sn);
                    // find the contact the message was intended for
                    for (Contact c: contacts) {
                        if (c.getName().equals(name)) {
                            //We need to get the ArrayList of different messages
                            ArrayList<Message> newMessages = c.getMessages();
                            // add the newMessage in line 118 to the newMessages in Line 123 ArrayList
                            newMessages.add(newMessage);
                            //save the current contact
                            Contact currentContact = c;
                            currentContact.setMessages(newMessages);
                            contacts.remove(c);
                            //adding the new contact
                            contacts.add(currentContact); // updating the contacts arrayList
                        }
                    }
                }
            }else {
                System.out.println("These Contact is not registered with this service");
            }
        }
        showInitialOptions();
    }

    private static void showAllMessages() {
        // Saving all the messages into an ArrayList
        ArrayList<Message> allMessages = new ArrayList<>();
        for (Contact c: contacts) {
            allMessages.addAll(c.getMessages()); // by using the addAll method we are adding all the messages of all the contacts to the arraylist
        }

        if (allMessages.size()>0) {
            for (Message m: allMessages) {
                m.getDetails();
                System.out.println("-------------------"); // A separator to separate the messages
            }
        }else {
            System.out.println("You don not have any Messages");
        }

        showInitialOptions();
    }

    private static void manageContacts() {
        System.out.println("Please Select one:" +
                "\n\t1. Show all Contacts" +
                "\n\t2. Add a new Contact" +
                "\n\t3. Search for a Contact" +
                "\n\t4. Delete a Contact" +
                "\n\t5. Go Back");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                showAllContacts();
                break;
            case 2:
                addNewContact();
                break;
            case 3:
                searchForContact();
                break;
            case 4:
                deleteContacts();
                break;
            default:
                showInitialOptions(); // this would go back to the previous menu
                break;
        }
    }

    private static void deleteContacts() {
        System.out.println("Please enter the Contact's name you want deleted:");
        String name = scanner.next();
        if (name.equals("")) {
            System.out.println("Please check Contacts name and try again");
            deleteContacts();
        }else {
            boolean doesExist = false;
            for (Contact c: contacts) {
                if (c.getName().equals(name)) {
                    doesExist = true;
                    contacts.remove(c);
                }
            }

            if (!doesExist) {
                System.out.println("There is no such Contact registered with the service ");
            }
        }
        showInitialOptions();
    }

    private static void searchForContact() {
        System.out.println("Please enter the Contact's name:");
        String name = scanner.next();
        if (name.equals("")) {
            System.out.println("Please enter the Contact's name and try again");
            searchForContact();
        }else {
            boolean doesExist = false;
            for (Contact c: contacts) {
                if (c.getName().equals(name)) {
                    doesExist = true;
                    c.getDetails();
                }
            }

            if (!doesExist) {
                System.out.println("There is no such Contact registered with the services");
            }
        }
        showInitialOptions();
    }

    private static void addNewContact() {
        System.out.println("Adding a new Contact...." +
                "\nPlease enter the Contact's name:");
        String name = scanner.next();
        System.out.println("Please Enter Contact's number:");
        String number = scanner.next();
        System.out.println("Please Enter the Contact's Email:");
        String email = scanner.next();
        // so we won't get an empty string
        if (name.equals("") || number.equals("") || email.equals("")) {
            System.out.println("Please fill in the information");
            // then we start again from the begining by recalling this method
            addNewContact(); // This is called a recursive call ( calling a method from inside that same method)
        }else {
            // to check if there is no related Contact with this registered with the service
            boolean doesExist = false;
            for (Contact c: contacts) {
                if (c.getName().equals(name)) {
                    doesExist = true;
                }
            }

            if (doesExist) {
                System.out.println("We have Contact registered by this name " + name + " with the services");
                addNewContact();
            } else {

                Contact contact = new Contact(name, number, email);
                contacts.add(contact);
                System.out.println("Contact has been registered successfully with the user");
            }

        }
        // show the initial options again ( menu)
        showInitialOptions();

    }

   private static void showAllContacts() {
        if (contacts.size()>0) {
            for (Contact c: contacts) {
                c.getDetails();
                System.out.println("----------------------"); // allows differentiation this isn't necessary
            }

            showInitialOptions();
        }else {
            System.out.println("You do not have any Contacts");
            showInitialOptions();
        }

    }
       

}
