package unitins;

public class ArrayTins<T> {

	private final int SIZE = 10;
	private T[] array = null;
	private int lastPosition = 0; // VARIAVEL para guardar a última posição
	// exemplo: last position = 5 ' array de 0 a 4
	// exemplo: last position = 1, size =1, array[0]

	@SuppressWarnings("unchecked")
	public ArrayTins() {
		array = (T[]) new Object[SIZE];
	}

	public String toString() {
		String result = "[";

		for (int position = 0; position < lastPosition; position++) {
			result += array[position] + ",";
		}
		result += "]";
		return result;
	}

	public T get(int position) {

		if (position < 0 || position >= lastPosition) {
			throw new ArrayIndexOutOfBoundsException();
		}

		return array[position];

	}

	public boolean isEmpty() {
		return lastPosition == 0 ? true : false; // ou lastPosition == 0;
	}

	public int size() {

		return lastPosition;

	}

	public void add(int position, T newElement) {
		
		if (position < 0 || position > lastPosition) {
			throw new ArrayIndexOutOfBoundsException();
		}

		if (lastPosition == array.length) {
			resize();
		}

		for (int i = lastPosition - 1; i >= position; i--) {
			array[i + 1] = array[i];
		}

		array[position] = newElement;
		lastPosition++;
		
	}

	public T remove(int position) {
		
		if (position < 0 || position >= lastPosition) {
			throw new ArrayIndexOutOfBoundsException();
		}
		
		T ref = array[position];
		
		for (int i = position; i < lastPosition - 1; i++) {
			array[i] = array[i + 1];
		}
		
		lastPosition--;
		return ref;
		
	}

	public void add(T newElement) {

		if (lastPosition == array.length) {
			resize();
		}

		array[lastPosition] = newElement;
		lastPosition++;

	}

	private void resize() {

		System.out.println("mais memória...");
		@SuppressWarnings("unchecked")
		T[] newArray = (T[]) new Object[array.length + (array.length / 2)];

		for (int position = 0; position < array.length; position++) {
			newArray[position] = array[position];
		}

		array = newArray;
		System.gc(); // Pedir para passar o java lixo quando ele puder

	}

}
