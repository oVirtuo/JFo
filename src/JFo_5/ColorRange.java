package JFo_5;

import java.util.Scanner;

public class ColorRange {

    public static void main(String[] args) {
        // entrada de dados
        System.out.println("Insira um valor de comprimento de onda: ");
        Scanner input = new Scanner(System.in);
        double compOnda = input.nextDouble();

        if (compOnda >= 380 && compOnda < 450) {
            System.out.println("Violeta");
        }
        else if (compOnda >= 450 && compOnda < 495) {
            System.out.println("Azul");
        }
        else if (compOnda >= 495 && compOnda < 570) {
            System.out.println("Verde");
        }
        else if (compOnda >= 570 && compOnda < 590) {
            System.out.println("Amarelo");
        }
        else if (compOnda >= 590 && compOnda < 620) {
            System.out.println("Laranja");
        }
        else if (compOnda >= 620 && compOnda < 750) {
            System.out.println("Vermelho");
        }
        else {
            System.out.println("O valor especificado não está no espectro visível.");
        }

        input.close();

    }
    
}
