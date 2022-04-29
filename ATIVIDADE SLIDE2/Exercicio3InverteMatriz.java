/*
1)_ Crie um programa, no qual terá um vetor de inteiros, cujo tamanho será
definido pelo valor de uma variável local, que permita ao usuário entrar com
os valores. Depois, estes valores serão apresentados na ordem inversa à da
entrada.

2) Faça o mesmo procedimento do exercício anterior, porém desta vez estará
usando uma matriz bidimensional.
 */

import java.util.Scanner;

public class Exercicio3InverteMatriz {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int qntLin, qntCol;
        qntLin = qntCol = 0;

        System.out.println("Informe o tamanho de linhas da matriz: ");
        qntLin = input.nextInt();

        System.out.println("Informe o tamanho de colunas da matriz: ");
        qntCol = input.nextInt();

        int matriz[][] = new int[qntLin][qntCol];

        for (int i = 0; i < qntLin; i++) {
            for (int j = 0; j < qntCol; j++) {
                System.out.println("Digite o valor [" + i + "][" + j + "]");
                matriz[i][j] = input.nextInt();
            }
        }
        System.out.println(" ");

        System.out.println("Matriz: ");
        for (int i = 0; i < qntLin; i++) {
            for (int j = 0; j < qntCol; j++) {
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println("");
        }
        System.out.println();

        System.out.println("Matriz Invertida: ");
        for (int i = qntLin-1; i >= 0; i--) {
            for (int j = qntCol-1; j >= 0; j--) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
    }
}