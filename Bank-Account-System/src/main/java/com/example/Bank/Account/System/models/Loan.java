package com.example.Bank.Account.System.models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Data
@Setter
@Getter

public class Loan extends BaseEntity{
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)

    Integer id;
    @ManyToOne
    @JoinColumn(name="CustomerId",referencedColumnName = "id")
    Customer customer;
    double amount;


}
