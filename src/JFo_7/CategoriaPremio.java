package JFo_7;

public class CategoriaPremio {
    private String nome;
    private int ticketsObrigatorios;
    private int quantidadeDisponivel;

    public CategoriaPremio(String nome, int ticketsObrigatorios, int quantidadeDisponivel) {
        this.nome = nome;
        this.ticketsObrigatorios = ticketsObrigatorios;
        this.quantidadeDisponivel = quantidadeDisponivel;
    }

    public String getNome() {
        return nome;
    }

    public int getTicketsObrigatorios() {
        return ticketsObrigatorios;
    }

    public int getQuantidadeDisponivel() {
        return quantidadeDisponivel;
    }

    public void setQuantidadeDisponivel(int quantidadeDisponivel) {
        this.quantidadeDisponivel = quantidadeDisponivel;
    }
}