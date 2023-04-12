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

         class newcontacts{

             String Firstname ="jyoti";
             String Lastname = "kale";
             String Address = "beed MH";
             String city = "beed";
             int pincode = 234324;
             int phonenumber = 123456789;
             String email = "jyptikale@gmail.com";

         }
public class AddressBookMain extends newcontacts {
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
        System.out.println("Add New Persone Details...........!");
newcontacts obj = new newcontacts();
        System.out.println(obj.Firstname);
        System.out.println(obj.Lastname);
        System.out.println(obj.Address);
        System.out.println(obj.city);
        System.out.println(obj.pincode);
        System.out.println(obj.phonenumber);
        System.out.println(obj.email);

    }

}
