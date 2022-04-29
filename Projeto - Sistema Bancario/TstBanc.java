/*
	RA: 2348020
	Nome: Joice Kelly Oliveira Mendes
*/

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TstBanc{
	
	static Scanner input = new Scanner(System.in);

	public static void main(String avg[]){
		operacoes();
	}
	
	public static void operacoes(){
		
		Leitura l = new Leitura();
		Cliente c = new Cliente();
		ContaPoupanca cp = new ContaPoupanca();
		ContaCorrente cc = new ContaCorrente();
			
		System.out.println("\t\t\t\t\t\t--------------------------------------------------------------------------");
		System.out.println("\t\t\t\t\t\t-------------------------- Bem Vindo a Agencia ---------------------------");
		System.out.println("\t\t\t\t\t\t--------------------------------------------------------------------------");
		System.out.println("\t\t\t\t\t\t************************ Selecione o tipo de Contar **********************");
		System.out.println("\t\t\t\t\t\t--------------------------------------------------------------------------");
		System.out.println("\t\t\t\t\t\t----------------------|  Opcao 1 - Conta Poupanca  |----------------------");
		System.out.println("\t\t\t\t\t\t----------------------|  Opcao 2 - Conta Corrente  |----------------------");
		System.out.println("\t\t\t\t\t\t--------------------------------------------------------------------------");
		System.out.print("\nSelecione a opcao: ");
		int opcao1 = input.nextInt();
		System.out.println("\n");
		
		int opcao, valor, dia;
		
		do {
		System.out.println("\t\t\t\t\t\t--------------------------------------------------------------------------");
		System.out.println("\t\t\t\t\t\t************** Selecione uma operacao que deseja realizar ****************");
		System.out.println("\t\t\t\t\t\t--------------------------------------------------------------------------");
		System.out.println("\t\t\t\t\t\t----------------------|    Opcao 1 - Criar conta    |---------------------");
		System.out.println("\t\t\t\t\t\t----------------------|    Opcao 2 - Depositar      |---------------------");
		System.out.println("\t\t\t\t\t\t----------------------|    Opcao 3 - Sacar          |---------------------");
		System.out.println("\t\t\t\t\t\t----------------------|    Opcao 4 - Listar         |---------------------");
		System.out.println("\t\t\t\t\t\t----------------------|    Opcao 5 - Saldo          |---------------------");
		System.out.println("\t\t\t\t\t\t----------------------|    Opcao 6 - Sair           |---------------------");
		System.out.println("\t\t\t\t\t\t--------------------------------------------------------------------------");
		
		System.out.print("\nSelecione a opcao: ");
		int opcao2 = input.nextInt();
		System.out.print("\n");
		
		if(opcao1 == 1) {
			
			switch(opcao2) {
	
					case 1:
						c.setCpf(l.entDados("Informe o CPF: "));
						c.setNome(l.entDados("Informe o NOME: "));
						c.setEmail(l.entDados("Informe o E-MAIL: "));
						c.setTelefone(l.entDados("Informe o TELEFONE: "));
						c.getEnder().setNum(Integer.parseInt(l.entDados("Informe o N da casa: ")));
						c.getEnder().setCep(Integer.parseInt(l.entDados("Informe o CEP: ")));		
						c.getEnder().setRua(l.entDados("Informe a RUA: "));
						c.getEnder().setCidade(l.entDados("Informe a CIDADE: "));
						c.getEnder().setEstado(l.entDados("Informe o ESTADO: "));
						c.getEnder().setBairro(l.entDados("Informe o BAIRRO: "));
						c.getEnder().setComplemento(l.entDados("Informe o COMPLEMENTO: "));
						c.getConta().setSaldo(Double.parseDouble(l.entDados("Informe o SALDO da conta: ")));
						c.getConta().setNumConta(Integer.parseInt(l.entDados("Informe o N da conta: ")));
							
						c.criaContPou(c.getConta().getNumConta(), c.getConta().getSaldo(), c);
							
					break;
						
					case 2:
							
						System.out.print("Informe o valor do Deposito: ");
						valor = input.nextInt();
							
						c.getConta().depositar(valor);
						
						DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
				        System.out.println(""+dtf.format(LocalDateTime.now()));
				        
						System.out.println("\nSALDO: "+c.getConta().getSaldo());
						System.out.println();
							
					break;
						
					case 3:
							
						System.out.print("Informe o valor de Saque: ");
						valor = input.nextInt();

						if(c.getConta().sacar(valor)) {
							System.out.println("Saque efetuado com Sucesso, novo saldo eh de: "+c.getConta().getSaldo());
						} else {
							System.out.println("Saldo insuficiente para saque");
						}
						
						System.out.println("SALDO: "+c.getConta().getSaldo());
						System.out.println();
						
					break;
						
					case 4:
							
						System.out.println("CPF............: \t\t"+c.getCpf());
						System.out.println("NOME...........: \t\t"+c.getNome());
						System.out.println("EMAIL..........: \t\t"+c.getEmail());
						System.out.println("TELEFONE.......: \t\t"+c.getTelefone());
						System.out.println("CEP............: \t\t"+c.getEnder().getCep());
						System.out.println("RUA............: \t\t"+c.getEnder().getRua());
						System.out.println("N CASA.........: \t\t"+c.getEnder().getNum());
						System.out.println("BAIRRO.........: \t\t"+c.getEnder().getBairro());
						System.out.println("COMPLEMENTO....: \t\t"+c.getEnder().getComplemento());
						System.out.println("CIDADE.........: \t\t"+c.getEnder().getCidade());
						System.out.println("ESTADO.........: \t\t"+c.getEnder().getEstado());
						System.out.println("SALDO..........: \t\t"+c.getConta().getSaldo());
						System.out.println("N DA CONTA.....: \t\t"+c.getConta().getNumConta());
							
					break;
					
					case 5:
						System.out.print("Informe o dia de hoje: ");
						dia = input.nextInt();
						
						cp.setDiaVersario(dia);
						
						if(cp.calcularRend(c)){
							System.out.println("Rendimento aplicado, novo saldo eh de = "+c.getConta().getSaldo());
						} else {
							System.out.println("Hoje nao eh dia de rendimento, novo saldo nao calculado");
						}
						
					break;	
					
					case 6:
						System.out.println("Saindo...");
						System.exit(0);
							
					default:
						System.out.println("Opcao Invalida!!!");
						operacoes();
					break;
					
			}

		} else {
		
			switch(opcao2) {
					
					case 1:
						
						c.setCpf(l.entDados("Informe o CPF: "));
						c.setNome(l.entDados("Informe o NOME: "));
						c.setEmail(l.entDados("Informe o E-MAIL: "));
						c.setTelefone(l.entDados("Informe o TELEFONE: "));
						c.getEnder().setNum(Integer.parseInt(l.entDados("Informe o N da casa: ")));
						c.getEnder().setCep(Integer.parseInt(l.entDados("Informe o CEP: ")));		
						c.getEnder().setRua(l.entDados("Informe a RUA: "));
						c.getEnder().setCidade(l.entDados("Informe a CIDADE: "));
						c.getEnder().setEstado(l.entDados("Informe o ESTADO: "));
						c.getEnder().setBairro(l.entDados("Informe o BAIRRO: "));
						c.getEnder().setComplemento(l.entDados("Informe o COMPLEMENTO: "));
						c.getConta().setSaldo(Double.parseDouble(l.entDados("Informe o SALDO da conta: ")));
						c.getConta().setNumConta(Integer.parseInt(l.entDados("Informe o N da conta: ")));
						
						c.criaContCor(c.getConta().getNumConta(), c.getConta().getSaldo(), c);
						
					break;
					
					case 2:
						
						System.out.print("Informe o valor do Deposito: ");
						valor = input.nextInt();
							
						c.getConta().depositar(valor);
						
						DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
				        System.out.println(""+dtf.format(LocalDateTime.now()));
				        
						System.out.println("\nSALDO: "+c.getConta().getSaldo());
						System.out.println();
						
					break;
					
					case 3:
						
						System.out.println("SALDO: "+c.getConta().getSaldo());
						System.out.print("\n\nInforme o valor de Saque: ");
						valor = input.nextInt();
						
						cc.setLimite(100);
						if(cc.sacar(valor, c)) {
							System.out.println("Saque efetuado com Sucesso, novo saldo eh de: "+c.getConta().getSaldo());
						} else {
							System.out.println("Saldo insuficiente para saque");
						}
							System.out.println("\nSALDO depois do Saque: "+c.getConta().getSaldo());
					
					break;
					
					case 4:

						System.out.println("CPF............: \t\t"+c.getCpf());
						System.out.println("NOME...........: \t\t"+c.getNome());
						System.out.println("EMAIL..........: \t\t"+c.getEmail());
						System.out.println("TELEFONE.......: \t\t"+c.getTelefone());
						System.out.println("CEP............: \t\t"+c.getEnder().getCep());
						System.out.println("RUA............: \t\t"+c.getEnder().getRua());
						System.out.println("N CASA.........: \t\t"+c.getEnder().getNum());
						System.out.println("BAIRRO.........: \t\t"+c.getEnder().getBairro());
						System.out.println("COMPLEMENTO....: \t\t"+c.getEnder().getComplemento());
						System.out.println("CIDADE.........: \t\t"+c.getEnder().getCidade());
						System.out.println("ESTADO.........: \t\t"+c.getEnder().getEstado());
						System.out.println("SALDO..........: \t\t"+c.getConta().getSaldo());
						System.out.println("N DA CONTA.....: \t\t"+c.getConta().getNumConta());
						
					break;
					
					case 5:
						
						System.out.println("\nSALDO: "+c.getConta().getSaldo());

					break;
					
					case 6:
						System.out.println("Saindo...");
						System.exit(0);
							
					default:
						System.out.println("Opcao Invalida!!!");
						operacoes();
						
					break;
					
				}				
		}
		
		System.out.print("\nDeseja voltar ao MENU: S/N ");
			opcao = input.next().charAt(0);
		System.out.println("\n");
			
		}while(opcao == 'S' || opcao == 's');
		
		System.exit(0);
		
	}
}