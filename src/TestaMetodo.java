
public class TestaMetodo {

    public static void main(String[] args) {

        Jogador pessoa = new Jogador("William", "Brasil", "meai", 1.74, 90, null);
        pessoa.calcularIdade();
        pessoa.imprimirDadosJogador();

        System.out.println();
    }
}
