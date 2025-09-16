import java.util.Scanner;

/*  user enters marks in 3 subjects.Calculate total and average.
Input: 80,90,85
Output:Total =255 ,avg=85.0 */

public class Average
{
    public static void main(String[]args)
    {
        double firstSubject,secondSubject,thirdSubject;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number in first subject : ");
        firstSubject=sc.nextDouble();
        System.out.print("Enter number in second subject :");
        secondSubject=sc.nextDouble();
        System.out.print("Enter number in third subject :");
        thirdSubject=sc.nextDouble();

        double totalNumber = firstSubject + secondSubject + thirdSubject;
        System.out.println("Total number is : " + totalNumber);
        double totalaverage = totalNumber / 3;
        System.out.println("Total average is : " + totalaverage);
    }
}