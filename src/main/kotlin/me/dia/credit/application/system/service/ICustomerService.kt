package me.dia.credit.application.system.service

import me.dia.credit.application.system.entity.Customer

interface ICustomerService {

    fun saveCustomer(customer: Customer): Customer

    fun findById(id: Long): Customer

    fun delete(id: Long)
}