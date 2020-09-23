package com.be.productsprototype;

import com.be.productsprototype.dao.ProductRepository;
import com.be.productsprototype.entities.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProductsPrototypeApplication implements CommandLineRunner {
    @Autowired
    private ProductRepository productRepository;
    public static void main(String[] args) {
        SpringApplication.run(ProductsPrototypeApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        productRepository.save(new Product(null,"JERRAFLORE CYPRES 30 ml","JC-30ml","25-12-2021",80));
        productRepository.save(new Product(null,"JERRAFLORE CYPRES 60 ml","JC-60ml","26-12-2021",160));
        productRepository.save(new Product(null,"SKIN TEA 40 ml","ST-40ml","20-11-2022",90));
        productRepository.save(new Product(null,"SKIN TEA 100 ml","ST-100ml","02-11-2022",180));
        productRepository.save(new Product(null,"GUM AFTAMED GEL 12M","GA-12ml","25-10-2021",100));
        productRepository.save(new Product(null,"GUM AFTAMED GEL 24M","JC-60ml","26-09-2021",190));
        productRepository.save(new Product(null,"MIRADENT 40 ml","MI-40ml","20-11-2022",60));
        productRepository.save(new Product(null,"MIRADENT 100 ml","MI-100ml","02-11-2022",110));

        productRepository.save(new Product(null,"EDEL WHITE 20 ml","EW-20ml","05-12-2021",40));
        productRepository.save(new Product(null,"EDEL WHITE 40 ml","EW-40ml","16-10-2021",70));

        productRepository.save(new Product(null,"PEARL DROPS 10 ml","PD-10ml","20-01-2022",100));
        productRepository.save(new Product(null,"PEARL DROPS 20 ml","PD200ml","02-01-2022",190));

        productRepository.save(new Product(null,"MIRADENT 3P","MI-3P","15-10-2021",48));
        productRepository.save(new Product(null,"MIRADENT 5P","MI-5P","16-09-2021",80));

        productRepository.save(new Product(null,"URGO URGO APHTES 50","UUA-50","05-11-2021",18));
        productRepository.save(new Product(null,"URGO URGO APHTES 100","UUA-100","06-12-2021",36));

    }
}
