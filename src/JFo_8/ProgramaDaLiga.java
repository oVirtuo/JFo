package JFo_8;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProgramaDaLiga {
    private static final int NUM_EQUIPES = 4;
    private static final int NUM_JOGOS_POR_SEMANA = 2;
    private static final double TEMPERATURA_CONGELANTE = 1.0;
    private static final int NUM_SEMANAS_INVERNO = 3;
    
    private List<Equipe> equipes;
    private List<Jogo> jogos;
    
    // Construtor
    public ProgramaDaLiga() {
        equipes = new ArrayList<>();
        jogos = new ArrayList<>();
        
        // Inicializa as equipes
        for (int i = 1; i <= NUM_EQUIPES; i++) {
            String nomeEquipe = "Equipe " + i;
            equipes.add(new Equipe(nomeEquipe));
        }
    }
    
    // Método para executar a temporada da liga
    public void executarTemporada() {
        int semanasCongelantes = 0;
        double temperaturaMedia = 0.0;
        double temperaturaMaisQuente = Double.MIN_VALUE;
        
        Scanner scanner = new Scanner(System.in);
        
        while (semanasCongelantes < NUM_SEMANAS_INVERNO) {
            System.out.print("Insira a temperatura da semana: ");
            double temperatura = scanner.nextDouble();
            
            if (temperatura >= TEMPERATURA_CONGELANTE) {
                jogarRodada(temperatura);
                temperaturaMedia += temperatura;
                temperaturaMaisQuente = Math.max(temperaturaMaisQuente, temperatura);
                semanasCongelantes = 0;
            } else {
                semanasCongelantes++;
            }
        }
        
        scanner.close();
        
        // Imprime estatísticas finais
        System.out.println("\nTemporada encerrada!");
        System.out.println("Estatísticas finais das equipes:");
        for (Equipe equipe : equipes) {
            equipe.imprimirEstatisticas();
        }
        
        System.out.println("Estatísticas dos jogos:");
        for (Jogo jogo : jogos) {
            jogo.imprimirEstatisticas();
        }
        
        temperaturaMedia /= jogos.size();
        System.out.printf("Temperatura mais quente da temporada: %.1f °C", temperaturaMaisQuente);
        System.out.println(" ");
        System.out.printf("Temperatura média da temporada: %.1f °C",  temperaturaMedia);
    }
    
    // Método para jogar uma rodada de jogos
    private void jogarRodada(double temperatura) {
    if (temperatura >= TEMPERATURA_CONGELANTE) {
        for (int i = 0; i < NUM_JOGOS_POR_SEMANA; i++) {
            Jogo jogo = gerarJogo(temperatura);
            jogos.add(jogo);
            atualizarEstatisticasEquipes(jogo);
            jogo.imprimirEstatisticas();
        }
    } else {
        System.out.println("Não foi possível marcar jogos devido à temperatura congelante.");
    }
}
    
    // Método para gerar um jogo aleatório
    private Jogo gerarJogo(double temperatura) {
        int equipeCasaIndex;
        int equipeVisitanteIndex;
        
        do {
            equipeCasaIndex = (int) (Math.random() * NUM_EQUIPES);
            equipeVisitanteIndex = (int) (Math.random() * NUM_EQUIPES);
        } while (equipeCasaIndex == equipeVisitanteIndex);
        
        Equipe equipeCasa = equipes.get(equipeCasaIndex);
        Equipe equipeVisitante = equipes.get(equipeVisitanteIndex);
        
        return new Jogo(equipeCasa.getNome(), equipeVisitante.getNome(), temperatura);
    }
    
    // Método para atualizar as estatísticas das equipes após um jogo
    private void atualizarEstatisticasEquipes(Jogo jogo) {
        Equipe equipeCasa = encontrarEquipePorNome(jogo.getEquipeCasa());
        Equipe equipeVisitante = encontrarEquipePorNome(jogo.getEquipeVisitante());
        
        equipeCasa.setGolsMarcados(equipeCasa.getGolsMarcados() + jogo.getGolsEquipeCasa());
        equipeCasa.setGolsSofridos(equipeCasa.getGolsSofridos() + jogo.getGolsEquipeVisitante());
        
        equipeVisitante.setGolsMarcados(equipeVisitante.getGolsMarcados() + jogo.getGolsEquipeVisitante());
        equipeVisitante.setGolsSofridos(equipeVisitante.getGolsSofridos() + jogo.getGolsEquipeCasa());
        
        if (jogo.getGolsEquipeCasa() > jogo.getGolsEquipeVisitante()) {
            equipeCasa.setVitorias(equipeCasa.getVitorias() + 1);
            equipeVisitante.setDerrotas(equipeVisitante.getDerrotas() + 1);
        } else if (jogo.getGolsEquipeCasa() < jogo.getGolsEquipeVisitante()) {
            equipeCasa.setDerrotas(equipeCasa.getDerrotas() + 1);
            equipeVisitante.setVitorias(equipeVisitante.getVitorias() + 1);
        } else {
            equipeCasa.setEmpates(equipeCasa.getEmpates() + 1);
            equipeVisitante.setEmpates(equipeVisitante.getEmpates() + 1);
        }
    }
    
    // Método auxiliar para encontrar uma equipe pelo nome
    private Equipe encontrarEquipePorNome(String nomeEquipe) {
        for (Equipe equipe : equipes) {
            if (equipe.getNome().equals(nomeEquipe)) {
                return equipe;
            }
        }
        return null;
    }
}
