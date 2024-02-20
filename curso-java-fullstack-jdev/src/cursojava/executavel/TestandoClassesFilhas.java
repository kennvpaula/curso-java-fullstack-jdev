package cursojava.executavel;

import cursojava.classes.Aluno;
import cursojava.classes.Diretor;
import cursojava.classes.Pessoa;
import cursojava.classes.Secretario;

public class TestandoClassesFilhas {

	public static void main(String[] args) {

		Aluno aluno = new Aluno();
		aluno.setNome("Kennedy");
		aluno.setNomeEscola("Jdev");
		aluno.setIdade(22);

		Diretor diretor = new Diretor();
		diretor.setRegistroGeral("545158");
		diretor.setNome("Luan");
		diretor.setIdade(45);

		Secretario secretario = new Secretario();
		secretario.setExperiencia("Administracao");
		secretario.setNumeroCpf("123456");
		secretario.setIdade(25);
		secretario.setNome("Weslley");

		System.out.println(aluno);
		System.out.println(diretor);
		System.out.println(secretario);

		System.out.println(aluno.pessoaMaiorIdade() + " - " + aluno.msgMaiorIdade());
		System.out.println(diretor.pessoaMaiorIdade());
		System.out.println(secretario.pessoaMaiorIdade());

		System.out.println("Salário é " + aluno.salario());
		System.out.println("Salário é " + secretario.salario());
		System.out.println("Salário é " + diretor.salario());

		teste(aluno);
		teste(diretor);
		teste(secretario);

	}

	public static void teste(Pessoa pessoa) {
		System.out.println("Essa pessoa é demais " + pessoa.getNome() + " e o salário é de " + pessoa.salario());
	}

}
