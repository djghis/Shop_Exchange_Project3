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

        Product fishBowl20 = new Product(lilyPad, vases, "fish bowl 20cm", "It's a fish bowl", 10, 0, Status.PRIVATE, RentCondition.CLEAN, ReplaceStatus.NEW, 10);
        productRepository.save(fishBowl20);

        Product fluteVase20 = new Product(ggSunflowers, vases, "flute vase 20cm","It is a flute vase",20,0,Status.PRIVATE,RentCondition.DIRTY,ReplaceStatus.FEE,23);
        productRepository.save(fluteVase20);

        Product fishBowl30 = new Product(lilyPad, vases, "fish bowl 30cm", "It's a fish bowl", 10, 0, Status.PRIVATE, RentCondition.CLEAN, ReplaceStatus.NEW, 10);
        productRepository.save(fishBowl30);

        Product fluteVase70 = new Product(ggSunflowers, vases, "flute vase 70cm","It is a flute vase",5,0,Status.PRIVATE,RentCondition.DIRTY,ReplaceStatus.FEE,50);
        productRepository.save(fluteVase70);


        vasileiosFlowers.borrowProduct(fishBowl20);
        userRepository.save(vasileiosFlowers);
        productRepository.save(fishBowl20);



    }



}
