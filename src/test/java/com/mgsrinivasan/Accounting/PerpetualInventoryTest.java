package com.mgsrinivasan.Accounting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/*
Moving Average - Perpetual
a new weighted avg cost calculated
    After Each purchase
avg cost determine cost of each unit sold
    Prior to Next purchase

cost of units = COGAS / Nbr of Units Available for Sale
 */

/*
                total cost      total units     average cost
1/1 balance         300             200             1.50

1/5 purchase        480             300             1.60
                    ----            ---             ----
                    780             500             1.56
1/15 sale          <624>           <400>            1.56
                    ---             ---             -----
                    156             100             1.56
1/18 purchase       330             200             1.65
                    ---             ---
                    486      /      300      =      1.62
1/27 purchase       534             300             1.78
                    -----           ---             ----
                    1,020           600             1.70

EI 600 units x $1.70 = $1,020
 */

class PerpetualInventoryTest {

    @Test
    void recordPurchase() {
    }

    @Test
    void recordInboundFreightCost() {
    }

    @Test
    void recordSale() {
    }

    @Test
    void recordInvAdj() {
    }

    @Test
    void setInventory() {
    }

    @Test
    void getInventory() {
    }

    @Test
    void setAccountsPayable() {
    }

    @Test
    void getAccountsPayable() {
    }

    @Test
    void setAccountsReceivable() {
    }

    @Test
    void getAccountsReceivable() {
    }

    @Test
    void setSalesRevenue() {
    }

    @Test
    void getSalesRevenue() {
    }

    @Test
    void setCostOfGoodsSold() {
    }

    @Test
    void getCostOfGoodsSold() {
    }

    @Test
    void setInvShrinkExp() {
    }

    @Test
    void getInvShrinkExp() {
    }
}