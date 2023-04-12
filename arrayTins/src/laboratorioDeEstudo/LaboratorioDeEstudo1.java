package laboratorioDeEstudo;

class PlantaPredio {

	String endereco;
	String cor;

}

public class LaboratorioDeEstudo1 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		System.out.println("aloooooo mundo estruturas de dados");

		PlantaPredio referencia1 = new PlantaPredio();
		PlantaPredio referencia2 = referencia1;

		new PlantaPredio();
		new PlantaPredio();
		new PlantaPredio();

		System.out.println(referencia1.endereco);

		referencia1 = null;
		referencia2 = referencia1;

		// COLETOR DE LIXO4

	}

}

// CLASSE É UM MODELO
// VARIAVEL DE REFERENCIA
// OBJETO
// COLETOR DE LIXO
// MEMÓRIA