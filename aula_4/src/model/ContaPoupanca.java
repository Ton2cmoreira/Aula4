package model;

public class ContaPoupanca extends Conta {
      private double Rendimento;
	public ContaPoupanca(String email) {
		super(email);
		this.Rendimento = Rendimento;
		
	}

	public String Saque (double valorSaque) {
		if(valorSaque <= saldo) {
			
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
       
	public String Deposito(double valorDeposito) {
		saldo += (valorDeposito + (valorDeposito*Rendimento));
		return("Valor Sacado: " + valorDeposito
				+ "\nValor Saldo Após o Saque: "
				+ saldo);
	}
	
	public double getSaldo() {
		return saldo;
}
}

