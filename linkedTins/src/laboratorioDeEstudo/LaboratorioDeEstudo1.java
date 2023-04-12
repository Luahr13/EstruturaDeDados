package laboratorioDeEstudo;

import unitins.LinkedTins;

public class LaboratorioDeEstudo1 {

	public static void main(String[] args) {

		
		LinkedTins<String> listaTins = new LinkedTins<String>();

		listaTins.add("A");
		listaTins.add("B");
		listaTins.add("C");
		listaTins.add("D");
		listaTins.remove(2);
		
		System.out.println("----------------------------");
		
//		listaTins.add("C");
//		listaTins.add("D");
//		listaTins.add(0, "A");
//		listaTins.add(1, "B");
//		listaTins.add(listaTins.size(), "F");
		
		System.out.println(listaTins);

//		System.out.println(listaTins.get(0));
//		System.out.println(listaTins.get(2));
//		System.out.println(listaTins.get(listaTins.size() - 1));
//		System.out.println(listaTins.get(listaTins.size()));
		
		
		/* TESTE O LINKEDLIST
		LinkedList<String> linkedJava = new LinkedList<String>();

		linkedJava.add("A");
		linkedJava.add("B");
		linkedJava.add("C");
		linkedJava.add("D");
		
		System.out.println(linkedJava);

		System.out.println(linkedJava.get(0));
		System.out.println(linkedJava.get(2));
		System.out.println(linkedJava.get(linkedJava.size() - 1));
		System.out.println(linkedJava.get(linkedJava.size()));
		*/
		
	}

}
