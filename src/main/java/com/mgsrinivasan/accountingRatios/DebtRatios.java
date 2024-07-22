// Updated to Maven and JUnit 5

/*
Debt ratios 
measure the extent to which an organization uses debt to fund its operations
measure the ability of the entity to pay for that debt 

investors, whose equity investments in a business could be put at risk if the debt level is too high.

Lenders: determine the extent to which loaned funds could be at risk.

source: http://www.accountingtools.com
*/
package com.mgsrinivasan.accountingRatios;

public class DebtRatios{

/*
Debt to equity ratio
= total amount of debt / the total amount of equity. 

intent: see if funding is coming from a reasonable proportion of debt. 
Lenders like to see a large equity stake in a business.
*/ 
   public static float debtToEquityRatio(float ttlDebtAmt, float ttlEquityAmt){

        return (ttlDebtAmt / ttlEquityAmt);
    }

/*
Debt ratio. 
= total debt / total assets

A high ratio: assets are being financed primarily with debt rather than equity
- considered to be a risky approach to financing.
*/
    public static float debtRatio(float ttlDebt, float ttlAssets){

        return (ttlDebt / ttlAssets);

    }	

/*
Debt service coverage ratio. 
total net annual operating income / total of annual loan payments. 

measures the ability of a business to pay back both the principal and interest portions of its debt.
*/
    public static float debtServiceCoverageRatio(float ttlNetAnnualOperIncome, float ttlAnnualLoanPayments) {

        return ttlNetAnnualOperIncome / ttlAnnualLoanPayments;

    }	
			
/*
Interest coverage ratio. 
= earnings before interest and taxes (EBIT) / interest expense (intExp) 

intent: see if a business can at least pay for its interest payments when due, even if the balance of a loan cannot be repaid. 

works well in cases where a loan is expected to be rolled over into a
new loan when it reaches maturity.
*/

    public static float interestCoverageRatio(float EBIT, float intExp) {

        return EBIT / intExp;
    }	

}