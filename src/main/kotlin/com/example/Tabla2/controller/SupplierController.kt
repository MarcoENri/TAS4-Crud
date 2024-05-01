package com.example.tabla2.controller

import com.example.tabla2.entity.Supplier
import com.example.tabla2.service.SupplierService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/supplier")
class SupplierController {
    @Autowired
    lateinit var supplierService: SupplierService

    @GetMapping
    fun list(): List<Supplier> {
        return supplierService.list()
    }

    @PostMapping
    fun save(@RequestBody supplier: Supplier): Supplier {
        return supplierService.save(supplier)
    }
}
