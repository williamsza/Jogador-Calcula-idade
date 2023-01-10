import java.util.Scanner;

public class TestaMetodo {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        System.out.println("Hello, players!");
        final Jogador jogador = new Jogador(null, null, null, null, 0, 0);

        System.out.println("Escreva o nome do jogador: ");
        String nomeJogador = in.nextLine();
        System.out.println("Digite a data do seu nascimento");
        int anoNascimento = in.nextInt();
        System.out.println("Digite a posição do jogador");
        int posicaoJogador = in.nextInt();
        System.out.println("1- Atacante:");
        System.out.println("2- Zageiro");
        System.out.println("3- Lateral");
        

    }
}

