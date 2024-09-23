package com.mgsrinivasan.Accounting;

// Updated to Java 12, Maven, JUnit 5

/*
                                Y1          Y2          Y3          total
contract price                                                      1,500,000
costs incurred                  350,000     550,000     465,000     1,365,000
est costs to complete [yr end]* 1,000,000   460,000         0
progress bilings each yr        300,000     575,000     625,000     1,500,000
collections on billings each yr 270,000     555,000     675,000     1,500,000

* new estimates may be made each yr
 */

/*
completed contract method - income recognition
Yr3
    total contract price        1,500,000
    total costs incurred        1,365,000
                                ----------
        income on construction    135,000
*/

/*
Percentage of completion method - appointment of estimated income
                                        YR1         YR2         YR3
contract price                          1,500,000   1,500,000   1,500,000
LESS costs:
    actual cost to date(cumulative)     350,000     900,000     1,365,000
    est. costs to complete              1,000,000   460,000
                                        ---------   ---------
    est. total costs                    1,350,000   1,360,000   1,365,000
                                        ---------   ---------   ---------
    est. total income                   150,000     140,000     135,000 (actual)

(costs incurred to date / est. Ttl construction costs) x Est. Total Income  total income apportioned
YR1 350,000                 1,350,000                       150,000         $38,889
                                                                            -------

YR2 900,000                 1,360,000                       140,000         92,647
Less:   income recognized to date:                                          <38,889>
                                                                            --------
income recognized to date YR2                                               $53,758

YR3 total income to be recognized (actual)                                  135,000
Less: income recognized to date (38,889 + 53,758)                            <92,647>
                                                                            ---------
Income recognized YR3                                                         42,353
 */

