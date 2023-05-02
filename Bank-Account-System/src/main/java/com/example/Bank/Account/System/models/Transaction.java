package com.example.Bank.Account.System.models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Data
@Setter
@Getter
@Table(name="account_transaction")
public class Transaction extends BaseEntity{
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    Integer id;
    @ManyToOne
    @JoinColumn(name="AccountId",referencedColumnName = "id")
    Account account;
    double fees;
    double amount;
}
