package br.meplis.ReadBook.entities;

import jakarta.persistence.*;
@Entity
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String street;
    private String city;
    private String state;
    private String country;

    @OneToOne
    @JoinColumn(name = "reader_id")
    private Reader reader;

    @Deprecated
    public Address(){}

    public Address(String street, String city, String state, String country) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.country = country;
    }
    public Reader getReader() {
        return reader;
    }
    public void setReader(Reader reader) {
        this.reader = reader;
    }
    public String getStreet() {
        return street;
    }
    public void setStreet(String street) {
        this.street = street;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }

}
