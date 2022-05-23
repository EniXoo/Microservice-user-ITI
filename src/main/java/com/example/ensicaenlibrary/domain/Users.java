package com.example.ensicaenlibrary.domain;

import lombok.Data;
import org.hibernate.annotations.Table;

import javax.persistence.*;

@Data
@Entity
@Table(appliesTo = "users")
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "userid")
    private Integer userId;

    @Column(name = "firstname")
    private String firstname;

    @Column(name = "lastname")
    private String lastname;

    @Column(name = "email")
    private String email;

    @Column(name = "phonenumber")
    private String phoneNumber;

    @Column(name = "zipcode")
    private String zipCode;

    @Column(name = "city")
    private String city;

    @Column(name = "adress")
    private String adress;

    @Column(name = "country")
    private String country;

}
