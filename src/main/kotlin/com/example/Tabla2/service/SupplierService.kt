package com.example.tabla2.service

import com.example.tabla2.entity.Supplier
import com.example.tabla2.repository.SupplierRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class SupplierService {

    @Autowired
    lateinit var supplierRepository: SupplierRepository

    fun list(): List<Supplier> {
        return supplierRepository.findAll()
    }

    fun save(supplier: Supplier): Supplier {
        return supplierRepository.save(supplier)
    }
}
