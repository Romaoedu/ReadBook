package br.meplis.ReadBook.entities;

import jakarta.persistence.*;


public class Contact {

    private String email;
    private Long phoneNumber;


    @Deprecated
    public Contact(){}

    public Contact(String email, Long phoneNumber) {
        this.email = email;
        this.phoneNumber = phoneNumber;
    }


    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public Long getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

}
