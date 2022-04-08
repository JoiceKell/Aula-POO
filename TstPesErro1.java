public class TstPesErro1{

	public static void main(String avg[]){

		Leitura l = new Leitura();
		Pessoa p1 = new Pessoa();
	
		p1.setCpf(Integer.parseInt(l.entDados("\nInforme o CPF: ")));
		p1.setNome(l.entDados("Informe o NOME: "));

		p1.getEnder().setRua(l.entDados("Informe a RUA: "));
		p1.getEnder().setNum(Integer.parseInt(l.entDados("Informe o NUM da casa: ")));

		System.out.println("\nCPF...: "+p1.getCpf());
		System.out.println("NOME...: "+p1.getNome());
		System.out.println("Ok - RUA...: "+p1.getEnder().getRua());
		System.out.println("Ok - NUMERO...: "+p1.getEnder().getNum());
	}

}