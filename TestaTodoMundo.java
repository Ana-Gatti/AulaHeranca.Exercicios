package br.com.generation.heranca;

public class TestaTodoMundo {

	public static void main(String[] args) {

		Professor prof = new Professor();
		FuncAdm funcAdm = new FuncAdm();
		Aluno aluno = new Aluno();

		prof.setNome("Jeff");
		prof.setIdade(25);
		prof.setEndereco("Rua: Das Flores, 190");
		prof.setSalario(1000.00);
		prof.setDisciplina("Java");

		System.out.println("Professor:");
		System.out.println("Nome: " + prof.getNome());
		System.out.println("Idade: " + prof.getIdade());
		System.out.println("Endereço: " + prof.getEndereco());
		System.out.println("Disciplina: " + prof.getDisciplina());
		System.out.println("Salario: " + prof.getSalario());
		System.out.println();

		funcAdm.setNome("Esmeralda");
		funcAdm.setIdade(20);
		funcAdm.setEndereco("Rua: Do Barulho, 200.. apto 220");
		funcAdm.setSalario(800.00);
		funcAdm.setSetor("Administrativo");
		funcAdm.setFuncao("Auxiliar Administrativo");

		System.out.println();
		System.out.println("Funcionário(a) Administrativo");
		System.out.println("Nome: " + funcAdm.getNome());
		System.out.println("Idade: " + funcAdm.getIdade());
		System.out.println("Endereço: " + funcAdm.getEndereco());
		System.out.println("Salário: " + funcAdm.getSalario());
		System.out.println("Função: " + funcAdm.getFuncao());
		System.out.println("Setor: " + funcAdm.getSetor());
		System.out.println();

		aluno.setNome("Ana");
		aluno.setIdade(29);
		aluno.setEndereco("Rua Generation, 10");
		aluno.setSemestre("2º");
		aluno.setCurso("Análise e Desenvolvimento de Sistemas");

		System.out.println("Aluno");
		System.out.println("Nome: " + aluno.getNome());
		System.out.println("Idade: " + aluno.getIdade());
		System.out.println("Endereço: " + aluno.getEndereco());
		System.out.println("Semestre: " + aluno.getSemestre());
		System.out.println("Curso: " + aluno.getCurso());

	}

}
