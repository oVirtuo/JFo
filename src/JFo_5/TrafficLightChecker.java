package JFo_5;

import java.util.Scanner;

public class TrafficLightChecker {

    public static void main(String[] args) {
        System.out.println("Insira o codigo de uma cor do semáforo: ");
        System.out.println("1 - Vermelho ");
        System.out.println("2 - Verde ");
        System.out.println("3 - Amarelo ");
        Scanner input = new Scanner(System.in);
        int corAtual = input.nextInt();
        switch(corAtual){
            case 1:
                System.out.println("A próxima luz do semáforo é Verde");
                break;
            case 2:
                System.out.println("A próxima luz do semáforo é Amarelo");
                break;
            case 3:
                System.out.println("A próxima luz do semáforo é Vermelho");
                break;
            default:
                System.out.println("Cor inválida.");
                break;
        }   
        input.close();
    }
}
