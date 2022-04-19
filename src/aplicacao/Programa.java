package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Empregado;
import entities.EmpregadoTerceirizado;

public class Programa {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Empregado> list = new ArrayList<>();

		System.out.print("Entre com o número de trabalhadores: ");
		int N = sc.nextInt();

		for (int i = 1; i <= N; i++) {
			System.out.println("Funcionário #" + i);
			System.out.print("Terceirizado? (s/n) ");
			char ch = sc.next().charAt(0);
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Quantidade de horas: ");
			int horas = sc.nextInt();
			System.out.print("Valor por hora: ");
			double valorHoras = sc.nextDouble();
			if (ch == 's') {
				System.out.print("Despesa adicional: ");
				double addDespAdicional = sc.nextDouble();
				list.add(new EmpregadoTerceirizado(nome, horas, valorHoras, addDespAdicional));
			} else {
				list.add(new Empregado(nome, horas, valorHoras));
			}
		}

		System.out.println();
		System.out.println("Pagamentos: ");
		for (Empregado emp : list) {
			System.out.println(emp.getNome() + " - $ " + String.format("%.2f", emp.pagamento()));
		}

		sc.close();
	}

}
