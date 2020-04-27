package com.codeclan.example.Shop_Exchange.components;

import com.codeclan.example.Shop_Exchange.models.*;
import com.codeclan.example.Shop_Exchange.repositories.CategoryRepository;
import com.codeclan.example.Shop_Exchange.repositories.ProductRepository;
import com.codeclan.example.Shop_Exchange.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    CategoryRepository categoryRepository;

    @Autowired
    ProductRepository productRepository;

    @Autowired
    UserRepository userRepository;

    public DataLoader(){

    }

    public void run(ApplicationArguments args) throws Exception {

        Category vases = new Category("vases");
        categoryRepository.save(vases);

        User lilyPad = new User("Lily Pad", "2 Warrender Park Road EH9 2HQ", "0131 00000", "lilypadflowers@aol.com");
        userRepository.save(lilyPad);

        User vasileiosFlowers = new User("Vasileios Flowers","7/37 Princes Street EH1 2JJ","0131 141414","vs@gmail.com");
        userRepository.save(vasileiosFlowers);


        Product fishBowl = new Product(lilyPad, vases, "fish bowl 20cm", "It's a fish bowl", 10, 0, Status.PRIVATE, RentCondition.CLEAN, ReplaceStatus.NEW, 10);

        productRepository.save(fishBowl);

        vasileiosFlowers.borrowProduct(fishBowl);
        userRepository.save(vasileiosFlowers);
        productRepository.save(fishBowl);



    }



}
