public class GerenciamentoDeContas {
	public static void main(String[] args) {		
		Conta conta1 = new Conta();
		conta1.nome = "HFrota";
		conta1.numero = 10;
		conta1.saldo = 20;
		conta1.limite = 100;

		System.out.println("--------------------------------------------");
		System.ou.println("CONTA");
		System.out.println("--------------------------------------------");
		System.out.println("Dono: " + conta1.nome);
		System.out.println("Numero: " + conta1.numero);
		System.out.println("Saldo: " + conta1.saldo);
		System.out.println("Limite: " + conta1.limite);
		System.out.println("--------------------------------------------");

		Conta conta2 = new Conta();
		conta2.nome = "RPonte";
		conta2.numero = 43;
		conta2.saldo = 299;
		conta2.limite = 900;
		
		System.ou.println("CONTA");
		System.out.println("--------------------------------------------");
		System.out.println("Dono: " + conta2.nome);
		System.out.println("Numero: " + conta2.numero);
		System.out.println("Saldo: " + conta2.saldo);
		System.out.println("Limite: " + conta2.limite);
		System.out.println("--------------------------------------------");
	}
}