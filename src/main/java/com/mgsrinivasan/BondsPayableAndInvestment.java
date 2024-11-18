package com.mgsrinivasan;

public class BondsPayableAndInvestment {
    /*
    Bonds Payable and Bond Investments
        provide for periodic fixed interest payments
            at a contract rate of interest

    at issuance or thereafter:
        if market rate of interest > contract rate,
            BV < maturity value
            difference = "discount"
                makes up for
                    contract rate
                being below
                    market rate

        if market rate of interest < contract rate,
            BV > maturity value
            bond will sell for
                more than the maturity value
                    to bring the effective rate
                          to the market    rate
            difference = "premium"
                    makes up for
                        contract rate
                    being above
                        market rate

        if market rate of interest = contract rate
            bond sells for maturity value

       maturity value
       + interest payments discounted to the present
       ----------------------
        market value of bond

    number of months used in calculation of interest and discount/premium amortization
        date is at beginning or the end of the month
        Ie Sept 1 to Dec 31 is 4 months

    bond issues that mature
        on a single date:   term bonds
        in installments:    serial bonds
     */

    /*
    example
    bonds               $10,000
    semiannual rate     6%
    maturity (yrs)      6
    market              5%

    PV of maturity value
    PV of $1; semiannual compounding
    n = 6 yrs x 2 = 12 periods
    i = 5% / 2 = 2.5%

    discount $10,000, 12 periods, at 2.5%; factor = .7436
    10,000 x .7436 = $7,436

    2. PV of annuity of 12 $300 interest payments
    PV of ordinary annuity of $1 factor, 12 periods, 2.5%; factor = 10.26
    300 x 10.26 =    $3,078

    today's value = $10,514
    - face           10,000
    ------------------------
    premium             514

    recognized over the life of the bond issue
    reduction of interest expense of the issuer
    reduction of interest revenue of the investor
    APB 21 outline, amortization is to be the interest or the PV basis


    PV of Maturity Amount using Yield or Market Rate
    + PV of Interest Annuity
    -------------------------
    Issue/Acquisition Price of Bonds

    Face Amount     yield rate = face rate
    Premium         yield rate < face rate
    Discount        yield rate > face rate

 */

 /*
 JEs
 1. Issue and Acquisition
 issuer (Gross)
 Cash   10.514
    Bonds Payable   10,000
    Bonds Premium      514

Investor (net)
Bond Investment 10,514
    Cash                10,514


1st Interest Payment:
issuer (gross):
Interest Expense    300
    Cash                   300

investor (net)
cash                300
    interest revenue        300


Interest method:
Interest received / paid         300.00
- Actual or Effective interest  $262.85 = $10,514 x 2.5%
                                -------
Premium Amortized               $37.15

3. Premium Amortization
issuer (gross):
Bond Premium        37.15
    Interest Expense        37.15

investor (net)
Interest Revenue    37.15
    Bond Investment         37.15
*/

/*
bonds are issued on the interest payment date

0bonds purchased between the interest payment dates,
    purchaser's cash paid
        includes accrued interest Through the purchase date
        reduces the subsequent receipt of interest income
            which covers a time period
            longer than
                       the time purchaser held the bond
 */

    /*
    Amount for premium amortization changes
            3% cash interest  2.5% effective int  BV decrease                   net BV of bonds
    Period  1000 x 3%         net BV x 2.5%       cash int - effective int      previous BV - BV decrease
    0                                                                           10,514.00
    1       300                 262.85              37.15                       10,476.85
    2       300                 261.92              38.08                       10,438.77
    3       300                 260.97              39.03                       10,399.74
    4
    5
    6
    7
    8
    9
    10
    11
    12      300                 251.26              48.74                       10,001.50
     */

