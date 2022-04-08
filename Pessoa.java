public class Pessoa{

	static int cpf = 0;		//Variáveis globais
	static String nome = "";

	public static void main(String avg[]){

		entCpf();
		entNome();

		System.out.println("\nCPF...: "+cpf);
		System.out.println("\nNOME...: "+nome);
	}

	public static void entCpf(){
		cpf = 78;
	}

	public static void entNome(){
		nome = "Joice Kelly";
	}

}