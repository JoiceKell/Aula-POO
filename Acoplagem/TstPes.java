import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class TstPes{

	public static void main(String avg[]){

		Pessoa p1 = new Pessoa();
	
		p1.setCpf(Integer.parseInt(entDados("\nInforme o CPF: ")));
		p1.setNome(entDados("Informe o NOME: "));

		p1.setRua(entDados("Informe a RUA: "));
		p1.setNum(Integer.parseInt(entDados("Informe o NUM da casa: ")));

		System.out.println("\nCPF - Ac...: "+p1.getCpf());
		System.out.println("NOME - Ac...: "+p1.getNome());
		System.out.println("RUA - Ac...: "+p1.getRua());
		System.out.println("NUMERO - Ac...: "+p1.getNum());
	}

	public static String entDados(String rotulo){

		System.out.println(rotulo);

		InputStreamReader teclado = new InputStreamReader(System.in);
		BufferedReader buff = new BufferedReader(teclado);

		String ret = "";

		try{
			ret = buff.readLine();
		} catch(IOException ioe){
			System.out.println("\nERRO de sistema RAM - TECLADO");
		}
	
		return ret;

	}

}