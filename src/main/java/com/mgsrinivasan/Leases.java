package com.mgsrinivasan;

public class Leases {
    /*
    operating leases - renting

    lessee:
        each payment rent expense
            rent expense    db
                cash            cr

    prepayment for future expense
        asset
        amortized - Straightline method

    consideration free rental months
        lessee takes net rent expense to be paid for entire period
        divide over Each period

        rental agreement 5 yrs = 60 months
        60 months x 1,000               60,000
        - 1st 6 months free             <6,000>
        --------------------            --------
        net cost 5 years                54,000
        entire period                   / 60 months
        -------------------             -----------
        monthly expense                 $900

    lessor:
    each period: rental income
        cash    dr
            rental income   cr

    fixed asset being rented in PPE
    depreciate Over useful life

    prepayment: liability account as deferred credit

     */

    /*
    capitalized lease:

    Lessee:  one of O.W.N.S. to capitalize
    "O"wnership transfers at end of lease term
    "W"ritten Bargain Purchase Option
    "N"inety percent rule
        90% of leased property FMV < PV of future leased payments
    "S"eventy-five percent rule
        75% of Asset's economic life committed in lease term


    lessor: ALL 3 of "LUC" to Capitalize
    "L"essee Owns the leased property
    "U"ncertainties NOT Exist on UnReimbursable Costs
        to be incurred by Lessor
    "C"ollectibility of Lease payments:
        reasonably predictable

     */
    /*
    Lessee Capitalization rules
    Capitalize leased asset as PPE on balance sheet
        Cost = PV of
                future leased payments
                Exclude executory cost for
                    repairs and maintenance (R & M)
                    insurance
                    tax
        discount rate: incremental borrowing rate
            lessor of
                lease implicit rate if known
                market rate available to lessee

     Dollar Amount to be capitalized:
     "O"wnership:       PV of payments + Required buyout
     "W"ritten BPO:     PV of payments + BPO
     "N"inety %:        PV of payments Only; NOT BPO
     "S"eventy-Five %:  PV of payments Only; NOT BPO

     Depreciate capitalized "lease" asset:
     "O"wnership:       asset life [legal form]
     "W"ritten BPO:     asset life [legal form]
     "N"inety %:        lease life [substance]
     "S"eventy-Five %:  lease life [substance]

    footnote disclosures:
    amount for appropriate required period "5 years"
    aggregate mount for period thereafter
    amount in the aggregate

     */
/*
lease
$20,000.00 payments for 5 years; Jan 1
10% incremental borrowing rate
asset life 10 years
ownership transfers at end of lease term

present value factor [5 years, 10% rate, annuity due] = 1 + 3.1699 = 4.1699

20,000 * 4.1699 = $83,398

YEAR    CASH    INT.EXP [balance * .10]    PRINC.[cash - int. exp]      BALANCE [Current Balance - Princ.]
1                                                                            83,398
1       20,000                  0            20,000                          63,398
2       20,000                  6,340        13,660                          49,738
3       20,000                  4,974        15,026                          34,712
4       20,000                  3,471        16,529                          18,183
5       20,000                  1,817        18,183                              0
        -------                 ------      --------
        100,000     =           16,602  +    83,398

TODAY   NOW      1       2       3       4
-----   ---     ---     ---     ---     ---
        20,000  20,000  20,000  20,000  20,000
20,000 ---|
18,183 -----------|
16,529 -------------------|
15,026 ---------------------------|
13,660 ------------------------------------|
------
83,398 = 20,000 * [1 + 3.1699]

 */


/*
Sales-type Lease

Lessor
2 profits:
    gain or loss on sale [lease] of asset
    interest income from collection of lease payment

I.E. Basis of Sold [Leased] Asset = $70,000

Jan 1 2021
    lease receivable    83,398
        sale                    83,398
record sale [lease] of asset to a lessee

cost of goods sold      70,000
    asset                       70,000
remove sold asset from inventory Balance Sheet;
record expense of sale on Income Statement

Jan 1 2021
cash    20,000
    lease receivable    20,000
record collection of 1st lease installment from lessee

Dec 31, 2021
Interest receivable     6,340
        interest income - lease     6,340
record interest earnings on outstanding principle amount
another payment is due 1st of Next year

Jan 1, 2022
cash        20,000
        lease receivable    13,660
        interest receivable  6,340
record collection of 2nd installment payment from lessee
 */


/*
Direct-Financing Capital Lease
Lessor: Only interest income from lease payment collection
NO gain or loss on sale [lease] of asset to lessee

IE asset basis = $83,398

Jan 1 2021
    lease receivable    83,398
        asset [sold]            83,398
sale of fixed asset at NO profit AND future lease payments

jan 1, 2021
cash                    20,000
    lease receivable                20,000
record 1st payment on lease at the start

dec 31, 2021
    interest receivable     6,340
        interest income             6,340
record recognition of 1st year interest income

jan 1, 2022
cash        20,000
    lease receivable        13,660
    interest receivable      6,340
record 1st payment on lease at the start

*/

/*
Sale - Leaseback
DESCRIPTION:
property sold by owner
    immediately leased [operating OR capital] back again
original owner/seller Never gives up possession Or use of property

CRITERIA: based on significance of retained lease
Minor:
PV of future lease payments < 10% of FMV of property Just SOLD [sales price]

Major:
PV of future lease payments > 10% of FMV of property Just SOLD [sales price]

Qualification:
NO Sale Leaseback: Minor Lease (back)
   Sale Leaseback: Major Lease (back)


NO Sale Leaseback: MINOR Lease (back); < 10% FMV
Loss on sale:
    recognize Entire Loss in year of sale
    record rent expense for Each payment

Gain on sale:
    recognize Entire Gain in year of sale
    record rent expense for Each payment


Sale Leaseback: MAJOR Lease (back); > 10% FMV
Loss on sale:
    recognize Entire Loss in year of sale

Deferred Gain on sale:
    Defer gain upto PV of lease liability
    Amortize deferred gain as offset (reduction) to
        IF operating leaseback:
                "rent expense" to be paid in future
        IF capital leaseback:
                "depreciation expense"
                    on capitalized asset that original owner/seller "owns" Again

FASB statement 13
    Any profit on a sale/leaseback transaction
        S/B Deferred
        and Amortized over lease term

Exception:
    IF lease term <= 10% of remaining useful life of leased asset,
        profit Recognized IN Full




*/
}
