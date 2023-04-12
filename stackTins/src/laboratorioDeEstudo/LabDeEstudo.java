package laboratorioDeEstudo;

import java.util.Arrays;
import java.util.Scanner;

import unitins.ArrayTins;
import unitins.StackTins;

public class LabDeEstudo {

	static void bubleSorte(int[] array) {

		int aux = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length - i - 1; j++) {
				if (array[j] > array[j + 1]) {
					aux = array[j];
					array[j] = array[j + 1];
					array[j + 1] = aux;
				}
			}
		}
		imprimirArray(array);
	}

	static void imprimirArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i] + " ");
		}
		System.out.println();
	}

	static long calculaTermoRecursivoFibonacci(int posicao) {

		if (posicao == 1 || posicao == 2) {
			return posicao = 1;
		}
		return calculaTermoRecursivoFibonacci(posicao - 1) +
				calculaTermoRecursivoFibonacci(posicao - 2);
	}

	static int calculaFatorial(int numero) {
		int resultado = 1;
		if (numero == 0 || numero == 1) {
			return resultado;
		}
		while (numero > 1) {
			resultado = resultado * numero;
			numero--;
		}
		return resultado;
	}

	static int calculaFatorialRecursivo(int numero) {
		if (numero == 0 || numero == 1) {
			return 1;
		}
		return numero * calculaFatorialRecursivo(numero - 1);
	}

	static int calculaPotencia(int base, int exponent) {
		if (exponent == 0) {
			return 1;
		}
		return base * calculaPotencia(base, exponent - 1);

	}

	public static void mergeSort(int[] arr) {
		if (arr.length <= 1) {
			return;
		}

		int mid = arr.length / 2;
		int[] left = Arrays.copyOfRange(arr, 0, mid);
		int[] right = Arrays.copyOfRange(arr, mid, arr.length);

		mergeSort(left);
		mergeSort(right);
		merge(arr, left, right);
	}

	private static void merge(int[] arr, int[] left, int[] right) {
		int i = 0;
		int j = 0;
		int k = 0;

		while (i < left.length && j < right.length) {
			if (left[i] < right[j]) {
				arr[k] = left[i];
				i++;
			} else {
				arr[k] = right[j];
				j++;
			}
			k++;
		}

		while (i < left.length) {
			arr[k] = left[i];
			i++;
			k++;
		}

		while (j < right.length) {
			arr[k] = right[j];
			j++;
			k++;
		}
	}

	public static void mergeSort(String[] arr) {
		if (arr.length <= 1) {
			return;
		}

		int mid = arr.length / 2;
		String[] left = new String[mid];
		String[] right = new String[arr.length - mid];

		for (int i = 0; i < mid; i++) {
			left[i] = arr[i];
		}
		for (int i = mid; i < arr.length; i++) {
			right[i - mid] = arr[i];
		}

		mergeSort(left);
		mergeSort(right);
		merge(arr, left, right);
	}

	private static void merge(String[] arr, String[] left, String[] right) {
		int i = 0;
		int j = 0;
		int k = 0;

		while (i < left.length && j < right.length) {
			if (getSobrenome(left[i]).compareTo(getSobrenome(right[j])) < 0) {
				arr[k] = left[i];
				i++;
			} else if (getSobrenome(left[i]).compareTo(getSobrenome(right[j])) > 0) {
				arr[k] = right[j];
				j++;
			} else {
				if (left[i].compareTo(right[j]) < 0) {
					arr[k] = left[i];
					i++;
				} else {
					arr[k] = right[j];
					j++;
				}
			}
			k++;
		}

		while (i < left.length) {
			arr[k] = left[i];
			i++;
			k++;
		}

		while (j < right.length) {
			arr[k] = right[j];
			j++;
			k++;
		}
	}

	private static String getSobrenome(String s) {
		String[] parts = s.split(" ");
		return parts[parts.length - 1];
	}

	public static void mergeSort(String[] array, int left, int right) {
		if (left < right) {
			int middle = (left + right) / 2;
			mergeSort(array, left, middle);
			mergeSort(array, middle + 1, right);
			merge(array, left, middle, right);
		}
	}

	public static void merge(String[] array, int left, int middle, int right) {
        int n1 = middle - left + 1;
        int n2 = right - middle;
        
        String[] L = new String[n1];
        String[] R = new String[n2];
        
        for (int i = 0; i < n1; ++i) {
            L[i] = array[left + i];
        }
        for (int j = 0; j < n2; ++j) {
            R[j] = array[middle + 1 + j];
        }
        
        int i = 0, j = 0;
        int k = left;
        
        while (i < n1 && j < n2) {
            if (L[i].compareTo(R[j]) <= 0) {
                array[k] = L[i];
                i++;
            } else {
                array[k] = R[j];
                j++;
            }
            k++;
        }
        
        while (i < n1) {
            array[k] = L[i];
            i++;
            k++;
        }
        
        while (j < n2) {
            array[k] = R[j];
            j++;
            k++;
        }
	}

	public static void main(String[] args) {

		String[] ay = {"banana", "apple", "chocolate", "danone", "estetoscopio", "fibraOptica"};
        System.out.println("Antes do sorting: " + Arrays.toString(ay));
        mergeSort(ay, 0, ay.length - 1);
        System.out.println("Depois sorting: " + Arrays.toString(ay));
		
		
		// int[] arr = { 4, 1, 7, 3, 9, 2 };
		// mergeSort(arr);
		// System.out.println(arr);

		// String[] nomes = { "Joao Silva", "Ana Paula Souza", "Ricardo Oliveira",
		// "Camila Rocha", "Felipe Pereira" };
		// mergeSort(nomes);
		// for (String nome : nomes) {
		// System.out.println(nome);
		// }

		/*
		 * int[] array = {5, 4, 3, 2, 1, 0};
		 * System.out.println(array);
		 */

		/*
		 * int base = 9;
		 * int exponent = 3;
		 * System.out.print(base + " elevado a " + exponent + " é: " +
		 * calculaPotencia(base, exponent));
		 */

		/*
		 * int numero = 3;
		 * System.out.println("Fatorial de " + numero + " é: " +
		 * calculaFatorial(numero));
		 * 
		 * System.out.println("FatorialRecurssivo de " + numero + " é: " +
		 * calculaFatorialRecursivo(numero));
		 */

		/*
		 * int posicao = 6;
		 * System.out.print("A " + posicao + "° posicao é: " +
		 * calculaTermoRecursivoFibonacci(posicao));
		 */

		/*
		 * try (Scanner ler = new Scanner(System.in)) {
		 * StackTins<Integer> bin = new StackTins<>();
		 * int decimal = 0;
		 * 
		 * System.out.println("Informe um número em decimal: ");
		 * decimal = ler.nextInt();
		 * 
		 * //Loop
		 * while (decimal != 0) {
		 * int resto = decimal % 2;
		 * bin.push(resto);
		 * decimal /= 2;
		 * }
		 * 
		 * //Uso o tipo StringBuilder para ter acesso a caracteristicas de stirng
		 * StringBuilder binario = new StringBuilder();
		 * while (!bin.isEmpty()) {
		 * binario.append(bin.pop());
		 * }
		 * 
		 * System.out.println("O número binário é: " + binario.toString());
		 * }
		 * 
		 * StackTins<String> pilha = new StackTins<String>();
		 * 
		 * pilha.push("Fusca");
		 * pilha.push("New Fiesta");
		 * pilha.push("Corolla");
		 * pilha.push("Hilux");
		 * pilha.push("Ferrari");
		 * pilha.push("Lamborghini");
		 * 
		 * while (!pilha.isEmpty()) {
		 * System.out.println(pilha.pop());
		 * }
		 * 
		 */
	}
}
