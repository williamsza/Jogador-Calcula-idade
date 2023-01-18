
import java.time.LocalDate;

public class TestaMetodo {

	public static void main(String[] args) {
		Jogador pele = new Jogador("Pelé", "Brasileira", 1.70, LocalDate.of(2000, 02, 05), 60, "defesa");
		Jogador romario = new Jogador("Romario", "Brasileira", 1.65, LocalDate.of(2005, 02, 10), 65, "meioCampo");
		Jogador ronaldo = new Jogador("Ronaldo", "Brasileira", 1.75, LocalDate.of(1995, 02, 15), 75, "atacante");

		pele.imprimirDados();
		pele.calcularIdade();
		pele.calcularAposentadoria();

		System.out.println("-----------------------------------");

		romario.imprimirDados();
		romario.calcularIdade();
		romario.calcularAposentadoria();

		System.out.println("-----------------------------------");

		ronaldo.imprimirDados();
		ronaldo.calcularIdade();
		ronaldo.calcularAposentadoria();

	}

}

