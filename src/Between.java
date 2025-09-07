import java.util.Scanner;
public class Between{
    public static void main(String[]args)
    {
        int userInput;

        Scanner sc =new Scanner(System.in);
        System.out.print("Enter user input : ");
        userInput=sc.nextInt();

        if(userInput == 1)
        {
            System.out.println("you are buying sugar ");
            System.out.println("price of 1kg sugar is 43 rupees");
        }
        else
        {
            System.out.println("you are buying rice");
            System.out.println("price of 1kg rice is 35 rupees");

        }
    }


}