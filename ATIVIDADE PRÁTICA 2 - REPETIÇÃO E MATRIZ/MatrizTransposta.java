import java.util.Scanner;

public class MatrizTransposta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita o tamanho da matriz
        System.out.print("Digite o número de linhas: ");
        int linhas = scanner.nextInt();
        System.out.print("Digite o número de colunas: ");
        int colunas = scanner.nextInt();

        int[][] matriz = new int[linhas][colunas];
        int[][] transposta = new int[colunas][linhas]; // A transposta terá colunas e linhas invertidas

        // Preenchendo a matriz
        System.out.println("Digite os elementos da matriz:");
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        // Calculando a transposição
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                transposta[j][i] = matriz[i][j];
            }
        }

        // Exibindo a matriz original
        System.out.println("\nMatriz Original:");
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        // Exibindo a matriz transposta
        System.out.println("\nMatriz Transposta:");
        for (int i = 0; i < colunas; i++) {
            for (int j = 0; j < linhas; j++) {
                System.out.print(transposta[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
