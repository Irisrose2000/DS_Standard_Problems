//4.Write a java program to input elements in array from user and count duplicate elements in array and print them.
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = scan.nextInt();

        if (size < 2) {
            System.out.println("Second largest element does not exist (-1)");
            return;
        }

        int[] arr = new int[size];
        System.out.println("Enter the elements in the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = scan.nextInt();
        }
        int count =0;
        // Bubble sort to sort the array in ascending order
        for (int i = 0; i < size; i++) {
            for (int j = i+1; j < size; j++) {
                if(arr[i]==arr[j])
                {
                    System.out.println(arr[j]);
                    count++;
                }
            }
        }
        System.out.println("the number of duplicates is"+count);
    }
}
               
