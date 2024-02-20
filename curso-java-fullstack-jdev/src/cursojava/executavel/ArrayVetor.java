package cursojava.executavel;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

public class ArrayVetor {

	public static void main(String[] args) {

		double[] notas = { 8.1, 9.3, 7.7, 8.3 };
		double[] notasSQL = { 8.3, 7.3, 6.7, 7.8 };

		// criação do aluno

		Aluno aluno = new Aluno();
		aluno.setNome("Kennedy");
		aluno.setNomeEscola("Jdev");

		// criação da disciplina
		Disciplina disciplina = new Disciplina();
		disciplina.setDisciplina("Java");
		disciplina.setNota(notas);

		// add disciplina para o aluno
		aluno.getDisciplinas().add(disciplina);

		// Segunda disciplina
		Disciplina disciplina2 = new Disciplina();
		disciplina2.setDisciplina("SQL");
		disciplina2.setNota(notasSQL);

		// add disciplina2 para o aluno
		aluno.getDisciplinas().add(disciplina2);

		// ---------------------------------------------------------

		// Manipulando Array de Objetos

		Aluno[] arrayAlunos = new Aluno[1];

		arrayAlunos[0] = aluno;

		for (int pos = 0; pos < arrayAlunos.length; pos++) {
			System.out.println("O nome do aluno é " + arrayAlunos[pos].getNome());

			for (Disciplina d : arrayAlunos[pos].getDisciplinas()) {
				System.out.println("O nome da disciplina é: " + d.getDisciplina());

				for (int posnota = 0; posnota < d.getNota().length; posnota++) {
					System.out.println("A nota número " + (posnota + 1) + " é " + d.getNota()[posnota]);
				}

			}
		}

	}

}
