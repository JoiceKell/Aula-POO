public class Pessoa{
	public static void main(String avg[]){
		int cpf = 0;
		String nome = "";

		cpf = entCpf(cpf);
		nome = entNome(nome);

		System.out.println("\nCPF...: "+cpf);
		System.out.println("\nNOME...: "+nome);
	}

	public static int entCpf(int cpf2){
		cpf2 = 34;
		return cpf2;
	}

	public static String entNome(String nome2){
		nome2 = "Adonai";
		return nome2;
	}

}