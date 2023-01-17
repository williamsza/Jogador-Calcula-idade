
import java.time.LocalDate;

public class Jogador {
    private String nome;
    private String nascionalidade;
    private double altura;
    private LocalDate nascimento;
    private double peso;
    private LocalDate defesa;
    private LocalDate meioCampo;
    private LocalDate atacante;
    private int posicao;

    public Jogador(
            String nome, String nascionalidade, int posicao, double altura, LocalDate nascimento, double peso) {
        this.nome = nome;
        this.nascionalidade = nascionalidade;
        this.altura = altura;
        this.nascimento = nascimento;
        this.peso = peso;
        this.defesa = defesa;
        this.meioCampo = meioCampo;
        this.atacante = atacante;
        this.posicao = posicao;
    }

    public int calcularIdade() {
        LocalDate agora = LocalDate.now();
        return (int) agora.getYear() - nascimento.getYear();
    }

    public int calcularAposentadoria() {

        if (posicao == defesa.getYear()) {
            LocalDate agora = LocalDate.now();
            LocalDate posicao = LocalDate.now();
            posicao = defesa.withYear(40);
            return (int) agora.getYear() - nascimento.getYear() - posicao.getYear();

        } else if (posicao == meioCampo.getYear()) {
            LocalDate agora = LocalDate.now();
            LocalDate posicao = LocalDate.now();
            posicao = meioCampo.withYear(38);
            return (int) agora.getYear() - nascimento.getYear() - posicao.getYear();

        } else if (posicao == atacante.getYear()) {
            LocalDate agora = LocalDate.now();
            LocalDate posicao = LocalDate.now();
            posicao = atacante.withYear(35);
            return (int) agora.getYear() - nascimento.getYear() - posicao.getYear();

        } else {

            System.out.println("Informação indisponivel");

        }
        return calcularAposentadoria();

    }

    public void imprimirDados() {
        System.out.println("Nome do jogdor: " + this.getNome());
        System.out.println("Nascionalidade do jogador: " + this.getNascionalidade());
        System.out.println("Idade:" + this.calcularIdade());
        System.out.println("Posição do Jogador: " + this.getPosicao());
        System.out.println("Data de nascimento do jogador: " + this.getNascionalidade());
        System.out.println("Altura do Jogador: " + this.getAltura());
        System.out.println("Peso do Jogador: " + this.getPeso());
        System.out.println("Defesa: " + this.getDefesa());
        System.out.println("Meio campo: " + this.getMeioCampo());
        System.out.println("Atacante: " + this.getAtacante());

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

    public LocalDate getDefesa() {
        return defesa;
    }

    public void setDefesa(LocalDate defesa) {
        this.defesa = defesa;
    }

    public LocalDate getMeioCampo() {
        return meioCampo;
    }

    public void setMeioCampo(LocalDate meioCampo) {
        this.meioCampo = meioCampo;
    }

    public LocalDate getAtacante() {
        return atacante;
    }

    public void setAtacante(LocalDate atacante) {
        this.atacante = atacante;
    }

    public int getPosicao() {
        return posicao;
    }

    public void setPosicao(int posicao) {
        this.posicao = posicao;
    }

    public void setCalculaAposentdoria() {
    }
}
