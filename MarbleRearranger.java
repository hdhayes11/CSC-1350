package marblerearranger;
import java.util.Arrays;
/**
     * This program calculates the white and black marbles from the array and when they are next. <br>
     * CSC 1350 Lab # 7
     * @author Hunter Hayes
     * @since 10/30/17
 */
public class MarbleRearranger {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        int[] marbles = {1, 1, 0, 0, 0, 1, 0, 0, 1};
        int i = 0;
        do
        {
            System.out.printf("marbles[] = %s%n", Arrays.toString(marbles));
            
            int firstwt = getFirstWhiteIndex(marbles);
            int nextblck = getNextBlackIndex(marbles,firstwt);
            
             if (nextblck >= marbles.length) {
                break;
            }
            
            System.out.printf("Left-most white index = %d, Next Black Index = %d%n", firstwt, nextblck);  
            System.out.printf("# of marbles examined for next black index: %d%n", nextblck - firstwt);
            
           
            swap(marbles, firstwt, nextblck);
            
        } while (i < marbles.length);
        
        System.out.println("*** no black marble found to the right of leftmost white marble");
    }
    
    public static int getFirstWhiteIndex(int[] marbles)
    {
        int i;
        for (i=0; i<marbles.length; i++) {
            if (marbles[i] == 1) {
                break;
            }
        }
        return i;
    }
    
    public static int getNextBlackIndex(int[] marbles, int from)
    {
        int i;
        for (i=from; i<marbles.length; i++) {
            if (marbles[i] == 0) {
                break;
            }
        }
        return i;
    }
    
    public static void swap(int[] marbles, int i, int j)
    {
        int temp = marbles[i];
        marbles[i] = marbles[j];
        marbles[j] = temp;
    }
    
}
