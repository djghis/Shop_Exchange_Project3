package com.codeclan.example.Shop_Exchange.repositories;


import com.codeclan.example.Shop_Exchange.models.Rental;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RentalRepository extends JpaRepository<Rental, Long> {
}
