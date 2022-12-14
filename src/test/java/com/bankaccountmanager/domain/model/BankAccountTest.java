package com.bankaccountmanager.domain.model;

import org.junit.Assert;
import org.junit.Test;

import com.bankaccountmanager.util.TestDataUtils;

import pl.pojo.tester.api.assertion.Assertions;
import pl.pojo.tester.api.assertion.Method;

public class BankAccountTest {

    @Test
    public void testBankAccountAsPojo() {
        Assertions.assertPojoMethodsFor(BankAccount.class).testing(Method.values()).areWellImplemented();
    }

    @Test
    public void testBankAccountBuilder() {
        BankAccount bankAccount = TestDataUtils.getBankAccount1();

        Assert.assertEquals("iban mismatched", TestDataUtils.IBAN1, bankAccount.getIban());
        Assert.assertEquals("balance mismatched", TestDataUtils.BALANCE1, bankAccount.getCurrentBalance());
    }
}