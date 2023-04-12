package laboratorioDeEstudo;

import java.util.ArrayList;

import unitins.ArrayTins;

public class LaboratorioDeEstudo3 {

	public static void main(String[] args) {

		ArrayList<PlantaPredio> listaJava = new ArrayList<PlantaPredio>();

		ArrayTins<PlantaPredio> listaTins = new ArrayTins<PlantaPredio>();

//		System.out.println(listaJava.isEmpty());
//		System.out.println(listaTins.isEmpty());
//
//		System.out.println(listaJava.size());
//		System.out.println(listaTins.size());

		listaJava.add(new PlantaPredio()); // Inserido na posição 0
		listaJava.add(new PlantaPredio()); // Inserido na posição 1
		// listaJava.add(0, new PlantaPredio()); Inserido na posição 0, empurra os outros para frente
		//listaJava.add(8, new PlantaPredio());  Não pode, pois adiciona de 1 por 1 posição
												// Adiciona elementos até chegar na posição 8
		
		listaJava.remove(2);

		

		listaTins.add(new PlantaPredio());
		listaTins.add(new PlantaPredio());

		for (int i = 0; i < 10; i++) {
			listaTins.add(new PlantaPredio());

		}

//		System.out.println(listaJava.isEmpty());
//		System.out.println(listaTins.isEmpty());
//
//		System.out.println(listaJava.size());
//		System.out.println(listaTins.size());
//
//		System.out.println(listaJava);
//		System.out.println(listaTins);

//		System.out.println(listaTins.get(0));
//		System.out.println(listaTins.get(1));
//		System.out.println(listaTins.get(2));

	}

}
