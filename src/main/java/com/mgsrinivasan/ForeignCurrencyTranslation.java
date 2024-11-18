package com.mgsrinivasan;

public class ForeignCurrencyTranslation {

    /*
    USA GAAP Current Rate Method
    key word "translating"

    functional currency = local currency unit [LCU]
                        NO high inflation
    Assets:                             current rate = spot rate at B/S date

    Liabilities:                        current rate

    Owner's Equity [O.E.]:              historical cost

    Retained Earnings [RE]:             calculated

    revenues, expenses, gains/losses:   weighted avg rate for year

    foreign currency translation gain/loss:
                                    cumulative translation adjustment
                                    in "other comprehensive income"
     */


    /*
    USA GAAP Remeasurement Method
    key word "remeasuring"

    functional currency = USA $ or
                        local currency unit [LCU]
                        in highly inflation economy [$100 over 3 years]

    Assets:
        monetary:       current rate = spot rate at B/S date
        Nonmonetary:    historical rate

    Liabilities:
        monetary:       current rate = spot rate at B/S date
        Nonmonetary:    historical rate

    Owner's Equity [O.E.]:
            historical rate
    Retained Earnings [RE]:
            calculated

    revenues, expenses, gains/losses:   weighted avg rate for year
        EXCEPT:
            Amortization Expense:   historical rate
            Depreciation Expense:   historical rate

    foreign currency translation gain/loss:
        in "I"ncome from Continuing Operations
            Discontinued Operations
            ExtraOrdinary Items

     */

        /*

    IFRS
    functional currency NOT EQUAL Presentation Currency

    functional currency: currency of primary economic environment in which entity operates

    foreign currency: currency Other Than functional currency

    presentation currency: currency in which financial statements are presented


    ALL Assets:                         current rate = spot rate at B/S date
    ALL Liabilities:                    current rate

    Owner's Equity [O.E.]:              historical cost

    Retained Earnings [RE]:             calculated

    revenues, expenses, gains/losses:
                            historical rate;
                            May Use: weighted avg rate for year

    foreign currency translation gain/loss:
                                    in "Other Comprehensive Income"
     */

     /*

    IFRS
    functional currency EQUALS Presentation Currency

    functional currency: currency of primary economic environment in which entity operates
    foreign currency: currency Other Than functional currency
    presentation currency: currency in which financial statements are presented

    Assets & Liabilities:
        Monetary: current rate = spot rate at B/S date
        NonMonetary @ Historical cost = Historical rate
        NonMonetary @ Fair Value = rate when fair value was determined

    Owner's Equity [O.E.] ALL Nonmonetary: historical cost

    Retained Earnings [RE]:             calculated

    revenues, expenses, gains/losses:
                            historical rate
                            May Use: weighted avg rate for year

    foreign currency translation gain/loss:
                           in Profit or Loss
        Except: Nonmonetary items
            IF Gains/Losses in "Other Comprehensive Income [OCI]"
               FC TL Gains/Losses: OCI Also
     */


}
