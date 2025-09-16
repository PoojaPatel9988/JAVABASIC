// Save user address details:house no,pincode,street,city.format & print full address.
import java.util.Scanner;
public class Address
{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int houseNumber,pinCode;
        String street,city;

        System.out.print("Enter your house number : ");
        houseNumber=input.nextInt();
        System.out.print("Enter your street : ");
        street=input.nextLine();
        street=input.nextLine();
        System.out.print("Enter your city : ");
        city=input.nextLine();
        System.out.print("Enter your pin code : ");
        pinCode=input.nextInt();

        System.out.println(":::::::::::SAVE USER ADDRESS:::::::::::");
        System.out.println("House number : " + houseNumber);
        System.out.println("Street : " + street);
        System.out.println("city : " + city);
        System.out.println("pin-code : " + pinCode);
    }
}
