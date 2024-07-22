// Updated to Maven and JUnit 5

/**
Accounts payable ratios designed to measure 
the operational efficiency of a payables department - monitored internally as a management function 

its ability to pay suppliers in a timely manner - interest to outside analysts judging the creditworthiness of a company.

source: http://www.accountingtools.com
*/

package com.mgsrinivasan.accountingRatios;

public class APRatios{

/**
Payables turnover 
= total supplier purchases / average accounts payable

A longer turnover interval than the industry average indicates 
a company is Not Paying its suppliers in a timely manner.
*/ 
   public static float payablesTurnover(float totalSupplierPurchases, float begAccountsPayable, float endAccountsPayable){

	   float avgAccountsPayable = (begAccountsPayable + endAccountsPayable)/2;

       return (totalSupplierPurchases / avgAccountsPayable);
    }

/**
Percentage of qualifying discounts taken 
= qualifying supplier early payment discounts taken / discounts could have been taken

measurement of < 100% indicates problems with the timely identification and payment of early payment discount deals.
*/
    public static float pctgQualifyingDiscountsTaken(float discountsTaken, float discountsCouldHaveBeenTaken){

        return (discountsTaken/discountsCouldHaveBeenTaken);

    }	

/**
 * Percentage of duplicate payments processed. 
= aggregate amount of duplicate invoices paid / total amount of supplier
payments made. 
percentage > zero: a company's payables system is Not adequate for the timely identification of duplicate supplier invoices.
*/
    public static float pctgDuplicatePaymentsProcessed(float aggregDuplicateInvoicesPaid, float totalAmountSupplierPayments){

        return (aggregDuplicateInvoicesPaid / totalAmountSupplierPayments);

    }	
			
}
