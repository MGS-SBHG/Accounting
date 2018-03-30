
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class DebtRatiosTest {

	DebtRatios sm;

    @Before
    public void setup() {
        sm = new DebtRatios();
    }

    @Test
    public void testDebtToEquityRatio() {
    	float ttlDebtAmt = 500000.00; 
    	float ttlEquityAmt = 750000.00;
    	float expected = 0.6666666667;
    	
        assertEquals("DebtToEquityRatio not working correctly", expected, sm.debtToEquityRatio(ttlDebtAmt, ttlEquityAmt));
    }

    @Test
    public void testdebtRatio() {
    	float ttlDebt = 700000.00;
    	float ttlAssets = 1000000.00;
    	float expected = 0.7;
    
        assertEquals("debtRatio not working correctly", expected, sm.debtRatio(ttlDebt, ttlAssets));
    }

    @Test
    public void testdebtServiceCoverageRatio() {
    	float ttlNetAnnualOperIncome = 10000000.00; 
    	float ttlAnnualLoanPayments = 50000000.00;
    	
    	float expected = 0.2;
    
        assertEquals("debtServiceCoverageRatio not working correctly", expected, sm.debtServiceCoverageRatio(ttlNetAnnualOperIncome, ttlAnnualLoanPayments));
    }

    @Test
    public void testinterestCoverageRatio() {
    	float EBIT = 1000000000.00; 
    	float intExp = 40000.00;
    	    	
    	float expected = 25000;
    
        assertEquals("interestCoverageRatio not working correctly", expected, sm.interestCoverageRatio(EBIT, intExp));
    }
}
