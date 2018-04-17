package minmaxfinder;
import java.util.Scanner;
/**
 * This class calculates the lowest, highest, sum of passing scores, number of fails and prints it out into an easy to read format. <br>
 * CSC 1350 Lab # 5
 * @author Hunter Hayes
 * @since 10/09/17
 */
public class MinMaxFinder {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sumOfPassingScore = 0;
        int numOfNonPassing = 0;
        String nonPassing = "";
        
        System.out.print("Enter number of test scores (>=5) to compute the lowest, highest, and sum of passing scores -> ");
        int numTestScores = scan.nextInt();
        
        System.out.print("Enter the first test score [0-100] -> ");
        int testScore = scan.nextInt();
        int lowestScore = testScore;
        int highestScore = testScore;
        if (testScore >= 70)
        {
            sumOfPassingScore += testScore;
            System.out.printf("Lowest = %d, Highest = %d and Sum of Passing Scores = %d\n\n", lowestScore, highestScore, sumOfPassingScore);
        }
        else
        {
            numOfNonPassing++;
            nonPassing += testScore;
            System.out.printf("Lowest = %d, Highest = %d and Sum of Passing Scores = %d\nNumber of non-passing scores (%d) : %s\n\n", lowestScore, highestScore, sumOfPassingScore, numOfNonPassing, nonPassing);
        }
        for (int i = 1; i < numTestScores; i++)
        {
            System.out.print("Enter the next test score [0-100] -> ");
            testScore = scan.nextInt();
            if (testScore <= lowestScore)
                lowestScore = testScore;
            else if (testScore >= highestScore)
                highestScore = testScore;
            if (testScore >= 70)
            {
                sumOfPassingScore += testScore;
                System.out.printf("Lowest = %d, Highest = %d and Sum of Passing Scores = %d\n\n", lowestScore, highestScore, sumOfPassingScore);
            }
            else
            {
                numOfNonPassing++;
                nonPassing += (" " +testScore);
                System.out.printf("Lowest = %d, Highest = %d and Sum of Passing Scores = %d\nNumber of non-passing scores (%d) : %s\n\n", lowestScore, highestScore, sumOfPassingScore, numOfNonPassing, nonPassing);
            }
            
        }
    }
    
}
