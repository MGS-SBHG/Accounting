package com.mgsrinivasan;

/*
ASC Topic 845, Nonmonetary Transactions
[SFAS No. 153, Exchanges of Nonmonetary Assets --
An Amendment of APB Opinion No. 29]
 */
public class NonmonetaryFixedAssetsExchange {

    /*
    Does the nonmonetary asset exchange meet
    1 of the 3 following exception criteria?
            (1)  Fair value of asset received and asset given up are both unknown;
            OR
            (2)  The exchange transaction is done to facilitate sales;
            OR
            (3)  The transaction lacks commercial substance:
                (a) Cash flows do NOT change in their risk, timing, and amount;
                AND
                (b)  Do not include tax effects when considering the cash flows.
     */

    /*
    NO
    it Does NOT Meet Any of the exception criteria.
        use Fair Value method.
        Calculate Realized gain/loss:

Fair Value of Assets Given Up*                   vs.
CV of Assets Given Up

* If you do not know the Fair Value of assets given up, then just use the Fair Value of the
assets received.

Recognize realized loss because of conservatism.

Recognize realized gain because the exception criteria are not met.

Asset Rec'd (Fair Value) dr. Loss (calculated)             dr.
Accum. Depn                   dr.
     Asset Given (HC)                cr.
     Gain (calculated)               cr.

     */

    /*
    Meets criteria (1)
        use the CV method

        No gain or loss is recognized.  Everything is done at CV.

        Asset Rec'd (plug) dr.
        Accum. Depn         dr.
            Asset Given (HC)     cr.


        Do not calculate realized gain/loss.  You don't need it.
     */

    /*
    Meets criteria (2) or (3).

    Calculate the realized gain/loss:

    Fair Value of Assets Given Up* vs. CV of Assets Given Up

    * If you do not know the Fair Value of assets given up,
        then just use the Fair Values of the assets received.


    No Boot Paid  or Received
        Recognize realized loss.
        Do not recognize realized gain.

        Asset Rec'd (plug) dr. Loss (calculated)   dr.
        Accum. Depn         dr.
            Asset Given (HC)       cr.


    Boot Paid
        Recognize realized loss.
        Do not recognize realized gain.

        Asset Rec'd (plug) dr. Loss (calculated)   dr.
        Accum. Depn         dr.
                Asset Given (HC)      cr.
                Cash                           cr.

    Boot Received

Recognize realized loss.
    Recognize some realized gain pro-rata =
        (Realized Fair Value of Boot / Gain) x (Fair Values of both Boot + Asset Rec'd)

    Cash                  dr.
    Asset Rec'd (plug)    dr.
    Loss (calculated)     dr.
    Accum. Depn           dr.
      Asset Given (HC)            cr.
      Gain (calculated)           cr.
     */

    /*
    Notes:
    (1) The "list price" may not necessarily be the Fair Value and
    (2) Major exception:
            Recognize the entire gain for MONETARY exchanges
                where boot is 25% or more of the Fair Value of the exchange
                (per FASB EITF No. 01-2, para. 19, page 12,
                  OR ASC 845-10-25-6 at www.fasb.org).
     */
}
