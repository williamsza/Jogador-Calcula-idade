import java.util.Date;

public class Jogador {
    private String nome;
    private String nascionalidade;
    private String posicao;
    private Date anoNascimento;
    private double altura;
    private double peso;
    private Long calculaIdade;

    Jogador(String nome, String nascionalidade, String posicao, Date anoNascimento, double altura,
            double peso) {
        this.nome = nome;
        this.nascionalidade = nascionalidade;
        this.posicao = posicao;
        this.anoNascimento = anoNascimento;
        this.altura = altura;
        this.peso = peso;
    }

    public void imprimirDadosJogador() {
        System.out.println("Nome do jogdor: " + this.getNome());
        System.out.println("Nascionalidade do jogador" + this.getNascionalidade());
        System.out.println("Posição do Jogador: " + this.getPosicao());
        System.out.println("Data de nascimento do jogador" + anoNascimento);

        System.out.println("Altura do Jogador" + this.getAltura());
        System.out.println("Peso do Jogador" + this.getPeso());

    }

    Date hoje = new Date();

    public Long calcularIdade() {
        return this.hoje.getTime() - this.anoNascimento.getTime();

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

    public void setAnoNascimento(Date anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

}
