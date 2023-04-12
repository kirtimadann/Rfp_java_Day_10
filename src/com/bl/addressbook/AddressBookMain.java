package com.bl.addressbook;


 class contacts{

         String Firstname;
         String Lastname;
         String Address;
         String city;
         int pincode;
         int phonenumber;
         String email;

         }
public class AddressBookMain {
    public static void main(String[] args) {

        System.out.println("Welcome to Address Book");

        contacts c = new contacts();
        c.Firstname="kirti";
        c.Lastname = "Madan";
        c.Address = "jalna";
        c.phonenumber = 955656687;
        c.pincode = 431203;
        c.email = "kirtimadan125@gmail.com";
        c.city = "jalna";

        System.out.println(c.Firstname);
        System.out.println(c.Lastname);

        System.out.println(c.Address);

        System.out.println(c.phonenumber);
        System.out.println(c.pincode);
        System.out.println(c.email);
        System.out.println(c.city);



    }

}
