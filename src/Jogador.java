import java.time.LocalDate;
import java.time.Period;

public class Jogador {
    private String nome;
    private String nascionalidade;
    private String posicao;
    private double altura;
    private LocalDate nascimento;
    private double peso;

    public Jogador(String nome, String nascionalidade, String posicao, double altura,
            LocalDate nascimento, double peso) {
        this.nome = nome;
        this.nascionalidade = nascionalidade;
        this.posicao = posicao;
        this.altura = altura;
        this.nascimento = nascimento;
        this.peso = peso;
    }

    public int calcularIdade() {

        LocalDate agora = LocalDate.now();
        return (int) agora.getYear() - nascimento.getYear();

    }

    public void imprimirDados() {
        System.out.println("Nome do jogdor: " + this.getNome());
        System.out.println("Nascionalidade do jogador: " + this.getNascionalidade());
        System.out.println("Idade:" + this.calcularIdade());
        System.out.println("Posição do Jogador: " + this.getPosicao());
        System.out.println("Data de nascimento do jogador: " + this.getNascimento());
        System.out.println("Altura do Jogador: " + this.getAltura());
        System.out.println("Peso do Jogador: " + this.getPeso());

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNascionalidade() {
        return this.nascionalidade;
    }

    public void setNascionalidade(String nascionalidade) {
        this.nascionalidade = nascionalidade;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public LocalDate getNascimento() {
        return nascimento;
    }

    public void setNascimento(LocalDate nascimento) {
        this.nascimento = nascimento;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

}
