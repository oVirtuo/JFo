package JFo_7;

import java.util.Random;

public class Jogo {
    private int creditosNecessarios;
    private int ticketsGanhos;

    public Jogo(int creditosNecessarios, int ticketsGanhos) {
        this.creditosNecessarios = creditosNecessarios;
        this.ticketsGanhos = ticketsGanhos;
    }

    public int jogar(Cartoes cartao) {
        if (cartao.getSaldoCredito() >= creditosNecessarios) {
            cartao.setSaldoCredito(cartao.getSaldoCredito() - creditosNecessarios);
            int tickets = new Random().nextInt(ticketsGanhos + 1);
            cartao.setSaldoTickets(cartao.getSaldoTickets() + tickets);
            System.out.println("Cartão " + cartao.getNumeroIdentificacao() + " - Tickets ganhos: " + tickets + " - Saldo atual: " + cartao.getSaldoTickets());
            return tickets;
        } else {
            System.out.println("Créditos insuficientes para jogar.");
            return 0;
        }
    }
}