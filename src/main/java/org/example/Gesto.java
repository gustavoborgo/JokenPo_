package org.example;
import java.util.Set;
import java.util.EnumSet;


public enum Gesto {
    PEDRA,
    PAPEL,
    TESOURA,
    LAGARTO,
    SPOCK;

    private Set<Gesto> venceDe;

    static {
        PEDRA.venceDe   = EnumSet.of(TESOURA, LAGARTO); // PEDRA vence TESOURA e LAGARTO
        PAPEL.venceDe   = EnumSet.of(PEDRA, SPOCK);     // PAPEL vence PEDRA e SPOCK
        TESOURA.venceDe = EnumSet.of(PAPEL, LAGARTO);    // TESOURA vence PAPEL e LAGARTO
        LAGARTO.venceDe = EnumSet.of(SPOCK, PAPEL);      // LAGARTO vence SPOCK e PAPEL
        SPOCK.venceDe   = EnumSet.of(TESOURA, PEDRA);    // SPOCK vence TESOURA e PEDRA
    }

    public Resultado jogarContra(Gesto outro) {
        if (this == outro) return Resultado.EMPATE;
        else if (venceDe.contains(outro)) return Resultado.VENCEU;
        else return Resultado.PERDEU;
    }
}