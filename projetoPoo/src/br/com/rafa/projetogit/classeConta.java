package br.com.rafa.projetogit;

public class classeConta {

	int atributoNumeroConta;//0
	double atributoSaldoConta;//0.0
	
	classePessoa atributoPessoaConta;
	
	void metodoDepositar(double parametroValor) { //método
		
		//this.atributoSaldoConta += parametroValor;
		this.atributoSaldoConta = this.atributoSaldoConta + parametroValor + (parametroValor * .1);
	}
}
