package cursojava.classes;

import cursojava.interfaces.PermitirAcesso;

public class Diretor extends Pessoa implements PermitirAcesso {
	private String registroEducacao;
	private int tempoDirecao;
	private String Titulacao;

	private String login;
	private String senha;
	
	public Diretor(String login, String senha) {
		this.login = login;
		this.senha = senha;
		
	}
	public Diretor() {
	}
	
	public String getRegistroEducacao() {
		return registroEducacao;
	}

	public void setRegistroEducacao(String registroEducacao) {
		this.registroEducacao = registroEducacao;
	}

	public int getTempoDirecao() {
		return tempoDirecao;
	}

	public void setTempoDirecao(int tempoDirecao) {
		this.tempoDirecao = tempoDirecao;
	}

	public String getTitulacao() {
		return Titulacao;
	}

	public void setTitulacao(String titulacao) {
		Titulacao = titulacao;
	}

	@Override
	public String toString() {
		return "Diretor [registroEducacao=" + registroEducacao + ", tempoDirecao=" + tempoDirecao + ", Titulacao="
				+ Titulacao + "]";
	}

	@Override
	public double salario() {
		return 3900.88;
	}
	@Override
	public boolean autenticar(String login, String senha) {

		this.login = login;
		this.senha = senha;

		return autenticar();
	}

	@Override
	public boolean autenticar() {
		return login.equals("123") && senha.equals("123");

	}

}
