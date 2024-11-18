package com.mgsrinivasan;

public class TroubledDebtSettlements {
/*
Debt Restructure
SFAS 15
accounting for debtors where creditors are compelled to grant relief (restructure debt) to debtors

Types
1. Settlement of debt at less than carrying amount
2. Continuation of debt with modification of terms

SFAS 114 amended by SFAS 118
accounting by creditors from impairment of certain loans
impaired loans: loans restructured in a troubled debt restructuring involving modification of terms

 */

/*
1. Settlement of debt

a. debtors
if debt is settled by exchange of assets,
    consideration to extinguish debt
    - carrying amt of the debt
    ---------------------------
    ordinary gain is recognized

SFAS 145 gain Not Extraordinary

if noncash asset given:
separate gain / loss recorded
    to revalue asset to FMV basis of the noncash asset given

steps:
1. Revalue noncash asset to FMV
2. Determine the restructuring gain

if stock is used,
    record stock at FMV


b. creditor:
assets received in full settlement are recorded at FMV

receivable
- asset FMV
-------------
ordinary loss

account for assets
    as if purchased for cash

Summary
debtor transfers assets
    or grants an equity interest
to the creditor in full satisfaction of debt

debtor and creditor account for
    FV of the assets transferred
    and
    equity interest granted

debtor recognizes a gain
creditor recognizes a loss

recorded amt of debt
- FV accounted for
--------------------
gain / loss

*/
/*
example 1
company transfers land in full settlement of debt of loan payable

loan payable (5 yrs remaining)   $90,000
accrued interest payable         $10,000
Land
BV          $70,000
FMV         $80,000


JEs:
debtor:
-------
land        10,000
    gain on transfer of assets  10,000

$90,000 loan payable
- $80,000 FV of land
---------------------
10,000 gain

loan payable            90,000 CV
interest payable        10,000 CV
    land                            80,000 FMV
    gain on debt restructure        20,000 difference

creditor
--------
land                    80,000  FMV
loss on settlement      20,000  difference
    loan receivable                90,000 CV
    interest receivable             10,000 CV
 */

    /*
    example 2
    date        payment     interest revenue    discount amortized  carrying value [CV]
    12/31/x4                                                            49,587
    12/31/x5    0               4,959               4,959               54,586
    12/31/x6    0               5,454               5,454               60,000
    */

    /*
   CREDITOR: record interest revenue; amortization of discount on N/R
                        12/31/x5            12/31/x6
    discount on N/R     8,264               9092
        interest revenue        4959                5454
        allowance [plug]        3305                3638

     */

    /*
    allowance for doubtful accounts
    --------------------------------------
                    |   12/31/x4    33.057
                    |   12/31/x5    3305
                    |   12/31/x6    3638
    ----------------------------------------
                    |               40,000
   12/31/x6 40,000  |
   -----------------------------------------
                        ending balance -0-

     */

/*
DEBTOR: pays only 60,000 of 100,000 Note at maturity
Note Payable    100,000
    Gain [plug]             40,000
    Cash                    60,000

CREDITOR:
Cash       60,000
Allowance   40,000
    Note Receivable     100,000

 */

/*
disclosure - CREDITOR ONLY
ASC 310-10-50-15 RECEIVABLES, OVERALL DISCLOSURES, IMPAIRED LOANS
SFAS NO 118 ACCOUNTING BY CREDITORS FOR IMPAIRMENT OF A LOAN-INCOME RECOGNITION AND DISCLOSURES
    AMENDMENT TO FASB STATEMENT NO. 114

    NOTES RECEIVABLE (IMPAIRED LOANS)
        N/R WITH ALLOWANCE ACCOUNT
        N/R W/O  ALLOWANCE ACCOUNT

    TOTAL BALANCE: IMPAIRED LOANS PRINCIPLE

    CREDITOR POLICY
        Interest revenue recognition
        how they record Receipt of Cash

    Each Year an Income Statement Prepared:
        Average investment in impaired N/R
        Interest revenue recognized on those Impaired N/R
        Interest revenue on Cash Basis

    Policy
        deciding Which loans are reviewed for impairment

    Factors/Reasons
        used to determine whether a loan IS impaired

    Changes in Allowance accounts
        SEC registrants ONLY ASC 235-10-S99-4
        incl. Beg and End Balances
 */

    /*
    Accounting For Troubled Debt, Restructurings - Settlements
        DEBTOR:     ASC 470-60
        CREDITORS:  ASC 310-40

        CREDITOR
        --------
        N/R     1,000,000
        INT REC   100,000

        DEBTOR
        -------
        N/P     1,000,000
        INT PAY   100,000

     */

    /*
    Settlement: debtor transfers asset to creditor

    Debtor Co. settles debt; transfers building:
    CREDITOR:
    ---------
    Building            950,000
    Allowance OR LOSS   150,000
        Int Receivable              100,000
        Note Receivable             1,000,000

   DEBTOR:
   -------
   Accum Dep    150,000
   Note Payable 1,000,000
   Int Payable  100,000
        Building            900,000
        Gain on Transfer    200,000
        Gain on Settlement  150,000 [plug]

     */

