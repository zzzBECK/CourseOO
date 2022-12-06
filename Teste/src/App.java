import java.util.Locale;
import java.util.Scanner;

import entities.ContaBancaria;

public class App {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);

        int id;
        String nome;
        String option;
        double valorDeposito;
        ContaBancaria cliente;
        
        Scanner leitor = new Scanner(System.in);
        System.out.println("enter account number: ");
        id = leitor.nextInt();
        leitor.nextLine();

        System.out.println("enter account holder: ");
        nome = leitor.nextLine();

        System.out.println("Is there inicial deposit? Y/n: ");
        option = leitor.nextLine();


        if (option.toUpperCase().equals("Y")){
            System.out.println("Enter initial deposit value: ");
            valorDeposito = Double.parseDouble(leitor.nextLine());

            cliente = new ContaBancaria(id, nome, valorDeposito);
            
        }
        else{

            cliente = new ContaBancaria(id, nome);
        }

        System.out.println(cliente.toString());

        System.out.println("Enter a deposit value: ");

        cliente.realizarDeposito(Double.parseDouble(leitor.nextLine()));

        System.out.println(cliente.toString());

        System.out.println("Enter a withdraw value: ");

        cliente.realizarSaque(Double.parseDouble(leitor.nextLine()));

        System.out.println(cliente.toString());

        leitor.close();
    }
}
