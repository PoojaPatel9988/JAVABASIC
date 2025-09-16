import java.util.Scanner;

public class Difference
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        int num1,num2,result;

        num1=15;
        System.out.println("The 1st number is " + num1);
        num2=10;
        System.out.println("The 2nd number is " + num2);
        result= num1 - num2;
        System.out.println("The difference of two number is : " + result);

    }
}