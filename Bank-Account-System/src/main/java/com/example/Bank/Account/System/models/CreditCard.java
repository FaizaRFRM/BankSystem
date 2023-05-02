package com.example.Bank.Account.System.models;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class CreditCard extends BaseEntity{

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    Integer id;
    @ManyToOne
    @JoinColumn(name="CustomerId",referencedColumnName = "id")
    Customer customer;
    String customerName;
    Integer AccountNo;
}
