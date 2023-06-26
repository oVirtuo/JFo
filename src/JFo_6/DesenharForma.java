package JFo_6;

import java.util.Scanner;

public class DesenharForma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a largura das formas: ");
        int largura = input.nextInt();

        System.out.print("Digite a altura das formas: ");
        int altura = input.nextInt();

        criaRetangulo(altura, largura);
        System.out.printf("\n");
        criaTriangulo(altura);


        input.close();
    }




    static void criaRetangulo(int a, int b){

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                if (i == 0 || i == a - 1 || j == 0 || j == b - 1) {
                    System.out.print("#"); // Desenhar bordas
                } else {
                    System.out.print(" "); // Espaço interno vazio
                }
            }
            System.out.println(); // Nova linha após cada linha do retângulo
        }

    }

    static void criaTriangulo(int a){

        for (int i = 0; i < a; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i || i == a - 1) {
                    System.out.print("#"); // Borda do triângulo
                } else {
                    System.out.print(" "); // Espaço interno vazio
                }
            }
            System.out.println(); // Nova linha após cada linha do triângulo
        }
    }

}