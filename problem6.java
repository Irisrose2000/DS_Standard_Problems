//6.Write a java program to print all negative elements in an array.
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
        System.out.println("negative numbers are\n");
        for(int i=0;i<size;i++)
        {
            if(arr[i]<0)
            {
                System.out.println(arr[i]);
               
            }
        }
        
    }
}
