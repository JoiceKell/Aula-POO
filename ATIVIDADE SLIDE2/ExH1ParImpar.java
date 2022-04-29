import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExH1ParImpar {
	public static void main(String arg[]){
		InputStreamReader c = new InputStreamReader(System.in);
		BufferedReader cd = new BufferedReader(c);
		String valor =""; 

		System.out.println("Entre com um valor: ");
		try{
			valor = cd.readLine();
		}
		catch(IOException e){
			System.out.println("Erro de entrada");
		}
		
		int num = Integer.parseInt(valor);
		
		if(num % 2 == 0){
			System.out.println("O valor digitado eh par!");
		} else {
			System.out.println("O valor digitado eh impar!");
		}

	}
}