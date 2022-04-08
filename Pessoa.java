public class Pessoa{

	int cpf = 0;				//Variáveis globais
	String nome = "";

	public static void main(String avg[]){

		Pessoa p1 = new Pessoa();

		p1.setCpf(123);
		p1.setNome("Alguem");
	
		
		System.out.println("\nCPF...: "+p1.getCpf());
		System.out.println("\nNOME...: "+p1.getNome());
	}

	public int getCpf(){
		return cpf;
	}

	public void setCpf(int cpf2){
		cpf = cpf2;
	}

	public String getNome(){
		return nome;
	}

	public void setNome(String nome2){
		nome = nome2;
	}

}