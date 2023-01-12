import java.time.LocalDate;

public class Jogador {
    private String nome;
    private String nascionalidade;
    private String posicao;
    private double altura;
    private LocalDate anoNascimento;
    private double peso;

    public Jogador(String nome, String nascionalidade, String posicao, double altura,
            int i, double peso) {
        this.nome = nome;
        this.nascionalidade = nascionalidade;
        this.posicao = posicao;
        this.anoNascimento = anoNascimento;
        this.altura = altura;
        this.peso = peso;
    }

    public int calcularIdade() {
        LocalDate hoje = LocalDate.now();
        return (int) hoje.getYear() - this.anoNascimento.getYear();

    }

    public boolean imprimirDadosJogador() {
        System.out.println("Nome do jogdor: " + this.getNome());
        System.out.println("Nascionalidade do jogador " + this.getNascionalidade());
        System.out.println("Posição do Jogador: " + this.getPosicao());
        System.out.println("Data de nascimento do jogador " + this.getAnoNascimento());
        System.out.println("Altura do Jogador " + this.getAltura());
        System.out.println("Peso do Jogador " + this.getPeso());
        return false;

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

    public LocalDate getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(LocalDate anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

}
