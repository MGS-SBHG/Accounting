package com.mgsrinivasan;

/*
jan 1
    100,000 shares Common stock outstanding
april 1
    issue 60,000 additional share for cash
July 1
    issue 16,000 additional shares in 10% stock dividend
Nov 1
    purchases 12,000  of Treasury Stock
Dec 1
    sells 6,000 shares Tresury Stock
total nbr CS shares outstanding
    100,000
    +60,000
    +16,000
    -12,000
    +6,000
    ---------
    170,000

 */
public class WtdAvgNbrOfShares {

/*
weighted avg nbr of shares outstanding
jan 1 100,000 shares x 12/12 = 100,000 wtd avg
april 1 60,000 shares x 9/12 = 45,000 wtd avg
                               -------
july 1 10% stock dividend       145,000 subtotal
                                * 1.10
                                --------
                                159,500
Nov 1   (12,000) x 2/12         (2,000)
Dec 1   6,000 x 1/12            500
                                ---------
Total weighted avg shares       158,000
 */

/*
Jan 1 - March 31
                        100,000
+ 10% stock dividend    10,000
                        -------
                        110,000
                        x 3/12
                        -------
                        27,500 wtd avg

apr 1 - oct 31
                        100,000
+ 10% stock dividend    10,000
                        + 60,000
+ 10% stock dividend    +  6,000
                        ---------
                        176,000
                        x 7/12
                        --------
                        102,667 wtd avg shares
Nov 1 - Nov 30
                        100,000
                        +10,000
                        +60,000
                        +6,000
                        -12,000
                        --------
                        164,000
                        x 1/12
                        --------
                        13,667 wtd avg shares
 dec 1 - dec 31
                        100,000
                        +10,000
                        +60,000
                        +6,000
                        -12,000
                        +6,000
                        ----------
                        170,000
                        x 1/12
                        ----------
                        14,167
totol wtd shares
27,500
102,667
13,667
14,167
--------
158,001
*/
}
