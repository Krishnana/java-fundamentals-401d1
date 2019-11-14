/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package lab2;

import org.junit.Test;
import static org.junit.Assert.*;

public class La02Test {
    private Lab02 classUnderTest = new Lab02();

    @Test 
    public void testroll() {        
        assertNotNull("Roll Dice Values",classUnderTest.roll(4));
    }

    @Test 
    public void tescheckDups() {        
        int[] result = {1,1,1,1};
        assertEquals("CheckDups test failed","true",classUnderTest.checkDups(result));
    }

    @Test 
    public void tesCalcAverage() {        
        int[] result = {2,2,2,2};
        float actualValue = classUnderTest.calcAverage(result);
        float expected = 2.0f;
        System.out.println("actualValue:" + actualValue);        
        assertEquals(expected, actualValue,0);
    }

    @Test 
    public void tesDisplayLowestAverage() {        
        int[][] weeklyMonthTemperatures = {
            {66, 64, 58, 65, 71, 57, 60},
            {57, 65, 65, 70, 72, 65, 51},
            {55, 54, 60, 53, 59, 57, 61},
            {65, 56, 55, 52, 55, 62, 57}

        };
        String actualValue = classUnderTest.displayLowestAverage(weeklyMonthTemperatures);
        String expected = "[55, 54, 60, 53, 59, 57, 61]";
        System.out.println("actualValue:" + actualValue);        
        assertEquals(expected, actualValue);
    }    

}