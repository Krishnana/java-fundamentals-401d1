/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package lab2;

import java.util.Random;
import javax.print.DocFlavor.STRING;
import java.util.Arrays;

public class Lab02{
    public static void main(String[] args){

        // Roll a Dice
        int[] results = roll(4);

        // Check if an array has duplicate values
        System.out.println("Dup Exists:" + checkDups(results));

        // Calculate Averages
        System.out.println("Averages:" + calcAverage(results));

        // Daily average temperatures for Seattle, October 1-28 2017
        int[][] weeklyMonthTemperatures = {
            {66, 64, 58, 65, 71, 57, 60},
            {57, 65, 65, 70, 72, 65, 51},
            {55, 54, 60, 53, 59, 57, 61},
            {65, 56, 55, 52, 55, 62, 57}

        };
        displayLowestAverage(weeklyMonthTemperatures);   
  };

    /**
     * Roll Dice uses random number to generate number betwwen 0 and 6
     * 
     * @param n
     *            number of times the dice is rolled
     * @return Array with values of each dice roll
     */
    public static int[] roll(int n){

        int[] results = new int[n];
       

        for(int i=0; i<n; i++){
            results[i] = (int) (Math.random()*(n - 1)) + 1;           
        }
       System.out.println("Dice Rolls:" + Arrays.toString(results));
       return(results);
    }

    /**
     * Finds if the input array has duplicate values
     * 
     * @param results
     *            Array of dice results
     * @return true if duplicate exists else false
     */
    public static String checkDups(int[] results){
        boolean dupExists = false;
        for(int i=0; i<results.length; i++){
            for(int j=i+1; j<results.length;j++){
               if(results[j]==results[i]) {
                dupExists = true;
                break;
               }
            }
        }
       return(Boolean.toString(dupExists));
    } 

    /**
     * Calculates average of dice results
     * 
     * @param results
     *            Array of dice results
     * @return Average value of dice results
     */
    public static float calcAverage(int[] results){
        float total = 0;
        for(int i=0; i<results.length; i++){
            total  = results[i] + total;
        }
       return(total/results.length);
    }     
      
    /**
     * Calculates lowest average from array of array
     * 
     * @param results
     *            Array of array with weekly Month temp
     * @return Lowest Average temp in an year
     */
    public static String displayLowestAverage(int[][] results){        
        float[] avg = new float[results.length];
        int lowestIndex = 0;

        for(int i=0; i<results.length;i++){
            avg[i] = calcAverage(results[i]);

            if (i>0){
                if(avg[i] > avg[i-1]){
                    lowestIndex = i-1;
                } else{
                    lowestIndex = i;
                }
            } 
        }
        System.out.println("Lowest Average Temp:" + avg[lowestIndex]);
        System.out.println("Lowest Average Week's Temp Details:" + Arrays.toString(results[lowestIndex]));
        return Arrays.toString(results[lowestIndex]);
    }
           
}
