/*
	RA: 2348020
	Nome: Joice Kelly Oliveira Mendes
*/

import java.util.Calendar;

public class ContaPoupanca extends ContaBancaria implements CalcRendimento{

	private int diaVersario;

//============================= Método Construtor Inicializa Atributos =============================================

	public ContaPoupanca(){
		diaVersario = 0;
	}
	
//============================ Método Construtor Cria Conta Poupança ===============================================
	
	public ContaPoupanca(int numConta, double saldo, Cliente cliente) {
		super.setNumConta(numConta);
		super.setSaldo(saldo);
		super.setCliente(cliente);
	}

//============================ Método Calcular Taxa de Renda do DiaVersario da Conta ===============================	
	
	public boolean calcularRend(Cliente cli) {
		
		double taxaRend;
		
		Calendar hoje = Calendar.getInstance();
		taxaRend = 0.5;
		
		if(diaVersario == hoje.get(Calendar.DAY_OF_MONTH)) {
			cli.getConta().setSaldo(cli.getConta().getSaldo() + cli.getConta().getSaldo() * taxaRend);
			return true;
		}
		return false;
	}
	
//============================ Método Getter e Setter ===========================================================

	public int getDiaVersario(){
		return diaVersario;
	}	

	public void setDiaVersario(int diaVersario){
		this.diaVersario= diaVersario;
	}

}



