public class Pessoa{

	private int cpf = 0;				//Variáveis globais
	private String nome = "";

	public int getCpf(){
		return cpf;
	}

	public String getNome(){
		return nome;
	}

	public void setCpf(int cpf){
		if(cpf > 0){
			this.cpf = cpf;
		} else {
			System.out.println("\nCPF deve ser positivo!");
			this.cpf = 1501;
		}
	}

	public void setNome(String nome){
		this.nome = nome;
	}

}