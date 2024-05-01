package com.example.tabla2.entity

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Table
import java.time.LocalDateTime

@Entity
@Table(name = "product")
class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id", updatable = false, nullable = false)
    var id: Long? = null

    @Column(name = "product_name", nullable = false)
    var productName: String = ""

    @Column(name = "quantity_in_stock", nullable = false)
    var quantityInStock: Int = 0

    @Column(name = "unit_price", nullable = false)
    var unitPrice: Double = 0.0

    @Column(name = "last_updated")
    var lastUpdated: LocalDateTime? = null
}
