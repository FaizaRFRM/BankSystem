package com.example.Bank.Account.System.Services;

import com.example.Bank.Account.System.models.CreditCard;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class CreditCardService {
    @Autowired
    CreditCardService creditCardService;


    public List<CreditCard> getAllCreditCard() {
        return creditCardService.getAllCreditCard();
    }

    public CreditCard getCreditCardById(Integer id) {
        CreditCard creditCard = creditCardService.getCreditCardById(id);
        return creditCard;
    }

    public List<CreditCard> getAllCreditCardByIsActive() {

        return creditCardService.getAllCreditCardByIsActive();
    }

    public List<CreditCard> getAllCreditCardByInActive() {

        return creditCardService.getAllCreditCardByInActive();
    }

    public <List> CreditCard getCreditCardByCreatedDate(String date) throws ParseException {
        DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        Date CreateDate = formatter.parse(date);
        return creditCardService.getCreditCardByCreatedDate(String.valueOf(CreateDate));


    }

    public <List> CreditCard getCreditCardByUpdatedDate(String date) throws ParseException {
        DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        Date UpdateDate = formatter.parse(date);
        return creditCardService.getCreditCardByUpdatedDate(String.valueOf(UpdateDate));


    }

    public CreditCard deletCreditCardById(Integer id) throws ParseException {
        CreditCard creditCard = creditCardService.deletCreditCardById(id);
        creditCard.setActive(true);
        creditCardService.save(creditCard);
        return creditCard;
    }



    public void deletAllCreditCard() {
        CreditCard creditCard = (CreditCard) creditCardService.deletAllCreditCard();
        creditCard.setActive(true);
        creditCardService.save(creditCard);
    }

    public <List> CreditCard DeleteCreditCardsByCreatedDate(String date) throws ParseException {
        DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        Date CreateDate = formatter.parse(date);
        return creditCardService.DeleteCreditCardsByCreatedDate(String.valueOf(CreateDate));


    }

    public <List> CreditCard DeleteCreditCardsByUpdatedDate(String date) throws ParseException {
        DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        Date UpdateDate = formatter.parse(date);
        return creditCardService.DeleteCreditCardsByUpdatedDate(String.valueOf(UpdateDate));

    }
}
