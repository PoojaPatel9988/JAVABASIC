/* ask for name and print number of character in the name using.length().
Input: "Lanos"
Output: Name has 5 character  */

import java.util.Scanner;
public class MethodLength
{
    public static void main(String[]args)
    {
        String name;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name is : ");
        name=sc.next();

        System.out.println("Name has " + name.length() + " character.");
    }
}
