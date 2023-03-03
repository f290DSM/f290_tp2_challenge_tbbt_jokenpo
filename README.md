# Desafio JoKenPo The Big Bang Theory

![](https://i.imgur.com/p9MPH.png)

Para este desafio vocês deverão utilizar os conhecimentos adquiridos para resolver da melhor forma possivel uma partida de Jokenpo com a variação que contenha o Lagarto e Spock, conforme a ilustração acima.

Utilizem a linguagem de sua preferencia e o paradigma de programação ao qual esteja mais confortável.

## Segunda resolução com Paradigma Estruturado

Nesta resolução removemos as constantes e as substiuimos por `Enums` para facilitar a legibilidade do código.

```java
package br.com.fatecararas;

// Import estatico do enum Tipo para diminuirmos um nivel da chamada do Enum

import static br.com.fatecararas.domain.Tipo.*;

import java.util.Random;
import java.util.Scanner;

public class Main {

    // Remoção dos atributos estáticos da classe Main para reuso nas classes isoladas da branch versao-4
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Escolha uma das opções [ 1-PAPEL, 2-TESOURA, 3-PEDRA, 4-LAGARTO, 5-SPOCK ]\n");
        int jogada = in.nextInt();
        int computador = new Random().nextInt(5) + 1;
        System.out.println("O COMPUTADOR escolheu: " + computador);

        /*
          Estamos utilizando os enums para facilitar a leitura e o gerenciamento dos numeros das jogadas.
          O Enum nos possibilita utilizar valores adicionais, como no trecho abaixo, estamos utilizando
          o identificador do Enum e um valor para o ID que representa uma jogada.
         */
        if (jogada == PAPEL.getId() && computador == PAPEL.getId()) {
            System.out.println("Empate. PAPEL.getId()empata com papel!");
        } else if (jogada == PAPEL.getId() && computador == TESOURA.getId()) {
            System.out.println("Perdeu! Tesoura corta o papel!");
        } else if (jogada == PAPEL.getId() && computador == PEDRA.getId()) {
            System.out.println("Ganhou! Pedra embrulha o papel!");
        } else if (jogada == PAPEL.getId() && computador == LAGARTO.getId()) {
            System.out.println("Perdeu! Lagarto come o papel!");
        } else if (jogada == PAPEL.getId()) {
            System.out.println("Ganhou! PAPEL.getId()refuta o Spock!");
        } else if (jogada == TESOURA.getId() && computador == PAPEL.getId()) {
            System.out.println("Ganhou. Tesoura corta o papel!");
        } else if (jogada == TESOURA.getId() && computador == TESOURA.getId()) {
            System.out.println("Empate! Tesoura empata com tesoura!");
        } else if (jogada == TESOURA.getId() && computador == PEDRA.getId()) {
            System.out.println("Perdeu! Pedra quebra a tesoura!");
        } else if (jogada == TESOURA.getId() && computador == LAGARTO.getId()) {
            System.out.println("Ganhou! Tesoura decapta o lagarto!");
        } else if (jogada == TESOURA.getId()) {
            System.out.println("Perdeu! Spock derrete a tesoura!");
        } else if (jogada == PEDRA.getId() && computador == PAPEL.getId()) {
            System.out.println("Perdeu. Papel embrulha a pedar!");
        } else if (jogada == PEDRA.getId() && computador == TESOURA.getId()) {
            System.out.println("Empate! Tesoura empata com tesoura!");
        } else if (jogada == PEDRA.getId() && computador == PEDRA.getId()) {
            System.out.println("Empatou! Pedra empata com pedra!");
        } else if (jogada == PEDRA.getId() && computador == LAGARTO.getId()) {
            System.out.println("Ganhou! Pedra esmaga o lagarto!");
        } else if (jogada == PEDRA.getId()) {
            System.out.println("Perdeu! Spock vaporiza a apedra!");
        } else if (jogada == LAGARTO.getId() && computador == PAPEL.getId()) {
            System.out.println("Ganhou. Lagarto come papel!");
        } else if (jogada == LAGARTO.getId() && computador == TESOURA.getId()) {
            System.out.println("Perdeu! Tesoura decapta o lagarto!");
        } else if (jogada == LAGARTO.getId() && computador == PEDRA.getId()) {
            System.out.println("Perdeu! Pedra esmaga lagarto!");
        } else if (jogada == LAGARTO.getId() && computador == LAGARTO.getId()) {
            System.out.println("Empatou! Lagarto empata com lagarto!");
        } else if (jogada == LAGARTO.getId()) {
            System.out.println("Ganhou! Lagarto envenena o Spock!");
        } else if (jogada == SPOCK.getId() && computador == PAPEL.getId()) {
            System.out.println("Perdeu. Papel refuta Spock!");
        } else if (jogada == SPOCK.getId() && computador == TESOURA.getId()) {
            System.out.println("Ganhou! Spock derrete a tesoura!");
        } else if (jogada == SPOCK.getId() && computador == PEDRA.getId()) {
            System.out.println("Ganhou! Spock vaporiza a pedra!");
        } else if (jogada == SPOCK.getId() && computador == LAGARTO.getId()) {
            System.out.println("Perdeu! Lagarto envenena Spock!");
        } else if (jogada == SPOCK.getId()) {
            System.out.println("Empatou! Spock empata com Spock!");
        }

        in.close();

    }
}
```