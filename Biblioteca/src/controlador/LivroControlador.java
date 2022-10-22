package controlador;

import java.io.IOException;

import Fabrica.Fabrica;
import entidade.Entidade;
import persistencia.Persistencia;

public class LivroControlador extends Controlador {
	Fabrica fabrica = Fabrica.getFactory("Livro");
	Persistencia persistencia;
	@Override
	public void insereArray(Entidade livro, int opcao) throws IOException {
		// TODO Auto-generated method stub
		persistencia = fabrica.createPersistencia();
		persistencia.inserir(livro);
	}
	
	public void alterar(Entidade livroAntigo, Entidade livroNovo) {
		// TODO Auto-generated method stub
		persistencia = fabrica.createPersistencia();
		persistencia.alterar(livroAntigo,livroNovo);
		
	}
	
	public void excluir(Entidade livro) {
		// TODO Auto-generated method stub
		persistencia = fabrica.createPersistencia();
		persistencia.excluir(livro);
	}

	@Override
	public void visualizar() {
		// TODO Auto-generated method stub
		persistencia = fabrica.createPersistencia();
		persistencia.visualizar();
	}

	@Override
	public void buscaPorId() {
		// TODO Auto-generated method stub
		persistencia = fabrica.createPersistencia();
		persistencia.buscaPorId();
	}

	@Override
	public void buscaPorString() {
		// TODO Auto-generated method stub
		persistencia = fabrica.createPersistencia();
		persistencia.buscaPorString();
	}

	@Override
	public void visualizarBusca() {
		// TODO Auto-generated method stub
		persistencia = fabrica.createPersistencia();
		persistencia.visualizarBusca();
	}
	
}
