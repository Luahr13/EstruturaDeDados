package laboratorioDeEstudo;

// import java.util.ArrayList;

import unitins.ArrayTins;

public class LaboratorioDeEstudo4 {

	public static void main(String[] args) {

		// ArrayList<PlantaPredio> listaJava = new ArrayList<PlantaPredio>();

		ArrayTins<PlantaPredio> listaTins = new ArrayTins<PlantaPredio>();

		// cenários de sucesso
		listaTins.add(new PlantaPredio());
		listaTins.add(new PlantaPredio());
		listaTins.add(new PlantaPredio());
		listaTins.add(3, new PlantaPredio());
		System.out.println(listaTins);
		listaTins.remove(1);

		System.out.println("--------------------");

		// cenários de erro
		listaTins.add(-1, new PlantaPredio());
		listaTins.add(20, new PlantaPredio());
		listaTins.remove(-2);
		listaTins.remove(4);
		listaTins.remove(55);

	}

}
