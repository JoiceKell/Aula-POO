public class TstHer{

	public static void main(String avg[]){

		Prof prof = new Prof();

		prof.setCpf(61); 			//prof acessa por herança a classe Pessoa
		prof.setNome("JK");		
		prof.getEnder().setRua("das Nações");
		prof.getEnder().setNum(52);

		prof.setSal(1200);			//Da própria classe prof
		prof.setTitulo("Mestre");

		System.out.println("\nPROF - CPF...: "+prof.getCpf());
		System.out.println("PROF - NOME...: "+prof.getNome());
		System.out.println("PROF - RUA...: "+prof.getEnder().getRua());
		System.out.println("PROF - NUMERO...: "+prof.getEnder().getNum());
		System.out.println("PROF - SALARIO...: "+prof.getSal());
		System.out.println("PROF - TITULO...: "+prof.getTitulo());
		
	}

}
