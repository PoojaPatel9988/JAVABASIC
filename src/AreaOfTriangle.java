/* input based and height .
calculate area of triangle.
formula : 0.5 * base * height
 */
import java.util.Scanner;
import java.lang.*;
public class AreaOfTriangle
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter base of triangle : ");
        double base=sc.nextDouble();

        System.out.print("enter height of triangle : ");
        double height=sc.nextDouble();

        double triangle = 0.5 * base * height;
        System.out.println("the total area of triangle is : " + triangle);
    }
}
