package JFo_4;

import java.util.Scanner;

public class ComputeMethods {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a temperatura em Fahrenheit: ");
            double farenheit = input.nextDouble();

        System.out.println("Vamos calcular uma hipotenusa também.");
        System.out.println("Digite a altura do triangulo: ");
          int altura = input.nextInt();
        System.out.println("Digite a base do triangulo: ");
          int base = input.nextInt();

    
        
        double celsius = converteFtoC(farenheit);
        System.out.println("A temperatura em Celsius é: " + celsius);
        double hipotenusa = hypotenusa(altura, base);
        System.out.printf("A hipotenusa deste triangulo é: %.2f", hipotenusa);
        int dados = roll();
        System.out.printf("\nA soma dos valores de dois dados rolados é: " + dados);


        input.close();
    
    }

    static double converteFtoC(double f) {
        double c;
        c =  ((5 / 9) * (f - 32));
        return c;
    }

    static double hypotenusa(int a, int b){
        double h = Math.sqrt((a*a)+(b*b));
        return h;
   }

   static int roll(){

        int max = 6;
        int min = 1;
        int range = max - min + 1;

        int r1 = (int)(Math.random() * range) + min;
        int r2 = (int)(Math.random() * range) + min;
        int rs = r1 + r2;

        return rs;
   }
    


   
}
