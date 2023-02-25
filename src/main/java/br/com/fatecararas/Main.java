package br.com.fatecararas;

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
//        int jogada = in.nextInt();
        int computador = new Random().nextInt(5) + 1;
        System.out.println("O COMPUTADOR escolheu: " + Tipo.getInstance(computador));

        //TODO: Implementar regra para criação do tipo om base na classe Algoritmo
        var papel = new Papel();

        jokenpo.setAlgoritmo(papel);
        Tipo tipoJogadaComputador = Tipo.getInstance(computador);

        jokenpo.jogar(tipoJogadaComputador);

        in.close();

    }
}