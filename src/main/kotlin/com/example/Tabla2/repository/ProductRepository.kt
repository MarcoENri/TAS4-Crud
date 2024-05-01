package com.example.tabla2.repository

import com.example.tabla2.entity.Product
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface ProductRepository : JpaRepository<Product, Long> {
    fun findById (id : Long?) : Product?
}
