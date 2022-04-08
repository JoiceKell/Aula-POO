public class Pessoa{
	public static void main(String avg[]){
		int cpf = 0;
		String nome = "";

		cpf = entCpf();
		nome = entNome();

		System.out.println("\nCPF...: "+cpf);
		System.out.println("\nNOME...: "+nome);
	}
	public static int entCpf(){
		return 16;
	}

	public static String entNome(){
		return "Emanuel";
	}

}