    /*
    Semiannual interest payments

   period   Issuer:
   ------   -------
    2       Interest Expense    261.92
            Bond Premium        38.08
                Cash                    300

           Investor:
           ---------
           Cash                 300
                Interest Revenue        38.08
                Bond Investment         261.92

          Issuer:
          -------
 12       Interest Expense    251.26
          Bond Premium        48.74
                Cash                    300


         Investor:
         ---------
         Cash                 300
                Interest Revenue        48.74
                Bond Investment         251.26

*/

/*
    If yr-end does not coincide with the interest dates
        an adjusting entry is made, recognize:
        proportional share of interest payable / receivable
        amortization of discount or premium
            straight-line w/in the amortization period
*/

/*
continuing example:
both issuer and investor have reporting periods ending
    3 months after bond issuance:

record 1/2 of the interest of the usual semiannual period:

JE on closing dates

300 / 2     = 150
38.15 / 2   = 18.58

issuer
-------
interest expense    150.00
    interest payable        150.00

bond premium        18.58
    interest expense        18.58

investor:
---------
interest receivable 150.00
    interest revenue        150.00

interest revenue    18.58
    bond investment         18.58

Reversed at the beginning of the new period
regular payments are made at next interest payment date
*/

/*
Bonds sold / bought between interest periods:
    premium / discount computed for period
        between sale (purchase) date
        and     last (next) interest date
straight-line the amount calculated
    using the effective interest method

continuing example:
    investor sold $5,000 of bonds
        2 months after issuance for $5250 + interest:

1. Amortize bond premium
    '1/2 x 1/3 x $37.15 = $6.19

Interest revenue        6.19
    Bond Investment             6.19

2. Record Sale
cash                    5,300               5,250 + 50 interest
loss                    0.81                difference
    interest expense            50.00       1/2 x 1/3 x 300
    investment                  5250.81     5,257 - 6.19

3. Check interest recorded to interest earned:
interest revenue recorded   $50.00 - $6.19      = 43.81
interest earned             $5,257 x 2.5% x 1/3 = 43.81

 */

