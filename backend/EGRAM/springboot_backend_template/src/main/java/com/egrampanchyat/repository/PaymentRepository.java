package com.egrampanchyat.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.egrampanchyat.entity.Payment;
import com.egrampanchyat.entity.TaxType;

public interface PaymentRepository extends JpaRepository<Payment, Long> {

    List<Payment> findByUserEmail(String userEmail);
    long countByTaxType(TaxType taxType);

}
