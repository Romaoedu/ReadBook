package br.meplis.ReadBook.entities;

import jakarta.persistence.*;
import org.hibernate.validator.constraints.br.CPF;

@Entity
@Table(name = "Readers" )
public class Reader {

    @Column(name = "name")
    private String name;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long readerId;
    @CPF
    @Column(nullable = false)
    private String cpf;


    @OneToOne(cascade = CascadeType.ALL)
    private Contact contact;

    @OneToOne(cascade = CascadeType.ALL)
    private Address address;

    @Deprecated
    public Reader() {} //No used

    public Reader(String name, String cpf) {
            this.name = name;
            this.cpf = cpf;

        }

        public Address getAddress () {
            return address;
        }
        public void setAddress (Address address){
            this.address = address;
        }
        public Contact getContact () {
            return contact;
        }
        public void setContact (Contact contact){
            this.contact = contact;
        }
        public String getName () {
            return name;
        }
        public void setName (String name){
            this.name = name;
        }
        public Long getReaderId () {
            return readerId;
        }
        public void setReaderId (Long readerId){
            this.readerId = readerId;
        }
        public String getCpf () {
            return cpf;
        }
        public void setCpf (String cpf){
            this.cpf = cpf;
        }
    }

