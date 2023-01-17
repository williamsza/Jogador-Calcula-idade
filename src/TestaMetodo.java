
import java.time.LocalDate;
//import java.util.Date;

public class TestaMetodo {

	public static void main(String[] args) {
		Jogador pele = new Jogador("Pelé", "Brasileira", 0, 1.73, LocalDate.of(2000, 02, 10), 90);
		Jogador romario = new Jogador("Romario", "Brasileira", 0, 1.73, LocalDate.of(2000, 02, 10), 90);
		Jogador ronaldo = new Jogador("Ronaldo", "Brasileira", 0, 1.73, LocalDate.of(2000, 02, 10), 90);
		

		pele.setNome("Pele");
		pele.setNascionalidade("Brasileira");
		pele.setAltura(1.73);
		pele.setPosicao(0);
		pele.setNascimento(LocalDate.of(2000, 02, 10));
		pele.setAltura(1.73);
		pele.setPeso(90);

		romario.setNome("Romario");
		romario.setNascionalidade("Brasileira");
		romario.setAltura(1.73);
		romario.setPosicao(0);
		romario.setNascimento(LocalDate.of(2001, 02, 11));
		romario.setAltura(1.73);
		romario.setPeso(90);

		ronaldo.setNome("Ronaldo");
		ronaldo.setNascionalidade("Brasileira");
		ronaldo.setAltura(1.65);
		ronaldo.setPosicao(0);
		ronaldo.setNascimento(LocalDate.of(2010, 02, 10));
		ronaldo.setAltura(1.65);
		ronaldo.setPeso(91);

		
		

		System.out.println(pele.calcularIdade());
		System.out.println(romario.calcularIdade());
		System.out.println(ronaldo.calcularIdade());

		System.out.println(pele.calcularAposentadoria());
		System.out.println(romario.calcularAposentadoria());
		System.out.println(ronaldo.calcularAposentadoria());

	}

}
