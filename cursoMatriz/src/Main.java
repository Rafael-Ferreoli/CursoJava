import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("DIGITE O TAMANHO DE LINHAS DA MATRIZ:");
        int n = sc.nextInt();
        System.out.println("DIGITE O TAMANHO DE COLUNAS DA MATRIZ:");
        int m = sc.nextInt();

        int contNegativo = 0;
        System.out.println("PREENCHA A MATRIZ:");
        int[][] mat = new int[n][m];
        for (int i = 0; i < mat.length; i++) {
            System.out.println("DIGITE A #" + (i + 1) + " LINHA:");
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j] = sc.nextInt();
                if (mat[i][j] < 0) {
                    contNegativo++;
                }
            }
        }

        System.out.println("VERIFICANDO OCORRENCIA:");
        int verOcorrencia = sc.nextInt();
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == verOcorrencia) {
                    System.out.println("POSICAO: " + i + "," + j);
                    if (j > 0) {
                        System.out.println("LEFT: " + mat[i][j - 1]);
                    }
                    if (j < mat[i].length - 1) {
                        System.out.println("RIGHT: " + +mat[i][j + 1]);
                    }
                    if (i < mat.length - 1) {
                        System.out.println("DOWN: " + mat[i + 1][j]);
                    }
                    if (i > 0) {
                        System.out.println("UP: " + mat[i - 1][j]);
                    }
                    System.out.println();
                }
            }
        }

        System.out.println("MATRIZ IMPRESSA:");
        for (int i = 0; i < mat.length; i++) {
            System.out.print("[ ");
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println("]");
        }

        System.out.println("DIAGONAL PRINCIPAL:");
        for (int i = 0; i < mat.length; i++) {
            System.out.print(mat[i][i] + " ");
        }
        System.out.println();
        System.out.println("NUMEROS NEGATIVOS:");
        System.out.println(contNegativo);
        sc.close();
    }
}