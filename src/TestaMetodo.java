
import java.time.LocalDate;
import java.util.Date;

public class TestaMetodo {

	public static void main(String[] args) {
		Jogador pele = new Jogador("Pelé", "Brasileira", "atacante", 1.70, LocalDate.of(0, 0, 0), 0, null, null, null);
		Jogador romario = new Jogador("Romario", "Brasileira", "meioCampo", 1.65, LocalDate.of(1966, 01, 29), 70, null, null, null);
		Jogador zico = new Jogador("Romario", "Brasileira", "defesa", 1.65, LocalDate.of(1966, 01, 29), 70, null,null, null);

		pele.setNome("Pele");
		pele.setNascionalidade("Brasileira");
		pele.setAltura(1.73);
		pele.setPosicao("Atacante");
		pele.setNascimento(LocalDate.of(0, 0, 0));
		pele.setAltura(1.73);
		pele.setPeso(90);

		romario.setNome("Romario");
		romario.setNascionalidade("Brasileira");
		romario.setAltura(1.73);
		romario.setPosicao("meioCanpo");
		romario.setNascimento(LocalDate.of(0, 0, 0));
		romario.setAltura(1.73);
		romario.setPeso(90);

		zico.setNome("Zico");
		zico.setNascionalidade("Brasileira");
		zico.setAltura(1.65);
		zico.setPosicao("defesa");
		zico.setNascimento(LocalDate.of(0, 0, 0));
		zico.setAltura(1.65);
		zico.setPeso(91);

		pele.calcularIdade();
		pele.calcularAposentadoria(null, null, null, null, null, null);

		System.out.println(pele.calcularIdade());

	}

}
