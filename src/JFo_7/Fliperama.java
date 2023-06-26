package JFo_7;

import java.util.Scanner;

/*Cartão deve possuir metodo getter, um ID, valor de crédito e saldo de tickets(ao criar um cartão deve ser atribuido um ID novo, valor de saldo e tickets igual a 0)
 * 
 * Jogos devem ter um nome(dado no exercicio), um valor de cédito para semrem jogados que desconta do valor do cartão (se o cartão tiver saldo insuficiente, é negado) 
 * e um atribuidor de tickets
 * 
 * Terminais aceitam dinheiro que é convertido em credito para o cartão como inteiros, para cada dolar = 2 creditos. Terminais informam o crédito dos cartões junto a seus IDs
 * Créditos são transferiveis entre cartões mo terminal, tickets são trocados nmos terminais por premios, um erro deve ser exibido se o saldo de tickets for isuficiente ou se
 * o premio tiver acabado. Ao conceder um premio deve ser impresso no terminal a operação e a qnt de premios daquele tipo restantes.(3 premios no terminal)
 * 
 * Metodo Principal(Fliperama) instanciar 2 cartões e os demais objetos 
 * 
 * 
 */

class Fliperama {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Instanciando cartões
        System.out.print("Digite o número do Cartão 1: ");
        int numeroCartao1 = input.nextInt();
        Cartoes cartao1 = new Cartoes(numeroCartao1);

        System.out.print("Digite o número do Cartão 2: ");
        int numeroCartao2 = input.nextInt();
        Cartoes cartao2 = new Cartoes(numeroCartao2);
        // Instanciando jogo
        Jogo jogo = new Jogo(3, 10); // Cada jogo requer 3 créditos e concede até 10 tíquetes

        // Instanciando categorias de prêmio
        CategoriaPremio[] categoriasPremio = new CategoriaPremio[3];
        categoriasPremio[0] = new CategoriaPremio("Categoria 1", 20, 5);
        categoriasPremio[1] = new CategoriaPremio("Categoria 2", 10, 3);
        categoriasPremio[2] = new CategoriaPremio("Categoria 3", 15, 7);

        // Instanciando terminais
        Terminal terminal1 = new Terminal(jogo, categoriasPremio);
        Terminal terminal2 = new Terminal(jogo, categoriasPremio);

        // Ações no programa
        terminal1.inserirCartao(cartao1);
        System.out.print("\nDigite a quantidade de dinheiro para adicionar créditos ao Cartão 1: ");
        int dinheiro1 = input.nextInt();
        terminal1.adicionarCreditos(dinheiro1);

        System.out.print("Vamos jogar para oncseguir tickets.");
        terminal1.jogo.jogar(cartao1); // Tenta jogar um jogo com o Cartão 1

        System.out.println("\nDeseja solicitar qual premio?");
        System.out.println("Categoria 1");
        System.out.println("Categoria 2");
        System.out.println("Categoria 3");
        int cat1 = input.nextInt();
        switch(cat1){
            case 1:
                terminal1.solicitarPremio("Categoria 1"); // Tenta solicitar um prêmio com o Cartão 1
                break;
            case 2:
                terminal1.solicitarPremio("Categoria 2"); // Tenta solicitar um prêmio com o Cartão 1
                break;
            case 3:
                terminal1.solicitarPremio("Categoria 3"); // Tenta solicitar um prêmio com o Cartão 1
                break;
            default:
                terminal1.solicitarPremio("Valor incorreto."); // Tenta solicitar um prêmio com o Cartão 1
        }
        terminal1.verificarSaldo(); // Verifica o saldo do Cartão 1
    
        System.out.print("Transferindo créditos");
        terminal1.transferirCreditos(terminal2, cartao2, 10); // Transferir 10 créditos do Cartão 1 para o Cartão 2


        //Cartão 2
        terminal2.inserirCartao(cartao2);
        System.out.print("\nDigite a quantidade de dinheiro para adicionar créditos ao Cartão 2: ");
        int dinheiro2 = input.nextInt();
        terminal2.adicionarCreditos(dinheiro2);

        System.out.print("Vamos jogar para oncseguir tickets.");
        terminal1.jogo.jogar(cartao2); // Tenta jogar um jogo com o Cartão 1

        System.out.print("\nDeseja solicitar qual premio?");
        System.out.print("Categoria 1");
        System.out.print("Categoria 2");
        System.out.print("Categoria 3");
        int cat2 = input.nextInt();
        switch(cat2){
            case 1:
                terminal2.solicitarPremio("Categoria 1"); // Tenta solicitar um prêmio com o Cartão 1
                break;
            case 2:
                terminal2.solicitarPremio("Categoria 2"); // Tenta solicitar um prêmio com o Cartão 1
                break;
            case 3:
                terminal2.solicitarPremio("Categoria 3"); // Tenta solicitar um prêmio com o Cartão 1
                break;
            default:
                terminal2.solicitarPremio("Valor incorreto."); // Tenta solicitar um prêmio com o Cartão 1
        }

        terminal2.verificarSaldo(); // Verifica o saldo do Cartão 2

        input.close();
    }

}
