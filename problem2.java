//2.Write a Java program to input amount from user and print minimum number of notes (Rs. 500, 100, 50, 20, 10, 5, 2, 1) required for the amount.
import java.util.Scanner;
class Main
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the Amount :");
		int total_amount = input.nextInt();
		int cnt_500, cnt_100, cnt_50, cnt_20, cnt_10, cnt_5, cnt_2, cnt_1;
		cnt_500 = cnt_100 = cnt_50 = cnt_20 = cnt_10 = cnt_5 = cnt_2 = cnt_1 = 0;
		if(total_amount >= 500)
			cnt_500 = total_amount/500;
			total_amount -= cnt_500 * 500;
		if(total_amount >= 100)
			cnt_100 = total_amount/100;
			total_amount -= cnt_100 * 100;
		if(total_amount >= 50)
			cnt_50 = total_amount/50;
			total_amount -= cnt_50 * 50;
		if(total_amount >= 20)
			cnt_20 = total_amount/20;
			total_amount -= cnt_20 * 20;
		if(total_amount >= 10)
			cnt_10 = total_amount/10;
			total_amount -= cnt_10 * 10;
		if(total_amount >= 5)
			cnt_5 = total_amount/5;
			total_amount -= cnt_5 * 5;
		if(total_amount >= 2)
			cnt_2 = total_amount /2;
			total_amount -= cnt_2 * 2;
		if(total_amount >= 1)
			cnt_1 = total_amount;
 
		System.out.println("Total number of Notes");
		System.out.println("500 = "+ cnt_500);
		System.out.println("100 = "+ cnt_100);
		System.out.println("50 = "+ cnt_50);
		System.out.println("20 = "+ cnt_20);
		System.out.println("10 = "+ cnt_10);
		System.out.println("5 = "+ cnt_5);
		System.out.println("2 = "+ cnt_2);
		System.out.println("1 = "+ cnt_1);
	}
}

