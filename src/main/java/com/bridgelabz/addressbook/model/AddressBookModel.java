package com.bridgelabz.addressbook.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "address_book") // Defines table name

@Data  // Generates getters, setters, toString(), equals(), and hashCode()
@NoArgsConstructor  // Generates a no-args constructor
@AllArgsConstructor // Generates a constructor with all fields

public class AddressBookModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-generate ID
    private Long id;

    private String name;
    private String address;
    private String city;
    private String phone;


//    // Default Constructor (Required by JPA)
//    public AddressBookModel() {}

//    // Parameterized Constructor
//    public AddressBookModel(Long id, String name, String address, String city, String phone) {
//        this.id = id;
//        this.name = name;
//        this.address = address;
//        this.city = city;
//        this.phone = phone;
//    }

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }

    public String getCity() { return city; }
    public void setCity(String city) { this.city = city; }

    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }

}

