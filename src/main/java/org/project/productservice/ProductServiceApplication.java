package org.project.productservice;

import org.project.productservice.models.Category;
import org.project.productservice.models.Price;
import org.project.productservice.models.Product;
import org.project.productservice.repositories.CategoryRepository;
import org.project.productservice.repositories.PriceRepository;
import org.project.productservice.repositories.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProductServiceApplication implements CommandLineRunner {

    private final ProductRepository productRepository;
    private final CategoryRepository categoryRepository;
    private final PriceRepository priceRepository;

    public ProductServiceApplication(ProductRepository productRepository,
                                     CategoryRepository categoryRepository,
                                     PriceRepository priceRepository) {
        this.productRepository = productRepository;
        this.categoryRepository = categoryRepository;
        this.priceRepository = priceRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(ProductServiceApplication.class, args);


    }
    @Override
    public void run(String... args) throws Exception {
        Category category = new Category() ;
        category.setName("Apple Devices");
        Category savedCategory = categoryRepository.save(category) ;

        Price price1  = new Price() ;
        price1.setCurrency("INR");
        price1.setValue(150000);
       // Price savedPrice = priceRepository.save(price1) ;

        Product product1 = new Product() ;
        product1.setCategory(savedCategory);
        product1.setDescription("Best iphone ever");
        product1.setTitle("iPhone15");
        product1.setPrice(price1);


        Price price2  = new Price() ;
        price2.setCurrency("USD");
        price2.setValue(50000);

        Product product2 = new Product() ;
        product2.setCategory(savedCategory);
        product2.setDescription("Best iphone ever");
        product2.setTitle("iPhone15");
        product2.setPrice(price2);

        productRepository.save(product1);
        productRepository.save(product2) ;
        // System.out.println(product1);
    }
}