    /*
    Settlement - Debtor gives creditor Stock
    Debtor CO to Creditor CO
        10,000 shares $10 par Common Stock
            market value $60 per share

    creditor
    --------
    Investment in debtor co     600,000 [10,000 x $60]
    Allowance or Loss [plug]    500,000 [10,000 x ($60 - $10)]
            Interest Receivable             100,000
            Note Receivable                 1,000,000

    debtor:
    -------
    Note Payable        1,000,000
    Interest Payable      100,000
            Gain on settlement                  500,000 [plug]
            Common stock                        100,000 [10,000 X $10]
            Additional paid in capital[APIC]    500,000 [10,000 X ($60-$10)]
     */

/*
Accounting for Troubled Debt - Modification of terms
DEBTOR:     ASC 470-60
CREDITOR:   ASC 310-40
SFAS NOs 15, 114

MOD 13.C SIM 1 continuation

 */

    /*
    spreadsheet formula
    PV(rate,nperiods,pmt,[fv],[type])
    rate = 9% or 0.09
    nperiods = 3
    [fv] = future value; what's due at maturity
    type: 0 = ordinary annuity
          1 = annuity due

    principal = PV(0.09,3,0,-250000,0) = 193,046
    interest = PV(0.09,3,-15000,0,0) = 37,969

     193,046
    + 37,969
    ---------
    $231,015  CV 01/01/Yr3

    creditor amortization schedule:
                250,000 x 6%    CV x 9%
    period          payment      int revenue    amortization(plug)  Carry Value(CV)
    1/1/yr3             -           -               -               231,015
    12/31/yr3       15,000       20,791             5,791           236,806
    12/31/yr4       15,000       21,313             6,313           243,119
    12/31/yr5       15,000       21,881             6,881           250,000 CV approaches this!
                    ------      --------            -------
    Total:          45,000       63,985             18,985

     */

/*
creditor remaining JEs
12/31/Y4
Cash        15,000
Allowance   6,313
    Int Rev         21,313

12/31/Y5
Cash        15,000
Allowance   6,881
    Int Rev         21,881

Cash        250,000
    N/R             250,000

 */
/*
Modification of terms
a. debtor (SFAS 15)
compare total future cash flows of the restructured debt
principle and interest to
the prestructured/present carrying value

if total amount of cash flows > carrying value,
    no adjustment to carrying value
    compute new effective interest rate
        makes PV of future cash flows = present CV of the debt (principal and interest)

if total amount of cash flows < carrying value,
    current debt Is Reduced to the amount of the future cash flows
    gain Recognized
    No interest expense recognized;
        loan was written down to CV
    payments including those designated as "interest"
            would be applied to the principal
if restructure is part settlement and part modification,
    1. account for the part settlement,
    then
    2. account for the part modification of payments

*/
/*
b. creditor (SFAS 114)
creditor measures impairment based on
    1. PV of expected future cash flows
            discounted at loan's
                "effective interest rate"
                    based on original contract rate
                      Not structured agreement rate
   expedient ways:
   2. The loan's observable market price, or
   3. The FV of the collateral if loan is "collateral dependent"
            loan repayment is expected to be provided solely by the underlying collateral

If the measure of the impaired loan
< recorded investment in
    loan
    + accrued interest
    + net deferred loan fees or costs
    + unamortized premium or discount
recognize impairment
    a. create a valuation account;
        charge to bad debt expense,
        or
    b. debit existing valuation allowance for the impaired loan
    with
        credit to bad debt expense

PV of an impaired loan's expected future cash flows
    will change from one reporting period
                  to the next,
    due to:
        1. passage of time, or
        2. revised estimates in the amount
            or timing of those cash flows
No guidance on how the creditor should recognize the change in PV

Summary
SFAS 15
    terms of the debt are modified
    in order to reduce/defer
        cash payments that the debtor
            is obligated to make to the creditor;
    the debt continues

debtor
    reduction in interest expense
        from the date of restructuring
        to maturity
gain / loss only when
    total future cash payments
        specified by the new terms
    less than (<) the recorded amount of the debt

creditor - SFAS 114
    use the original effective interest rate to measure losses

 */

/*
example Mod of terms; gain/loss recognized

loan payable (5 yrs remaining)  $90,000
accrued interest payable        10,000
land
    BV                          70,000
    FMV                         80,000
interest rate:                   5%

modification of terms
reduced interest rate:           4%
accrued interest forgiven
principal reduced to            $80,000


debtor:
future cash flows (after restructuring)
principal                   80,000
interest                    16,000
-----------                 ------
total cash to be repaid     96,000

prior to restructure:
----------------------
principal                   90,000
interest                    10,000
-----------                 -------
total cash to be repaid     100,000

Gain to be recognized       4,000

Analysis of debtor's Loan Payable Account T-account
----------------------------------------------------
                            |   90,000  Loan payable Before mod of terms
                            |   10,000  accrued interest
gain                $4,000  |
4% mod int pymnts   3,200   |
principle reduction 3,200   |
                    3,200   |
                    3,200   |
                    3,200   |
----------------------------------------------------------
                            |   $96,000 balance After restructure


creditor:
PV of future cash flows (after restructure)
discounted at original effective interest rate, 5% for 5 yrs
Principal   $80,000 x .78353 (pv of 1, n=5, I =5%)                      62,682.40
Interest    $80,000 x 4% x 4.32948 (pv of ordinary annuity, n=5, I=5%)  13,854.34
----------                                                              ---------
PV of future cash flows                                                 76,536.74

Recorded investment in loan by creditor             100,000.00
PV of future cash flows  (after restructure)         76,536.74
---------------                                     -----------
Impairment loan loss to be recognized by creditor   23,463.26

*/

/*
JEs

debtor (SFAS 15)
Beg of yr 1:
interest payable    10,000
loan payable        4,000
    loan payable                    10,000
    gain on restructure of debt      4,000

accrued interest: added to loan payable to get prestructure carrying value [CV]
gain:             reduces  loan payable to total future cash flows of the restructed debt

Made each End of yrs 1 through 5:
loan payable    3,200
    cash                3,200

End of yr 5:
loan payable    80,000
    cash                80,000


creditor (SFAS 114)
Beg of yr 1:
bad debt expense        23,464
    loan receivable                         10,000
    accrued interest receivable             10,000
    valuation allowance for impaired loans  3,464

End of Year 1:
cash                                        3,200
valuation allowance for impaired loans        627
    interest revenue / bad debt expense                3,827
    (80,000-3,464) x 5%

End of Year 2:
cash                                        3,200
valuation allowance for impaired loans        658
    interest revenue / bad debt expense             3,858
    (80,000-3,464-627) x 5%

End of Year 3:
cash                                        3,200
valuation allowance for impaired loans        691
    interest revenue / bad debt expense             3,891
    (80,000-3,464-627-658) x 5%

End of Year 4:
cash                                        3,200
valuation allowance for impaired loans        726
    interest revenue / bad debt expense             3,926
    (80,000-3,464-627-658-691) x 5%

End of Year 5:
cash                                        3,200
valuation allowance for impaired loans        762
    interest revenue / bad debt expense             3962
    (80,000-3,464-627-658-691-726) x 5%

 */

/*
Example - Modification of terms; No Gain Recognized by Debtor
                OLD     NEW
principal       90,000  85,000
interest        5%      4%

Future cash flows (after restructuring)
Principal                       85,000
Interest (85,000 x 4% x 5 yrs)  17,000
---------                       -------
Total cash to be paid           102,000

Amount prior to restructure
principal   90,000
interest    10,000
---------                       ----------
Amount prior to restructure     <100,000>

= interest expense/revenue         2,000
    to be recognized over 5 yrs

Need to compute the effective interest rate
so that PV of future payments = $100,000


debtor: end of years 1 through 5:
loan payable        xxxx
interest expense     xxx
    cash                    3,400 [ $17,000/5 ]

loan payable    85,000
    cash                85,000


creditor [same as SFAS 114 example above]:
original effective interest rate W/B Used to measure the loss

*/

/*
Impairment

debtor: has legal obligation to repay debt;
NO JE recorded

creditor:
if based on current information and events,
    it is probable it will be Not able to collect All amounts due,
    the N/R Is Impaired
        based on the creditor's normal review procedures
loss is recorded at the time impairment is discovered

current carrying value of note
- PV of expected future cash flows discounted at the loan's contractual rate
-------
Loss

*/

/*
example: Impairment
1/1/2024 S corp issued to G corp.
$100,000 noninterest bearing note
3 years
10%
            [prev CV x .10]
date        10% interest    current CV = prev CV + int
1/1/2024                    75132                     PV 100,000, 10%, 3 periods; 100,000 x .75132
12/31/2024      7,513                                   75132 + 7513
12/31/2025      8,265                                   82645 + 8265
12/31/2026      9,091                                   90910 + 9090

12/31/24 S corp mgt determines
    it is Probable G corp Not be able repay entire note
    Only $75,000 Will Be Repayed


Carrying value at 12/31/02                                                82,645
PV of future receipts ($75,000, i=10%, n=2) 75000* factor 0.82645         61,984
                                                                         --------
                                                                          20,661

Record impairment on S corp, the Creditor's books:
bad debt expense                        20,661
    allowance for doubtful accounts             20,661

debtor, G corp records nothing;
still obligated to repay entire $100,000

future interest revenue recorded by S corp
    based upon the new carrying value of $61,984
if significant change in the expected future cash flows,
    impairment is recalculated
    allowance is readjusted



 */
} // end of class
