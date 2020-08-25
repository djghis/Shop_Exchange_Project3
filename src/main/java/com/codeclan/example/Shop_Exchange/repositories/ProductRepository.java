package com.codeclan.example.Shop_Exchange.repositories;

import com.codeclan.example.Shop_Exchange.models.Product;
import com.codeclan.example.Shop_Exchange.models.Status;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

//findByproductdescriptiondescriptionORproductdescriptionname
    List<Product> findDistinctByNameContainsIgnoreCaseAndStatusNot(String string, String status);
//    List<Product> findDistinctByNameContainsIgnoreCase(String string);
    //findBYproductdescriptionstatus
    //findByitemborrowed
}
