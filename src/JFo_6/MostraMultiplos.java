package JFo_6;

import java.util.Scanner;

public class MostraMultiplos {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Escolha um número ineiro qualquer: ");
        int num = input.nextInt();
        System.out.println(" ");
        
        for(int i = 1; i <= 12; i++){
            int mult = num * i;
            System.out.println("7x"+ i +" = "+ mult);
        }
        input.close();
    }
    
}
