/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package basicLibrary;

import java.util.Arrays;

public class Library {

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
            results[i] = (int) (Math.random()* 6) + 1; 
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
