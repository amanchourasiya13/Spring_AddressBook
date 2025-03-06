package com.bridgelabz.addressbook.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data  // Generates getters, setters, toString(), equals(), and hashCode()
@NoArgsConstructor  // Generates a no-args constructor
@AllArgsConstructor // Generates a constructor with all fields
public class AddressBook {
    private Long id;
    private String name;
    private String address;
    private String city;
    private String phone;
}
