package com.codeclan.example.Shop_Exchange.controllers;

import com.codeclan.example.Shop_Exchange.models.Rental;
import com.codeclan.example.Shop_Exchange.repositories.RentalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rentals")
public class RentalController {

    @Autowired
    RentalRepository rentalRepository;

    @GetMapping
    public ResponseEntity<List<Rental>> getAllRentals(){
        return new ResponseEntity<>(rentalRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value="/{id}")
    public ResponseEntity<Rental> getRental(@PathVariable Long id) {
        return new ResponseEntity(rentalRepository.findById(id), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Rental> postRental(@RequestBody Rental rental) {
        rentalRepository.save(rental);
        return new ResponseEntity<>(rental, HttpStatus.CREATED);
    }

    @PutMapping(value="/{id}")
    public ResponseEntity<Rental> putRental(@RequestBody Rental rental) {
        rentalRepository.save(rental);
        return new ResponseEntity<>(rental, HttpStatus.OK);
    }

    @DeleteMapping(value="/{id}")
    public ResponseEntity<Long> deleteRental(@PathVariable Long id) {
        rentalRepository.deleteById(id);
        return new ResponseEntity<>(id, HttpStatus.OK);
    }
}
