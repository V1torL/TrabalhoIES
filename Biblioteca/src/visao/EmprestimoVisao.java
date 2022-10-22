package visao;

import java.io.IOException;
import java.util.List;

import Fabrica.Fabrica;
import controlador.Controlador;
import entidade.EmprestimoEntidade;
import entidade.Entidade;

public class EmprestimoVisao extends Visao{

	@Override
	public void menu(Fabrica fabrica) throws IOException {
		// TODO Auto-generated method stub
		int opcao = -1;
		EmprestimoEntidade emprestimo;
		Controlador controlador;
		
		EmprestimoEntidade emprestimoAntigo;
		EmprestimoEntidade emprestimoNovo;
		
		String nomeLivro;
		String matriculaAluno;
		
		String novoLivroNome;
		String novaMatriculaAluno;
		
		while(opcao != 0) 
		{
			System.out.println("1 - Cadastrar Emprestimo");
			System.out.println("2 - Visualizar Emprestimos");
			System.out.println("3 - Alterar Emprestimo");
			System.out.println("4 - Remover Emprestimo");
			System.out.println("5 - Buscar Emprestimo");
			System.out.println("0 - Retornar");
			
			opcao = Integer.parseInt(Console.readLine());
			
			 switch (opcao) {

		        case 1:
		        	emprestimo = (EmprestimoEntidade) fabrica.createEntidade();
		        	System.out.println("Nome Livro: ");
		        	nomeLivro = Console.readLine();
		        	emprestimo.setNomeLivro(nomeLivro);
		        	System.out.println("Matricula: ");
		        	matriculaAluno = Console.readLine();
		        	emprestimo.setMatriculaAluno(matriculaAluno);
		        	
		        	controlador = fabrica.createControlador();
		        	
		        	controlador.insereArray(emprestimo, opcao);
		            break;
		        case 2:
		        	controlador = fabrica.createControlador();
		        	controlador.visualizar();
		        	break;
		        case 3:
		        	emprestimoAntigo = (EmprestimoEntidade) fabrica.createEntidade();
		        	
		        	System.out.println("Nome do Livro que deseja alterar: ");
		        	nomeLivro = Console.readLine();
		        	emprestimoAntigo.setNomeLivro(nomeLivro);
		        	System.out.println("Matricula do Aluno: ");
		        	matriculaAluno = Console.readLine();
		        	emprestimoAntigo.setMatriculaAluno(matriculaAluno);
		        	
		        	emprestimoNovo = (EmprestimoEntidade) fabrica.createEntidade();
		        	
		        	System.out.println("Novo nome do Livro: ");
		        	novoLivroNome = Console.readLine();
		        	emprestimoNovo.setNomeLivro(novoLivroNome);
		        	System.out.println("Nova Matricula: ");
		        	novaMatriculaAluno = Console.readLine();
		        	emprestimoNovo.setMatriculaAluno(novaMatriculaAluno);
		        	
		        	controlador = fabrica.createControlador();
		        	
		        	controlador.alterar(emprestimoAntigo, emprestimoNovo);
		        	break;
		        case 4:
		        	emprestimo = (EmprestimoEntidade) fabrica.createEntidade();
		        	System.out.println("Nome Livro: ");
		        	nomeLivro = Console.readLine();
		        	emprestimo.setNomeLivro(nomeLivro);
		        	System.out.println("Matricula: ");
		        	matriculaAluno = Console.readLine();
		        	emprestimo.setMatriculaAluno(matriculaAluno);
		        	
		        	controlador = fabrica.createControlador();
		        	controlador.excluir(emprestimo);
		        	break;
		        case 5:
		        	emprestimo = (EmprestimoEntidade) fabrica.createEntidade();
		        	System.out.println("Nome Livro: ");
		        	nomeLivro = Console.readLine();
		        	emprestimo.setNomeLivro(nomeLivro);
		        	System.out.println("Matricula: ");
		        	matriculaAluno = Console.readLine();
		        	emprestimo.setMatriculaAluno(matriculaAluno);
		        	
		        	controlador = fabrica.createControlador();
		        	controlador.visualizarBusca();
		        	//Parei aqui
		        	break;
		        default:
		            System.out.println("Opcao Invalida!");
		     }
		}
	}

	@Override
	public void view(List<Entidade> Entidade) {
		// TODO Auto-generated method stub
		for(Entidade e: Entidade) {
			System.out.println("ID: " + e.getId());
			System.out.println("Nome Livro: " + e.getNomeLivro());
			System.out.println("Matricula: " + e.getMatriculaAluno());
			System.out.println("\n");
		}
		
	}

	@Override
	public void buscaPorId(Entidade emprestimo) {
		// TODO Auto-generated method stub
		System.out.println("ID: " + emprestimo.getId());
		System.out.println("Nome Livro: " + emprestimo.getNomeLivro());
		System.out.println("Matricula: " + emprestimo.getMatriculaAluno());
	}

	@Override
	public void buscaPorString(Entidade emprestimo) {
		// TODO Auto-generated method stub
		System.out.println("ID: " + emprestimo.getId());
		System.out.println("Nome Livro: " + emprestimo.getNomeLivro());
		System.out.println("Matricula: " + emprestimo.getMatriculaAluno());
	}

}
