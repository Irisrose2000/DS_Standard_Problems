//7.Write a java program to find maximum and minimum element in array
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
        System.out.println("maximum nad minimum");
        int maximum=arr[1];
        int minimum=arr[1];
        for(int i=0;i<size;i++)
        {
            if(maximum<arr[i])
            {
                maximum=arr[i];
               
            }
            if(minimum>arr[i])
            {
                minimum=arr[i];
            }
        }
        System.out.println("the maximum number is "+maximum);
        System.out.println("the minmum number is "+minimum);
        
    }
}