import com.mgsrinivasan.construction.ConstructionContracts;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConstructionContractsTest {

	public static ConstructionContracts xyzConstruction1 = new ConstructionContracts(1500000,350000,1000000,300000,270000);
    public static ConstructionContracts xyzConstruction2 = new ConstructionContracts(1500000,550000,460000,575000,555000);
    public static ConstructionContracts xyzConstruction3 = new ConstructionContracts(1500000,465000,0,625000,675000);
    public static ConstructionContracts xyzConstruction4 = new ConstructionContracts(1500000,1365000,0,1500000,1500000);

//    static {
//        // contractPrice  costsIncurredEachYr  estCostsToCompleteYrEnd  progressBillingsEachYr  collectionsOnBillingsEachYr
//        }

    @Test
    public void getContractPriceTestYr1()
    {
    	double expectedValueYr1 = 1_500_000;

        assertEquals(expectedValueYr1, xyzConstruction1.getContractPrice(),"Error in Yr 1 ContractPriceTest");
    } // getContractPriceTest()

    public void getContractPriceTestYr2()
    {
        double expectedValueYr1 = 1_500_000;
        assertEquals(expectedValueYr1, xyzConstruction2.getContractPrice(),"Error in Yr 2 ContractPriceTest");
    } // getContractPriceTest()

    public void getContractPriceTestYr3()
    {
        double expectedValueYr1 = 1_500_000;

        assertEquals(expectedValueYr1, xyzConstruction3.getContractPrice(),"Error in Yr 3 ContractPriceTest");

    } // getContractPriceTest()

    public void getContractPriceTestYr4()
    {
        double expectedValueYr1 = 1_500_000;

        assertEquals(expectedValueYr1, xyzConstruction4.getContractPrice(),"Error in Yr 4 ContractPriceTest");
    } // getContractPriceTest()

    @Test
    public void setCostsIncurredEachYrTest()
    {
    	double expectedValueYr1 = 350_000;

        assertEquals(expectedValueYr1 ,  xyzConstruction1.getCostsIncurredEachYr(),"Error in Yr 1 CostsIncurredEachYr Test");

    } // getContractPriceTest()

    public void setCostsIncurredEachYrTest2()
    {
        double expectedValueYr2 = 550_000;

        assertEquals(expectedValueYr2, xyzConstruction2.getCostsIncurredEachYr(),"Error in Yr 2 CostsIncurredEachYr Test");

    } // getContractPriceTest()

    public void setCostsIncurredEachYrTest3()
    {
        double expectedValueYr3 = 465_000;

        assertEquals(expectedValueYr3 ,  xyzConstruction3.getCostsIncurredEachYr(),"Error in Yr 3 CostsIncurredEachYr Test");

    } // getContractPriceTest()

    public void setCostsIncurredEachYrTest4()
    {
        double expectedValueYr1 = 350_000;
        double expectedValueYr2 = 550_000;
        double expectedValueYr3 = 465_000;
        double expectedValueYrTtl = expectedValueYr1 + expectedValueYr2 + expectedValueYr3;

        assertEquals(expectedValueYrTtl, xyzConstruction4.getCostsIncurredEachYr(),"Error in Ttl CostsIncurredEachYr Test");

    } // getContractPriceTest()


    @Test
    public void getEstCostsToCompleteYrEndTest1()
    {
    	double expectedValueYr1 = 1_000_000;

        assertEquals(expectedValueYr1, xyzConstruction1.getEstCostsToCompleteYrEnd(),"Error in Yr 1 EstCostsToCompleteYrEnd Test" );

    } // EstCostsToCompleteYrEndTest

    public void getEstCostsToCompleteYrEndTest2()
    {
        double expectedValueYr2 = 460_000;

        assertEquals(expectedValueYr2, xyzConstruction2.getEstCostsToCompleteYrEnd(),"Error in Yr 2 EstCostsToCompleteYrEnd Test");

    } // EstCostsToCompleteYrEndTest

    public void getEstCostsToCompleteYrEndTest3()
    {
        double expectedValueYr3 = 0;

        assertEquals(expectedValueYr3, xyzConstruction3.getEstCostsToCompleteYrEnd(),"Error in Yr 3 EstCostsToCompleteYrEnd Test");

    } // EstCostsToCompleteYrEndTest

    @Test
    public void getProgressBillingsEachYrTest1()
    {
    	double expectedValueYr1 = 300_000;

        assertEquals(expectedValueYr1, xyzConstruction1.getProgressBillingsEachYr(),"Error in Yr 1 setProgressBillingsEachYr Test");

    } // getProgressBillingsEachYrTest

    public void getProgressBillingsEachYrTest2()
    {
        double expectedValueYr2 = 575_000;

        assertEquals(expectedValueYr2 ,xyzConstruction2.getProgressBillingsEachYr(),"Error in Yr 2 setProgressBillingsEachYr Test");

    } // getProgressBillingsEachYrTest

    public void getProgressBillingsEachYrTest3()
    {
        double expectedValueYr3 = 625_000;

        assertEquals(expectedValueYr3, xyzConstruction3.getProgressBillingsEachYr(),"Error in Yr 3 setProgressBillingsEachYr Test");

    } // getProgressBillingsEachYrTest

    public void getProgressBillingsEachYrTest4()
    {
        double expectedValueYr1 = 300_000;
        double expectedValueYr2 = 575_000;
        double expectedValueYr3 = 625_000;
        double expectedValueTtl = expectedValueYr1 + expectedValueYr2 + expectedValueYr3;

        assertEquals(expectedValueTtl, xyzConstruction4.getProgressBillingsEachYr(),"Error in Ttl setProgressBillingsEachYr Test");

    } // getProgressBillingsEachYrTest

    @Test
    public void getCollectionsOnBillingsEachYrTest()
    {
    	double expectedValueYr1 = 270_000;

        assertEquals(expectedValueYr1, xyzConstruction1.getCollectionsOnBillingsEachYr(),"Error in Yr 1 getCollectionsOnBillingsEachYr Test");

    } // getCollectionsOnBillingsEachYrTest

    @Test
    public void getCollectionsOnBillingsEachYrTest2()
    {
        double expectedValueYr2 = 555_000;

        assertEquals(expectedValueYr2 , xyzConstruction2.getCollectionsOnBillingsEachYr(),"Error in Yr 2 getCollectionsOnBillingsEachYr Test");

    } // getCollectionsOnBillingsEachYrTest

    @Test
    public void getCollectionsOnBillingsEachYrTest3()
    {
        double expectedValueYr3 = 675_000;

        assertEquals(expectedValueYr3 , xyzConstruction3.getCollectionsOnBillingsEachYr(),"Error in Yr 3 getCollectionsOnBillingsEachYr Test");

    } // getCollectionsOnBillingsEachYrTest

    @Test
    public void getCollectionsOnBillingsEachYrTest4()
    {
        double expectedValueYr1 = 270_000;
        double expectedValueYr2 = 555_000;
        double expectedValueYr3 = 675_000;
        double expectedValueTtl = expectedValueYr1 + expectedValueYr2 + expectedValueYr3;

        assertEquals(expectedValueTtl , xyzConstruction4.getCollectionsOnBillingsEachYr(),"Error in Ttl getCollectionsOnBillingsEachYr Test");

    } // getCollectionsOnBillingsEachYrTest


    @Test
    public void completedContractTest()
    {
    	double expectedValueRecognizedIncome = 135_000;

        assertEquals( expectedValueRecognizedIncome, xyzConstruction3.completedContract(),"Error in completedContractTest");
    } // completedContractTest()

    @Test
    public void setActualCostToDateTest1(){

    	xyzConstruction1.setActualCostToDate(xyzConstruction1.getCostsIncurredEachYr());
    	System.out.println(xyzConstruction1.getActualCostToDate());

    } // setActualCostToDateTest()

    @Test
    public void setActualCostToDateTest2(){

        xyzConstruction2.setActualCostToDate(xyzConstruction2.getCostsIncurredEachYr());
        System.out.println(xyzConstruction2.getActualCostToDate());

    } // setActualCostToDateTest()

    @Test
    public void setActualCostToDateTest3(){

        xyzConstruction3.setActualCostToDate(xyzConstruction3.getCostsIncurredEachYr());
        System.out.println(xyzConstruction3.getActualCostToDate());

    } // setActualCostToDateTest()

    @Test
    public void setEstTtlCosts1(){

    	System.out.println(xyzConstruction1.getActualCostToDate() + " " + xyzConstruction1.getEstCostsToCompleteYrEnd());

    	xyzConstruction1.setEstTtlCosts();

    	System.out.println(xyzConstruction1.getEstTtlCosts());

    } // setEstTtlCosts()

    @Test
    public void setEstTtlCosts2(){

        System.out.println(xyzConstruction2.getActualCostToDate() + " " + xyzConstruction1.getEstCostsToCompleteYrEnd());

        xyzConstruction2.setEstTtlCosts();

        System.out.println(xyzConstruction2.getEstTtlCosts());

    } // setEstTtlCosts()
    @Test
    public void setEstTtlCosts3(){

        System.out.println(xyzConstruction3.getActualCostToDate() + " " + xyzConstruction1.getEstCostsToCompleteYrEnd());

        xyzConstruction3.setEstTtlCosts();

        System.out.println(xyzConstruction3.getEstTtlCosts());

    } // setEstTtlCosts()

} // class

