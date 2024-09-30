package com.mgsrinivasan;

public class TroubledDebtSettlements {

    /*
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

}
