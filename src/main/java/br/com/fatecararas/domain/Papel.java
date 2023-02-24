package br.com.fatecararas.domain;

public class Papel extends Algoritmo{

    @Override
    void executar(Tipo pTipo) {
        switch (pTipo) {

            case PEDRA:
            case SPOCK:
                System.out.println("Ganhou!");
                break;
            case TESOURA:
            case LAGARTO:
                System.out.println("Perdeu!");
                break;
            default:
                System.out.println("Empatou!");


//            case PAPEL:
//                System.out.println("Empate. Papel empata com papel!");
//                break;
//            case TESOURA:
//                System.out.println("Perdeu! Tesoura corta o papel!");
//                break;
//            case PEDRA:
//                System.out.println("Ganhou! Pedra embrulha o papel!");
//                break;
//            case LAGARTO:
//                System.out.println("Perdeu! Lagarto come o papel!");
//                break;
//            case SPOCK:
//                System.out.println("Ganhou! Papel refuta o Spock!");
//            default:
//                System.out.println("Opção inválida!");
        }
    }
}
