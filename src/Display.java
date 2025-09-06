/*Ask user for city and pin code .display their formatted address
 input: city: puna,pincode:4110001.
 output: YOur address : puna - 4110001
 */
import java.lang.*;
import java.util.Scanner;

public class Display
{
    public static void main(String[]args)
    {
        String address, pinCode;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your address:");
        address = sc.nextLine();

        System.out.print("Enter your pincode:");
        pinCode = sc.nextLine();


        System.out.println("your address :" + address + " - " + pinCode);
        //System.out.println("your pin code :" + pinCode);
    }
}
