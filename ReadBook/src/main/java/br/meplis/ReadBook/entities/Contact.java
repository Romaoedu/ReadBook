package br.meplis.ReadBook.entities;

import jakarta.persistence.*;

@Entity
public class Contact {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String email;
    private Long phoneNumber;

    @OneToOne
    @JoinColumn(name = "reader_id")
    private Reader reader;

    @Deprecated
    public Contact(){}

    public Contact(String email, Long phoneNumber) {
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public Reader getReader() {return reader;}
    public void setReader(Reader reader) {
        this.reader = reader;
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
