package cursojava.classesauxiliares;

import cursojava.interfaces.PermitirAcesso;

//Somente receber quem tem o contrato da Interface de PermitirAcesso e chamar o autenticar
public class FuncaoAutenticacao {
	
	private PermitirAcesso permitirAcesso;
	
	public boolean autenticar() {
		return permitirAcesso.autenticar();
	}
	public FuncaoAutenticacao(PermitirAcesso acesso) {
		this.permitirAcesso = acesso;
	}

}
