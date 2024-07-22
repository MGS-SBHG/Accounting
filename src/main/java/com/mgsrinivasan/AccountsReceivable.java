package com.mgsrinivasan;

// Updated to Maven and JUnit 5

public class AccountsReceivable {

    // amounts owed to reporting entity by customers
    // current asset

    float begBalanceAR = 0;     // debit
    float creditSales = 0;      // debit
    float collectionsMade = 0;  // credit
    float returns = 0;          // credit
    float discounts = 0;        // credit
    float writeOffUncollectible = 0;    // credit
    float endBalanceAR = 0;     // debit

    public AccountsReceivable(float begBalanceAR, float creditSales, float collectionsMade, float returns, float discounts,float writeOffUncollectible, float endBalanceAR) {
        this.begBalanceAR = begBalanceAR;
        this.creditSales = creditSales;
        this.collectionsMade = collectionsMade;
        this.returns = returns;
        this.discounts = discounts;
        this.writeOffUncollectible = writeOffUncollectible;
        this.endBalanceAR = endBalanceAR;
    }

    public float calcEndingAllowanceDoubtfulAccount(float begBalanceAR, float creditSales, float collectionsMade, float returns, float discounts, float uncollectible, float badDebtExp) {
        endBalanceAR = (begBalanceAR + creditSales +  badDebtExp + collectionsMade - returns - discounts - uncollectible);
        return (endBalanceAR);
    }

    public String printAR()
    {
        String tAccount = "               A/R " +
                          "------------------------------------" +
                            this.begBalanceAR + "|                   " +
                            this.creditSales +  "|                   " +
                          "                |" + this.collectionsMade +
                          "                |" + this.returns +
                          "                |" + this.discounts +
                          "                |" + this.writeOffUncollectible +
                          "------------------------------------" +
                          this.endBalanceAR + "|" ;
        return tAccount;
    }

    float begBal_AllowDoubtfulAccts = 0;
    float writeOffs = 0;
    float collections = 0;
    double badDebtExp = 0;
    float endBal_allowDoubtfulAccts = 0;

    public String printAllowance()
    {
        String allowanceTAccount = "Allowance for Doubtful Accounts" +
                                "------------------------------" +
                                "               |" + this.begBal_AllowDoubtfulAccts +
                                this.writeOffs + "   |" +
                                "               |" + collections +
                                "               |" + badDebtExp +
                                "--------------------------------" +
                                "               |" + endBal_allowDoubtfulAccts;
        return allowanceTAccount;
    }

    public double calcBadDebtExpense_pctgOfSales(float sales, double percentageOfSales)
    {
    // interim reporting
    badDebtExp = sales * percentageOfSales;

    begBal_AllowDoubtfulAccts -= badDebtExp; // reduce Allowance Account

    return badDebtExp;
    }

    public double calcBadDebtExpense_pctgOfAR(double endBalanceAR, double percentageOfEndReceivables, double begBal_AllowDoubtfulAccts, double collections, double writeOffs)
    {
    // year end reporting
    endBal_allowDoubtfulAccts = (float) (endBalanceAR * percentageOfEndReceivables);

    badDebtExp  = endBal_allowDoubtfulAccts - (begBal_AllowDoubtfulAccts + collections) + writeOffs;

    return badDebtExp;
    }

    public void writeOffBadAccount(float badAccount)
    {
    begBal_AllowDoubtfulAccts -= badAccount;
    begBalanceAR -= badAccount;
    }

    public void directWriteOff(float badAccount)
    {
    // for smaller businesses
    // NOT GAAP
    // expenses Not matched in Same period to revenue i.e. Matching Principle

    badDebtExp += badAccount;
    begBalanceAR -= badAccount;
    }

/*
assignment: cash collected from receivable: pay off a specific liability
pledging: if debt is Not paid as it become due, creditor can force liquidation of pledged asset (ie. AR)
    factoring: a single party has most/all of the company's AR
                buyer: collects the AR
    securitization: maany parties havee right to the co's AR
                seller: collects AR; forwards cash to buyer
A/R considered Sold - 3 criteria:
    1 asset isolated from seller
    2 buyer NOW has right to buy/sell asset
    3 seller HAS Not retained control through agreements to repurchase/redeem asset

AR sold "with recourse"
    buyer Can demand payment from seller
        if a receivable is Not paid by customer when due

    loss xxx (diff)
    cash xxx
        AR                  xxx
        recourse obligation xxx FMV failure of some customers to pay

AR sold "without recourse"
    seller has No obligation
    NO "recourse obligation" account

    loss xxx (diff)
    cash xxx
        AR                  xxx

*/
} // end of AccountsReceivable class

