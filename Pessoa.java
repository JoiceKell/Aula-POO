public class Pessoa{

	int cpf = 0;				//Variáveis globais
	String nome = "";

	public static void main(String avg[]){

		Pessoa p1; 	 	//p1 é um endereço de memória - Objeto
		p1 = new Pessoa(); //Método Construtor -- > Informa ao SO as dimensões de p1

		p1.entCpf();

		System.gc();

		p1.entNome();
		p1.impDados();

	}

	public void entCpf(){
		Pessoa p11 = new Pessoa();
		cpf = 74;
	}

	public void entNome(){
		nome = "Solange";
	}

	public void impDados(){
		System.out.println("\nCPF...: "+cpf);
		System.out.println("\nNOME...: "+nome);
	}

}