import java.util.Scanner;
public class Value
{
    public static void main(String[]args)
    {
//mai computer me name ,email,mobile number,address,age computer me save karna hu or jarurat padna par unko print karna chauta hu
//declaration and initilization of varibal
        int age;
        String name, email, mobileNumber, address;


//user se input lena ke liya object:
        Scanner input = new Scanner(System.in);

        System.out.println("enter your name:");
        name = input.nextLine();

        System.out.println("Enter your address:");
        address = input.nextLine();

        System.out.println("Enter your mobile number:");
        mobileNumber = input.nextLine();

        System.out.println("Enter your email:");
        email = input.nextLine();

        System.out.println("Enter your age:");
        age = input.nextInt();

//logic:
//printing:testing
        System.out.println(":::::::::DATA SAVE IN COMPUTER MEMORY::::::::::");
        System.out.println("your name is:" + name + " and your address is :" + address);
        System.out.println("your mobile number is:" + mobileNumber);
        System.out.println("your email is:" + email);
        System.out.println("your age is:" + age);


        int friendAge;
        boolean isYourFriendOld;

        System.out.println("now, enter friend age : (let's compare): ");
        friendAge = input.nextInt();

        System.out.println("below is your result of (is your friend old or not | if yes : TRUE or no : FALSE)");

        isYourFriendOld = friendAge > age;   //backend
        System.out.println(isYourFriendOld);  //frontend

    }
}
