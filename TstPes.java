public class TstPes{

	public static void main(String avg[]){

		Pessoa p1 = new Pessoa();

		p1.cpf = -10;
		p1.setNome("Dez");
	
		
		System.out.println("\nCPF...: "+p1.getCpf());
		System.out.println("\nNOME...: "+p1.getNome());
	}

}