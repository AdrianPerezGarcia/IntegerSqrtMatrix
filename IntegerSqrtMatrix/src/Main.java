import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tam = 0;
		String entryTam = sc.nextLine();
		entryTam = entryTam.replaceAll(" +", " ");
		String[] entrySplittedTam = (entryTam.split(" "));
		if (entrySplittedTam.length != 1) {
			wrongEntry();
		} else {
			try {
				tam = Integer.parseInt(entrySplittedTam[0]);
				if (tam <= 0) {
					wrongEntry();
				}
			} catch (NumberFormatException e) {
				wrongEntry();
			}
		}
		
		int[][] matrix = new int[tam][tam];
		readEntry(sc, matrix, 0, 0, null);
		
		if (isSimetric(matrix, 0, 0)) {
			System.out.println("La matriz de tamaño " + tam + " es de raíz entera simétrica.");
		} else {
			System.out.println("La matriz de tamaño " + tam + " no es de raíz entera simétrica.");
		}
		sc.close();
	}

	/* Fills the matrix with the form requested in the statement. */
	private static void readEntry(Scanner sc, int m[][], int i, int j, String[] entrySplitted) {
		if (i < m.length) {
			if (j == 0) {
				String entry = sc.nextLine();
				entry = entry.replaceAll(" +", " ");
				entrySplitted = (entry.split(" "));
				if (entrySplitted.length != m.length) {
					wrongEntry();
				}
			}
			
			if (j >= m.length) {
				readEntry(sc, m, ++i, 0, entrySplitted);
			} else {
				int aux = -1;
				try {
					aux = Integer.parseInt(entrySplitted[j]);
				} catch (NumberFormatException e) {
					wrongEntry();
				}
				m[i][j] = makeIntegerSqrt(aux);
				readEntry(sc, m, i, ++j, entrySplitted);
			}
		}
	}
	
	/* Method called every time an entry is not valid to finish the program. */
	private static void wrongEntry() {
		System.out.println("Entrada Inválida.");
		System.exit(-1);
	}

	/* Receive a number, check if it's valid to make the square root and call the recursive method. */
	private static int makeIntegerSqrt(int n) {
		if (n < 0) {
			wrongEntry();
		}
		n = makeIntegerSqrtAux(n, 0);
		return n;
	}

	/* Makes an integer square root by the recursive way. */
	private static int makeIntegerSqrtAux(int n, int i) {
		if (i * i > n) {
			return i - 1;
		} else if (i * i == n) {
			return i;
		}
		return makeIntegerSqrtAux(n, i + 1);
	}

	/* Receive a square matrix and their size and returns a boolean according to their symmetry. */	
	public static boolean isSimetric(int[][] matrix, int i, int j) {
        if (j < matrix.length-i && i < matrix.length)
            return matrix[i][j] == matrix[j][i] && isSimetric(matrix, ++i, j) && isSimetric(matrix, 0, ++j);
        return true;
    }

}