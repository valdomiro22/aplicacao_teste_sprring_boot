package me.dia.credit.application.system.service.impl

import me.dia.credit.application.system.entity.Customer
import me.dia.credit.application.system.repository.CustomerRepository
import me.dia.credit.application.system.service.ICustomerService
import org.springframework.stereotype.Service
import java.lang.RuntimeException

@Service
class CustomerService(
    private val customerRepository: CustomerRepository
): ICustomerService {

    override fun saveCustomer(customer: Customer): Customer = this.customerRepository.save(customer)

    override fun findById(id: Long): Customer = this.customerRepository.findById(id).orElseThrow {
            throw RuntimeException("ID $id not found")
    }

    override fun delete(id: Long) = this.customerRepository.deleteById(id)

}