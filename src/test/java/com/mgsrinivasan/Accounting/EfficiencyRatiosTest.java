
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class DebtRatiosTest {

	EfficiencyRatios sm;

    @Before
    public void setup() {
        sm = new EfficiencyRatios();
    }

    @Test
    public void testaccountsReceivableTurnover() {
    	float creditSales = 0.0;
    	float begAR = 0.0;
    	float endAR = 0.0;   	
    	
    	float expected = 0.0;
    	
        assertEquals("accountsReceivableTurnover not working correctly", expected, sm.accountsReceivableTurnover(creditSales,begAR, endAR));
    }

    @Test
    public void testinventoryTurnover() {
    	float COGS = 0.0;
    	float begInv = 0.0;  
    	float endInv = 0.0;
    	
        assertEquals("testinventoryTurnover not working correctly", expected, sm.inventoryTurnover(COGS, begInv, endInv));
    }

    @Test
    public void testfixedAssetTurnover() {
    	float sales = 0.0; 
    	float avgFixedAssets = 0.0;
    	float expected = 0.0;
    
        assertEquals("fixedAssetTurnover not working correctly", expected, sm.fixedAssetTurnover(sales, avgFixedAssets));
    }

    @Test
    public void acctsPayableTurnover() {
    	float ttlPurchasesFromSuppliers = 0.0; 
    	float avgPayables = 0.0;   	
    	float expected = 0.0;
    
        assertEquals("acctsPayableTurnover not working correctly", expected, sm.acctsPayableTurnover(ttlPurchasesFromSuppliers, avgPayables));
    }
}
