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

		Aluno aluno = new Aluno();

		aluno.setCpf(16); 			//aluno acessa por herança a classe Pessoa
		aluno.setNome("Joice");		
		aluno.getEnder().setRua("do Choro");
		aluno.getEnder().setNum(13);

		aluno.setRa(1300);			//Da própria classe aluno
		aluno.setCurso("Engenharia de Software");

		System.out.println("\nALUNO - CPF...: "+aluno.getCpf());
		System.out.println("ALUNO - NOME...: "+aluno.getNome());
		System.out.println("ALUNO - RUA...: "+aluno.getEnder().getRua());
		System.out.println("ALUNO - NUMERO...: "+aluno.getEnder().getNum());
		System.out.println("ALUNO - RA...: "+aluno.getRa());
		System.out.println("ALUNO - CURSO...: "+aluno.getCurso());
		
	}

}
