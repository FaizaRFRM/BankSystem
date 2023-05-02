package com.example.Bank.Account.System.Services;

import com.example.Bank.Account.System.Repositories.AccountRepository;
import com.example.Bank.Account.System.models.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

@Service
public class AccountService {
    @Autowired
    AccountRepository accountRepository;


    public List<Account> getAllAccounts() {
        return accountRepository.getAllAccounts();
    }

    public Account getAccountsById(Integer id) {
        Account account = accountRepository.getAccountsById(id);
        return account;
    }

    public List<Account> getAllAccountsByIsActive() {

        return accountRepository.getAllAccountsByIsActive();
    }

    public List<Account> getAllAccountByInActive() {

        return accountRepository.getAllAccountByInActive();
    }

    public <List> Account getAcountByCreatedDate(String date) throws ParseException {
        DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        Date CreateDate = formatter.parse(date);
        return accountRepository.getAcountByCreatedDate(CreateDate);


    }

    public <List> Account getAccountByUpdatedDate(String date) throws ParseException {
        DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        Date UpdateDate = formatter.parse(date);
        return accountRepository.getAccountByUpdatedDate(UpdateDate);


    }

    public void deletAccountById(Integer id) throws ParseException {
        Account account = accountRepository.deletAccountById(id);
        account.setActive(true);
        accountRepository.save(account);
    }

    public void deletAllAccount() {
        Account account = (Account) accountRepository.deletAllAccount();
        account.setActive(true);
        accountRepository.save(account);
    }

    public <List> Account DeleteAccountsByCreatedDate(String date) throws ParseException {
        DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        Date CreateDate = formatter.parse(date);
        return accountRepository.DeleteAccountsByCreatedDate(CreateDate);


    }

    public <List> Account DeleteAccountsByUpdatedDate(String date) throws ParseException {
        DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        Date UpdateDate = formatter.parse(date);
        return accountRepository.DeleteAccountsByUpdatedDate(UpdateDate);

    }
//    ***********************************
public Account getBalanceById(Integer id) {
    Account account = accountRepository.getBalanceById(id);
    return account;
}

























//    ************************************************************
//    public void createNewAccount(Integer id,Integer accountNo, double balance) {
//        Account account= new Account(); // create object
//        account.setAccountNo(accountNo);
//        account.setBalance(balance);
//        account.setCreatedDate(new Date());
//        account.setUpdatedDate(new Date());
//        account.setIsActive(Boolean.TRUE);
//        accountRepository.save(account);
//    }
//

//
//    public void createNewAccount() {
//        Account account = new Account();
//        account.setBalance(2143235);
//        accountRepository.save(account);
//    }


//    public void updateSchool(String date, Integer id) throws ParseException {
//
//        DateFormat formatter = new SimpleDateFormat("yyy-MM-dd");
//        Date javaDate = formatter.parse(date);
//        School school = schoolRepository.getSchoolById(id);
//        school.setCreatedDate(javaDate);
//        school.setName("ABC School");
//        schoolRepository.save(school);
//
//    }
}
