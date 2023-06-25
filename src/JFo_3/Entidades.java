package JFo_3;

//Java Foundations - Exercícios - Seção 3
import java.util.Scanner;

public class Entidades {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        String Nome, SobreNome;
        int  Idade, parcelas;
        double  Salario, SaldoIni, SaldoFinal, ValorCarro;
        
        System.out.println("Olá, preciso de alguns dados...");
        System.out.println("Me informe seu primeiro nome: ");
            Nome = input.nextLine();

        System.out.println("Me informe seu sobrenome: ");
            SobreNome = input.nextLine();

        System.out.println("Me informe sua idade: ");
            Idade = input.nextInt();

        System.out.println("Me informe seu saldo bancário e depois seu salário: ");
        System.out.println("Saldo: R$" ); 
            SaldoIni = input.nextDouble();
        System.out.println("Salário: R$" ); 
            Salario = input.nextDouble();

        System.out.println("\nDigamos que você comprou um carro e terminará de pagar após uma certa quantidade de parcelas, digite o valor do carro e as parcelas: ");
        System.out.println("Valor do Carro: ");
            ValorCarro = input.nextDouble();
        System.out.println("Número de parcelas: ");
            parcelas = input.nextInt();

        double parcelasAnos = parcelas / 12; //Anos para acabar as parcelas
        double ValorParcelas = ValorCarro / parcelas;
        int IdadeFinal  = (int) (Idade + Math.round(parcelasAnos));
        double SaldoSal = SaldoIni + (Salario * parcelas);
        SaldoFinal = SaldoSal - ValorCarro;

        System.out.println("Senhor(a), "+ Nome +" "+ SobreNome +" comprando esse carro, após "+ parcelasAnos +" anos esses serão seus dados:");
        System.out.println("Idade: "+ IdadeFinal);
        System.out.printf("Valor das " + parcelas + "x parcelas pagas: %.2f", ValorParcelas);
        System.out.println("\nSaldo Bancário: R$"+ SaldoFinal);

        if (SaldoFinal < 0){
            System.out.println("Infelizmente você estará devendo ao banco.");
        } else{
            System.out.println("Então tudo bem comprar este carro.");
        }

        System.out.println("Dê uma nota de 1 a 10 para o serviço.");
            int Nota = 0;
            while(Nota < 1 || Nota >10){
                Nota = input.nextInt();
                if(Nota < 1 || Nota >10){
                    System.out.println("Digite novamente");
                }
            }
        
        System.out.println("Obrigado e até uma próxima!");

        input.close();
    }
}

