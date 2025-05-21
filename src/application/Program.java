package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the size of the array: ");
		int size = sc.nextInt();

		System.out.println("Enter the Heights: ");

		double[] variable = new double[size]; // array Tipo Primitivo
		for (int i = 0; i < variable.length; i++) {
			variable[i] = sc.nextDouble();
		}

		double average = 0.0;
		for (double height : variable) {
			average += height / variable.length;
		}
		System.out.printf("AVERAGE HEIGHT = %.2f", average);

		sc.close();

	}

}
/*     >>>>>     **array de tipo primitivo de estrutura de dados**     <<<<<

### Explicação:

Na linha:

double[] variable = new double[size];

 * `double[]` é a **sintaxe de declaração de um array primitivo em Java**.
 * Isso cria um **array de valores do tipo primitivo `double`**, com tamanho definido pela variável `size`.
 * 	O array é acessado por índice (`variable[i]`), e tem um campo `.length` que indica seu tamanho.

---

| Termo               | Significado                                                             |
| ------------------- | ----------------------------------------------------------------------- |
| `array` (minúsculo) | Estrutura de dados nativa da linguagem Java (ex: `double[]`, `int[]`)   |

---

*/