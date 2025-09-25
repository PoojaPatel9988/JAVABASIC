/*  ask from user name and reverse it using string functions.
 Input:Neha
 Output:aheN  */
import java.util.Scanner;
public class MethodStringBuilderReverse
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String name,reverseName;
        System.out.println("Enter your name : ");
        name=sc.nextLine();

        reverseName=new StringBuilder(name).reverse().toString();
        System.out.println("Reverse name is : " + reverseName);


    }
}