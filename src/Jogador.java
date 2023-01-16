
import java.time.LocalDate;

public class Jogador {
    private String nome;
    private String nascionalidade;
    private String posicao;
    private double altura;
    private LocalDate nascimento;
    private double peso;
    private LocalDate defesa;
    private LocalDate meioCampo;
    private LocalDate atacante;

    public Jogador(
            String nome,
            String nascionalidade, String posicao, double altura,
            LocalDate nascimento, double peso, LocalDate defesa, LocalDate meioCampo, LocalDate atacante) {
        this.nome = nome;
        this.nascionalidade = nascionalidade;
        this.posicao = posicao;
        this.altura = altura;
        this.nascimento = nascimento;
        this.peso = peso;
        this.defesa = defesa;
        this.meioCampo = meioCampo;
        this.atacante = atacante;
    }

    public int calcularIdade() {
        LocalDate agora = LocalDate.now();
        return (int) agora.getYear() - nascimento.getYear();
    }

    public int calcularAposentadoria(LocalDate agora, LocalDate posicaoDefesa, LocalDate posicaoMeioCampo,
            LocalDate posicaoAtacante,
            String string, LocalDate localDate) {

        // LocalDate posicaoMeioCampo = LocalDate.now();
        // LocalDate posicaoAtacante= LocalDate.now();
        // LocalDate posicaoDefesa = LocalDate.now();

        if (posicaoDefesa.getYear() == posicaoDefesa.getYear()) {
            posicaoDefesa.withYear(40);
            return (int) agora.getYear() - nascimento.getYear() - defesa.getYear();

        } else if (posicaoMeioCampo.getYear() == meioCampo.getYear()) {
            posicaoMeioCampo.withYear(38);
            return (int) agora.getYear() - nascimento.getYear() - meioCampo.getYear();

        } else if (posicaoAtacante.getYear() == atacante.getYear()) {
            posicaoMeioCampo.withYear(35);
            return (int) agora.getYear() - nascimento.getYear() - atacante.getYear();

        } else {

        }
        System.out.println("Informação indisponivel");
        return 0;

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

    public void setNascimento(LocalDate of) {
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

    public void setDefesa(LocalDate volante) {
        this.defesa = volante;
    }

    public LocalDate getMeioCampo() {
        return meioCampo;
    }

    public void setMeioCampo(LocalDate sentravante) {
        this.meioCampo = sentravante;
    }

    public LocalDate getAtacante() {
        return atacante;
    }

    public void setAtacante(LocalDate atacante) {
        this.atacante = atacante;
    }

}
