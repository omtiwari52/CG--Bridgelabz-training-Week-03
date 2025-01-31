package CountingSort;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Get the total Scores
        System.out.print("Enter the number total Scores :- ");
        int n = input.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the Scores :- ");
        // Taking the user Input of student marks
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }

        SortStudentAges sort = new SortStudentAges();
        // enter the min and max value
        System.out.print("Enter the min value:- ");
        int min = input.nextInt();
        System.out.print("Enter the max element:- " );
        int max = input.nextInt();
        // sort the array
        try{
            sort.countingSort(arr, min, max);
            System.out.print("Scores after sorting:- ");
            System.out.print(Arrays.toString(arr));
        }catch (Error e){
            System.out.println("Error caught invalid input please check and re-enter");
        }
    }
}
