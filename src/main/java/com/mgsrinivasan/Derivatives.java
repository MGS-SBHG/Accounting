package com.mgsrinivasan;

public class Derivatives {
    /*
    1 Foreign Currency Transaction
		Money is NOT  U.S. $
		Purchase (A/P) of goods & services
		Sale (A/R) of goods & services

2 Derivative Instruments; Hedging Activities
	convert entire set of F/S to $ U.S. Currency Dollars

3. F/S Disclosures
	Aggregate transaction Gain/Loss included in Entity N.I.
	Significant rate changes
	    subsequent [ Subsequent event information] to date of F/S
	        including effects on unSettled foreign currency transactions

Derivatives ASC 815
Definition - 3 distinguishing characteristics
1.	Financial Instruments
    a.	1 or more Underlyings
    b.	1 or more Notions

	Underlyings
        changes;
        causes the risks
        causes the losses / gains
        the financial or physical variable
            that has observable changes
        or	objectively verifiable changes

	i.e. commodity price (price per bushel of corn)
		interest rates
		exchange rates [LIBOR]
		indexes related to those items
		credit rating
		temperature changes

	Notion:
		nbr of units of the item
		financial currency
		qty specified in the financial instrument or contract
	i.e. 	nbr of bushels of wheat; nbr of stock shares; Nbr of barrels of oil

	Settlement Amount
		computation in the financial instrument or contract
	i.e.	FV of stock x nbr of shares
		complex computations
		ratios
step-wise variables

leveraging techniques

	Notion amt = units
	Settlement amt = dollars

	Derivative contracts cost $0.00 or very little.

c. Terms.
1.	requires / permits the Net Settlement Amount
2.	Provides for delivery of asset

1 million bushels @ $1 / bushel; changes to $1.10 / bushel
	Net Settlement = [1.10 - 1.00] x 1 million bushels = $100,000


Inclusions / Exclusions of Derivatives
Inclusions:
1.	Options (Put/Trade/Sell/Call)
2.	Futures Contracts
3.	Interest Rate Swaps
4.	Currency Swaps
5.	Swaptions: options on swaps
6.	Credit Index Contracts
7.	Interest Rate Caps; Floors; Collars

Exclusions:
1.	Normal purchases / sales
2.	Equity securities (sale of C.S.)
3.	Debt Securities (i.e. Bonds)
4.	regular way
5.	leases
6.	MBS Mortgage Backed Securities
7.	ESOP Employee Stock Options
8.	Royalty Agreements; Contracts tied to sales volume
9.	Variable Annuity Contracts
10.	Adj. Rate Loans
11.	Guarantee Investment Contracts
12.	NonExchange Traded Contracts tied to physical variables
13.	Derivatives that serve as ingredient to Sales Accounting
	i.e. Guarantee Residual Value on Sales Arrangement
     */
 /*
Hedging Instruments General Criteria:

Take Asset gain and offset Liability loss

2 Criteria for derivatives to qualify as a Hedging Instrument
1.	Sufficient Documentation at beginning of hedge
    a.	objective and strategy of hedge
    b.	hedging instrument ; hedged item
    c.	how Effectiveness of hedge will be assessed on an ongoing basis

2. Hedge must be Highly Effective throughout its life
		(3) Highly Effective Hedge
		    “cumulative change in value of hedging instrument
		        S/B 80-125% of the inverse cumulative changes
		            in FV or Cash Flows of hedged item”
		(4) Method Used to assess effectiveness
			Used throughout hedge
			Consistent w/ approach used for managing risk

Embedded Derivatives and Bifurcation
		hybrid instruments:
		    financial instruments and contracts;
		    contains features, if stood alone, meets the definition of derivative instrument

		host contract
		    basic contract that has the embedded derivative instrument

		bifurcation
		    process: embedded derivative instrument
		                Separated from host contract
		                treated as stand-alone instrument.

host contract (w/o embedded derivative): accounted normally.
derivative instrument:                   derivatives accounting rules

3 Bifurcation Criteria: ALL Must Be Met:
1.	Embedded derivative:
        Meets definition of a derivative
2.	Hybrid instrument:
        Not regularly recorded at FV w/ changes in Current Earnings
3.	Economic characteristics and risks of the embedded instrument:
        Not that of host contract

Hybrid instruments that normally require bifurcation:
	Convertible debt (i.e. convertible Bonds Payable ["B/P"] with stock option)
	B/P with Interest rate based on S & P 500 index
	Equity instrument (stock) w/ Call option:
	    allows issuing co. to buy back stock
	Equity instrument (stock) w/ Put option:
	    requires issuing co. to buy back stock at Holder’s request
	Loan Agreement:
	    permits debtor to pay off loan Prior To maturity;
	    loan payoff penalty based on short-term T-Bill rates
	Loans with Term-Extending options
	    value based on Prime rate at time of extension

Election Not to Bifurcate:
	Entire instrument at FV
	Irrevocable
	Instrument-By-Instrument basis
	Changes in FV is recognized in earnings
		Unrealized Holding Gains / Losses -> Income from Continuing Operations
	Balance Sheet ("B/S") Disclosure for hybrid Instruments:
        a.Line item - F.V.     Instrument
	      Line item - Non-F.V. Instrument
        b. Hybrid Instrument
			    $xxx.xx Aggregate amt ( $ $xxx.xx  F.V. amt )

FV Option
		on Host financial instrument
		        After separating Non-financial derivative instrument
		        From         the Nonfinancial  hybrid     instrument
		Disclosure rules for F.V.

  */
/*
Types of Hedges
	3 types:
		Fair Value [F.V.]
		Cash Flow [C.F.]
		Foreign Currency [F.C.]

	F.C. treated like F.V. Hedge
	F.C. treated like C.F. Hedge

FV Hedge
    derivative instrument to hedge exposure of changes in FV of an asset or liability
	Criteria: hedged item must be either:
		All or specific portion [% ; contractual cash flow ] of:
            1 Recognized [ presented on the B/S ] Asset or Liability
            or
	        2 UnRecognized Firm Commitment [Purchase Order (PO); Contract ; Executory in nature ]
                a.Binding on Both parties
                b.specific on all significant terms
                c.NonPerformance clause: makes performance probable
		            i.e. “I’ll sue you if …”

	the accounting for Effective AND InEffective Portions
        report on Income from Continuing Operations
	Only the Relative Value = FV
		Mark Up/Down
		UnRealized Holding Gains / Losses reported in Current Earnings (Income from Continuing Operations - Net of Tax )

Cash Flow Hedge
	hedge exposure to variability in expected future cash flows

    Criteria
        1. Hedged asset / liability and hedging instrument Must be linked
                the basis (specified rate or index) for change in cash flows
                is the same for
                        hedged asset/liability
                        and
                        hedging instrument.
        2.cash flows Must Be “highly effective” (80% - 125% threshold)
        3. if forecasted transaction,
              it Must Be considered probable.
        4. if series of transactions,
              they must share the same risk exposure
                    i.e. purchases of particular product from same supplier over a period of time.

    Accounting for Hedging instrument:
		Effective portion: UnRealized Holding Gains / Losses
                                reported in Other Comprehensive Income (OCI)
		InEffective Portion:
                                reported in Income from Continuing Operations

Foreign Currency Hedges
	Foreign currency denominated asset/liability in normal ops
	    are hedged w/ offsetting Forward Exchange contracts.
	    natural hedge; normal accounting

4 areas requiring hedge accounting:
    1 UnRecognized Firm Commitments (PO / Contract)
        Accounted like Fair Value hedge
    2 Avail for Sale Securities
		Accounted like Fair Value hedge
    3 Foreign Currency denominated Forecasted Transactions (think about doing it )
        Accounted like Cash flow hedge
		UnRealized Holding Gain/Loss in O.C.I.
    4 Net Investment in Foreign Operations
		Accounted like Cash flow hedge
		UnRealized Holding Gain/Loss in O.C.I.

    example:
        gains/losses of
        Effective portion of hedging instruments recognized in current earnings
            FV hedges yes; Cash flow hedge No
        InEffective portion:
            FV hedges yes; Cash flow hedge yes
 */
    /*
Forward Exchange Contracts
Foreign currency transaction gains & losses
On assets or liabs denominated in a currency Other Than functional currency
Est. F.V. of  Fwd Exchange contracts
Use forward exchange rate for remaining term of the contract

Foreign Currency transaction = spot rate
Forward contract = forward rate

Derivatives - why hold them?
	For Speculation:
		Value at FV on B/S ( UnRealized Holding gains/losses when Marked up/down to FV)
		Income from Continuing Operations (net of tax) in Other Revenue/Gains OR Other Expenses/Losses

    For Hedging:
		Fair Value (FV) hedge
		Cash Flow  (CF) hedge
		Foreign Currency
			Treated like FV hedge
 			Treated like CF hedge

examples:
Example 1
Dec 31 yr 1  foriegn currency transaction loss?
Purchase inventory Nov 30 yr 1
Payable March yr 2
Dec 31 yr 1 need to revalue the A/P ( adj JE )
For FC gain / loss

                    A/P
-------------------------------------------                                      .
11/30/Yr 1     | 100,000 € x 0.87 = $87,000
               | $5,000 adj
12/31/Yr 1     | 100,000 € x 0.92 = $92,000

Adj. JE.
FC Trans loss. $5,000
	A/P 			$5,000


Example 2:
             A/R (offset A/P)
----------------------------------                               .
12/12/Yr 1        |
$100,000 €        |
x 0.90            |
= $90,000.        |
----------------------------------                                .
                  |
$3,000 Adj.       |
-----------------------------------                                .
                  |
12/31/Yr 1        |
100,000 €         |
x 0.93.           |
 = $93,000.       |                               .


Adj. JE.
A/R		$3,000
    Gain.       $3,000


Example 3:
2nd Forward contract to hedge contract to purchase equipment
Hedge = FV hedge
March yr 2  expected delivery date; settlement due to mfr
On Dec 31 yr 1, FC transaction gain from Fwd contract to include in NI ?

             A/R (offset A/P)
---------------------------------------                              .
12/12/Yr 1        |
$100,000 €        |
x 0.90            |
= $90,000.        |
--------------------------------------                             .
                  |
$3,000 Adj.       |
--------------------------------------                         .
                  |
12/31/Yr 1        |
100,000 €         |
x 0.93.           |
 = $93,000.       |                               .
-------------------------------------

Adj. JE.
A/R		$3,000
Gain.			 $3,000
In " Other Gains "

example 4:
Speculation: gains/losses go to "Income From Continuing Opers."
Dec 31 yr 1 FC transaction gain from fwd contract to include in NI?
$3,000.

*/
    /*
Disclosures for Hedges:
A Objectives and Strategies for achieving them
B Context to understand the instrument
C Risk Mgt Policies
D List of hedged instruments
	Separated by type of hedge
	Reported each time complete set of F/S are issued
	Derivatives Not designated as hedging instruments

Instruments and Derivatives Eligible for offset: Disclosures in footnotes:
1. Gross Amt of Recognized assets and liabilities
2. Amts offset ASC 210-20-45; 815-10-45
3. Net Amts in "Statement of Financial Position"
4. Amts subject to master netting arrangements included in the offset.
5. Net  Amts considering nbrs 3 and 4 above

Add. Footnote disclosures for Derivative instruments. ASC 815 / fasb 161
1. How and why an entity
*/

