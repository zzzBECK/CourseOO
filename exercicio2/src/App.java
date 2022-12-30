import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");

        List<Product> products = new ArrayList<>();

        System.out.print("Enter the number of products: ");

        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= n; i++){
            System.out.println("Product #" + i + " data:");
            System.out.print("Common, used, imported (c/u/i)?");
            char option = sc.next().charAt(0);
            sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Price: ");
            Double price = Double.parseDouble(sc.nextLine());

            if (option == 'c'){

                Product product = new Product(name, price);
                products.add(product);
            }
            else if (option == 'u'){
                System.out.print("Manufacture Date: (DD/MM/YYYY): ");
                Date date = sdf1.parse(sc.nextLine());

                Product product = new UsedProduct(name, price, date);
                products.add(product);

            }
            else if (option == 'i'){
                System.out.print("Custom fee: ");
                Double customFee = Double.parseDouble(sc.nextLine());

                Product product = new ImportedProduct(name, price, customFee);
                products.add(product);
            }

        }

        for (Product product : products){
            
            System.out.println(product.priceTag());
        }

        sc.close();
    }
}
