public class TstPesErro1{

	public static void main(String avg[]){

		Leitura l = new Leitura();
		Pessoa p1 = new Pessoa();
		Endereco e = new Endereco();
	
		p1.setCpf(Integer.parseInt(l.entDados("\nInforme o CPF: ")));
		p1.setNome(l.entDados("Informe o NOME: "));

		e.setRua(l.entDados("Informe a RUA: "));
		e.setNum(Integer.parseInt(l.entDados("Informe o NUM da casa: ")));

		System.out.println("\nCPF...: "+p1.getCpf());
		System.out.println("NOME...: "+p1.getNome());
		System.out.println("E - RUA...: "+e.getRua());
		System.out.println("E - NUMERO...: "+e.getNum());
	}

}