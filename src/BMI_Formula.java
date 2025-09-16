/*   Store user's height and weight .show BMI formula:
weight / ( height * height)
Input: height=1.8,weight=70
Output:BMI = 21.60     */

import java.util.Scanner;
public class BMI_Formula
{
    public static void main(String[]args)
    {
        double height,weight;
        Scanner sc=new Scanner(System.in);
        System.out.print("enter height : ");
        height=sc.nextDouble();
        System.out.print("enter weight : ");
        weight=sc.nextDouble();

        double formula =weight / (height * height);
        System.out.println("BMI : " + formula);
    }
}
