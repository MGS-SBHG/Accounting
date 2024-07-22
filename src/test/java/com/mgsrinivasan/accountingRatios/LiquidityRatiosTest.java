package com.mgsrinivasan.accountingRatios;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LiquidityRatiosTest {

    @Test
    void quickAcidRatioTest() {
        // year 2
        //  current assets:
        float cash = 170000;
        float netReceivables = 450000;
        float marketableSecurities = 80000;

        // current liabs:
         float mortgagePayable_current_portion = 60000;
         float aP_and_accruedLiabs = 240000;
         float shortTermNP = 100000;
         float currentLiabs = mortgagePayable_current_portion + aP_and_accruedLiabs + shortTermNP;

         float expected = (float) 1.75;

        // year 1
        //  current assets                                 current liabs:
        //  cash 90,000                                    mortgage payable-current portion 50,000
        //  netReceivables  400,000                        AP and accrued liabs 220,000
        //  marketableSecurities 40000                     short-term NP 140,000
        // quick ratio

        assertEquals(expected, LiquidityRatios.quickAcidRatio(cash,netReceivables,marketableSecurities, currentLiabs), "quickAcidTestRatioTest not working correctly");

    }

    @Test
    void quickAcidRatioTest2() {

        //  current assets:
        float cash = 90000;
        float netReceivables = 400000;
        float marketableSecurities = 40000;

        // current liabs:
        float mortgagePayable_current_portion = 50000;
        float aP_and_accruedLiabs = 220000;
        float shortTermNP = 140000;
        float currentLiabs = mortgagePayable_current_portion + aP_and_accruedLiabs + shortTermNP;

        float expected = (float) 1.2926829;

        assertEquals(expected, LiquidityRatios.quickAcidRatio(cash,netReceivables,marketableSecurities, currentLiabs), "quickAcidTestRatioTest not working correctly");

    }

    @Test
    void currentRatioTest() {
        // year 1
        //  current assets                                 current liabs:
        //  cash and foreign currency 90000               mortgage payable-current portion 50000
        //  netReceivables  400000                        AP and accrued liabs 220000
        //  marketableSecurities 40000                     short-term NP 140000
        //  prepaid expenses
        //  inventory

        //  current assets:
        float cash = 90000;
        float foreignCurrency = 0;
        float netAccountsReceivables = 400000;
        float marketableSecurities = 40000;
        float prepaidExpenses = 0;
        float inventory = 0;

        float currentAssets = cash + foreignCurrency + netAccountsReceivables + marketableSecurities + prepaidExpenses + inventory;

        // current liabs:
        float mortgagePayableCurrentPortion = 50000;
        float aPAndAccruedLiabs = 220000;
        float shortTermNP = 140000;

        float currentLiabs = mortgagePayableCurrentPortion + aPAndAccruedLiabs + shortTermNP;

        float expected = (float) 1.2926829;

        assertEquals(expected, LiquidityRatios.currentRatio(currentAssets, currentLiabs), "currenttRatioTest not working correctly");

    }

    @Test
    void currentRatioTest2() {
        // year 2
        //  current assets:
        float cash = 170000;
        float foreignCurrency = 0;
        float netAccountsReceivables = 450000;
        float marketableSecurities = 80000;
        float prepaidExpenses = 0;
        float inventory = 0;

        float currentAssets = cash + foreignCurrency + netAccountsReceivables + marketableSecurities + prepaidExpenses + inventory;

        // current liabs:
        float mortgagePayableCurrentPortion = 60000;
        float aPAndAccruedLiabs = 240000;
        float shortTermNP = 100000;

        float currentLiabs = mortgagePayableCurrentPortion + aPAndAccruedLiabs + shortTermNP;

        float expected = (float) 1.75;

        assertEquals(expected, LiquidityRatios.currentRatio(currentAssets, currentLiabs), "currenttRatioTest not working correctly");

    }

    @Test
    void cashRatioTest() {
    }

    @Test
    void assetCoverageRatioTest() {
        //                    (totalAssets - intangibles - (currentLiabilities - shortTermPortionOfLongTermDebt)) / totalDebt
        // yr1    .60              100             30              20                   10                           100
        // yr2    .83              150             40              25                   15                           120
        // yr3    1.00             200             50              30                   20                           140
        float expected = (float) .60;
        float totalAssets = 100;
        float intangibles = 30;
        float currentLiabilities = 20;
        float shortTermPortionOfLongTermDebt = 10;
        float totalDebt = 100;

        assertEquals(expected, LiquidityRatios.assetCoverageRatio(totalAssets,intangibles,currentLiabilities, shortTermPortionOfLongTermDebt, totalDebt), "assetCoverageRatioTest Not Working correctly");

    }

    @Test
    void quickRatioTest() {
        //
        float expected = (float) 1.0666667;
        float cash = 10000;
        float cashEquivalents = 0;
        float shortTermInvestmentsMktSecurities = 1000;
        float currentReceivables = 5000;
        float currentLiabilitie = 15000;

        assertEquals(expected, LiquidityRatios.quickRatio(cash,cashEquivalents,shortTermInvestmentsMktSecurities,currentReceivables,currentLiabilitie), "quickRatioTest Not Working correctly");

    }
}