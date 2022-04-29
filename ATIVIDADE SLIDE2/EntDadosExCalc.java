import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EntDadosExCalc {
	public static void main(String arg[]){
		InputStreamReader c = new InputStreamReader(System.in);
		BufferedReader cd = new BufferedReader(c);
		String a =""; 
		String b = "";
		String opcao = "";		

		System.out.println("Entre com o 1º valor: ");
		try{
			a = cd.readLine();
		}
		catch(IOException e){
			System.out.println("Erro de entrada");
		}

		System.out.println("Entre com o 2º valor: ");
		try{
			b = cd.readLine();
		}
		catch(IOException e){
			System.out.println("Erro de entrada");
		}

		System.out.println("Menu de Opções: ");
		System.out.println("1- Somar (a+b) ");
		System.out.println("2- Multiplicar (a*b) ");
		System.out.println("3- Subtrair (a-b) ");
		System.out.println("4- Dividir (a/b) ");
		System.out.println("Escolha uma opcao: ");
		try{
			opcao = cd.readLine();
		}
		catch(IOException e){
			System.out.println("Erro de entrada");
		}
		
		int letterA = Integer.parseInt(a);
		int letterB = Integer.parseInt(b);
		int op = Integer.parseInt(opcao);	
		float div1 = Float.parseFloat(a);	
		float div2 = Float.parseFloat(b);	

		switch(op){
		case 1:
			System.out.println("A soma de "+a+" + "+b+" eh: "+(letterA+letterB));
			break;
		case 2:
			System.out.println("A multiplicacao de "+a+" * "+b+" eh: "+(letterA*letterB));
			break;
		case 3:
			System.out.println("A subtracao de "+a+" - "+b+" eh: "+(letterA-letterB));
			break;
		case 4:
			System.out.println("A Divisão de "+a+" / "+b+" eh: "+(div1/div2));
			break;
		default:
			System.out.println("Operacao Invalida!");
		}

	}
}