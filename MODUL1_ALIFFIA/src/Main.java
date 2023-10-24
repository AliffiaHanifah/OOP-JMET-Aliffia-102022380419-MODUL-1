import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        // TODO: Create Database Object
        Database database = new Database();
        

        // TODO: Create Konser Object and Set the Attributes
        Konser konser = new Konser();
        konser.setBandName("The Unity");
        konser.setDate("25 April 2023");
        konser.setLocation("Jakarta");
        konser.setTicketPrice(3000000);

        // TODO: Insert Konser Object to Database


        // TODO: Display Greeting Message and Prompt User to Register
        System.out.println("Selamat Datang di Konser The Unity");
        System.out.println("Silahkan Register Terlebih Dahulu");

        // TODO: Create a User Object and Set the Attributes
        User user = new User();
        user.setName("Jeno");
        System.out.println("Nama: "+ user.getName);
        user.setPhoneNumber(812228987);

        // TODO: Display Main Menu and Prompt User to Choose Menu
        
    }
}
