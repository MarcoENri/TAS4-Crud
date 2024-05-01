package com.example.tabla2.controller

import com.example.tabla2.entity.Product
import com.example.tabla2.service.ProductService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/product")
class ProductController {
    @Autowired
    lateinit var productService: ProductService

    @GetMapping
    fun list(): List<Product> {
        return productService.list()
    }

    @PostMapping
    fun save(@RequestBody product: Product): Product {
        return productService.save(product)
    }

    @PutMapping
    fun update(@RequestBody product: Product): ResponseEntity<Product>{
        return ResponseEntity(productService.update(product), HttpStatus.OK)
    }

    @PatchMapping
    fun patch(@RequestBody product: Product): ResponseEntity<Product>{
        return ResponseEntity(productService.updateName(product), HttpStatus.OK)
    }

}
