package com.bridgelabz.addressbook.controller;

import com.bridgelabz.addressbook.dto.AddressBookDTO;
import com.bridgelabz.addressbook.model.AddressBook;
import com.bridgelabz.addressbook.service.AddressBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/addressbook")
public class AddressBookController {

    @Autowired
    private AddressBookService addressBookService;

    @GetMapping
    public String test() {
        return "Spring Boot is running!";
    }

    @PostMapping("/add")
    public ResponseEntity<AddressBook> addAddress(@RequestBody AddressBookDTO addressBookDTO) {
        return ResponseEntity.ok(addressBookService.addAddress(addressBookDTO));
    }

    @GetMapping("/all")
    public ResponseEntity<String> getAllAddresses() {
        return ResponseEntity.ok(addressBookService.getAllAddresses());
    }

    @GetMapping("/{id}")
    public ResponseEntity<String> getAddressById(@PathVariable Long id) {
        return ResponseEntity.ok(addressBookService.getAddressById(id));
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<String> updateAddress(@PathVariable Long id, @RequestBody AddressBookDTO addressBookDTO) {
        return ResponseEntity.ok(addressBookService.updateAddress(id, addressBookDTO));
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteAddress(@PathVariable Long id) {
        return ResponseEntity.ok(addressBookService.deleteAddress(id));
    }
}