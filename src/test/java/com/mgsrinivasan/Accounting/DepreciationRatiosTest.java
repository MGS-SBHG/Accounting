
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class DepreciationRatiosTest {

	Depreciation sm;

    @Before
    public void setup() {
        sm = new Depreciation();
    }

    
    @Test
    public void testStraightLineDep() {
    	float assetCost = 0.0; 
    	float expectedSalvageCost = 0.0; 
    	int estUsefulLife = 0.0;
    	
    	float expected = 0.0;
    	
        assertEquals("straightLineDep Not working correctly", expected, sm.straightLineDep(assetCost, expectedSalvageCost, estUsefulLife));
    }

    @Test
    public void testSumOfYrsDigitsDep{
  
    	float assetCost = 0.0; 
    	float expectedSalvageCost = 0.0; 
    	int estUsefulLife = 0.0;
    	
    	float expected = 0.0;
    	
        assertEquals("sumOfYrsDigitsDep not working correctly", expected, sm.sumOfYrsDigitsDep(assetCost, expectedSalvageCost, estUsefulLife));
    }

    @Test
    public void testDblDeclBalDep{
    	int usefulLife = 0.0;
    	float strgtLineRate = 0.0;
    	float assetCost = 0.0;
    	float accumDep = 0.0;
    	float expected = 0.0;
    	
        assertEquals("dblDeclBalDep not working correctly", expected, sm.dblDeclBalDep(usefulLife, strgtLineRate, assetCost, accumDep));
    }

    @Test
    public void testOneHdrdFiftyPctDeclBalDep{
    	float strgtLineRate = 0.0;
    	float assetCost = 0.0; 
    	float accumDep = 0.0;
    	
    	float expected = 0.0;
    	
        assertEquals("oneHdrdFiftyPctDeclBalDep not working correctly", expected, sm.oneHdrdFiftyPctDeclBalDep(strgtLineRate, assetCost, accumDep));
    }
  

}
