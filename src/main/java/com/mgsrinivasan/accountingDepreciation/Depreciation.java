package com.mgsrinivasan.accountingDepreciation;

public class Depreciation{

	float deprecAssetCost = 0;
	float deprecRatePerYr = 0;
	int syd = 0;
	int remainingEstUsefulLife = 0;
	float rate = 0;
	float Beg_nbv = 0;
	float depr = 0;
	float End_nbv = 0;

	
    public double straightLineDep(float assetCost, float expectedSalvageCost, int remainEstUsefulLife)
    {
    	deprecAssetCost = (float)(assetCost - expectedSalvageCost);
    	deprecRatePerYr = (1/remainEstUsefulLife);
    	
		System.out.println("Purchase cost /t – estimated salvage value /t Depreciable asset cost /t Depreciation rate per year /t + estUsefulLife \n");
		
		System.out.println( assetCost + "/t" + expectedSalvageCost + "/t" + deprecAssetCost 
				+ remainEstUsefulLife + deprecRatePerYr + "\n"); 

    	//System.out.println(deprecRatePerYr + " depreciation rate x " + deprecAssetCost + "depreciable asset cost = " + (deprecAssetCost*deprecRatePerYr) + " annual depreciation" + "\n");

        return (deprecAssetCost * deprecRatePerYr);
    } //straightLineDep

    public double sumOfYrsDigitsDep( float assetCost, float expectedSalvageCost, int estUsefulLife) 
    {

    	deprecAssetCost = (assetCost - expectedSalvageCost);
    	syd = (estUsefulLife * (estUsefulLife + 1)) / 2;
    	remainingEstUsefulLife = estUsefulLife;
    	double applPctg = 0.0;
    	double depr = 0;
	
	System.out.println("Remaining estimated useful life at beg. of yr: " + estUsefulLife + "\n");
	System.out.println("SYD: " + estUsefulLife + "/" + syd + " /t Applicable% " + "Annual Depreciation " + "\n");
	for (int i = 0; i <= estUsefulLife; i++){
	
	applPctg = remainingEstUsefulLife / syd;	
	System.out.println(applPctg + " ");
	
    depr = (deprecAssetCost * applPctg);
	System.out.println(depr + "\n");
	}
	return depr;
    } // sumOfYrsDigitsDep

    public double dblDeclBalDep (int usefulLife, float strgtLineRate, float assetCost, float d ) 
    {
    	rate = 2 * strgtLineRate;
    	Beg_nbv = assetCost;
    	depr = 0;

	System.out.println("Yr \t Beginning NBV \t Depreciation \t Ending NBV \n");
	
	for (int i=0; i <= usefulLife; i++)
	{
        depr = rate * Beg_nbv;       
        End_nbv = Beg_nbv - depr;	

		System.out.println(i + "\t" + depr + "\t" + End_nbv + "\n");
        
        Beg_nbv = End_nbv;   	 	
	}
	return depr;
    } //dblDeclBalDep

    public double oneHdrdFiftyPctDeclBalDep (int usefulLife, float strgtLineRate, float assetCost, float accumDep ) 
    {
    	rate = (float) (1.5*strgtLineRate);
    	Beg_nbv = assetCost;
    	depr = 0;    	

	System.out.println("Yr \t Beginning NBV \t Depreciation \t Ending NBV \n");
	for (int i=0; i <= usefulLife; i++)
	{
        depr = rate * Beg_nbv;       
        End_nbv = Beg_nbv - depr;	

		System.out.println(i + "\t" + depr + "\t" + End_nbv + "\n");
        
        Beg_nbv = End_nbv;   	 	
	}	
	return depr;
    }// oneHdrdFiftyPctDeclBalDep			
}
