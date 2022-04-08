public class Pessoa{

	static int cpf = 0;		//Variáveis globais
	static String nome = "";

	public static void main(String avg[]){

		entCpf();
		entNome();
		impDados();

	}

	public static void entCpf(){
		cpf = 75;
	}

	public static void entNome(){
		nome = "Joice";
	}

	public static void impDados(){
		System.out.println("\nCPF...: "+cpf);
		System.out.println("\nNOME...: "+nome);
	}

}