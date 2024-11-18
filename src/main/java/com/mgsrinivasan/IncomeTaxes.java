package com.mgsrinivasan;

public class IncomeTaxes {
    /*
    Accounting for Income Taxes
        differences between book income and taxable income
            temporary differences
            permanent differences

      temporary differences
            items that will reverse themselves

            * Revenues and expenses on
                    Income Statement Now
                    Tax return Later

                    revenues:
                        installment sales method - tax purpose
                        accrual accounting - financial stmnt purpose

                    revenues:
                        percentage of completion: financial accounting purpose
                        completed contract method: tax purpose

                    expense:
                        warranty accounting - estimated expenses

            * Revenue and Expense items:
                Tax return Now
                Income Statement Later

            revenues:
                    anything collected in advance
            expenses:
                    accelerated depreciation: tax return
                    straight-line depreciation: financial accounting purposes

     Permanent Differences:
        income statemnt items Never on tax return

        Life insurance premiums
        life insurance proceeds
        Muni bonds interest received
        dividends received from domestic corps
            80% dividends NonTaxable

     */
/*
                            Book income     Tax Return
Life insurance premium      (12,000)        NOT ON Return
Muni Bonds interest         30,000          NOT ON Return
dom Corp Dividends          10,000          2,000 [100% - 80% = 20% x 10,000]
                           --------         ------
total                      178,000          152,000
30% Tax rate

JEs to record taxes:
Income tax expense - current    45,600                 permanent diff; owed to govt
    Income taxes payable                    45,600
152,000 x .30 = $45,600

 */

/*
FASB 109 timing differences temporary differences

example:
Book income $500,000
                            per tax return      per books
rental income               35,000              60,000
depreciation                140,000             110,000
life insurance premium          0               45,000

40% tax rate

current portion of income tax expense
journal entries

FASB 109 ASSET AND LIABILITY APPROACH
Deferred Tax Liability:
    when taxable income W/B higher in the future
example:
    take $600,000 More depreciation
              on the tax return
            than the books
        will reverse itself
            1994 400,000, 30% tax rate
            1995 200,000, 25% tax rate

        future taxable amount
        x future tax rate
        ------------------
        deferred tax liability

            1994 400,000 x 30% tax rate = 120,000
            1995 200,000 x 25% tax rate =  50,000
                                        ----------
                                          170,000

        deferred tax asset:
            future deductible amount
            reversal of a temporary difference
                that W/ cause taxable income < book income

      1993 have accrued warranty expense $50,000
            will be reversed 1996 20% tax rate

      future deductible amount x future tax amount = deferred tax asset
      50,000 x 20% = 10,000

        deferred tax asset  10,000
            income tax expense      10,000

 */
/*
balance sheet
    deferred tax item caused by:     the deferred item:
    ----------------------------     ------------------
    Current asset or liability          Current
    Non-current item                    Non-Current

when item reverses to determine if current or non-current

deferred current items      Netted Against  current liabilities
deferred non-current items  Netted Against  non-current liabilities

Allowance account:
    > 50% probability deferred tax asset Will NOT Reverse itself

    income tax expense $400
        valuation allowance     $400
    $2,000 of warranty liability will NOT reverse itself

    Balance sheet presentation:
    deferred tax asset $10,000
    Less Allowance        (400)     $9,600

    NO Allowance account for deferred tax liabilities

Loss carry-back / carry-forward

example
    1992 taxable income         $100,000
    1993 net operating loss     $150,000
    tax rate 40%

    JE:
    tax refund receivable   40,000
        income tax expense          40,000
        (loss benefit)
    $100,000 of 1993 net operating loss carried back to 1992
        to get refund $40,000


   FASB 109: tax benefit from loss carry-forward reported in
        year of loss as deferred tax asset
   deferred tax asset   $20,000
        income tax expense          $20,000


Equity method: a timing difference
The equity method of accounting
    used to account for an organization’s investment
    in another entity (the investee).
  only used when the investor has "significant influence"
            over the investee.
  the investor recognizes its share of the profits and losses of the investee
        in the periods when these profits and losses
        are also reflected in the accounts of the investee.
  Any profit or loss recognized by the investing entity
        appears in its income statement.
  any recognized profit increases the investment recorded
        by the investing entity,
  a recognized loss decreases the investment.

The equity method Only Used when
    the investor can influence the operating or financial decisions of the investee.
    If there is NO "significant influence" over the investee
        the investor instead uses "the cost method"
            to account for its investment.

The cost method of accounting
    used to record an investment in another business
        when the investor has "minimal influence" over that business.
    two criteria are present:
        1 investor has NO "substantial influence" over investee
            generally: an investment of 20% or less of shares of investee

        2 investment Has NO easily determinable fair value

    investor account for the investment at
        its *historical cost*  = purchase price
    an asset on the balance sheet of investor

Once the investor records the initial transaction,
    No need to adjust it,
    unless evidence that
        fair market value of the investment
            has declined to Below the recorded historical cost.
        investor *writes down* the recorded cost of the investment
            to its new fair market value.

    If there is evidence that
        fair market value has increased above historical cost
        Not Allowable under Generally Accepted Accounting Principles [GAAP]
            to increase the recorded value of the investment.
    a highly conservative approach to recording investments.

 */
}
