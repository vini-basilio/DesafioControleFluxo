import java.util.Scanner;

import edu.dio.utils.ParametrosInvalidosException;

public class Contador {
	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);

		System.out.println("Digite o primeiro parâmetro");

		int parametroUm = terminal.nextInt();

		System.out.println("Digite o segundo parâmetro");

		int parametroDois = terminal.nextInt();

		try {

			contar(parametroUm, parametroDois);

		} catch (ParametrosInvalidosException exception) {

			System.err.println(exception.getMessage());
		}

		terminal.close();
	}

	static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {

		if (parametroUm > parametroDois) {
			throw new ParametrosInvalidosException(null, "O segundo parâmetro deve ser maior que o primeiro");
		} else if (parametroUm == parametroDois) {
			System.out.println("Ambos valores são iguais!");
		} else {
			int contagem = parametroDois - parametroUm;

			for (int i = 1; i <= contagem; i++) {
				System.out.println("Imprimindo o número " + i);
			}
		}

	}
}
