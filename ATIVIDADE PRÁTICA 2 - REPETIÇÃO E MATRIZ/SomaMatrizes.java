class SomaMatrizes {
    public static void main(String[] args) {
        int[][] matriz1 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        int[][] matriz2 = {
            {9, 8, 7},
            {6, 5, 4},
            {3, 2, 1}
        };
        
        int[][] soma = new int[3][3];
        
        // Realiza a soma das matrizes
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                soma[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }
        
        // Exibe o resultado
        System.out.println("Resultado da soma das matrizes:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(soma[i][j] + " ");
            }
            System.out.println();
        }
    }
}
