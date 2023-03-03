package br.com.fatecararas;

import br.com.fatecararas.domain.Algoritmo;
import br.com.fatecararas.domain.Jokenpo;
import br.com.fatecararas.domain.Papel;
import br.com.fatecararas.domain.Tipo;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        var jokenpo = new Jokenpo();

        System.out.println("Escolha uma das opções [ 1-PAPEL, 2-TESOURA, 3-PEDRA, LAGARTO-LAGARTO, 5-SPOCK ]\n");
        int jogada = in.nextInt();
        int computador = new Random().nextInt(5) + 1;
        System.out.println("O COMPUTADOR escolheu: " + Tipo.getInstance(computador));

        //TODO: Implementar regra para criação do tipo om base na classe Algoritmo
        var algoritmo = getAlgoritmo(jogada);

        jokenpo.setAlgoritmo(algoritmo);
        Tipo tipoJogadaComputador = Tipo.getInstance(computador);

        jokenpo.jogar(tipoJogadaComputador);

        in.close();

    }
    private static Algoritmo getAlgoritmo(Integer pId) {
        Algoritmo algoritmo = null;
        switch (pId) {
            case 1 -> algoritmo = new Papel();
            //TODO: Implementar os demais algoritmos
            default -> throw new IllegalStateException("Unexpected value: " + pId);
        }
        return null;
    }
}