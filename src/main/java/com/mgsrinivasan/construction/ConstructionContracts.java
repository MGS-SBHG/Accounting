package com.mgsrinivasan.construction;

public class ConstructionContracts {

	static private double contractPrice;
	static private double costsIncurredEachYr;
	static private double estCostsToCompleteYrEnd;
	static private double progressBillingsEachYr;
	static private double collectionsOnBillingsEachYr;
	
	
	static private double actualCostToDate;
	
	static private double estTtlCosts;
	static private double estTtlIncome;
	
	static private double ttlIncomeApportionRatio;

	static private double incomeRecognizedCurrentYr;
	static private double incomeRecognizedToDate;

	static private double incomeOnConstruction_CompletedContract;
	
	// constructor
	public ConstructionContracts(double cp, double costsYr, double estCostsToComplete, double progressBillings, double collections)
	{		
		contractPrice = cp;
		costsIncurredEachYr = costsYr;		
		estCostsToCompleteYrEnd = estCostsToComplete;
		progressBillingsEachYr = progressBillings;
		collectionsOnBillingsEachYr = collections;
	}
	
	public void setContractPrice(double ctrctPrice) 
	{
		contractPrice = ctrctPrice;
	}
	
	public double getContractPrice() 
	{
		return contractPrice;
	}

	
	public void setCostsIncurredEachYr(double costsIncEachYr) 
	{
		costsIncurredEachYr = costsIncEachYr;
	}
	
	public double getCostsIncurredEachYr() 
	{
		return costsIncurredEachYr;
	}


	public double getEstCostsToCompleteYrEnd() 
	{
		return estCostsToCompleteYrEnd;
	}


	public void setEstCostsToCompleteYrEnd(double estCosts) 
	{
		estCostsToCompleteYrEnd = estCosts;
	}

	
	public void setProgressBillingsEachYr(double progressBillings) 
	{
		progressBillingsEachYr = progressBillings;
	}

	public double getProgressBillingsEachYr() 
	{
		return progressBillingsEachYr;
	}

		
	public double completedContract() 
	{	
		incomeOnConstruction_CompletedContract = (getContractPrice() - getCostsIncurredEachYr());
		return incomeOnConstruction_CompletedContract;
	} // completedContract
	

	public double pctgOfCompletion() 
	{	
		return (contractPrice - costsIncurredEachYr);
	} // pctgOfCompletion
	
	
	public void setActualCostToDate(double costs) 
	{	
		actualCostToDate += costs;
	} // setActualCostToDate
	
	
	public double getActualCostToDate() 
	{	
		return actualCostToDate; 		
	} // setActualCostToDate



	
	public double getCollectionsOnBillingsEachYr() 
	{
		return collectionsOnBillingsEachYr;
	}

	public void setCollectionsOnBillingsEachYr(double collections) 
	{
		collectionsOnBillingsEachYr = collections;
	}

	
	public void setEstTtlIncome() 
	{
		estTtlIncome = getContractPrice() - getEstTtlCosts();
	}

	public double getEstTtlIncome() 
	{
		return estTtlIncome;
	}
	

	public void setEstTtlCosts() 
	{
		estTtlCosts = getActualCostToDate() + getEstCostsToCompleteYrEnd();
	}	
	
	public double getEstTtlCosts() 
	{
		return estTtlCosts;
	}

	public double getTtlIncomeApportionRatio() 
	{
		return ttlIncomeApportionRatio;
	}

	public void setTtlIncomeApportionRatio() 
	{
		ttlIncomeApportionRatio = getActualCostToDate() / getEstTtlCosts();
	}

	public double getIncomeRecognizedCurrentYr() {
		return incomeRecognizedCurrentYr;
	}

	public void setIncomeRecognizedCurrentYr() {
		incomeRecognizedCurrentYr = (getTtlIncomeApportionRatio() * getEstTtlIncome());
	}

	public double getIncomeRecognizedToDate() {
		return incomeRecognizedToDate;
	}

	public void setIncomeRecognizedToDate() {
		incomeRecognizedToDate += incomeRecognizedCurrentYr;
	}

	
} // ConstructionContracts
