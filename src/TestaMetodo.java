import java.util.Date;
// Date hoje = new Date();
// System.out.println(hoje);

public class TestaMetodo {
    // private static Long calcularIdade;

    public static void main(String[] args) {

        Jogador pessoa = new Jogador(null, null, null, null, 0, 0);
        Jogador calculaIdade = new Jogador(null, null, null, null, 0, 0);
        pessoa.imprimirDadosJogador();
        pessoa.calcularIdade();
    }
}
