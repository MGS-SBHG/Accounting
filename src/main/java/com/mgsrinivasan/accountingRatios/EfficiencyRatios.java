package com.mgsrinivasan.accountingRatios;

// Updated to Maven and JUnit 5

/*
Efficiency ratios
measure the ability of a business to use its assets and liabilities to
generate sales.

A highly efficient organization
	minimized its net investment in assets,
		requires less capital and debt in order to remain in operation.

assets: efficiency ratios compare an aggregated set of assets to sales or the cost of goods sold.

liabilities: the main efficiency ratio compares payables to total purchases from suppliers.

source: http://www.accountingtools.com
*/

public class EfficiencyRatios {

    /*
    Accounts receivable turnover.
    = credit sales / average accounts receivable [(begAR + endAR)/2].

    high turnover rate achieved by:
        being selective about only dealing with high-grade customers
        limiting amount of credit granted
        engaging in aggressive collection activities.
    */
    public static float accountsReceivableTurnover(float creditSales, float begAR, float endAR){
        return creditSales / (avgAR(endAR,begAR));
    }

    public static float avgAR(float endAR, float begAR) {
        return (endAR + begAR)/2;
    }

    /*
    Inventory turnover.
    = cost of goods sold (COGS) / average inventory.

    A high turnover rate achieved by:
        minimizing inventory levels,
        using a just-in-time production system, and
        using common parts for all products manufactured
    */
    public static float inventoryTurnover(float COGS, float begInv, float endInv){
        return (COGS / avgInv(begInv, endInv));
    }

    public static float avgInv(float begInv, float endInv){
        return (begInv + endInv) / 2;
    }

    // avg Days Sales In Inventory
    // meaasures number of days inventory is held Before sale
    // reflects efficiency of inventory policy
    public static float avgDaysSalesInInventory(float inventoryTurnover){
        return 365 / inventoryTurnover;
    }

    /*
    Fixed asset turnover.
    = sales / average fixed assets

    A high turnover ratio achieved by:
    outsourcing the more asset-intensive production to suppliers,
    maintaining high equipment utilization levels, and
    avoiding investments in excessively expensive equipment.

    meeasure co's returrn on PPE
    how efficiently a co is producing sakes with its machines
    */
    public static float fixedAssetTurnover(float sales, float begNetFixedAssets, float endNetFixedAssets) {
        float avgFA =  (avgFixedAssets(begNetFixedAssets, endNetFixedAssets));
        return (float) (sales / avgFA);
    }

    public static float avgFixedAssets(float begFixedAssets, float endFixedAssets){
        return ((begFixedAssets + endFixedAssets)/2);
    }

    /*
    Accumulated Dep to Fixed Assets ratio
        calculates age, value, remaaining usefuless of fixed assets
        what percentage of these assets have been used up
    */
    public static float accumDepToFixedAssets(float accumDep, float totalFixedAassets){
        return accumDep / totalFixedAassets;
    }
/*
Accounts payable turnover.
total purchases from suppliers / average payables.

Changes to this ratio are limited by the underlying payment
terms agreed to with suppliers.
*/

    public static float acctsPayableTurnover(float ttlPurchasesFromSuppliers, float begPayables, float endPayables) {
        return ttlPurchasesFromSuppliers / avgPayables(begPayables, endPayables);
    }

    public static float avgPayables(float begPayables, float endPayables){

        return (begPayables + endPayables) / 2;
    }


}

