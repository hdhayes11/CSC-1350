package pascaltrianglecalculator;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * The purpose of this program is to create three methods
 * that will be used to generate the binomial coefficients on each row
 * and display them as a Pascal's triangle.
 *CSC 1350 Project # 4
 * @author hhayes9 (Hunter Hayes)
 * @since 11-2-17
 */
public class PascalTriangleCalculator 
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int[] nums = {1};
        System.out.print("Enter the name of the output file -> ");   
        String outFile = scan.next();
        System.out.print("Enter the number of rows for the triangle -> ");
        int numRow = scan.nextInt();
        
        int shift;
        if (numRow <= 5)
            shift = 1;
        else if (numRow <= 9)
            shift = 2;
        else if (numRow <= 13)
            shift = 3;
        else if (numRow <= 16)
            shift = 4;
        else 
            shift = 5;
        
        try (PrintWriter fileOut = new PrintWriter(outFile))
        {
        for (int i = 1; i <= numRow; i++)
        {
            printRow(nums, numRow, shift, fileOut);
            nums = nextRow(nums);
        }
        fileOut.close(); 
        }
        catch(IOException e)
        {
            System.out.println(e);
        }          
    }
    public static int[] nextRow(int[] currentRow)
    {
        int[] newRow = new int[currentRow.length + 1];
        newRow[0] = 1;
        newRow[newRow.length - 1] = 1;
        for (int i = 1; i < newRow.length - 1; i++)
        {
            newRow[i] = (currentRow[i-1]) + (currentRow[i]);
        }
        return newRow;
    }
    public static void printRow(int row[], int numRow, int shift, PrintWriter writer)
    {
         if (row.length != numRow)
        {
            System.out.printf("%"+(shift*(numRow-row.length))+"s", "");
            writer.printf("%"+(shift*(numRow-row.length))+"s", "");
        }
        
        for (int i = 0; i < row.length; i++)
        {
            if (shift == 1)
            {
                System.out.printf("%d%1s", row[i], "");
                writer.printf("%d%1s", row[i], "");
            }
            else
            {
                System.out.printf("%d%"+((shift*2)-Integer.toString(row[i]).length())+"s", row[i], "");
                writer.printf("%d%"+((shift*2)-Integer.toString(row[i]).length())+"s", row[i], "");                
            }
        }
        System.out.println();
        writer.println();
    }
}
