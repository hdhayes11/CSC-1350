package sorter;
import java.util.Arrays;
/**
 *
 * @author Hunter Hayes
 */
public class SelectionSortDemo {
    
    public static void main(String[] args) {
    int[] list = {2,4,5,6,4,5,3,5,3};
    System.out.printf("Initial Data: %s%n%n", Arrays.toString(list));
    Sorter.selectionSort(list);
    System.out.printf("%nSorted Data: %s%n", Arrays.toString(list));
    
    int[] listTwo = {1,2,3,4,5,6,7,8,9};
    System.out.printf("Initial Data: %s%n%n", Arrays.toString(listTwo));
    Sorter.selectionSort(listTwo);
    System.out.printf("%nSorted Data: %s%n", Arrays.toString(listTwo));

    int[] listThree = {9,8,7,6,5,4,3,2,1};
    System.out.printf("Initial Data: %s%n%n", Arrays.toString(listThree));
    Sorter.selectionSort(listThree);
    System.out.printf("%nSorted Data: %s%n", Arrays.toString(listThree));
    
    }
    
}
