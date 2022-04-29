/*
1)_ Crie um programa, no qual ter� um vetor de inteiros, cujo tamanho ser�
definido pelo valor de uma vari�vel local, que permita ao usu�rio entrar com
os valores. Depois, estes valores ser�o apresentados na ordem inversa � da
entrada.
 */
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int tam;
        System.out.println("Informe o tamanho do vetor: ");
        tam = input.nextInt();

        int vet[] = new int[tam];
        int inverte[] = new  int[tam];

        for(int i = 0; i < tam; i++){
            System.out.println("Digite o valor "+(i+1)+": ");
            vet[i] = input.nextInt();
        }
        System.out.println(" ");
        for(int i = 0; i < tam; i++){
            System.out.print(vet[i]+ " ");
        }

        inverteVetor(vet);

        System.out.println(" ");
        System.out.println(" ");
        for(int i = 0; i < tam; i++){
            System.out.print(vet[i]+ " ");
        }
    }
    private static void inverteVetor(int vet[]){
        int temp;

        for (int i = 0; i < vet.length; i++) {
            for (int j = 0; j < i; j++) {
                temp = vet[i];
                vet[i] = vet[j];
                vet[j] = temp;
            }
        }
    }
}

