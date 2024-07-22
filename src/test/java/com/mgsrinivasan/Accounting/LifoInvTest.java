package com.mgsrinivasan.Accounting;

import org.junit.jupiter.api.Test;


/*
                total cost $     total units     average cost
1/1 Balance         300             200             1.50

                    480     =       300 units x     1.60
1/5 purchase        780     /        500      =     1.56

sold                               <400>
1/15 sale           156             100             1.56

                    330     =       200 units  x    1.65
1/18 purchase       486     /       300        =    1.62

                    534     =       300       x     1.78
1/27 purchase       1020    /       600       =     1.70

ending inventory    1,020   =       600       x     1.70

LIFO:
Last goods purchased are sold
EI:  goods First purchased

LIFO periodic
600 units left          total
1/1     200 x 1.50  =   300
1/15    300 x 1.60  =   480
1/18    100 x 1.65  =   165
        ----            ----
EI      600             945

LIFO PERPETUAL
1/1     200 X 1.50  =   300
1/5     300 X 1.60  =   480

SOLD    400
1/1     100 X 1.50  =   150
1/5     300 X 1.60  =   480
COGS                   $630

1/5     100 X 1.50  =   150
1/18    200 X 1.65  =   330
1/27    300 X 1.78  =   534
EI                   $1,014

 */
class LifoInvTest {

    @Test
    void setLifoBegInv() {
    }

    @Test
    void setLifoPurchase() {
    }

    @Test
    void getLifoCOGSUnits() {
    }

    @Test
    void setLifoEndInv() {
    }

    @Test
    void getLifoEndInv() {
    }
}