package unitins;

public class LinkedTins<T> {

	private Node<T> head = null;
	private int qtdElements = 0;

	public boolean isEmpty() {
		return head == null;
	}

	public int size() {
		return qtdElements;
	}

	public T remove(int position) {

		if (position < 0 || position >= size()) {
			throw new ArrayIndexOutOfBoundsException();
		}

		qtdElements--;

		Node<T> oldNode = getNode(position);

		if (position == 0) {
			head = oldNode.getNext();
		} else {
			Node<T> previousNode = getNode(position - 1);

			previousNode.setNext(oldNode.getNext());
		}

		return oldNode.getData();

	}

	public void add(int position, T newElement) {

		if (position < 0 || position > size()) {
			throw new ArrayIndexOutOfBoundsException();
		}

		Node<T> newNode = new Node<T>(newElement);
		qtdElements++;

		// INSERE NO INICIO DA LISTA
		if (position == 0) {
			newNode.setNext(head);
			head = newNode;
			return;
		}

		// INSERE NO FINAL DA LISTA
		if (position == size()) {
			Node<T> last = getNode(size() - 1);
			last.setNext(newNode);
			return;
		}

		// INSERE EM QUALQUER LUGAR QUE NÃO SEJAM AS PONTAS
		Node<T> previousNode = getNode(position - 1);
		newNode.setNext(previousNode.getNext());
		previousNode.setNext(newNode);

	}

	private Node<T> getNode(int position) {
		Node<T> aux = head;

		for (int count = 0; count < position; count++) {
			aux = aux.getNext();
		}

		return aux;
	}

	public T get(int position) {

		if (position < 0 || position >= size()) {
			throw new ArrayIndexOutOfBoundsException();
		}

		Node<T> aux = head;

		for (int count = 0; count < position; count++) {
			aux = aux.getNext();
		}

		return aux.getData();

	}

	public void add(T newElement) {

		Node<T> newNode = new Node<T>(newElement);
		qtdElements++;

		if (isEmpty()) {
			head = newNode;
			return;
		}

		Node<T> aux = head;

		while (aux.getNext() != null) {
			aux = aux.getNext();
		}

		aux.setNext(newNode);

	}

//	@Override  OUTRA FORMA DE FAZER
//	public String toString() {
//
//		Node<T> aux = head;
//
//		String result = "[";
//
//		while (aux != null) {
//			if (aux.getNext() != null) {
//				result += aux.getData() + ", ";
//			} else {
//				result += aux.getData() + "]";
//			}
//
//			aux = aux.getNext();
//		}
//
//		return result;
//
//	}

//	@Override OUTRA FORMA DE FAZER
//	public String toString() {
//
//		Node<T> aux = head;
//		String list = "";
//
//		while (aux != null) {
//			list += aux.toString() + " ";
//			aux = aux.getNext();
//		}
//		return list;
//
//	}

	@Override
	public String toString() {

		Node<T> aux = head;

		String result = "[";

		for (int i = 0; i < qtdElements; i++) {
			if (i < (qtdElements - 1)) {
				result += aux.getData() + ", ";
			} else {
				result += aux.getData();
			}

			aux = aux.getNext();
		}

		result += "]";

		return result;

	}

}
