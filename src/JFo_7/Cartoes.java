package JFo_7;

public class Cartoes {
    private int numeroIdentificacao;
    private int saldoCredito;
    private int saldoTickets;

    public Cartoes(int numeroIdentificacao) {
        this.numeroIdentificacao = numeroIdentificacao;
        this.saldoCredito = 0;
        this.saldoTickets = 0;
    }

    public int getNumeroIdentificacao() {
        return numeroIdentificacao;
    }

    public int getSaldoCredito() {
        return saldoCredito;
    }

    public void setSaldoCredito(int saldoCredito) {
        this.saldoCredito = saldoCredito;
    }

    public int getSaldoTickets() {
        return saldoTickets;
    }

    public void setSaldoTickets(int saldoTickets) {
        this.saldoTickets = saldoTickets;
    }
}
