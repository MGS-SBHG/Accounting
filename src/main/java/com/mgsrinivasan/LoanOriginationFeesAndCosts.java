package com.mgsrinivasan;


public class LoanOriginationFeesAndCosts {

    /*
    lender incurs various loan origination costs
        when originating or acquiring a loan

    SFAS 91,  lender defers and recognizes these costs
        over the life of the loan only when:
            the costs relate directly to the loan
            the costs would not have incured except for the loan
            ie  attorneys fees,
                title insurance,
                wages of employees direct work on the loan origination

    lender charges the borrower
        a nonrefundable loan origination fee

    SFAS 91, Both lender and borrower
                shall defer
                and
                recognize this fee
                    over the life of the loan

    fee is in the form of "points";
        1 point = 1% of the face amount of the loan

    ie B bank loan to V company inc
    yrs n               10
    amt                 $100,000
    stated i            10%
    monthly payments    1,213
    direct loan
    orignation costs    $3,000
    nonrefundable loan
    origination fee     5 points    5% x $100,000 = $5,000

     */

    /*

    face of loan           100,000
    - Nonref. loan fee      <5,000>
    + loan   costs           3,000
    ------------------      -------
    B Bank carrying amount  98,000

    10 yrs x 12 months x $1213 = 145,560

    145,560
    / 100,000
    ---------
    1.4556 factor for effective interest rate FV of $1
    8.5%

    */

    /*
    face                                100,000
    loan fee 5 points   100,000 x .05 =  <5,000>
                                        --------
    V Co loan carrying amt               95,000

    pv          95,000
    / face      100,000
    --------    -------
    factor      0.95

     */

    /*
    loan origination costs - added to the principle by lender
    fees charged to client - deducted from principle by Both lender and borrower
                                to compute carrying amount
     */

    /*
    Disclosures
        if borrower receives face amount of loan
                from lender
                w/ No related discount or premium
            liability is the face amount
            effective interest rate = stated interest rate on the interest-bearing note

    when note is issued for amount
        Other Than face of the loan
    Or noninterest-bearing note is used
        discount:   adds to interest expense over the life of the note
        premium:    reduces interest expense over the life of the note

    the amount in discount or premium account:
        amortized to interest expense
            over the life of the note

     */

    /*
    Balance Sheet
        notes: reported at net carrying amount
        discounts on NP: liability valuation account         (contra account)
        premium   on NP: addition to face amount of the note (adjunct account)
     */

    /*
    FS footnotes
        disclose for all LT borrowings
            for Each of the 5 years following BS date:
                aggregate amounts for maturities
                the sinking fund requirements
     */
}
