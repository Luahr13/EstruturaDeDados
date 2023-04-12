import java.util.Arrays;

public class laboratorio {
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
    }
}
