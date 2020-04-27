package com.codeclan.example.Shop_Exchange.repositories;

import com.codeclan.example.Shop_Exchange.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

//findByproductdescriptiondescriptionORproductdescriptionname//
    //findBYproductdescriptionstatus
    //findByitemborrowed

}
