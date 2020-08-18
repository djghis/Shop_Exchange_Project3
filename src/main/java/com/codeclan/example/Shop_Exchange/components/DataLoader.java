package com.codeclan.example.Shop_Exchange.components;

import  com.codeclan.example.Shop_Exchange.models.*;
import com.codeclan.example.Shop_Exchange.repositories.CategoryRepository;
//import com.codeclan.example.Shop_Exchange.repositories.ProductDescriptionRepository;
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

//    @Autowired
//    ProductDescriptionRepository productDescriptionRepository;

    public DataLoader(){

    }

    public void run(ApplicationArguments args) throws Exception {

        Category vases = new Category("vases");
        categoryRepository.save(vases);

        Category baskets = new Category("baskets");
        categoryRepository.save(baskets);

        Category arches = new Category("arches");
        categoryRepository.save(arches);

        Category sundries = new Category("sundries");
        categoryRepository.save(sundries);

        User lilyPad = new User("Lily Pad", "2 Warrender Park Road EH9 2HQ", "0131 00000", "lilypadflowers@aol.com");
        userRepository.save(lilyPad);

        User vasileiosFlowers = new User("Vasileios Flowers","7/37 Princes Street EH1 2JJ","0131 141414","vs@gmail.com");
        userRepository.save(vasileiosFlowers);

        User ggSunflowers = new User("GG Flowers","6 Millar Place, EH10 2HQ","0131 14 14 14","gg@hotmail.com");
        userRepository.save(ggSunflowers);

//        ProductDescription fishBowl20 = new ProductDescription("fish bowl 20cm", "It's a fish bowl", vases, "Lend", "Clean", "New", 10);
//
//        ProductDescription fluteVase20 = new ProductDescription("flute vase 20cm","It is a flute vase",vases,"Rent","Dirty","Fee",23);
//
//        ProductDescription fishBasket30 = new ProductDescription("fish basket 30cm", "It's a fish basket", baskets, "Rent", "Clean", "New", 10);
//
//        ProductDescription fluteVase70 = new ProductDescription("flute vase 70cm","It is a flute vase",vases,"Lend","Dirty","Fee",50);


        Product prod1 = new Product(lilyPad, "fish bowl 20cm", "It's a fish bowl", vases, "Lend", "Clean", "New", 10, 10 );
        productRepository.save(prod1);


        Product prod5 = new Product(lilyPad, "flute vase 20cm","It is a flute vase",vases,"Rent","Dirty","Fee",23, 10);
        productRepository.save(prod5);


//        vasileiosFlowers.borrowProduct(prod1);
//        productRepository.save(prod1);

    }



}
