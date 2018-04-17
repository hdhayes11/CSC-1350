package averagefinder;
import java.util.Scanner;
import java.util.Arrays;
/**
     * This class calculates the list of scores, average test score, average of test scores, average of passing test scores, minimum test scores, and number of 'A' test scores from an array. <br>
     * CSC 1350 Lab # 6
     * @author Hunter Hayes
     * @since 10/23/17
     */
public class AverageFinder {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number of students (no less than 5) -> ");
        int testScores[] = new int[scan.nextInt()];
        System.out.printf("Successively enter %d test scores between 0 and 100.%n",testScores.length);
        System.out.print("---------------------------------------------------");
        for(int i = 0; i <= testScores.length-1; i++)
        {
            System.out.printf("%nEnter a score (%d remaining) -> ",testScores.length);
            testScores[i] = scan.nextInt();
            System.out.printf("testScores[%d] = " + testScores[i], i);
        }
        System.out.print("\n---------------------------------------------------");
        System.out.printf("%nList of Scores: %s", toString(testScores));
        double avg = (double)sumIf(testScores,0,100)/testScores.length;
        System.out.printf("%nAverage Test Score: %d/%d = %.2f", sumIf(testScores,0,100), testScores.length, avg);
        double avgTestScores = (double)sumIf(testScores,avg,100)/countIf(testScores,avg,100);
        System.out.printf("%nAverage of Test Scores (>= %.2f): %.2f",avg,avgTestScores);
        double avgPassing = (double)sumIf(testScores,70,100)/countIf(testScores,70,100);
        System.out.printf("%nAverage of Passing Test Scores: %.2f", avgPassing);
        System.out.printf("%nMinimum Test Score: %d", findMin(testScores));
        System.out.printf("%nNumber of 'A' Test Scores: %d", countIf(testScores,90,100));
    }
    
    public static String toString(int[] testScores) {
        String userToString = "";
        userToString += testScores[0];
        for(int i = 1; i <= testScores.length-1; i++)
            userToString += ", " + testScores[i];
        return ("{" + userToString +"}");
    }
    public static int sumIf(int[] testScores, double low, double high) {
        int sum = 0;
        for(int i = 0; i <= testScores.length-1; i++)
        {
             if(testScores[i]>=low&&testScores[i]<=high)
                sum+= testScores[i];   
        }
        return sum;
    }
    public static int countIf(int[] testScores, double low, double high) {
        int numScores = 0;
        for(int i = 0; i<= testScores.length-1; i++)
        {
            if(testScores[i]>=low&&testScores[i]<=high)
                numScores++;
        }
        return numScores;
    }
    public static int findMin(int[] testScores)
    {
        int min = testScores[0];
        for(int i=1; i<testScores.length; i++)
        {
            if (testScores[i]<min)
                min = testScores[i];
        }
        return min;
    }
   
    
}
