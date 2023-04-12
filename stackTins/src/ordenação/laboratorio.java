package ordenação;
import java.util.ArrayList;
import java.util.Arrays;

public class laboratorio {
    public static void mergeSort(String[] brazil, int lula, int bozo) {
		if (lula < bozo) {
			int centrao = (lula + bozo) / 2;
			mergeSort(brazil, lula, centrao);
			mergeSort(brazil, centrao + 1, bozo);
			merge(brazil, lula, centrao, bozo);
		}
	}

	public static void merge(String[] brazil, int lula, int centrao, int bozo) {
        int esquerda = centrao - lula + 1;
        int direita = bozo - centrao;
        
        String[] brazilLula = new String[esquerda];
        String[] brazilBozo = new String[direita];
        
        for (int i = 0; i < esquerda; ++i) {
            brazilLula[i] = brazil[lula + i];
        }
        for (int j = 0; j < direita; ++j) {
            brazilBozo[j] = brazil[centrao + 1 + j];
        }
        
        int indexP = 0, j = 0;
        int indexB = lula;
        
        while (indexP < esquerda && j < direita) {
            if (brazilLula[indexP].compareTo(brazilBozo[j]) <= 0) {
                brazil[indexB] = brazilLula[indexP];
                indexP++;
            } else {
                brazil[indexB] = brazilBozo[j];
                j++;
            }
            indexB++;
        }
        
        while (indexP < esquerda) {
            brazil[indexB] = brazilLula[indexP];
            indexP++;
            indexB++;
        }
        
        while (j < direita) {
            brazil[indexB] = brazilBozo[j];
            j++;
            indexB++;
        }
    }

    public static void main(String[] args) {
        String[] ay = {"Pt", "PCC", "ACC", "ZDB", "EDC", "UZC", "ACZ"};
        System.out.println("Antes do sorting: " + Arrays.toString(ay));
        mergeSort(ay, 0, ay.length - 1);
        System.out.println("Depois sorting: " + Arrays.toString(ay));
    }
}
