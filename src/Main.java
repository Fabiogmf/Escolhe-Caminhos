import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String voltarAoMenu = "";

        do {
            System.out.println("Seja Bem Vindo a escolha dos caminhos, escolha o melhor caminho para você:");
            System.out.println("A)Caminho da Floresta Sombria");
            System.out.println("B) Caminho da Caverna Misteriosa");
            System.out.println("C) Caminho da Montanha Gelada");
            System.out.println("D) Caminho do Rio Envenenado");
            System.out.println("E) Caminho do Castelo Abandonado");

            String escolha = in.nextLine();

            if (escolha.equalsIgnoreCase("A")) {
                System.out.println("Você entrou na floresta sombria. As árvores aqui são antigas, os galhos parecem sussurrar seu nome. De repente, você ouve um uivo distante. Continue avançando ou voltar?");
            }

            else if (escolha.equalsIgnoreCase("B")) {
                System.out.println("Você adentra uma caverna fria e úmida. O ar é pesado, e o chão escorregadio. Lá no fundo, você avista algo brilhando. É uma armadilha ou um tesouro escondido? O que você fará?");
            }

            else if (escolha.equalsIgnoreCase("C")) {
                System.out.println("O caminho da montanha está coberto de neve espessa. O vento é gelado e você mal consegue enxergar adiante. No horizonte, vê-se uma cabana solitária. Será um refúgio seguro ou uma armadilha?");
            }

            else if (escolha.equalsIgnoreCase("D")) {
                System.out.println("Você encontra um rio de águas escuras e calmas. Peixes estranhos nadam em círculos. Um velho barco está amarrado à margem, mas a corrente parece forte. Atravesse com o barco, ou siga pela margem, sabendo que há perigos escondidos?");
            }

            else if (escolha.equalsIgnoreCase("E")) {
                System.out.println("As grandes portas do castelo estão entreabertas, rangendo com o vento. Lá dentro, as velas estão apagadas, e os corredores estão envoltos em escuridão. Há um sussurro que ecoa pelos salões. Entrar na grande sala ou explorar as masmorras do castelo?");
            }

            else {
                System.out.println("Escolha inválida. Por favor, escolha uma opção entre A e E.");
                continue;
            }

            System.out.println("Deseja voltar ao menu ou continuar? (Digite 'voltar' para voltar ao menu, ou 'continuar' para seguir em frente)");
            voltarAoMenu = in.nextLine();

            if (voltarAoMenu.equalsIgnoreCase("continuar")) {
                System.out.println("Bom caminho!");
                break;
            }

        } while (voltarAoMenu.equalsIgnoreCase("voltar"));

        System.out.println("Obrigado por jogar!");
        in.close();
    }
}