 /*
 Bond Issue Costs
    costs in connection with issuance of bonds
    printing and engraving
    accounting and legal fees
    commissions
 SFAC 6, treat as
    expense
  or
    reduction of related bond liability
        reduces bond proceeds
            increases the effective rate
        accounted for like UnAmortized discounts
APB 21: 1 of these ways

 */
/*
GAAP
    treat as deferred charges
    amortize it on a straightline basis
        over the life of the bond

                            Each period             Each period
Amortization methods:       Interest Rev / Exp      Interest Rate
Effective Interest Method   changes                 constant
Straight line method        constant                changes

Effective Interest Method:              discount    premium
--------------------------              ---------   ---------
Interest Revenue / Expense              increases   decreases
Amount of amortization                  increases   increases
Carrying Amount of BP or Inv in Bonds   increases   decreases

 */

/*
Convertible Bonds APB 14 SFAS 84
    have right to convert to common stock
    when Issued, NO value is placed on conversion feature

2 methods of accounting: more reliable of
cost method:    BV of bonds
market method:  market value of stocks or bonds

 */

/*
JEs for Market Value Method (market value > BV)

Issuer:
bonds payable           BV
bond premium            BV
Loss on redemption      PLUG; (Mkt value of stocks or bonds - BV of bonds)
    Common Stock                    Par
    Paid-in Excess of par           (Mkt - Par)
    Gain on redemption              PLUG; (Mkt value of stocks or bonds - BV of bonds)

*/

/*
since conversion Is the culmination of the earnings process,
    loss or gain Is Recognized

Investor:
---------
Stock investment    MKT VALUE
Loss on conversion  PLUG; (MKT OF stocks OR bonds - BV of bonds)
    Investment in Bonds     Carry Value = historical cost - accum dep
    Gain on conversion      PLUG; (MKT OF stocks OR bonds - BV of bonds)

 */
/*
Cost Method
------------
Bonds Payable   BV
Bond Premium    BV
    Bond Discount           BV
    Common Stock            BV
    Paid-in excess of par   BV

NO gain or loss recorded
    because NO gain or loss occurs
    from an equity transaction.

*/

/*
"Sweeteners"
    firms change the original conversion privilege
          give additional considerations to bondholders
       to induce conversion

   SFAS 84  FMV of  "sweeteners"
        Recognized as "an ordinary expense"
            upon conversion

        FMV of the securities issuable
      - FMV of all securities
      --------------------------------
        Consideration transferred over
 */

/*
Debt issued with Detachable Purchase Warrants
APB 14
debt proceeds allocated between
    the debt
    and
    stock warrants
based on relative market values

 */
/*
example Debt issued with Detachable Purchase Warrants
units of 1 bond and 1 warrant (buy 10 shares of stock at $50/share)
issue price for $1,030
                            relative fair market
warrants trade at $40       40/1000  = .04
bonds trade at $960         960/1000 = .96

Issue price assigned to warrants    $1,030 issue price x 4% = $41.20

cash            1,030.00
bond discount   11.20
    bonds payable               1,000.00
    PIC-capital-stock warrants     41.20

 */
/*
One warrant exercised:
cash                500
PIC-stock warrants  41.20
    common stock            par of 10 shares
    Paid-in-excess          PLUG
 */

/*
If market value of the stock given:
market price of stock   $54
 - option price         -50
---------------------   ---
 value of warrant       $4 x 10 shares = $40

allocating cash received to stock warrants
     increases interest costs on the bond issue
     by
          reducing    the premium
       or increasing  the discount

 */
/*
bonds are issued with Nondetachable stock purchase warrants
No Allocation to equity made
reason: inseparability prevents determining separate market value
APB 14
contrast: detachable warrants
     often traded separately from the debt
     have a readily determinable market value of their own
 */
/*
Extinguishment of debt APB 26
    when debtor pays creditor
            and is relieved of All obligations relating to the debt
examples
    the calling of a bond by the debtor: requires bondholder to sell bond to issuing corp. at a certain date and stated price
    the open market repurchase of a debt issue
    refunding of debt - replacement of a debt with a debt

 when debtor is legally released from being primary obligor of the debt
           judicially
     or by the creditor
 and
    it is probable
        debtor Will Make No Further payments on it

Not Examples
    troubled debt restructures: creditors grant relief to debtors
    debt conversions initiated by the debt holders

 */
/*
ordinary gain / loss
    recognized in the period of extinguishment

    bond reacquisition price
    - book value (face value + unamortized premium + issue costs)
    ---------
    gain


    bond reacquisition price
    - book value (face value - unamortized discount + issue costs)
    ---------
    loss

not affected reissuance of debt before or after refunding

applies to convertible bonds when reacquired with cash

ordinary gain/loss
    separate item in net income
        before extraordinary items
    most companies use debt refinancing
        as a normal risk mgt tool

classified as extraordinary item (SFAS 145):
if company meets criteria for extraordinary:
    1. infrequent in occurance
    2. unusual in nature

*/
/*
JE
Loss or gain        xx          xx
Bonds Payable       xx
Bond Premium        xx
Unamortized issue costs         xx
Bond discount                   xx
Cash                            xx

 */

 /*
investment in securities
transfer from:           transfer to:
--------------          -------------
held-to-maturity        available-for-sale      report unrealized gain or loss as separate part of S.H.E.
held-to-maturity        trading                 recognize unrealized gain or loss Immediately

available-for-sale      held-to-maturity        report unrealized gain or loss as separate part of S.H.E.
                                                amortize over remaining life of security
available-for-sale      trading                 recognize unrealized gain or loss Immediately

trading                 held-to-maturity        Do NOT reverse Unrealized Gain / Loss Previously recognized in income
trading                 available-for-sale      Do NOT reverse Unrealized Gain / Loss Previously recognized in income

 */

}
