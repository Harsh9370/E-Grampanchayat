package com.egrampanchyat.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    
    @Column(nullable = false)
    private String userEmail;

   
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private TaxType taxType;

    
    @Column(nullable = false)
    private String paymentMethod;

    @Column(nullable = false)
    private Double amount;
    
 

    private String gateway;        
    private String transactionId;  
    private String status;         


   
    @Column(nullable = false)
    private LocalDateTime paidAt;
    
    
    private LocalDate expiryDate;




   
    public String getMethod() {
        return this.paymentMethod;
    }

    public void setMethod(String method) {
        this.paymentMethod = method;
    }

   
    public LocalDateTime getCreatedAt() {
        return this.paidAt;
    }

    public void setCreatedAt(LocalDateTime time) {
        this.paidAt = time;
    }
}
