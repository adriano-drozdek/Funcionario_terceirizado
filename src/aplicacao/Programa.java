package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Empregado;

public class Programa {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Empregado> list = new ArrayList<>();

		System.out.println("Entre com o número de trabalhadores");
		int N = sc.nextInt();

		for (int i = 1; i <= N; i++) {
			System.out.println("Funcionário #" + i);
			System.out.println("Terceirizado? (S/N) ");
			char ch = sc.next().charAt(0);
			System.out.println("Nome");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.println("Quantidade de horas: ");
			int horas = sc.nextInt();
			System.out.println("Valor por hora: ");
			double valorHoras = sc.nextDouble();

		}
		sc.close();
	}

}
