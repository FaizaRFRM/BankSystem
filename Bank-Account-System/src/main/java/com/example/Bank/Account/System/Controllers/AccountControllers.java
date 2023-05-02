package com.example.Bank.Account.System.Controllers;

import com.example.Bank.Account.System.Services.AccountService;
import com.example.Bank.Account.System.models.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.util.List;

@RestController
@RequestMapping(value = "Account")
public class AccountControllers {
    @Autowired
    AccountService accountService;
    @RequestMapping(value = "getAllAccounts", method = RequestMethod.GET)
    public List<Account> getAllAccounts() {
        List<Account> accounts =accountService.getAllAccounts();
//        for (Account A:accounts)
//        {
//            slackClient.sendMessage("this is the id:"+S.getId().toString()+"this is the name of school:"+S.getName());
//        }
        return accounts;
    }
    @RequestMapping(value = "getAccountsById", method = RequestMethod.GET)
    public Account getAccountsById(@RequestParam Integer id) {
        Account account = accountService.getAccountsById(id);
//        slackClient.sendMessage("this is the id:"+school.getId().toString()+"this is the name of school:"+school.getName());
        return account;
    }

    @RequestMapping(value = "getAllAccountsByIsActive", method = RequestMethod.GET)
    public List<Account> getAllAccountsByIsActive() {
        List<Account> activeAccountList = accountService.getAllAccountsByIsActive();
        return activeAccountList;
    }
    @RequestMapping(value = "getAllAccountByInActive", method = RequestMethod.GET)
    public List<Account> getAllAccountByInActive() {
        List<Account> InactiveAccountsList = accountService.getAllAccountByInActive();
        return InactiveAccountsList;

    }

    @RequestMapping(value = "getAcountByCreatedDate", method = RequestMethod.GET)
    public <List>Account getAcountByCreatedDate(@RequestParam String date) throws ParseException {
        Account account =accountService.getAcountByCreatedDate(date);
        return account;
    }
    @RequestMapping(value = "getAccountByUpdatedDate", method = RequestMethod.GET)
    public <List>Account getAccountByUpdatedDate(@RequestParam String date) throws ParseException {
        Account account =accountService.getAccountByUpdatedDate(date);
        return account;
    }
    @RequestMapping(value = "deletAccountById", method = RequestMethod.POST)
    public void deletAccountById(@RequestParam Integer id) throws ParseException {
        accountService.deletAccountById(id);
    }
    @RequestMapping(value = "deletAllAccount", method = RequestMethod.POST)
    public void deletAllAccount() {

        accountService.deletAllAccount();
    }
    @RequestMapping(value = "DeleteAccountsByCreatedDate", method = RequestMethod.POST)
    public <List>Account DeleteAccountsByCreatedDate(@RequestParam String date) throws ParseException {
        Account account =accountService.DeleteAccountsByCreatedDate(date);
        return account;

    }
    @RequestMapping(value = "DeleteAccountsByUpdatedDate", method = RequestMethod.POST)
    public <List>Account DeleteAccountsByUpdatedDate(@RequestParam String date) throws ParseException {
        Account account =accountService.DeleteAccountsByUpdatedDate(date);
        return account;

    }




//************************************************************




@RequestMapping(value = "createNewAccount", method = RequestMethod.POST)
public String createNewAccount() {
    accountService.createNewAccount();
    return "School add successful";
}
@RequestMapping(value = "getBalanceById", method = RequestMethod.GET)
public Account getBalanceById(@RequestParam Integer id) {
    Account account = accountService.getBalanceById(id);
//        slackClient.sendMessage("this is the id:"+account.getId().toString()+"this is the name of school:"+account.getName());
    return account;
}

























//***********************************************************
//    @RequestMapping(value = "createNewAccount", method = RequestMethod.POST)
//    public String createNewAccount(@RequestParam Integer id,Integer accountNo, double balance) {
//        try {
//            accountService.createNewAccount(id, accountNo, balance);
//        } catch (Exception e) {
//            return "Failed try again";
//        }
//        return "Account Created Successfully)";
//    }

//


//    @RequestMapping(value = "updateSchool")
//    public void updateSchool(@RequestBody MarketRequestForCreateDateUpdate data)throws ParseException {
//        accountService.updateSchool(data.getDate(),data.getId());
//    }
}
