import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EntDadosExemplo {
	public static void main(String arg[]){
		InputStreamReader c = new InputStreamReader(System.in);
		BufferedReader cd = new BufferedReader(c);

		String s =""; 
		String t = "";

		System.out.println("Entre com o 1º valor: ");
		try{
			s = cd.readLine();
		}
		catch(IOException e){
			System.out.println("Erro de entrada");
		}
		System.out.println("Entre com o 2º valor: ");
		try{
			t = cd.readLine();
		}
		catch(IOException e){
			System.out.println("Erro de entrada");
		}
		int a = Integer.parseInt(s);
		int b = Integer.parseInt(t);
		System.out.println("A soma dos dois valores eh: "+(a+b));
	}
}