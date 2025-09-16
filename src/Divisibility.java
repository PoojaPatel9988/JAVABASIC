import java.util.Scanner;

public class Divisibility
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int number;
        System.out.println(" Enter the any number to check divisibilitry of five :");
        number= sc.nextInt();

        int rem = number % 5;

        if(rem == 0)
        {
            System.out.println(number + " is completely divisible by 5");
            System.out.println("because remender is " + rem);
        }
        else
        {
            System.out.println(number + " is not divisibility by 5");
            System.out.println("because remender is " + rem);
        }
    }
}