package com.mgsrinivasan;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AccountsReceivableTest {


//    @org.junit.jupiter.api.BeforeEach
//    void setUp() {
//        AccountsReceivable acctsRcvbl = new AccountsReceivable(0,0,0,0,0,0,0);
//    }

//    @org.junit.jupiter.api.AfterEach
//    void tearDown() {
//    }

    @Test
    @DisplayName("calcEndingAllowanceDoubtfulAccount")
    void calcEndingAllowanceDoubtfulAccount(){
        AccountsReceivable acctsRcvbl = new AccountsReceivable(0,0,0,0,0,0,0);

        assertEquals(21000, acctsRcvbl.calcEndingAllowanceDoubtfulAccount(8000, 0, 2000,0,0,15000,26000), "Ending Allowance Acct should equal 21000");
    }

    @Test
    void calcBadDebtExpense_pctgOfSales() {
        AccountsReceivable acctsRcvbl = new AccountsReceivable(0,0,0,0,0,0,0);

        assertEquals(12000, acctsRcvbl.calcBadDebtExpense_pctgOfSales(300000, .04), "bad debt expense should equal 12000");

    }

    @Test
    void calcBadDebtExpense_pctgOfAR1() {
        AccountsReceivable acctsRcvbl = new AccountsReceivable(0,0,0,0,0,0,0);
        assertEquals(11000, acctsRcvbl.calcBadDebtExpense_pctgOfAR(130000, .10,2000,0,0), "bad debt expense should equal 11000");
    }

    @Test
    void calcBadDebtExpense_pctgOfAR2() {
        AccountsReceivable acctsRcvbl = new AccountsReceivable(0,0,0,0,0,0,0);

        assertEquals(26000, acctsRcvbl.calcBadDebtExpense_pctgOfAR(550000, .04,16000,0,20000), "bad debt expense should equal 26000");
    }

    @Test
    void writeOffBadAccount() {
    }

    @Test
    void directWriteOff() {
    }
}
