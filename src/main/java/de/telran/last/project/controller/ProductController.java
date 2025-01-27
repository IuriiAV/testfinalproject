package de.telran.last.project.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/products")
public class ProductController {

    //localhost:8080/api/v1/products?categoryId=0&sort=1&minPrice=0
    //localhost:8080/api/v1/products
    //localhost:8080/api/v1/products?sort=1
    //localhost:8080/api/v1/products?minPrice=100
    //localhost:8080/api/v1/products?sort=1&minPrice=100
    @GetMapping
    public String getAll(@RequestParam(name = "categoryId", required = false) Long categoryId,
                         @RequestParam (name = "sort", required = false) Integer direction,
                         @RequestParam (name = "minPrice", required = false) Integer minPrice) {
        /*

        SELECT * FROM product WHERE categoryId = categoryId AND minPrice > min

         */
        return "Hello";
    }
}
