import java.util.Scanner;

import java.text.SimpleDateFormat;
import java.util.Locale;

import entities.Client;
import entities.OrderItem;
import entities.Product;

public class App {
    public static void main(String[] args) throws Exception {
        
        Locale.setDefault(Locale.US);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Client data:");
        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Email: ");
        String email = sc.nextLine();

        System.out.println("Enter order data:");
        System.out.print("Status: ");
        
        // Product p = new Product("TV", 1000.0);
        // OrderItem ot1 = new OrderItem(1, 1000.0, p);
        
        // Client cli = new Client("Maria", "maria@gmail.com", sdf.parse("20/10/1995"));

        // System.out.println(cli);

        // System.out.println(ot1);
    }
}
