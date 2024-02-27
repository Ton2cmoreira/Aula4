package model;

public class ContaCorrente extends Conta {
	private double valorTaxa;

	ContaCorrente(String email, double valorTaxa){
		super(email);
		this.valorTaxa = valorTaxa;
		// TODO Auto-generated constructor stub
	}
   
	public String Saque (double valorSaque) {
		if(valorSaque <= saldo) {
			saldo =- valorTaxa;
			saldo =- valorSaque;
			return (
					"Valor Sacado: " + valorSaque
					+"\nValor Saldo Após o Saque: "
					+ saldo	
					);
			
					
		} else {
			return "Saldo insuficiente";
		}
	}
       
	String Deposito(double valorDeposito) {
		saldo += valorDeposito;
		return("Valor Sacado: " + valorDeposito
				+ "\nValor Saldo Após o Saque: "
				+ saldo);
	}
	
	public double getSaldo() {
		return saldo;
}
}


