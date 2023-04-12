package com.bl.addressbook;
import java.util.*;

         class NewContact{

             Scanner sc = new Scanner(System.in);


             String Firstname;
             String Lastname;
             String Address;
             String city;

             String email;

             int pincode;
             int phonenumber;



         }
public class AddressBookMain extends NewContact {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //NewContact obj = new NewContact();

        System.out.println("Enter name");
        String Firstname = sc.nextLine();
        System.out.println("Enter last name");
        String Lastname = sc.nextLine();
        System.out.println("Enter Address");
        String Address = sc.nextLine();
        System.out.println("Enter city");
        String city = sc.nextLine();
        System.out.println("Enter email");
        String email = sc.nextLine();
        System.out.println("Enter pincode");
        int pincode = sc.nextInt();
        System.out.println("Enter phonenumber");
        int phonenumber = sc.nextInt();
        System.out.println(Firstname);
        System.out.println(Lastname);
        System.out.println(Address);
        System.out.println(city);
        System.out.println(email);
        System.out.println(pincode);
        System.out.println(phonenumber);
    }

}
