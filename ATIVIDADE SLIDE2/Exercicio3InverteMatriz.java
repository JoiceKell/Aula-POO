/*
1)_ Crie um programa, no qual ter� um vetor de inteiros, cujo tamanho ser�
definido pelo valor de uma vari�vel local, que permita ao usu�rio entrar com
os valores. Depois, estes valores ser�o apresentados na ordem inversa � da
entrada.

2) Fa�a o mesmo procedimento do exerc�cio anterior, por�m desta vez estar�
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