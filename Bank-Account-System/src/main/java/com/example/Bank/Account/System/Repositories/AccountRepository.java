package com.example.Bank.Account.System.Repositories;

import com.example.Bank.Account.System.models.Account;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface AccountRepository extends CrudRepository<Account,Integer> {
    @Query(value = "SELECT s from Account s")
    List<Account> getAllAccounts();

    @Query(value = "SELECT s from Account s where s.id=:SchoolId")
    Account getAccountsById(@Param("SchoolId") Integer SchoolId);

    @Query(value = "SELECT s from Account s where s.IsActive = true")
    List<Account> getAllAccountsByIsActive();
    @Query(value = "SELECT s from Account s where s.IsActive = false")
    List<Account> getAllAccountByInActive();
    @Query(value ="SELECT s from Account s where s.createdDate = :date")
    <List>Account getAcountByCreatedDate(@Param("date") Date date);
    @Query(value ="SELECT s from Account s where s.updatedDate = :date")
    <List>Account getAccountByUpdatedDate(@Param("date") Date date);
    @Query(value = "Update  Account s set s.IsActive=false where s.id=:id")
    Account deletAccountById(@Param("id") Integer id);
    @Query(value = "Update Account s set s.IsActive = false")
    List<Account> deletAllAccount();
    @Query(value ="update Account s set s.IsActive=false where s.createdDate = :date")
    <List>Account DeleteAccountsByCreatedDate(@Param("date") Date date);
    @Query(value ="update Account s set s.IsActive=false where s.updatedDate = :date")
    <List>Account DeleteAccountsByUpdatedDate(@Param("date") Date date);

    //***************************
    @Query(value = "SELECT b from Account b where b.id=:AccountId")
    Account getBalanceById(@Param("AccountId") Integer AccountId);






























//    ******************************************************************


//    @Query("INSERT INTO Account a (id, accountNo, balance) VALUES (:id, :accountNo, :balance)")
//    Integer createNewAccount(Integer id, Integer accountNo, double balance);


}
