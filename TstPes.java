public class TstPes{

	public static void main(String avg[]){

		Leitura l = new Leitura();
		Pessoa p1 = new Pessoa();
	
		p1.setCpf(Integer.parseInt(l.entDados("\nInforme o CPF: ")));
		System.out.println("\nCPF...: "+p1.getCpf());
	}

}