//Java Foundations - Exercícios - Seção 3
import java.util.Scanner;

public class Entidades {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        String Nome;
        int  Idade, parcelas;
        double  Salario, SaldoIni, SaldoFinal, ValorCarro;
        
        System.out.println("Olá, preciso de alguns dados...");
        System.out.println("Me informe seu nome: " + (Nome = input.nextLine()));

        System.out.println("Me informe sua idade: " + (Idade = input.nextInt()));

        System.out.println("\nMe informe seu saldo bancário e depois seu salário: " + 
            "\nSaldo: R$" + (SaldoIni = input.nextDouble()) + 
            "\nSalário: R$" + (Salario = input.nextDouble()));

        System.out.println("\nDigamos que você comprou um carro e terminará de pagar após uma certa quantidade de parcelas, digite o valor do carro e as parcelas: " + 
            "\nValor do Carro: " + (ValorCarro = input.nextDouble()) +
            "\nNúmero de parcelas: " + (parcelas = input.nextInt()));

        double parcelasAnos = parcelas / 12; //Anos para acabar as parcelas
        double ValorParcelas = ValorCarro / parcelas;
        int IdadeFinal  = (int) (Idade + Math.round(parcelasAnos));
        double SaldoSal = SaldoIni + (Salario * parcelas);
        SaldoFinal = SaldoSal - ValorCarro;

        System.out.println("Senhor(a), "+ Nome +" comprando esse carro, após "+ parcelasAnos +" esses serão seus dados:");
        System.out.println("Idade: "+ IdadeFinal);
        System.out.println("Valor das" + parcelas + "x parcelas pagas: "+ ValorParcelas);
        System.out.println("Saldo Bancário: R$"+ SaldoFinal);

        if (SaldoFinal < 0){
            System.out.println("Infelizmente você estará devendo ao banco. 😔");
        } else{
            System.out.println("Então tudo bem comprar este carro. 😄");
        }

        input.close();
    }
}

