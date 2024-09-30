package com.mgsrinivasan;

// Updated to Maven and JUnit 5

/*
Notes Receivable [NR] and Notes Payable [NP]

Short term NR and NP
from transactions with
        customers - Notes Receivable [NR]
        suppliers - Notes Payable [NP]
in the normal course of business

NR within one year - current asset
NP due in one year - current liability
    recorded at their maturity values
 */

/*
Long term NR and NP
    due in more than 1 year

    recorded at net value
            note [PV (APB 21)]
            +/- (premium or discount) upon issuance / receipt of note
            -----------------
            net value
valued at
1. cash received or paid
   assumes No other rights
2. established exchange price (FMV) or property or services received or provided
    if Not determinable, PV with imputed interest rate
*/

/*
net receivable
x effective interest rate
--------------------------
NR interest revenue

net payable
x effective interest rate
--------------------------
NP interest expense
*/

/*
Note exchanged for cash Only
    No other rights or privileges are exchanged
    PV of note = cash exchanged
    cash can Not equal face amt of note (maturity amt)
    discount: when face of note > PV of note
    premium:  when   PV of note > face of note
*/

/*
Note exchanged for cash and unstated rights and/or privileges
    the cash exchanged =
        1. PV of note
        2. PV of unstated right or privilege

    compute one of the PVs;
    the other PV = face - computed PV
*/

/*
ie A company borrows $200,000 from B company (Co A's major customer)

note payable, due in 3 yrs, noninterest bearing
unstated right / privilege:  ability of B company to buy inventory at Less Than regular price

PV of note payable:
    based interest rate A company Would Have to pay in a normal borrowing of $200,000
        (w/o the unstated rights/privilege);
        i=12%
    pv factor of 3 yrs, 12% = .712
    pv of NP =                      $200,000 * .712 =    142,400 cash received
    pv of the right or privilege =   200,000 - 142,400 =  57,600 discount

*/

/*
JEs 2023    A Company
1/1/23
Cash                142,200
Discount on NP       57,600
    NP                          200,000

Cash                    57,600
    Deferred Revenue            57,600

12/31/23
Interest Expense        17,088
    Discount on NP              17,088
142,400 x .12 = 17,088

Deferred Revenue        xx
    Sales                       xx
xx - depends on Amt of Goods acquired

Company A 2023 Balance Sheet:
NP: noncurrent asset recorded Net of UnAmortized discount


B Company
NR                      200,000
    Discount on N/R                 57,600
    Cash                            142,400

Adv. Payments on Inventory  57,600
    Cash                            57,600

Discount on N/R             17,088
    Interest Income                 17,088

Inventory                   xx
    Adv payments on inventory       xx
xx - depends on Amt of Goods acquired

Company B 2023 Balance Sheet:
NR: noncurrent asset recorded Net of UnAmortized discount
*/

/*
Note exchanged in noncash exchange (goods, property, services)

To determine the note PV:
1. assume stated rate or contract rate on note
     represents a fair rate of return to the supplier
        for the use of the related funds
face amt of note = its PV
interest revenue (expense) = face of note x interest rate of note
No discount or premium

2. APB 21 interest rate on note being fair  Not valid when:
1. interest rate Not stated (note is Noninterest bearing)
2. interest rate: unreasonably high or low
3. stated face of note: materially different
    from  current cash sales price for same or similar items
 Or from  market value of note at transaction date

when interest rate is Not fair,
    face does Not equal PV

PV of note is then determined by the priorities:
1. FMV of goods, property, services
ELSE
2. note's market value,
ELSE
3. use imputed interest rate  (debtor's incremental borrowing rate)

*/

/*
ie interest rate is not fair; fmv of property is known:

D company sold a building Jan 1 2023
Cost         7,000,000
BV           4,000,000
Received    14,000,000  Noninterest bearing note; due 3 yrs

0% interest is Not fair;
note's PV is Not known

1. building sold has reliable fmv ?
Assume building could have been sold for
    $10,000,000
    on Jan 1, 2023
    in straight cash transaction
FMV of building =  PV of note

Note face   14,000,000
- PV          10,000,000
            ----------
= discount  4,000,000   amortized to income by effective interest method

*/

public class NotesReceivablePayable {
    float NR_Face = 0;
    float annualRate = 0;
    float dateOfIssuanceToDateOfMaturity = 0;
    float interestToBePaidOnNR = 0;
    float NR_Maturity_Value = 0;
    float buyerDiscountProfitRate = 0;
    float buyersProfit = 0;
    float pricePaidForNR = 0;

    // Discount on N/R
// compute amount given to seller
    public float computeInterest() {
        interestToBePaidOnNR = (NR_Face * annualRate * dateOfIssuanceToDateOfMaturity);
        return interestToBePaidOnNR;
    }

    public float computeNR_Maturity_Value() {
        NR_Maturity_Value = (NR_Face + interestToBePaidOnNR);
        return NR_Maturity_Value;
    }

    public float computeBuyersProfit() {
        buyersProfit = (NR_Maturity_Value * buyerDiscountProfitRate);
        return buyersProfit;
    }

    public float computePricePaidForNR() {
        pricePaidForNR = (NR_Maturity_Value - buyersProfit);
        return pricePaidForNR;
    }
}