    /*
example:
Foreign Exchange Transaction Gain / Loss Yr 2 income ?

        Sales
------------------
        | 250,000 Pula Co  9/1/y1
        |

            A/R
---------------------------                      .
250,000 Pula Co |   9/1/y1
x .20           |
----------------|
$50,000         |
----------------------------
250,000 Pula    |  $2,500  Adj Entry 12/31/Y1
x .19           |
-----------------------------
$47,500         |   12/31/Y1
-----------------------------
$7,500          |    02/01/Y2  Adj. Entry before collection
250,000         |
x .22           |
----------------------------                  .
$55,000

Adj Entry 12/31/Y1
Loss  $2,500
	A/R         $2,500

02/01/Y2  Adj. Entry Before collection
A/R   $7,500
	Gain	    $7,500

Answer: $7,500

 */
/*
example:
1.	An at-the-money option
        one in which the price of the underlying is equal to the strike or exercise price.
2.	Bifurcation
        the process of separating an embedded derivative from its host contract.
        This process is necessary so that
            hybrid instruments (a financial instrument or other contract that contains an embedded derivative)
                can be separated into their component parts,
                    each being accounted for using the appropriate valuation techniques.
3.	An American call option
        provides the holder the right to acquire an underlying
                at an exercise or strike price
                    anytime during the option term.
        A premium is paid by the holder for the right to benefit from the appreciation in the underlying.
4.	An embedded derivative
        a feature on a financial instrument or other contract
            which, if the feature stood alone,
                would meet the defi nition of a derivative.
5.	A forward contract
        an agreement between two parties
            to buy and sell a specific quantity of
                    a commodity,
                    foreign currency,
                    or financial instrument
             at an agreed-upon price,
             with delivery and/or settlement at a designated future date.
       Because a forward contract is Not Formally regulated by an organized exchange,
            each party to the contract is subject to the default of the other party.
6.	A futures contract
            a forward-based contract to make or take delivery of
                    a designated financial instrument,
                                 foreign currency,
                              or commodity
                        during a designated period,
                            at a specified price or yield.
              The contract frequently has provisions for cash settlement.
              A futures contract is traded on a regulated exchange
                            and, therefore, involves less credit risk than a forward contract.
7.	A call option is
            "in the money" if
                the price of the underlying Is Greater Than the strike/exercise price of the underlying.
8.	The notional amount (or payment provision)
            the referenced associated asset or liability.
            A notional amount is commonly a number of units such as
                    shares of stock,
                    principal amount,
                    face value,
                    stated value,
                    basis points,
                    barrels of oil, etc.
                It may be
                    that amount
                    + a premium
                 or - a discount

                 The interaction of the price or rate (underlying)
                    with the referenced associated asset or liability (notional amount)
                 determines whether settlement Is Required
                    and, If So, the amount.
9.	A call option
        "out of the money" if
                the strike/exercise price   Is Greater Than the price of the underlying
    A put option is "out of the money" if
                the price of the underlying Is Greater Than the strike or exercise option
10.	An American put option
            provides the holder
                the right to sell the underlying
                    at an exercise/strike price,
                Anytime during the option term.
         A gain accrues to the holder as
                the market price of the underlying Falls Below the strike price.
11. A swap
        a forward-based contract/agreement
                generally between two counterparties
                    to exchange streams of cash flows
                    over a specified period in the future.
12. An underlying
        commonly a specified price or rate such as
            a stock price,
            interest rate,
            currency rate,
            commodity price,
            a related index.
            However, Any variable (financial or physical) with
                        (1) observable changes
                     or (2) objectively verifiable changes
                     such as
                            a credit rating,
                            insurance index,
                            climatic or geological condition (temperature, rainfall)
                       qualifies.
             Unless it is specifically Excluded,
                a contract based on any qualifying variable IS accounted for
                    under the rules for derivatives IF It Has
                        the distinguishing characteristics stated above.

 */
    /*
    Example:
    Logan Corporation
        markets their products internationally.
        buys and sells goods in
            country         currency:
            Great Britain   £
            France,         €
            Germany.        €
    Logan’s functional currency is the US dollar,
        transactions are denominated in the currencies for each country

     The spot rates for various dates throughout the year are shown below
Date	                US $ per £1	    US $ per €1
January 1, year 1	    1.786	        1.258
March 1, year 1	        1.869	        1.249
April 15, year 1	    1.791	        1.197
November 10, year 1	    1.857	        1.290
December 1, year 1	    1.911	        1.329
December 20, year 1	    1.945	        1.333
December 31, year 1	    1.927	        1.364
January 15, year 2	    1.869	        1.311
Avg daily rate, year 1	1.886	        1.279

1. Accounts receivable (£)	691,530
        Sales                           691,530

£370,000 × 1.869 = $691,530


2. Cash	                662,670
Loss on FC transaction	28,860
Accounts receivable (£)             691,530

£370,000 × 1.791 = $662,670

4. Accounts payable (€)	    245,100
    Loss on FC transaction	7,410
        Cash                        252,510
€190,000 × 1.329 = $252,510

5. Accounts receivable (€)	333,250
        Sales                       333,250
€250,000 × 1.333 = $333,250

6. Accounts receivable (€)	7,750
        Gain on FC transaction		7,750
Adjust to spot rate on balance sheet date
€250,000 × (1.364 – 1.333) = $7,750 gain

7.  Cash	                327,750
    Loss on FC transaction	13,250
Accounts receivable (€)		        341,000

€250,000 × 1.311 = $327,750
Original A/R
        $333,250
        + $7,750 gain
        -------------
        $341,000 balance in A/R as of 12/31/Y1
Loss on FC transaction:
        $341,000
        – $327,750
        -----------
        $13,250

Explanations
Foreign currency transactions
        recorded at the spot rate
            on "the date of the transaction"

When the account is settled in the foreign currency,
    the currency is exchanged
            at the spot rate on "the date of settlement"
    any gain or loss is recognized as "a transaction gain/loss"

If the account is outstanding at the balance sheet date,
    the account receivable or payable is adjusted to "the spot rate" on the balance sheet date
    the gain/loss from foreign currency transaction is recognized as "Other Income" for the period.

Example

1.	(C) Tandem currencies
            two currencies Other Than a functional currency
                expected to move in tandem with each other
                    relative to an entity’s functional currency.
2.	(E) A discount or premium
            the difference between
                    the futures rate
                and the spot rate
            at the date of a forward contract.
3.	(B) The ineffective portion of a hedge
                has resulting gains or losses taken into income
                    in the period in which they arise.
4.	(A) The effective portion of a hedge
            is given special hedge accounting treatment.
            The evaluation of effectiveness is done No Less Than every Three (3) months.
        A highly effective hedge
            will have a value change ranging
                    from roughly .8
                    to            1.2 times the variability of the cash flows being hedged.
5.	(D) A forward contract
            a hedge against an exposed asset position
                created by having an account in a denomination
                other than the functional currency.

     */
    /*
    Example:
    14 items that represent financial instruments and other contracts
        that may be included in or excluded from the requirements of
        ASC Topic 815 (SFAS 133), Derivatives and Hedging.
    Determine:
    "I"ncluded: Item meets the definition of a derivative instrument and must be accounted for using ASC Topic 815.
    "E"xcluded: Item is Not Required to be accounted for under ASC Topic 815, either because it does not meet the defi nition of derivative instru ment or because the item is specifi cally excluded from ASC Topic 815 treatment.

1.	(E) Leases are excluded from accounting for derivatives treatment.
2.	(E) Guaranteed investment contracts are not required to be accounted for under derivative rules.
3.	(I) Futures contracts must be accounted for using the rules for derivatives.
4.	(E) Equity securities do not fall under the requirements of accounting for derivatives.
5.	(I) Credit indexed contracts are required to be accounted for under the rules for derivatives.
6.	(E) Mortgage-backed securities are excluded from derivatives treatment.
7.	(E) Debt securities are not required to be accounted for using the rules for derivatives.
8.	(I) Interest rate caps must be accounted for using the rules for derivatives.
9.	(I) Swaptions meet the defi nition of a derivative instrument.
10.	(E) Employee stock options are excluded from derivatives treatment.
11.	(I) Options to purchase (call) or sell (put) exchange-traded securities are included under derivatives.
12.	(E) Variable annuity contracts do not fall under the requirements of accounting for derivatives.
13.	(E) Adjustable rate loans are not required to be accounted for under the rules for derivatives.
14.	(I) Interest rate swaps must be accounted for using the rules for derivatives.

     */
}
