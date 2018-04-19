package sorter;
import java.util.Arrays;
/**
     * This program sorts the array in
     * multiple different orders and
     * shows the numbers being compared
     * each run.<br>
     * @author Hunter Hayes
 */

public class Sorter {

    public static void selectionSort(int[] list) 
    {
        int i, j, temp, minIndex;
        for (i = 0; i < list.length - 1; i++)
        {
            minIndex = i;
            for (j = i+1; j < list.length; j++)
            {
                if (list[j] < list[minIndex])
                    minIndex = j;
            }
            temp = list[i];
            list[i] = list[minIndex];
            list[minIndex] = temp;
            System.out.print("\n"+Arrays.toString(list));
        }
        
    }
    //@version 1 First Version sorts array from highest to lowest value
      public static void selectionSort(int[] list)
      {
          int i, j, temp, minIndex;
          for (i = 0; i < list.length - 1; i++)
          {
              minIndex = i;
              for (j = i+1; j < list.length; j++)
              {
                  System.out.printf("(%s,%s) ", list[minIndex], list[j]);
                  if (list[j] < list[minIndex])
                      minIndex = j;
              }
              temp = list[i];
              list[i] = list[minIndex];
              list[minIndex] = temp;
              
              System.out.print("\n"+Arrays.toString(list)+"\n");
          }
      }
    //@version 2 Second Version sorts array from highest to lowest value and shows comparisons
      public static void selectionSort(int[] list)
      {
          int i, j, temp, minIndex;
          for (i = 0; i < list.length - 1; i++)
          {
              minIndex = i;
              for (j = list.length-1; j>i; j--)
              {
                  System.out.printf("(%s,%s) ", list[minIndex], list[j]);
                  if (list[j] < list[minIndex])
                      minIndex = j;
              }
              temp = list[i];
              list[i] = list[minIndex];
              list[minIndex] = temp;
              
              System.out.print("\n"+Arrays.toString(list)+"\n");
          }
      }
    //@version 3 third version sorts array from highest to lowest value leftward and shows comaprisons
      public static void selectionSort(int[] list)
      {
          int i, j, temp, minIndex;
          for (i = list.length-1; i>0; i--)
          {
              minIndex = i;
              for (j = i-1; j >= 0; j--)
              {
                  System.out.printf("(%s,%s) ", list[minIndex], list[j]);
                  if (list[j] < list[minIndex])
                      minIndex = j;
              }
              temp = list[i];
              list[i] = list[minIndex];
              list[minIndex] = temp;
              
              System.out.print("\n"+Arrays.toString(list)+"\n");
          }
      }
    
}
