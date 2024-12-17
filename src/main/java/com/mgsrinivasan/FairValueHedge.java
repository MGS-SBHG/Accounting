package com.mgsrinivasan;

public class FairValueHedge {
/*
fair value hedge:
    a derivative used to hedge [offset] exposure to changes in
        fair value [FV] of
                a recognized asset
                or liability
                OR unrecognized commitment

 perfect hedge: gain/loss offset each other
    gain or loss on FV of derivative = gain or loss of hedged asset/liability

 typical FV hedges
    interest rate swaps: hedge risk that changes in interest rates will impact FV of debt obigations
    put options: hedge risk that an equity investment will decline in value

options and futures disadvantages
    1 are traded on organized securities exchanges
        options and futures
                have standardized terms
                lack the flexibiility to tailor contracts to specific circumstances
    2 most derivatives' types have relatively short time horizons
        can Not be used to reduce any type of long term risk exposure

 a swap
    a very popular derivative used by many corporations
    transaction between 2 parties
        1st party promises to make a payment to 2nd party
        2nd party promises to make a simultaneous payment to 1st party

 */
    /*
    interest rate swap: FV Hedge
        1st party makes payments based on fixed/floating rate
        2nd party does the opposite
        large money-center banks
                finds the 2 parties
                handles the flow of payments between the 2 parties

        party A                 party B
                ---A pays B--->
                <--B pays A ---
                Bank Facilities Transaction

     */
    /*
        Accounting entries for FV hedge
        Jones Co issues $1,000,000 5-year 8% fixed rate bonds Jan 2,2023

        Cash    1,000,000
            Bonds Payable   1,000,000

    a fixed interest rate - to appeal to investors
    Jones Co
            suffer an economic loss b/c locked into 8% interest payment
                    even if rates decline
            to protect against risk of loss,
                    enter 5-year interest rate swap contract
                        to hedge risk of a decline in interest rates
     swap contract terms to Jones Co:
            Jones Will Receive 8% fixed payments based on $1,000,000 amount
            Jones Will Pay variable rate [6.8% at inception]
                based on market rate in effect for life of the swap
     using the swap, Jones Co change bonds payable interest
                        from fixed rate
                          to variable rate

            Jones Co pays 6.8% variable rate   Jones Co pays 8% fixed rate
     [swap counter party] <     [Jones Co]          >   [Bond investor]
                    [swap contract]           [Bond payable]
            Jones Co receives 8% fixed rate

     settlement dates for swap correspond to debt interest payment date Dec 31
     each interest payment [settlement] date
            Jones Co and counter-party computes
                6.8% LIBOR current market rate - fixed 8% rate
                value of swap

     the underlying for an interest rate swap
        London Interbank Offer Rate [LIBOR]: an index of market interest rate

    IF interest rates Decline
            value of swap contract to Jones Co increase; Jones Co has a gain
            Jones Co fixed rate debt obligation increases; Jones Co has an economic loss

     the swap: an effective risk-mgt tool
            its value related to the same underlying [interest rates]
                that will affect the fixed-rate bond payable value
     IF value of swap goes up, it offsets the loss to the debt obligation

    Jan 2, 2023
     Assume swap was entered
     Same date as bond debt issuance
     swap Has No Value, NO JE
    Memorandum to indicate signing swap contract

   Dec 31, 2023
        Interest Expense    80,000
            Cash                    80,000
      interest on bonds made


        Cash                12,000
            Interest Expense        12,000

        Jones CO
            receives 1,000,000 x 8.0% fixed rate    = $80,000
            pays     1,000,000 x 6.8% variable rate = <68,000>
            settlement payment                        $12,000

    Swap Contract   40,000
        UnRealized Holding Gain or Loss     40,000
    value of interest rate swap increased based on market appraisal
    FV change reflects PV of ecpected future differences in variable and fixed interest rates

    Swap Contract on Balance Sheet
    Gain on hedge transaction on Income Statement

    UNRealized Holding Gain or Loss - Income    40,000
        Bonds Payable                                   40,000
    interest rates declined; JOnes Co records loss; increase in liability
    Loss on hedging activity - net income
    bonds payable in BS adjusted to FV

    Balance Sheet - Fair Value Hedge Presentation
    Jones Co
    Balance Sheet [Partial]
    December 31, 2023

    Current Assets
    Swap Contract   $40,000

    Long-term liabilities
    Bonds payable   $1,040,000

effect on Jones Co balance sheet
    addition of swap asset $40,000
    increase in bonds payable carrying value $40,000

    Jones Co
    Income Statement [Partial]
    For The Year Ended December 31, 2023

    Interest Expense [$80,000 - 12,000]         68,000
    Other Income
    ----------
    UnRealized Holding Gain - swap contract 40,000
    UnRealized Holding Gain - swap contract (40,000)
        Net gain (loss)                        $-0-

    $68,000 interest expense reported
    Jones Co
            receiving a fixed rate
            paying a variable rate on swap
        fixed rate on BP is converted to variable rate
        effective interest rate of 6.8% 2023
     similar accounting and measurement applied to Future interest payment dates
            IF interest rates increase,
                Jones Co Will Continue to receive 8% on swap                        [records a loss]
                         Will be locked into fixed payments to bondholders at 8%    [records a gain]
                gain on swap Offsets loss on debt obligation
                    Net Gain or Loss on hedging activity = Zero

      Impact:
      $40,000                               $40,000
            Increase in Gain                increase in Loss
            increase in Swap Asset          increase in Bonds Payable

    Summary accounting of FV hedge:
        Jones Co records derivative at FV in Balance sheet
        Any gains and losses     in Income sheet

        gain on swap Offsets/hedges loss on bond payable
            due to interest rates decline

        By adjusting hedged item (Jones Co bonds payable) to fair value (FV)
            with gain or loss recorded in earnings
                special accounting
                    Jones bonds payable Deviates from amortized cost
                    justified to report accurately hedging relationship
                        swap and bonds payable recorded at FV in Balance Sheet
                        offsetting gains and losses in Income Statement
     */
    /*
    cash flow hedge
        hedge exposures to
            "cash flow risk": exposure to variability in cash flows
        derivatives accounted at FV on Balance sheet
        gains / losses recorded in
            Equity as part of Other Comprehensive Income(OCI)
            ** NOT directly in Net Income [like general derivatives]

     cash flow hedge example:
        Allied Can Co.
        September 2022 anticipates purchasing 1,000 metric tons aluminum Jan 2023
        concerned aluminum prices will increase in the next few months
        wants to protect against possible aluminum price increases
        to hedge, enters into
        futures contract:
            firm contractual agreement
                between a buyer
                and     a seller
            for a specified asset
            on a fixed date in the future
            has a standard specification
                Both parties Know Exactly What is being traded

        i.e. Allied aluminum *futures contract*:
            gives holder [Allied] the right and obligation to
                purchase asset:          1,000 metric tons
                at a present price:      $1,550 per ton contract price
                for a specified period of time: till contract expires Jan 2023
            "the underlying" for this derivative: the aluminum price

            IF aluminum price rises Above $1,550
                the value of the futures contract to Allied Increases
                    Allied Will Be Able to purchase the aluminum
                        at the Lower price of $1,550 per ton
                the Actual aluminum Does Not Have To BE exchanges
                On Each Settlement Date, futures contract parties
                    settle/pay cash differences
                         between
                            futures prices
                        and
                            aluminum price

            "a forward": similar to "futures contract"
                NOT traded on an exchange
                NOT have standardized conditions

     September 1 2022 futures contract enter into
        "spot price": price to be paid today for inventory To Be Delivered in January
            Equal To
        "contract price"
        NO Journal Entry [JE] Necessary
        Memorandum indicates furtures contract Signed

        December 31, 2022
            price for January aluminum delivery Increased To $1,575 per metric ton
            JE by Allied
                Futures Contract    25,000 [current asset in BS]
                    UnRealized Holding Gain or Loss - Equity    25,000 [Other Comprehensive Income (OCI)]

        "anticipated transaction":
            Allied Has Not Yet Purchased and Sold the inventory
                gains or losses on futures contract
                    accumulated in Equity as part of Other Comprehensive Income (OCI)
                        Until period inventory IS Sold and Earnings Affected

     January 2023 JE
     Allied Purchased
            1,000 metric tons Aluminum
            x $1,575
            ----------
            $1,575,000

        Aluminum Inventory  1,575,000
            Cash                        1,575,000

     January 2023 JE Allied Makes Final settlement on futures contract
        $1,575,000
        $1,550,000
        ----------
        $   25,000

     Cash   25,000
        Futures Contract    25,000

THrough Use of the Futures Contract Derivative:
    Allied fixed its inventory cost

    $25,000     futures contract settlement
    Offsets amount paid to purchase inventory at
    $1,575,000  prevailing market price

    Desired result: Net Cash outflow $1,550 per metric ton

    Anticipated Cash Flows
    wish to fix cash paid for inventory at 1,550,000

    Actual cash flows
    actual cash paid    1,575,000
    LESS: cash received   (25,000) on futures contract
    ------------------- ----------
    final cash paid     1,550,000


*** In practice: futures contracts Settles on a Daily Basis ***

NO Income effects up to this point
Gain on Futures Contract accumulated in Equity as part of Other Comprehensive Income (OCI)
    UNTIL period when inventory IS Sold
        Earnings affected through Cost of Goods Sold (COGS)

 aluminum is processed into finished goods i.e. cans
    total cost of cans Including Jan 2023 = $1,700,000

    July 2023 JE Allied sells cans for $2,000,000

    Cash                            2,000,000
        Sales Revenue                           2,000,000

    Cost og Goods Sold [COGS]       1,700,000
        Inventory (Cans)                        1,700,000


    July 2023 hedging transaction JE:
        effect of anticipated transactions affected earnings

    UnRealized Holding Gain or Loss     25,000
        Cost of Goods Sold (COGS)               25,000


Gain on futures contract reported on Other Comprhensive Income (OCI)
    Now reduces Cost of Goods Sold (COGS)
    cost of aluminum in overall COGS = $1,550,000
the futures contract Worked as planned to manage
    cash paid for aluminum inventory
    and
    COGS amount
     */


}

