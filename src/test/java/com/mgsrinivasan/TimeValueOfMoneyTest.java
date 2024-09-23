package com.mgsrinivasan;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/*
An ordinary annuity
    a series of recurring payments made at The End of a period
            payments for quarterly stock dividends

An annuity due
    a series of recurring payments made at The Beginning of a period.
            Monthly rent payments
            monthly mortgage payments

Present value:
    how much money you would need Now
        to produce a series of payments in the future
        assuming a set interest rate

Future value
    a measure of how much a series of regular payments
        will be worth at some point in the future,
        given a set interest rate.
        If you're making regular payments on a mortgage
            calculating the future value Can Help you determine
                the total cost of the loan.

The present value of an annuity
    refers to how much money would be needed today
        to fund a series of future annuity payments
            it's the sum that must be invested Now
                to guarantee a desired payment in the future

*/

class TimeValueOfMoneyTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    /*
    PVOfOne = pmt / (1 + rate)^(n)
         250,000 / (1 + 0.09)^3
         250,000 / 1.295029
         = 193,045.87
    */
    @Test
    void PVofOneTest() {
        TimeValueOfMoney pvOfOne = new TimeValueOfMoney(250000,0.09,3);

        assertEquals(193045.859375, pvOfOne.PVofOne(250000, 0.09, 3), " ");

    }

    /*
        PV of Annuity =    pmt * (1-(1+r)^(-n) / rate)
                        15,000 * (1-((1 + .09)^(-3)) / 0.09)
                        15,000 * (1 - 0.772183) / 0.09
                        15,000 * (0.227817 / 0.09)
                        15,000 * 2.5313
                        = 37,969.50
    */
    @Test
    void PVofAnnuityTest() {
        TimeValueOfMoney pvOfAnnuity = new TimeValueOfMoney(15000,0.09,3);

        assertEquals(37969.41796875, pvOfAnnuity.PVofAnnuity(15000, 0.09, 3), " ");

    }

    /*
future value of one
    C = cash flow at period 0
    r = rate of return
    n = nbr of periods
    FV = C * (1 + r)^n
*/
    /*
    in a savings account:
     C = $1,000 invested
     n = 5 years
     r = .10
        10% compounding interest rate

     FV = $1,000 × [(1 + 0.10)5]
     FV = $1,610.51
     */

    @Test
    void FVofOneTest() {
        TimeValueOfMoney fvOfOne = new TimeValueOfMoney(1000,0.10,5);

        assertEquals(1610.51025390625, fvOfOne.FVofOne(1000F, 0.10F, 5), " ");

    }

    /*
     invest $1,000 every year for the next five years, at 5% interest
     how much you would have at The End of the five-year period
    c = 1000
    r = .05
    n = 5
    FV = 5525.63
     */
    @Test
    void FVOfAnnuityTest() {
        TimeValueOfMoney fvOfAnnuity = new TimeValueOfMoney(1000,0.05,5);

        assertEquals(5525.625, fvOfAnnuity.FVOfAnnuity(1000F, 0.05F, 5), " ");

    }

    /*
     invest $1,000 at The Beginning of every year 4
        for the next 5 years,
        at 5% interest
     how much you would have at The End of the five-year period
    c = 1000
    r = 0.05
    n = 5
    FV = 5801.91
     */
    @Test
    void FVOfAnnuityDueTest() {
        TimeValueOfMoney fvOfAnnuityDue = new TimeValueOfMoney(1000,0.05,5);

        assertEquals(5801.90673828125, fvOfAnnuityDue.FVOfAnnuityDue(1000F, 0.05F, 5), " ");

    }

    /*
        calculate PV of your future rent payments
            as specified in your lease.
        pay $1,000 a month in rent.
        the next five months would cost
            in terms of present value
            assuming you kept your money in an account
            earning 5% interest

    c = 1000
    r = 0.05
    n = 5
    PV = 4545.95
     */
    @Test
    void PVOfAnnuityDueTest() {
        TimeValueOfMoney pvOfAnnuityDue = new TimeValueOfMoney(1000,0.05,5);

        assertEquals(4545.9462890625, pvOfAnnuityDue.PVOfAnnuityDue(1000F, 0.05F, 5), " ");

    }



    @Test
    void compoundInterest() {
    }

    @Test
    void simpleInterest() {
    }
}