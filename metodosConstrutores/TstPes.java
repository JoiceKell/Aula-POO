public class TstPes{

	public static void main(String avg[]){

		Pessoa p1 = new Pessoa();

		p1.setCpf(1);
		p1.setNome("Ruah");
		p1.getEnder().setRua("Rua das Flores");
		p1.getEnder().setNum(10);

		System.out.println("\nCPF - P1...: "+p1.getCpf());
		System.out.println("NOME - P1...: "+p1.getNome());
		System.out.println("RUA - P1...: "+p1.getEnder().getRua());
		System.out.println("NUMERO - P1...: "+p1.getEnder().getNum());

		Pessoa p2 = new Pessoa();
		p2 = p1;

		p1.setCpf(16);
		p1.setNome("Joice Kelly");
		p1.getEnder().setRua("do Coracao");
		p1.getEnder().setNum(25);
		
		System.out.println("\n\nCPF - P2...: "+p2.getCpf());
		System.out.println("NOME - P2...: "+p2.getNome());
		System.out.println("RUA - P2...: "+p2.getEnder().getRua());
		System.out.println("NUMERO - P2...: "+p2.getEnder().getNum());
	
		System.out.println("\nCPF - P1...: "+p1.getCpf());
		System.out.println("NOME - P1...: "+p1.getNome());
		System.out.println("RUA - P1...: "+p1.getEnder().getRua());
		System.out.println("NUMERO - P1...: "+p1.getEnder().getNum());
	
	}

}

/*


		p1.setCpf(Integer.parseInt(l.entDados("\nInforme o CPF: ")));
		p1.setNome(l.entDados("Informe o NOME: "));

		p1.getEnder().setRua(l.entDados("Informe a RUA: "));
		p1.getEnder().setNum(Integer.parseInt(l.entDados("Informe o NUM da casa: ")));

		System.out.println("\nCPF...: "+p1.getCpf());
		System.out.println("NOME...: "+p1.getNome());
		System.out.println("RUA...: "+p1.getEnder().getRua());
		System.out.println("NUMERO...: "+p1.getEnder().getNum());
*/