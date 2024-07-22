package com.mgsrinivasan.construction;

// Updated to Maven and JUnit 5

/*
Long Term construction contracts
accounted for under
	completed-contract method
		recognize revenue and profit at contract compeltion
		related costs deferred until completion; then matched to revenues

	percentage of completion method
		recognize contract revenue & profits during construction
			based on
			expected total profit
			current period estimated progress towards completion
			related costs recognized in current period in which incurred

		presumption: entities have the ability to make estimates sufficiently dependable
					to justify use
		preferable:
				when reasonably dependable estimates can be made
				conditions
					contracts executed by parties - provisions clearly specify
						enforceable rights of goods and services provided/received by parties
 						consideration exchanged
 						settlement manner and terms
 					buyer Can satisfy obligations under the contract
 					contractor can be expected to perform constractual obligations
 		advantage: 		periodic recognition of income
 		disadvantage:	dependence on estimates
 		procedures:
 			cost-to-cost: based on assumed relationship between unit of input and productivity
 				revenue (the contract price) and/or profit (revenue - construction expenses)
 				recognized in current period:

 					revenue = (cost to date / total expected cost based on latest estimate) * contract price
								- revenue recognized in previous periods

 					profit = (cost to date / total expected cost based on latest estimate) * expected profit
								- profit recognized in previous periods

 */
public class ConstructionContracts {

	static private double contractPrice;

	static private double costsIncurredEachYr;

	static private double totalCostsThisYr;

	static private double estCostsToCompleteYrEnd;

	static private double progressBillingsEachYr;

	static private double collectionsOnBillingsEachYr;
	
	
	static private double actualCostToDate;
	
	static private double estTtlCosts;

	static private double estProfit;
	
	// static private double ttlIncomeApportionRatio;

	static private double totalProfitToBeRecognizedEndOfYr;

	static private double incomeRecognizedCurrentYr;

	static private double incomeRecognizedToDate;

	static private double incomeOnConstruction_CompletedContract;
	
	// constructor
	public ConstructionContracts(double cp, double costsYr, double estCostsToComplete, double progressBillings, double collections)
	{
		/*
		contractPrice = cp;
		costsIncurredEachYr = costsYr;		
		estCostsToCompleteYrEnd = estCostsToComplete;
		progressBillingsEachYr = progressBillings;
		collectionsOnBillingsEachYr = collections;
		 */

		setContractPrice(cp);
		setCostsIncurredEachYr(costsYr);
		setEstCostsToCompleteYrEnd(estCostsToComplete);
		setProgressBillingsEachYr(progressBillings);
		setCollectionsOnBillingsEachYr(collections);
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

	public String costsJournalEntry() {
		double costs = getCostsIncurredEachYr();
		return "Construction in progress \t" + costs
				+ "\n \t Cash	\t" + costs;
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

	public String progressiveBillingsJE() {
		double billings = getProgressBillingsEachYr();
		return "Accounts Receivable \t" + billings
				+ "\n \t Billings on LT Contracts	\t" + billings;
	}
		
	public double completedContract() 
	{	
		incomeOnConstruction_CompletedContract = (getContractPrice() - getCostsIncurredEachYr());
		return incomeOnConstruction_CompletedContract;
	} // completedContract


	public double getTotalCostsThisYr() {
		return totalCostsThisYr;
	}

	public void setTotalCostsThisYr(double costsIncurredThisAndPrevYears) {
		totalCostsThisYr += costsIncurredThisAndPrevYears;
	}

	public double getPctgOfCompletionRate()
	{
		return getActualCostToDate() / getTotalCostsThisYr();
	} // getPctgOfCompletionRate


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

	public String cashCollectedJE() {
		double collected = getCollectionsOnBillingsEachYr();
		return "Cash \t" + collected
				+ "\n Accounts Receivable	\t" + collected;
	}

	public void setEstTtlIncome() 
	{
		estProfit = getContractPrice() - getEstTtlCosts();
	}

	public double getEstTtlIncome() 
	{
		return estProfit;
	}
	

	public void setEstTtlCosts() 
	{
		estTtlCosts = getActualCostToDate() + getEstCostsToCompleteYrEnd();
	}	
	
	public double getEstTtlCosts() 
	{
		return estTtlCosts;
	}

	/*
	public double getTtlIncomeApportionRatio() 
	{
		return ttlIncomeApportionRatio;
	}

	public void setTtlIncomeApportionRatio() 
	{
		ttlIncomeApportionRatio = getActualCostToDate() / getEstTtlCosts();
	}
	*/

	public double getIncomeRecognizedCurrentYr() {
		return incomeRecognizedCurrentYr;
	}

	public void setIncomeRecognizedCurrentYr() {
		incomeRecognizedCurrentYr = (getPctgOfCompletionRate() * getEstTtlIncome());
	}

	public String profitRecognizedJE() {
		return "Construction Expenses \t" + getCostsIncurredEachYr()
				+ "\n Construction In Progress 	\t" + (getIncomeRecognizedCurrentYr() - getCostsIncurredEachYr())
				+ "\n \t Construction Revenue \t" + getIncomeRecognizedCurrentYr();

	}

	public double getIncomeRecognizedToDate() {
		return incomeRecognizedToDate;
	}

	public void setIncomeRecognizedToDate() {
		incomeRecognizedToDate += incomeRecognizedCurrentYr;
	}

	public double getEstProfit() {
		return estProfit;
	}

	public void setEstProfit(double estimatedProfit) {
		estProfit = estimatedProfit;
	}

	public double getTotalProfitToBeRecognizedEndOfYr() {
		return totalProfitToBeRecognizedEndOfYr;
	}

	public void setTotalProfitToBeRecognizedEndOfYr() {
		totalProfitToBeRecognizedEndOfYr = getEstProfit() * getPctgOfCompletionRate();
	}
	
} // ConstructionContracts
