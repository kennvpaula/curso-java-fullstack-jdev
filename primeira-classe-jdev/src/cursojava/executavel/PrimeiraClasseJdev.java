package cursojava.executavel;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;

import curso.java.excecao.ExcecaoProcessarNota;
import cursojava.classes.Aluno;
import cursojava.classes.Diretor;
import cursojava.classes.Disciplina;
import cursojava.classesauxiliares.FuncaoAutenticacao;
import cursojava.constantes.StatusAluno;

public class PrimeiraClasseJdev {
	public static void main(String[] args) {
		
	

		try {
			
			lerArquivo();

			String login = JOptionPane.showInputDialog("Informe o login");
			String senha = JOptionPane.showInputDialog("Informe a senha");

			if (new FuncaoAutenticacao(new Diretor(login, senha)).autenticar()) { // vou travar o contrato para
																					// autorizar somente quem realmente
																					// tem o contrato
				// 100% legítimo

				// Criando a lista de alunos de forma dinâmica
				List<Aluno> alunos = new ArrayList<Aluno>();

				// K = key(ex. número da sua casa; V = valor
				// Lista e dentro da lista tem uma chave que identifica outra lista
				// HashMap é uma lista que dentro dela temos uma chave que identifica uma
				// sequência de valores também

				HashMap<String, List<Aluno>> maps = new HashMap<String, List<Aluno>>();

				for (int quantidade = 1; quantidade <= 2; quantidade++) {

					String nome = JOptionPane.showInputDialog("Qual é o nome do aluno " + quantidade + "?");
					String idade = JOptionPane.showInputDialog("Qual é a idade do aluno?");

					/*
					 * String dataNascimento =
					 * JOptionPane.showInputDialog("Qual é a data de nascimento do aluno?"); String
					 * rg = JOptionPane.showInputDialog("Qual é o rg?"); String cpf =
					 * JOptionPane.showInputDialog("Qual é o cpf?"); String nomeMae =
					 * JOptionPane.showInputDialog("Qual é o nome da mãe?"); String nomePai =
					 * JOptionPane.showInputDialog("Qual é o nome do pai?"); String dataMatricula =
					 * JOptionPane.showInputDialog("Qual é data da matrícula?"); String serie =
					 * JOptionPane.showInputDialog("Qual é a série?"); String nomeEscola =
					 * JOptionPane.showInputDialog("Qual é o nome da escola?");
					 */

					Aluno aluno1 = new Aluno();
					aluno1.setNome(nome);

					// Conversão da String do ShowInput para int

					aluno1.setIdade(Integer.valueOf(idade));
					/*
					 * aluno1.setDataNascimento(dataNascimento); aluno1.setRegistroGeral(rg);
					 * aluno1.setNumeroCpf(cpf); aluno1.setNomeMae(nomeMae);
					 * aluno1.setNomePai(nomePai); aluno1.setDataMatricula(dataMatricula);
					 * aluno1.setSerieMatriculado(serie); aluno1.setNomeEscola(nomeEscola);
					 */

					// adicionando disciplinas de forma dinâmica
					for (int pos = 1; pos <= 1; pos++) {
						String nomeDisciplina = JOptionPane.showInputDialog("Qual é a disciplina" + pos + "?");
						String notaDisciplina = JOptionPane.showInputDialog("Qual é a nota" + pos + "?");

						Disciplina disciplina = new Disciplina();
						disciplina.setDisciplina(nomeDisciplina);
			//			disciplina.setNota(Double.valueOf(notaDisciplina));

						aluno1.getDisciplinas().add(disciplina);
					}

					// removendo disciplina
					int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina?");
					if (escolha == 0) {
						String disciplinaRemover = JOptionPane.showInputDialog("Qual a disciplina 1, 2, 3 ou 4?");
						aluno1.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue() - 1);
					}

					// percorrendo a lista de alunos pela posição - o bloco fechou aqui
					alunos.add(aluno1);

				}

				// inicialização da chave, com a lista vazia e add o aluno no for
				maps.put(StatusAluno.APROVADO, new ArrayList<Aluno>());
				maps.put(StatusAluno.REPROVADO, new ArrayList<Aluno>());
				maps.put(StatusAluno.RECUPERACAO, new ArrayList<Aluno>());

				// Separação das listas
				for (Aluno aluno : alunos) {
					if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.APROVADO)) {
						maps.get(StatusAluno.APROVADO).add(aluno);

					} else if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.RECUPERACAO)) {
						maps.get(StatusAluno.RECUPERACAO).add(aluno);

					} else {
						maps.get(StatusAluno.REPROVADO).add(aluno);
					}

				}
				// Processando listas

				System.out.println("------------------ Lista dos aprovados ----------------------");
				for (Aluno aluno : maps.get(StatusAluno.APROVADO)) {
					System.out.println("Aluno: " + aluno.getNome() + " = " + "Resultado = " + aluno.getAlunoAprovado2()
							+ " na matéria " + aluno.getDisciplinas() + " com média de  " + aluno.getMediaNota());

				}
				System.out.println("------------------ Lista dos reprovados ----------------------");
				for (Aluno aluno : maps.get(StatusAluno.REPROVADO)) {
					System.out.println("Aluno: " + aluno.getNome() + " = " + "Resultado = " + aluno.getAlunoAprovado2()
							+ " na matéria " + aluno.getDisciplinas() + " com média de  " + aluno.getMediaNota());
				}
				System.out.println("------------------ Lista de Recuperação ----------------------");
				for (Aluno aluno : maps.get(StatusAluno.RECUPERACAO)) {
					System.out.println("Aluno: " + aluno.getNome() + " = " + "Resultado = " + aluno.getAlunoAprovado2()
							+ " na matéria " + aluno.getDisciplinas() + " com média de  " + aluno.getMediaNota());

				}

			} else {
				JOptionPane.showMessageDialog(null, "Acesso não permitido");
			}

		} catch (NumberFormatException e) {// Captura somente a exceção NumberFormatException

			StringBuilder saida = new StringBuilder();

			e.printStackTrace(); // imprime erro no conssole

			// Mensagem do erro ou causa

			System.out.println(" Mensagem: " + e.getMessage());

			for (int i = 0; i < e.getStackTrace().length; i++) {

				saida.append("\n Classe de erro: " + e.getStackTrace()[i].getClassName());
				saida.append("\n Método de erro: " + e.getStackTrace()[i].getMethodName());
				saida.append("\n Linha de erro: " + e.getStackTrace()[i].getLineNumber());
				saida.append("\n Classe de erro: " + e.getClass().getName());

			}

			JOptionPane.showMessageDialog(null, "Erro de conversão de número" + saida.toString());

		} catch (NullPointerException e) {// Captura somente a exceção NullPointerException
			JOptionPane.showMessageDialog(null, "Um Null Pointer exception" + e.getClass());

		} catch (ExcecaoProcessarNota e) { // Captura todas as exceções que não prevemos
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "Erro da exceção customizada: " + e.getClass().getName());

		} finally { // Sempre é executado ocorrendo eros ou não. É sempre usado quando precisa
					// executar um processo acontecendo erro ou não
			JOptionPane.showMessageDialog(null, "Obrigado por aprender Java comigo");

		}

	}

	public static void lerArquivo() throws ExcecaoProcessarNota {
		try {
			File fil = new File("c://lines.txt");
			Scanner scanner = new Scanner(fil);
		} catch (FileNotFoundException e) {
			throw new ExcecaoProcessarNota(e.getMessage());
		}
	}
}
