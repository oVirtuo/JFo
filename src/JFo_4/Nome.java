package JFo_4;

import java.util.Scanner;

public class Nome {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String Nome;
        String[] NComposto;

        System.out.println("Insira seu nome: ");
            Nome = input.nextLine();

        NComposto = Nome.split(" ");

        String PrimeiraLetras = FazNome(Nome);
        String Sobrenome = PegaSobrenome(NComposto);
        System.out.println("Seu nome é: "+ Sobrenome +", "+ PrimeiraLetras+"." );

        input.close();
    }

    static String PegaSobrenome(String[] NComposto) {

        String ultimo = NComposto[NComposto.length - 1];

        return ultimo;
    }

     static String FazNome(String name) {

        String primeira = String.valueOf(name.charAt(0));
        
        return primeira;
    }
    
}
