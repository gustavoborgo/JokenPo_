package org.example;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha seu gesto (PEDRA, PAPEL, TESOURA, LAGARTO, SPOCK):");
        Gesto jogador1 = lerGesto(scanner);

        System.out.println("Escolha o gesto do oponente (PEDRA, PAPEL, TESOURA, LAGARTO, SPOCK):");
        Gesto jogador2 = lerGesto(scanner);

        Resultado resultado = jogador1.jogarContra(jogador2);

        System.out.println("\nJogador 1 escolheu: " + jogador1);
        System.out.println("Jogador 2 escolheu: " + jogador2);
        System.out.println("Resultado: Jogador 1 " + resultado);
    }

    private static Gesto lerGesto(Scanner scanner) {
        while (true) {
            String entrada = scanner.nextLine().trim().toUpperCase();
            try {
                return Gesto.valueOf(entrada);
            } catch (IllegalArgumentException e) {
                System.out.println("Gesto inválido. Tente novamente:");
            }
        }
    }
}
