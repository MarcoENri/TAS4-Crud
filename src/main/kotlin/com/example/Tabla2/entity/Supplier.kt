package com.example.tabla2.entity

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Table

@Entity
@Table(name = "supplier")
class Supplier {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "supplier_id", updatable = false, nullable = false)
    var supplier_id: Int = 0

    @Column(name = "supplier_name", nullable = false)
    var supplier_name: String = ""

    @Column(name = "contact_name")
    var contact_name: String? = null

    @Column(name = "contact_title")
    var contact_title: String? = null

    @Column(name = "address")
    var address: String? = null

    @Column(name = "city")
    var city: String? = null

    @Column(name = "region")
    var region: String? = null

    @Column(name = "postal_code")
    var postal_code: String? = null

    @Column(name = "country")
    var country: String? = null

    @Column(name = "phone")
    var phone: String? = null

    @Column(name = "email")
    var email: String? = null
}
