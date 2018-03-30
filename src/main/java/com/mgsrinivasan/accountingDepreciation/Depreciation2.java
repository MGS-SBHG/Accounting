package com.mgsrinivasan.accountingDepreciation;

public class Depreciation{

    public float straightLineDep(float assetCost, float expectedSalvageCost, int estUsefulLife){
	float deprecAssetCost = assetCost - expectedSalvageCost;
	float deprecRatePerYr = 1 / estUsefulLife;

	system.out.println("Purchase cost: " + assetCost);
	system.out.println("– estimated salvage value:" + expectedSalvageCost);
	system.out.println("Depreciable asset cost: " + deprecAssetCost);
	system.out.println("Depreciation rate per year: 1/" + estUsefulLife + " estUsefulLife = " + deprecRatePerYr); 

    	system.out.println(deprecRatePerYr + " depreciation rate x " + deprecAssetCost + "depreciable asset cost = " + (deprecAssetCost*deprecRatePerYr) + "annual depreciation");

        return (deprecAssetCost * deprecRatePerYr);
    }

    public float sumOfYrsDigitsDep( float assetCost, float expectedSalvageCost, int estUsefulLife) {

	float depreciableCost = (assetCost - expectedSalvageCost);
	int syd = (estUsefulLife * (estUsefulLife + 1)) / 2;
	int remainingEstUsefulLife = estUsefulLife;
	float applPctg;

	for (i = 0; i <= estUsefulLife; i++){
	system.out.println("Remaining estimated useful life at beg. of yr: " + estUsefulLife);
	system.out.println("SYD: " + estUsefulLife + "/" + syd);

	applPctg = remainingEstUsefulLife / syd;	
	system.out.println("Applicable %: " + applPctg);
	
        depr = (depreciableCost * applPctg);
	system.out.println("Annual Depreciation: " + depr);
	}
	return depr;
    }

    public float dblDeclBalDep (int usefulLife, float strgtLineRate, float assetCost, float accumDep ) {

	float rate = 2 * strgtLineRate;
	float Beg_nbv = assetCost;
	float depr;
	float End_nbv;

	for (i=0; i <= usefulLife; i++){
	system.out.println("Yr: " + i + "\n");
	system.out.println("Beginning NBV: " + Beg_nbv + "\n");	 	
        depr = rate * Beg_nbv;
	system.out.println("Yr: " + i + "Depreciation: " + depr + "\n"); 
	End_nbv = Beg_nbv - depr
	system.out.println("Ending NBV: " + End_nbv + "\n");
	Beg_nbv = End_nbv;   	 	
	}
	return depr;
    }

    public float oneHdrdFiftyPctDeclBalDep (float strgtLineRate, float assetCost, float accumDep ) {

	float rate = 1.5 * strgtLineRate;
	float Beg_nbv = assetCost;
	float depr;
	float End_nbv;

	for (i=0; i <= usefulLife; i++){
	system.out.println("Yr: " + i + "\n");
	system.out.println("Beginning NBV: " + Beg_nbv + "\n");	 	
        depr = rate * Beg_nbv;
	system.out.println("Yr: " + i + "Depreciation: " + depr + "\n"); 
	End_nbv = Beg_nbv - depr
	system.out.println("Ending NBV: " + End_nbv + "\n");
	Beg_nbv = End_nbv;   	 	
	}
	return depr;
     }			
}
