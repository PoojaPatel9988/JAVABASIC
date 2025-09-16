/*  Ask user for quantity and price .calculate total cost.
Input : 3 units @ 120
Output:total=360  */
import java.util.Scanner;

public class CalculateTotalCost
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int quantity;
        double price,totalCost;
        System.out.println("Enter your quantity : ");
        quantity=sc.nextInt();
        System.out.println("Enter your price :");
        price=sc.nextDouble();
        totalCost=quantity * price;
        System.out.println("your total bill is : " + totalCost);

    }
}