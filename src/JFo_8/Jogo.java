package JFo_8;

import java.util.Random;

public class Jogo {
    private static int proximoNumeroJogo = 1;
    private String equipeCasa;
    private String equipeVisitante;
    private int golsEquipeCasa;
    private int golsEquipeVisitante;
    private double temperatura;
    
    // Construtor
    public Jogo(String equipeCasa, String equipeVisitante, double temperatura) {
        this.equipeCasa = equipeCasa;
        this.equipeVisitante = equipeVisitante;
        this.temperatura = temperatura;
        
        // Gera o resultado aleatório do jogo com base na temperatura
        golsEquipeCasa = gerarGolsAleatorios(temperatura);
        golsEquipeVisitante = gerarGolsAleatorios(temperatura);
    }
    
    // Método privado para gerar o número de gols aleatórios com base na temperatura
    private int gerarGolsAleatorios(double temperatura) {
        Random random = new Random();
        int maxGols;
        
        if (temperatura >= 30.0) {
            maxGols = random.nextInt(6) + 1; // De 1 a 6 gols possíveis
        } else if (temperatura >= 20.0) {
            maxGols = random.nextInt(4) + 1; // De 1 a 4 gols possíveis
        } else {
            maxGols = random.nextInt(2) + 1; // De 1 a 2 gols possíveis
        }
        
        return random.nextInt(maxGols + 1);
    }
    
    // Getters
    public String getEquipeCasa() {
        return equipeCasa;
    }
    
    public String getEquipeVisitante() {
        return equipeVisitante;
    }
    
    public int getGolsEquipeCasa() {
        return golsEquipeCasa;
    }
    
    public int getGolsEquipeVisitante() {
        return golsEquipeVisitante;
    }
    
    public double getTemperatura() {
        return temperatura;
    }
    
    // Método para imprimir estatísticas do jogo
    public void imprimirEstatisticas() {
        System.out.println("Jogo #" + proximoNumeroJogo);
        System.out.println(equipeCasa + " " + golsEquipeCasa + " - " + golsEquipeVisitante + " " + equipeVisitante);
        System.out.println("Temperatura: " + temperatura + "°C");
        System.out.println();
        
        proximoNumeroJogo++;
    }
}

