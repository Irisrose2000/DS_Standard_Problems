//1.Write a java program to check whether a character is alphabet, digit or special character.
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the charachter");
        char a=scan.next().charAt(0);
// used the ASCII code to identify the charchters
        if(a>=60&&a<=90||a>=97&&a<=122)
        {
            System.out.println("Alphabet");
        }
// 60 to 90 is for captial letters while 97 to 122 for small letters
        else if(a>=45&&a<=57)
        {
            System.out.println("Digit");
        }
        else
        {
            System.out.println("Special Charchter");
        }
        
    }
}
