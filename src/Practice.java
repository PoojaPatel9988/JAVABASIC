import java.util.Scanner;
public class Practice
{
    public static void main(String[] args)
    {
        String name, mobileNo, email;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name:");
        name = sc.nextLine();

        System.out.print("Enter your mobile number:");
        mobileNo = sc.nextLine();

        System.out.print("Enter your email:");
        email = sc.nextLine();

        System.out.println("::::::::DATA SAVE IN MEMORY::::::::");
        System.out.println("your name is:" + name);
        System.out.println("your mobile number is : " + mobileNo);
        System.out.println("youe email is :" + email);
    }
}
