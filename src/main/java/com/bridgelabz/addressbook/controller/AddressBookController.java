package com.bridgelabz.addressbook.controller;

import com.bridgelabz.addressbook.dto.AddressBookDTO;
import com.bridgelabz.addressbook.model.AddressBookModel;
import com.bridgelabz.addressbook.model.AddressBookModel;
import com.bridgelabz.addressbook.service.AddressBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/addressbook")
public class AddressBookController {

    @Autowired
    private AddressBookService addressBookService;

    @PostMapping("/add")
    public ResponseEntity<AddressBookModel> addAddress(@RequestBody AddressBookDTO addressBookDTO) {
        return ResponseEntity.ok(addressBookService.addAddress(addressBookDTO));
    }

    @GetMapping("/all")
    public ResponseEntity<List<AddressBookModel>> getAllAddresses() {
        return ResponseEntity.ok(addressBookService.getAllAddresses());
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getAddressById(@PathVariable Long id) {
        AddressBookModel address = addressBookService.getAddressById(id);
        if (address == null) {
            return ResponseEntity.badRequest().body("Address with ID " + id + " not found!");
        }
        return ResponseEntity.ok(address);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<?> updateAddress(@PathVariable Long id, @RequestBody AddressBookDTO addressBookDTO) {
        AddressBookModel updatedAddress = addressBookService.updateAddress(id, addressBookDTO);
        if (updatedAddress == null) {
            return ResponseEntity.badRequest().body("Address with ID " + id + " not found!");
        }
        return ResponseEntity.ok(updatedAddress);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteAddress(@PathVariable Long id) {
        boolean deleted = addressBookService.deleteAddress(id);
        if (!deleted) {
            return ResponseEntity.badRequest().body("Address with ID " + id + " not found!");
        }
        return ResponseEntity.ok("Address deleted successfully");
    }
}