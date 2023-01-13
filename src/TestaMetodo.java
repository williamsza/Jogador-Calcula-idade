
import java.time.LocalDate;
import java.util.Date;

public class TestaMetodo {

	public static void main(String[] args) {

		Jogador pessoa = new Jogador("William", "Brasileira", "meia", 1.74, LocalDate.of(1981, 7, 28), 90);

		System.out.println(pessoa.calcularIdade());

		//pessoa.imprimirDados();
		pessoa.calcularIdade();

	}
}
