package com.example.Bank.Account.System.Controllers;

import com.example.Bank.Account.System.Services.AccountService;
import com.example.Bank.Account.System.Services.CreditCardService;
import com.example.Bank.Account.System.models.Account;
import com.example.Bank.Account.System.models.CreditCard;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.util.List;

@RestController
@RequestMapping(value = "CreditCard")
public class CreditCardControllers {
    @Autowired
    CreditCardService creditCardService;

    @RequestMapping(value = "getAllCreditCard", method = RequestMethod.GET)
    public List<CreditCard> getAllCreditCard() {
        List<CreditCard> creditCards =creditCardService.getAllCreditCard();
//        for (Account A:accounts)
//        {
//            slackClient.sendMessage("this is the id:"+S.getId().toString()+"this is the name of school:"+S.getName());
//        }
        return creditCards;
    }
    @RequestMapping(value = "getCreditCardById", method = RequestMethod.GET)
    public CreditCard getCreditCardById(@RequestParam Integer id) {
        CreditCard creditCard = creditCardService.getCreditCardById(id);
//        slackClient.sendMessage("this is the id:"+school.getId().toString()+"this is the name of school:"+school.getName());
        return creditCard;
    }

    @RequestMapping(value = "getAllCreditCardByIsActive", method = RequestMethod.GET)
    public List<CreditCard> getAllCreditCardByIsActive() {
        List<CreditCard> activeCreditCardList = creditCardService.getAllCreditCardByIsActive();
        return activeCreditCardList;
    }
    @RequestMapping(value = "getAllCreditCardByInActive", method = RequestMethod.GET)
    public List<CreditCard> getAllCreditCardByInActive() {
        List<CreditCard> InactiveCreditCardsList = creditCardService.getAllCreditCardByInActive();
        return InactiveCreditCardsList;

    }

    @RequestMapping(value = "getCreditCardByCreatedDate", method = RequestMethod.GET)
    public <List>CreditCard getCreditCardByCreatedDate(@RequestParam String date) throws ParseException {
        CreditCard creditCard  =creditCardService.getCreditCardByCreatedDate(date);
        return creditCard;
    }
    @RequestMapping(value = "getCreditCardByUpdatedDate", method = RequestMethod.GET)
    public <List>CreditCard getCreditCardByUpdatedDate(@RequestParam String date) throws ParseException {
        CreditCard creditCard =creditCardService.getCreditCardByUpdatedDate(date);
        return creditCard;
    }
    @RequestMapping(value = "deletCreditCardById", method = RequestMethod.POST)
    public void deletCreditCardById(@RequestParam Integer id) throws ParseException {
        creditCardService.deletCreditCardById(id);
    }
    @RequestMapping(value = "deletAllCreditCard", method = RequestMethod.POST)
    public void deletAllCreditCard() {

        creditCardService.deletAllCreditCard();
    }
    @RequestMapping(value = "DeleteCreditCardsByCreatedDate", method = RequestMethod.POST)
    public <List>CreditCard DeleteCreditCardsByCreatedDate(@RequestParam String date) throws ParseException {
        CreditCard creditCard =creditCardService.DeleteCreditCardsByCreatedDate(date);
        return creditCard;

    }
    @RequestMapping(value = "DeleteCreditCardsByUpdatedDate", method = RequestMethod.POST)
    public <List>CreditCard DeleteCreditCardsByUpdatedDate(@RequestParam String date) throws ParseException {
        CreditCard creditCard =creditCardService.DeleteCreditCardsByUpdatedDate(date);
        return creditCard;

    }

}
