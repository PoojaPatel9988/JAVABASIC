/* a user wants to register on your portal .ask for their name and age ,then print a welcome message .
input: name="amit" age=20
output: welcome amit and your age is 20.*/

import java.util.Scanner;
public class AddressPincode
{
    public static void main(String[] args)
    {
        int age;
        String name;


        Scanner sc=new Scanner(System.in);

        System.out.println("enter your name is:" );
        name = sc.nextLine();
        System.out.println("enter your age is : " );
        age = sc.nextInt();
        System.out.println("welcome " + name + " and your age is: " + age);
    }
}