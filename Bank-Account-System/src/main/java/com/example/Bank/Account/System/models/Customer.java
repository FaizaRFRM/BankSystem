package com.example.Bank.Account.System.models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Data
@Setter
@Getter
public class Customer {
@Id
@GeneratedValue(strategy= GenerationType.IDENTITY)
    Integer id;
    String customerName;
    String phoneNo;
    String gender;
    String email;

}
