package visao;

import java.io.IOException;
import java.util.List;

import Fabrica.Fabrica;
import controlador.Controlador;
import entidade.LivroEntidade;
import entidade.Entidade;

public class LivroVisao extends Visao{	
	@Override
	public void menu(Fabrica fabricaEspecifica) throws IOException {
		// TODO Auto-generated method stub       
		int opcao = -1;
		LivroEntidade livro;
		Controlador controlador;
		
		LivroEntidade livroAntigo;
		LivroEntidade livroNovo;
		
		String nomeLivro;
		
		String novoLivro;
		
		while(opcao != 0) 
		{
			System.out.println("1 - Cadastrar Livro");
			System.out.println("2 - Visualizar Livro");
			System.out.println("3 - Alterar Livro");
			System.out.println("4 - Excluir");
			System.out.println("5 - Buscar Livro");
			System.out.println("0 - Retornar");
			
			opcao = Integer.parseInt(Console.readLine());
			
			 switch (opcao) {

		        case 1:
		        	livro = (LivroEntidade) fabricaEspecifica.createEntidade();
		        	System.out.println("Nome do Livro: ");
		        	nomeLivro = Console.readLine();
		        	livro.setNomeLivro(nomeLivro);
		        	
		        	controlador = fabricaEspecifica.createControlador();
		        	
		        	controlador.insereArray(livro, opcao);
		            break;
		        case 2:
		        	controlador = fabricaEspecifica.createControlador();
		        	controlador.visualizar();
		        	break;
		        case 3:
		        	livroAntigo = (LivroEntidade) fabricaEspecifica.createEntidade();
		        	
		        	System.out.println("Nome do Livro que deseja alterar: ");
		        	nomeLivro = Console.readLine();
		        	livroAntigo.setNomeLivro(nomeLivro);
		        	
		        	livroNovo = (LivroEntidade) fabricaEspecifica.createEntidade();
		        	
		        	System.out.println("Novo nome do Livro: ");
		        	novoLivro = Console.readLine();
		        	livroNovo.setNomeLivro(novoLivro);
		  
		        	
		        	controlador = fabricaEspecifica.createControlador();
		        	
		        	controlador.alterar(livroAntigo, livroNovo);
		        	break;
		        case 4:
		        	livro = (LivroEntidade) fabricaEspecifica.createEntidade();
		        	System.out.println("Nome Livro: ");
		        	nomeLivro = Console.readLine();
		        	livro.setNomeLivro(nomeLivro);
		        	
		        	controlador = fabricaEspecifica.createControlador();
		        	controlador.excluir(livro);
		        	break;
		        case 5:
		        	livro = (LivroEntidade) fabricaEspecifica.createEntidade();
		        	System.out.println("Nome Livro: ");
		        	nomeLivro = Console.readLine();
		        	livro.setNomeLivro(nomeLivro);
		        	
		        	controlador = fabricaEspecifica.createControlador();
		        	controlador.visualizarBusca();
		        	break;
		        default:
		            System.out.println("Opcao Invalida!");
		     }
		}
		
	}

	@Override
	public void view(List<Entidade> Entidade) {
		// TODO Auto-generated method stub
		for(Entidade l: Entidade) {
			System.out.println("\n");
			System.out.println("ID: " + l.getId());
			System.out.println("Nome Livro: " + l.getNomeLivro());
		}
	}

	@Override
	public void buscaPorId(Entidade livro) {
		// TODO Auto-generated method stub
		System.out.println("ID: " + livro.getId());
		System.out.println("Nome Livro: " + livro.getNomeLivro());
	}

	@Override
	public void buscaPorString(Entidade livro) {
		// TODO Auto-generated method stub
		System.out.println("ID: " + livro.getId());
		System.out.println("Nome Livro: " + livro.getNomeLivro());
	}
}
