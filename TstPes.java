public class TstPes{

	public static void main(String avg[]){

		Leitura l = new Leitura();
		Pessoa p1 = new Pessoa();

		String cpf_S = l.entDados("\nInforme o CPF: ");
		int cpf_I = Integer.parseInt(cpf_S);
		
	
		p1.setCpf(cpf_I);
		System.out.println("\nCPF...: "+p1.getCpf());
	}

}