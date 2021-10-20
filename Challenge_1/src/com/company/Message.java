package com.company;

public class Message {
        private String text;
        private String ContactName;
        private  int sn;


    public Message(String text, String contactName, int sn) {
        this.text = text;
        ContactName = contactName;
        this.sn = sn;
    }

    public void getDetails() {
        System.out.println("Contact Name: " + ContactName +
        "\nMessage: " + text + "" +
                "\nsn: " + sn);
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getContactName() {
        return ContactName;
    }

    public void setContactName(String contactName) {
        ContactName = contactName;
    }

    public int getSn() {
        return sn;
    }

    public void setSn(int sn) {
        this.sn = sn;
    }
}
