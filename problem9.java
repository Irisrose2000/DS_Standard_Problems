//9.Write a java program to print the reverse of array
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("enter the size of the arra");
        int size =scan.nextInt();
         int []arr=new int[size];
        System.out.println("enter the elements in the array");
        for(int i=0;i<size;i++)
        {
            arr[i]=scan.nextInt();
        }
        System.out.println("reverse array");
        for(int i=size-1;i>=0;i--)
        {
            System.out.println(arr[i]);
        }
    }
}
