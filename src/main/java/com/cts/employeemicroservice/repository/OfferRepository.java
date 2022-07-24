package com.cts.employeemicroservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.cts.employeemicroservice.model.EmployeeOffers;

public interface OfferRepository extends JpaRepository<EmployeeOffers, Integer> {

}
