/*
	RA: 2348020
	Nome: Joice Kelly Oliveira Mendes
*/

public class ContaBancaria{

	private int numConta;
	private double saldo;
	private Cliente cliente;

//============ Método Construtor Inicializa Atributos ==================

	public ContaBancaria(){

		numConta = 0;
		saldo = 0.0;

	}

//============ Métodos Getters ============================
	
	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public int getNumConta(){
		return numConta;
	}

	public double getSaldo(){
		return saldo;
	}	

//============ Métodos Setters ============================
	
	public void setNumConta(int numConta){
		this.numConta = numConta;
	}

	public void setSaldo(Double saldo){
		this.saldo= saldo;
	}

//============ Método Depositar ====================================
	
	public void depositar(double valor){
		saldo += valor;
	}
	
//============ Método Sacar ====================================

	public boolean sacar(double valor){
		if((saldo-valor >= 0)){
			saldo -= valor;
			return true;
		}
		return false;
	}
	
}
