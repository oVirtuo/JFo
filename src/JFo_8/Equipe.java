package JFo_8;

public class Equipe {
    
    private String nome;
    private int vitorias;
    private int derrotas;
    private int empates;
    private int golsMarcados;
    private int golsSofridos;
    
    // Construtor
    public Equipe(String nome) {
        this.nome = nome;
    }
    
    // Getters e Setters
    public String getNome() {
        return nome;
    }
    
    public int getVitorias() {
        return vitorias;
    }
    
    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }
    
    public int getDerrotas() {
        return derrotas;
    }
    
    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }
    
    public int getEmpates() {
        return empates;
    }
    
    public void setEmpates(int empates) {
        this.empates = empates;
    }
    
    public int getGolsMarcados() {
        return golsMarcados;
    }
    
    public void setGolsMarcados(int golsMarcados) {
        this.golsMarcados = golsMarcados;
    }
    
    public int getGolsSofridos() {
        return golsSofridos;
    }
    
    public void setGolsSofridos(int golsSofridos) {
        this.golsSofridos = golsSofridos;
    }
    
    // Método para imprimir estatísticas da equipe
    public void imprimirEstatisticas() {
        System.out.println("Estatísticas da equipe " + nome + ":");
        System.out.println("Vitórias: " + vitorias);
        System.out.println("Derrotas: " + derrotas);
        System.out.println("Empates: " + empates);
        System.out.println("Gols Marcados: " + golsMarcados);
        System.out.println("Gols Sofridos: " + golsSofridos);
        System.out.println();
    }
}