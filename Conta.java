public class Conta {
	String nome;
	int numero;
	double saldo;
	double limite;

	double saca(double valor) {
		this.saldo -= valor;
		return this.saldo; 
	}
	double deposita(double valor) {
		this.saldo += valor;
		return this.saldo;
	}
}