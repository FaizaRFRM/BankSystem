package com.example.Bank.Account.System.Repositories;

import com.example.Bank.Account.System.models.Account;
import com.example.Bank.Account.System.models.CreditCard;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository

public interface CreditCardRepository {
    @Query(value = "SELECT s from CreditCard s")
    List<CreditCard> getAllCreditCard();

    @Query(value = "SELECT s from CreditCard s where s.id=:CreditCardId")
    Account getCreditCardById(@Param("CreditCardId") Integer CreditCardId);

    @Query(value = "SELECT s from CreditCard s where s.IsActive = true")
    List<CreditCard> getAllCreditCardByIsActive();
    @Query(value = "SELECT s from CreditCard s where s.IsActive = false")
    List<CreditCard> getAllCreditCardByInActive();
    @Query(value ="SELECT s from Account s where s.createdDate = :date")
    <List>CreditCard getCreditCardByCreatedDate(@Param("date") Date date);
    @Query(value ="SELECT s from CreditCard s where s.updatedDate = :date")
    <List>Account getCreditCardByUpdatedDate(@Param("date") Date date);
    @Query(value = "Update  CreditCard s set s.IsActive=false where s.id=:id")
    Account deletCreditCardById(@Param("id") Integer id);
    @Query(value = "Update CreditCard s set s.IsActive = false")
    List<CreditCard> deletAllCreditCard();
    @Query(value ="update Account s set s.IsActive=false where s.createdDate = :date")
    <List>CreditCard DeleteCreditCardsByCreatedDate(@Param("date") Date date);
    @Query(value ="update CreditCard s set s.IsActive=false where s.updatedDate = :date")
    <List>CreditCard DeleteCreditCardsByUpdatedDate(@Param("date") Date date);
}
