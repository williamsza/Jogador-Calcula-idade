
public class TestaMetodo {

    public static void main(String[] args) {

        Jogador pessoa = new Jogador("William", "Brasil", "meia", 1.74, 1981, 90);
        

        pessoa.calcularIdade();
        pessoa.imprimirDadosJogador();

        System.out.print(pessoa.imprimirDadosJogador());
        System.out.println(pessoa.calcularIdade());
    }
}
