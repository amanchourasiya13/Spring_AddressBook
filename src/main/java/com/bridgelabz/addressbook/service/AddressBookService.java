package com.bridgelabz.addressbook.service;

import com.bridgelabz.addressbook.dto.AddressBookDTO;
import com.bridgelabz.addressbook.model.AddressBook;
import org.springframework.stereotype.Service;

@Service
public class AddressBookService {

    public AddressBook addAddress(AddressBookDTO addressBookDTO) {
        return new AddressBook(1L, addressBookDTO.getName(), addressBookDTO.getAddress(), addressBookDTO.getCity(), addressBookDTO.getPhone());
    }

    public String getAllAddresses() {
        return "Returning all addresses";
    }

    public String getAddressById(Long id) {
        return "Returning address with ID: " + id + " Successfully.";
    }

    public String updateAddress(Long id, AddressBookDTO addressBookDTO) {
        return "Address with ID " + id + " updated successfully";
    }

    public String deleteAddress(Long id) {
        return "Address with ID " + id + " deleted successfully";
    }
}
