//3.Write a java program to find second largest element in an array. If not exist, then return -1.
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

        // Bubble sort to sort the array in ascending order
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        // Find the second largest distinct element
        int largest = arr[size - 1];
        for (int i = size - 2; i >= 0; i--) {
            if (arr[i] < largest) {
                System.out.println("Second largest number: " + arr[i]);
                return;
            }
        }

        System.out.println("Second largest element does not exist (-1)");
    }
}
