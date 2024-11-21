//10.write a program to insert an element in the array
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read the size of the array
        System.out.println("Enter the size of the array:");
        int size = scan.nextInt();

        int[] arr = new int[size + 1]; // Create an array with one extra space

        // Input elements into the array
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = scan.nextInt();
        }

        // Input the element to insert
        System.out.println("Enter the element you want to insert:");
        int element = scan.nextInt();

        // Input the position to insert the element
        System.out.println("Enter the position where you want to insert:");
        int position = scan.nextInt();

        // Validate the position
        if (position < 0 || position > size) {
            System.out.println("Invalid position!");
        } else {
            // Shift elements to the right from the position
            for (int i = size; i > position; i--) {
                arr[i] = arr[i - 1];
            }

            // Insert the new element at the specified position
            arr[position] = element;

            // Print the updated array
            System.out.println("The updated array is:");
            for (int i = 0; i <= size; i++) {
                System.out.print(arr[i] + " ");
            }
        }

        scan.close();
    }
}
