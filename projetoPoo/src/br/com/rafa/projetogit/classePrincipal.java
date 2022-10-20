package br.com.rafa.projetogit;

public class classePrincipal {

	public static void main(String[] args) {
		
		classeConta objetoConta1 = new classeConta();//Instância um objeto
		objetoConta1.atributoPessoaConta = new classePessoa();
		
		objetoConta1.atributoPessoaConta.atributoNomePessoa = "Vitor Hugo";
		objetoConta1.atributoPessoaConta.atributoCPFPessoa = 1234;
		objetoConta1.atributoPessoaConta.atributoRGPessoa = 121212;
		objetoConta1.atributoNumeroConta = 1234;
		//objetoConta1.atributoSaldoConta = 45000.00 + (45000.00 * 0.20);//20%
		//objetoConta1.atributoSaldoConta = 45000.00;//20
		objetoConta1.metodoDepositar(450000.00);
				
		System.out.println(objetoConta1.atributoPessoaConta.atributoNomePessoa);
		System.out.println(objetoConta1.atributoPessoaConta.atributoCPFPessoa);
		System.out.println(objetoConta1.atributoPessoaConta.atributoRGPessoa);
		System.out.println(objetoConta1.atributoNumeroConta);
		System.out.println(objetoConta1.atributoSaldoConta);
		
		classeConta objetoConta2 = new classeConta();//Instância um objeto
		objetoConta2.atributoPessoaConta = new classePessoa();
		
		objetoConta2.atributoPessoaConta.atributoNomePessoa = "Handreya";
		objetoConta2.atributoPessoaConta.atributoCPFPessoa = 4321;
		objetoConta2.atributoPessoaConta.atributoRGPessoa = 343434;
		objetoConta2.atributoNumeroConta = 4321;
		//objetoConta2.atributoSaldoConta = 14000.50 + (14000.50 * 0.20);//20%
		//objetoConta2.atributoSaldoConta = 14000.50;
		objetoConta2.metodoDepositar(140000.50);
		
		System.out.println(objetoConta1.atributoPessoaConta.atributoNomePessoa);
		System.out.println(objetoConta1.atributoPessoaConta.atributoCPFPessoa);
		System.out.println(objetoConta1.atributoPessoaConta.atributoRGPessoa);
		System.out.println(objetoConta2.atributoPessoaConta);
		System.out.println(objetoConta2.atributoNumeroConta);
		System.out.println(objetoConta2.atributoSaldoConta);

	}

}
