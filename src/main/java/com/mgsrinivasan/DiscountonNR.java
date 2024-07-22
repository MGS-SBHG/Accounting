package com.mgsrinivasan;

// Updated to Maven and JUnit 5

public class DiscountOnNR {
    float NR_Face = 0;
    float annualRate = 0;
    float dateOfIssuanceToDateOfMaturity = 0;
    float interestToBePaidOnNR = 0;
    float NR_Maturity_Value = 0;
    float buyerDiscountProfitRate = 0;
    float buyersProfit = 0;
    float pricePaidForNR = 0;

    // Discount on N/R
// compute amount given to seller
    public float computeInterest() {
        interestToBePaidOnNR = (NR_Face * annualRate * dateOfIssuanceToDateOfMaturity);
        return interestToBePaidOnNR;
    }

    public float computeNR_Maturity_Value() {
        NR_Maturity_Value = (NR_Face + interestToBePaidOnNR);
        return NR_Maturity_Value;
    }

    public float computeBuyersProfit() {
        buyersProfit = (NR_Maturity_Value * buyerDiscountProfitRate);
        return buyersProfit;
    }

    public float computePricePaidForNR() {
        pricePaidForNR = (NR_Maturity_Value - buyersProfit);
        return pricePaidForNR;
    }
}
