package JFo_6;

import java.util.Scanner;

public class ValidaPIN {

    public static void main(String[] args) {
        int PIN = 2023;
        int PIN_Digitado = 0000;
        Scanner input = new Scanner(System.in);

        System.out.println("Insira o PIN: ");
         while (PIN_Digitado != PIN) {
            PIN_Digitado = input.nextInt();
            System.out.println("PIN errado, digite novamente");
            
        }
        System.out.println("Acesso Confirmado");

        input.close();
    }
    
}
