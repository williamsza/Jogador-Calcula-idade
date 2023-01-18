
import java.time.LocalDate;
//import java.util.Date;

public class TestaMetodo {

	public static void main(String[] args) {
		Jogador pele = new Jogador("Pelé", "Brasileira", 1.73, LocalDate.of(2000, 02, 05), 1.60,
				LocalDate.of(2000, 02, 05), null, null, 60);
		Jogador romario = new Jogador("Romario", "Brasileira", 1.65, LocalDate.of(2005, 02, 10), 1.65,
				LocalDate.of(2005, 02, 10), null, null, 70);
		Jogador ronaldo = new Jogador("Ronaldo", "Brasileira", 1.75, LocalDate.of(1995, 02, 15), 1.75,
				LocalDate.of(1995, 02, 15), null, null, 90);

		pele.imprimirDados();
		pele.calcularIdade();
		pele.calcularAposentadoria();
		romario.imprimirDados();
		romario.calcularIdade();
		romario.calcularAposentadoria();

		ronaldo.imprimirDados();
		ronaldo.calcularIdade();
		ronaldo.calcularAposentadoria();

	}

}

/*
 * pele.setNome("Pele");
 * pele.setNascionalidade("Brasileira");
 * pele.setAltura(1.73);
 * pele.setPosicao(0);
 * pele.setNascimento(LocalDate.of(2000, 02, 10));
 * pele.setAltura(1.73);
 * pele.setPeso(90);
 * pele.setCalculaAposentdoria();
 */
/*
 * romario.setNome("Romario");
 * romario.setNascionalidade("Brasileira");
 * romario.setAltura(1.73);
 * romario.setPosicao(0);
 * romario.setNascimento(LocalDate.of(2001, 03, 11));
 * romario.setAltura(1.73);
 * romario.setPeso(90);
 * romario.setCalculaAposentdoria();
 */
/*
 * ronaldo.setNome("Ronaldo");
 * ronaldo.setNascionalidade("Brasileira");
 * ronaldo.setAltura(1.65);
 * ronaldo.setPosicao(0);
 * ronaldo.setNascimento(LocalDate.of(2010, 04, 10));
 * ronaldo.setAltura(1.65);
 * ronaldo.setPeso(91);
 * ronaldo.setCalculaAposentdoria();
 * 
 */