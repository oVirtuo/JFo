package JFo_7;

public class Terminal {
    public Jogo jogo;
    private CategoriaPremio[] categoriasPremio;
    private Cartoes cartao;

    public Terminal(Jogo jogo, CategoriaPremio[] categoriasPremio) {
        this.jogo = jogo;
        this.categoriasPremio = categoriasPremio;
        this.cartao = null;
    }

    public void inserirCartao(Cartoes cartao) {
        this.cartao = cartao;
        System.out.println("\nCartão " + cartao.getNumeroIdentificacao() + " inserido.");
    }

    public void adicionarCreditos(int valor) {
        if (cartao != null) {
            int creditos = valor * 2; // 2 créditos por dólar
            cartao.setSaldoCredito(cartao.getSaldoCredito() + creditos);
            System.out.println("Créditos adicionados ao Cartão " + cartao.getNumeroIdentificacao() + ": " + creditos);
            System.out.println("Saldo de crédito atual do Cartão " + cartao.getNumeroIdentificacao() + ": " + cartao.getSaldoCredito());
        } else {
            System.out.println("Nenhum cartão inserido.");
        }
    }

    public void transferirCreditos(Terminal destino, Cartoes cartaoDestino, int quantidade) {
        if (cartao != null) {
            if (cartao.getSaldoCredito() >= quantidade) {
                cartao.setSaldoCredito(cartao.getSaldoCredito() - quantidade);
                cartaoDestino.setSaldoCredito(cartaoDestino.getSaldoCredito() + quantidade);
                System.out.println(quantidade + " créditos transferidos do Cartão " + cartao.getNumeroIdentificacao() + " para o Cartão " + cartaoDestino.getNumeroIdentificacao());
                System.out.println("Saldo de crédito atual do Cartão " + cartao.getNumeroIdentificacao() + ": " + cartao.getSaldoCredito());
                System.out.println("Saldo de crédito atual do Cartão " + cartaoDestino.getNumeroIdentificacao() + ": " + cartaoDestino.getSaldoCredito());
            } else {
                System.out.println("Créditos insuficientes para transferência.");
            }
        } else {
            System.out.println("Nenhum cartão inserido.");
        }
    }


    public void solicitarPremio(String categoria) {
        CategoriaPremio premio = null;
        for (CategoriaPremio categoriaPremio : categoriasPremio) {
            if (categoriaPremio.getNome().equals(categoria)) {
                premio = categoriaPremio;
                break;
            }
        }

        if (premio != null) {
            if (cartao.getSaldoTickets() >= premio.getTicketsObrigatorios()) {
                if (premio.getQuantidadeDisponivel() > 0) {
                    cartao.setSaldoTickets(cartao.getSaldoTickets() - premio.getTicketsObrigatorios());
                    premio.setQuantidadeDisponivel(premio.getQuantidadeDisponivel() - 1);
                    System.out.println("Prêmio solicitado: " + premio.getNome());
                    System.out.println("Quantidade restante do prêmio: " + premio.getQuantidadeDisponivel());
                } else {
                    System.out.println("Prêmio indisponível.");
                }
            } else {
                System.out.println("Tickets insuficientes para solicitar o prêmio.");
            }
        } else {
            System.out.println("Categoria de prêmio inválida.");
        }
    }

    public void verificarSaldo() {
        System.out.println("Cartão " + cartao.getNumeroIdentificacao() + " - Saldo de créditos: " + cartao.getSaldoCredito() + " - Saldo de tickets: " + cartao.getSaldoTickets());
    }
}
