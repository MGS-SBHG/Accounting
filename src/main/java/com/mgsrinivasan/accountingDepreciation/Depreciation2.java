package com.mgsrinivasan.accountingDepreciation;

public class Depreciation2{

    public float straightLineDep(float assetCost, float expectedSalvageCost, int estUsefulLife){
	float deprecAssetCost = assetCost - expectedSalvageCost;
	float deprecRatePerYr = 1 / estUsefulLife;

	System.out.println("Purchase cost: " + assetCost);
	System.out.println("– estimated salvage value:" + expectedSalvageCost);
	System.out.println("Depreciable asset cost: " + deprecAssetCost);
	System.out.println("Depreciation rate per year: 1/" + estUsefulLife + " estUsefulLife = " + deprecRatePerYr);

    	System.out.println(deprecRatePerYr + " depreciation rate x " + deprecAssetCost + "depreciable asset cost = " + (deprecAssetCost*deprecRatePerYr) + "annual depreciation");

        return (deprecAssetCost * deprecRatePerYr);
    }

    public float sumOfYrsDigitsDep( float assetCost, float expectedSalvageCost, int estUsefulLife) {

	float depreciableCost = (assetCost - expectedSalvageCost);
	int syd = (estUsefulLife * (estUsefulLife + 1)) / 2;
	int remainingEstUsefulLife = estUsefulLife;
	float applPctg;
	float depr = 0;

	for (int i = 0; i <= estUsefulLife; i++){
	System.out.println("Remaining estimated useful life at beg. of yr: " + estUsefulLife);
	System.out.println("SYD: " + estUsefulLife + "/" + syd);

	applPctg = remainingEstUsefulLife / syd;	
	System.out.println("Applicable %: " + applPctg);
	
	depr = (depreciableCost * applPctg);
	System.out.println("Annual Depreciation: " + depr);
	}
	return depr;
    }

    public float dblDeclBalDep (int usefulLife, float strgtLineRate, float assetCost, float accumDep ) {

	float rate = 2 * strgtLineRate;
	float Beg_nbv = assetCost;
	float depr = 0;
	float End_nbv;

	for (int i=0; i <= usefulLife; i++){
	System.out.println("Yr: " + i + "\n");
	System.out.println("Beginning NBV: " + Beg_nbv + "\n");
        depr = rate * Beg_nbv;
	System.out.println("Yr: " + i + "Depreciation: " + depr + "\n");
	End_nbv = Beg_nbv - depr;
	System.out.println("Ending NBV: " + End_nbv + "\n");
	Beg_nbv = End_nbv;   	 	
	}
	return depr;
    }

    public float oneHdrdFiftyPctDeclBalDep (int usefulLife, float strgtLineRate, float assetCost, float accumDep ) {

	float rate = (float) (1.5 * strgtLineRate);
	float Beg_nbv = assetCost;
	float depr = 0;
	float End_nbv;

	for (int i=0; i <= usefulLife; i++){
		System.out.println("Yr: " + i + "\n");
		System.out.println("Beginning NBV: " + Beg_nbv + "\n");
        depr = rate * Beg_nbv;
		System.out.println("Yr: " + i + "Depreciation: " + depr + "\n");
		End_nbv = Beg_nbv - depr;
		System.out.println("Ending NBV: " + End_nbv + "\n");
		Beg_nbv = End_nbv;
	}
	return depr;
     }			
}
