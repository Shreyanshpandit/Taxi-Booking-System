package com.project.TaxiBookingSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.TaxiBookingSystem.entity.Customer;

import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {
    // Find a customer by their email for login
    Customer findByEmail(String email);
    //Customer addcustomer(Customer cust);
    // Find all bookings made by a customer
    List<Customer> findByBookingsCustomerId(int customerId);

    Customer findByUsername(String username);

    // Additional query methods can be defined here as needed
}
