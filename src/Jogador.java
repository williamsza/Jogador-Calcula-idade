
import java.time.LocalDate;

public class Jogador {

    private String nome;
    private String nascionalidade;
    private double altura;
    private LocalDate nascimento;
    private double peso;
    private  String posicao;
   

    public Jogador(
            String nome,
            String nascionalidade,
            double altura,
            LocalDate nascimento,
            double peso,
            String posicao
) {
        this.nome = nome;
        this.nascionalidade = nascionalidade;
        this.altura = altura;
        this.nascimento = nascimento;
        this.peso = peso;
        this.posicao = posicao;

    }

    public void imprimirDados() {
        System.out.println("Nome do jogdor: " + this.getNome());
        System.out.println("Nascionalidade do jogador: " + this.getNascionalidade());
        System.out.println("Idade:" + this.calcularIdade());
        System.out.println("Aposentadoria:" + this.calcularAposentadoria());
        System.out.println("Posição do Jogador: " + this.getPeso());
        System.out.println("Data de nascimento do jogador: " + this.getNascionalidade());
        System.out.println("Altura do Jogador: " + this.getAltura());
        System.out.println("Peso do Jogador: " + this.getPeso());
        System.out.println("Posição: " + this.getPeso());

    }

    public int calcularIdade() {
        LocalDate agora = LocalDate.now();
        return (int) agora.getYear() - nascimento.getYear();
    }

    public int calcularAposentadoria() {
        int aposentadoriaDefesa = 40;
        int aposentadoriaMeioCampo = 38;
        int aposentadoriaAtaque = 35;
        if (posicao == "defesa") {
            return aposentadoriaDefesa - calcularIdade();

        } else if (posicao == "meioCampo") {
            return aposentadoriaMeioCampo - calcularIdade();

        } else if (posicao == "atacante") {
            return aposentadoriaAtaque - calcularIdade();

        }
        return 0;

    }

    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNascionalidade() {
        return nascionalidade;
    }

    public void setNascionalidade(String nascionalidade) {
        this.nascionalidade = nascionalidade;
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

    public LocalDate getDefesa(LocalDate defesa) {
        return defesa;
    }

}
