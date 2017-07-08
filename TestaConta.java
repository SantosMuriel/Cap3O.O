public class TestaConta {
	Conta minhaConta = new Conta();
	
	minhaConta.nome = "Valter";
	minhaConta.saldo = 10000;

	minhaConta.saca(200);
	System.out.println(minhaConta.saldo);
	
	minhaConta.deposita(800);
	System.out.println(minhaConta.saldo);
}