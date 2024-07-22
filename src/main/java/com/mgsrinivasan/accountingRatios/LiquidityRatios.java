package com.mgsrinivasan.accountingRatios;

// Updated to Maven and JUnit 5

public class LiquidityRatios {
    /*
            cash
                 bills
                 coins
                 foreign currency
                 checking account cash
                 savings account cash
                 bank drafts
                 money orders
                 petty cash

           cash equivalents:
                commercial paper
                marketable securities
                money market funds
                short term govt bonds
                treasury bills

           current liabilities
                accounts payable
                sales taxes payable
                payroll taxes payable
                income taxes payable
                interest payable
                bank account overdrafts
                wages payable and other accrued expenses
                customer deposits
                dividends declared
                short term debt
                current maturities of long term debt

             */

    /* quick ratio acid test ration
        compaany ability to pay its current liabilities
            when they come due
            with only quiock aassets
       quick assets: current assets
                        that can be converted to cash
                                within 90 days
                                 or in the short term
                cash
                cashEquivalents
                shortTermInvestments Marketable Securities
                        trading securities
                        available for sale securities
                    easily converted to cash within thee next 90 days
                    traded on open market ie NYSE
                        with known price
                        readily available buyers

                currentReceivables
    */

    // quick ratio = (total current assets - inventory - prepaid expenses)   / current liabilities
    //                        21,500        - 5000      - 500 prepaid taxes    15000
    


    public static float quickRatio(float cash, float cashEquivalents, float shortTermInvestmentsMktSecurities, float currentReceivables, float currentLiabilities){
        // 1.07  10000    0               1000                               5000                     15000
        return (cash + cashEquivalents + shortTermInvestmentsMktSecurities + currentReceivables)/currentLiabilities;
    }

    // ability to pay current liabilities from cash and near cash items
    public static float quickAcidRatio(float cash, float netReceivables, float marketableSecurities, float currentLiabilites){

            // year 2
            //  current assets:                            current liabs:
            //  cash 170,000                               mortgage payable-current portion 60,000
            //  netReceivables  450,000                    AP and accrued liabs 240,000
            //  marketableSecurities 80000                 short-term NP 100,000
        // 1.75 quick ratio

        // year 1
        //  current assets                                 current liabs:
        //  cash 90,000                                    mortgage payable-current portion 50,000
        //  netReceivables  400,000                        AP and accrued liabs 220,000
        //  marketableSecurities 40000                     short-term NP 140,000
        // quick ratio


        return (cash + netReceivables + marketableSecurities)/currentLiabilites;
    }

    public static float currentRatio(float currentAssets, float currentLiabilites){

        return (currentAssets/currentLiabilites);
    }

    public static float cashRatio(float cash, float cashEquivalents, float currentLiabilies){

        return (cash + cashEquivalents) / currentLiabilies;
    }

    /*
    asset coverage ratio
        risk measurement
        company's ability to repay debt obligations by selling its assets
        to investors - how much assets are required to paay down its deebt obligation
        3 sources of capital
            debt: debt investors paid interest
            equity: investors are owners of the company; if Not profitable, No dividends
            retained earnings
        how much thee assets are worth vs the debt of the company
     */
    public static float assetCoverageRatio(float totalAssets, float intangibles, float currentLiabilities, float shortTermPortionOfLongTermDebt, float totalDebt){

        // yr1    .60              100             30              20                   10                           100
        // yr2    .83              150             40              25                   15                           120
        // yr3    1.00             200             50              30                   20                           140
        return (float) ( ((totalAssets - intangibles) - (currentLiabilities - shortTermPortionOfLongTermDebt)) / totalDebt );

    }


}
