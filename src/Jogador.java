public class Jogador {
    String nome;
    String nascionalidade;
    String posicao;
    int dataDeNascimento;
    double altura;
    double peso;

    Jogador(String nome, String nascionalidade, String posicao, int dataDeNascimento, double altura, double peso) {
        this.nome = nome;
        this.nascionalidade = nascionalidade;
        this.posicao = posicao;
        this.dataDeNascimento = dataDeNascimento;
        this.altura = altura;
        this.peso = peso;
    }

    public void imprimirDados() {
        System.out.println("Nome do jogdor: " + getNome());
        System.out.println("Nascionalidade do jogador" + getNascionalidade());
        System.out.println("Posição do Jogador: " + getPosicao());
        System.out.println("Data de nascimento do jogador" + getDataDeNascimento());
        System.out.println("Altura do Jogador" + getAltura());
        System.out.println("Peso do Jogador" + getPeso());

    }

    public void calcularIdade() {

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

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public int getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(int dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
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
