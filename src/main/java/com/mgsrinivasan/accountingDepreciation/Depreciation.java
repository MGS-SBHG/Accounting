package com.mgsrinivasan.accountingDepreciation;

// Updated to Maven and JUnit 5

public class Depreciation{

	float deprecAssetCost = 0;
//	float deprecRatePerYr = 0;
//	int syd = 0;
//	int remainingEstUsefulLife = 0;
//	float rate = 0;
//	float Beg_nbv = 0;
//	float depr = 0;
//	float End_nbv = 0;

	public double bookValue(float assetCost, float accumDep)
	{
		return (assetCost - accumDep);
	}

    public double straightLineDep(float assetCost, float expectedSalvageCost, int EstUsefulLife)
    {
		deprecAssetCost = (assetCost - expectedSalvageCost);
    	double annualDepExp = (deprecAssetCost/EstUsefulLife);

        return (annualDepExp);
    } //straightLineDep

	/*
	double declining balance depreciation method
		accelerated depreciation method
		allocate larger amounts of costs to an asset in earlier years of its useful life
		lesser amounts in later years

	 */
    public double dblDeclBalDep (float assetCost, float accumDep, int usefulLife)
    {
		double rate = (2.0 / usefulLife); // .02
		System.out.println("rate:" + rate);

		double deprecAssetCost = (double)(assetCost - accumDep);
		System.out.println("deprecAssetCost: " + deprecAssetCost);

		double annualDepExp = (double) (deprecAssetCost * rate);
		System.out.println("annualDepExp: " + annualDepExp);

		return annualDepExp;
    } //dblDeclBalDep

    public double oneHdrdFiftyPctDeclBalDep (float assetCost, float accumDep, int usefulLife)
    {
    	float rate = (float) (1.5/usefulLife); //0.3
								// 100000  - 10000	   x 0.3
		double currentDeprExp = (assetCost - accumDep) * rate;

		return currentDeprExp;
    }// oneHdrdFiftyPctDeclBalDep

	public double sumOfYrsDigitsDep(float assetCost, float expectedSalvageCost, int estUsefulLife, int estRemainingUsefulLife)
	{
		deprecAssetCost = (assetCost - expectedSalvageCost);
//		System.out.println("assetCost: " + assetCost);
//		System.out.println("expectedSalvageCost: " + expectedSalvageCost);
//		System.out.println("deprecAssetCost: " + deprecAssetCost);

		int num = estRemainingUsefulLife;
//		System.out.println("estRemainingUsefulLife: " + estRemainingUsefulLife);

		int denom = 0;

		float fraction = 0;

		double annualDepExp = 0;

//		System.out.println("Remaining estimated useful life at beg. of yr: " + estUsefulLife + "\n");
//		System.out.println("SYD: " + estUsefulLife + "/" + syd + " /t Applicable% " + "Annual Depreciation " + "\n");

		for (int i = 0; i <= estUsefulLife; i++)
			denom += i;

//		System.out.println("denom: " + denom);

		fraction = (float) num/denom;
//		System.out.println("fraction: " + fraction);

		annualDepExp = deprecAssetCost * fraction;
//		System.out.println("annualDepExp: " + annualDepExp);

		return annualDepExp;

	} // sumOfYrsDigitsDep

}
