//5.Write a java program to print all negative elements in an array.
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
        int count =0,count_positive=0;
        // Bubble sort to sort the array in ascending order
        for (int i = 0; i < size; i++) {
            if(arr[i]<0)
            {
                count++;
            }
            else
            {
                count_positive++;
            }
        }
        System.out.println("the number of negative number is "+count);
        System.out.println("the number of positive number is"+count_positive);
    }
}
            
            

               
