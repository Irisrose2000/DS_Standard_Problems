//8.Write a java program to to count total number of even and odd elements in an array
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
        System.out.println("number of even and odd");
        int count_odd=0;
        int count_even=0;
        for(int i=0;i<size;i++)
        {
            if(arr[i]%2==0)
            {
               count_even++;
               
            }
            if(arr[i]%2!=0)
            {
                count_odd++;
            }
        }
        System.out.println("the count of even number is "+count_even);
        System.out.println("the count of odd number is "+count_odd);
        
    }
}
