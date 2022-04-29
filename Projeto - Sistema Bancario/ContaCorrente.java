/*
	RA: 2348020
	Nome: Joice Kelly Oliveira Mendes
*/

public class ContaCorrente extends ContaBancaria implements SaqueEspecial{
	private double limite;

//======================== Método Construtor Inicializa Atributos ==============================================
	
	public ContaCorrente() {
		limite = 0;
	}
	
//======================== Método Construtor Cria Conta Poupança ===============================================
	
	public ContaCorrente(int numConta, double saldo, Cliente cliente) {
		super.setNumConta(numConta);
		super.setSaldo(saldo);
		super.setCliente(cliente);
	}
	
//======================== Método Getter e Setter ==============================================================
	
	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
	
//======================== Polimorfismo de Sobrescrita =========================================================
	
	public boolean sacar(double valor, Cliente cli){  //Saque Especial
		double saldoLimite = cli.getConta().getSaldo() + limite;
		if((saldoLimite - valor)>= 0) {
			cli.getConta().setSaldo(cli.getConta().getSaldo()-valor);
			return true;
		}
		return false;
	}
}
