package controlador;

import java.io.IOException;

import entidade.Entidade;

public abstract class Controlador {

	public abstract void insereArray(Entidade entidade, int opcao) throws IOException;

	public abstract void alterar(Entidade entidadeAntiga, Entidade entidadeNova);

	public abstract void excluir(Entidade entidade);

	public abstract void visualizar();
	
	public abstract void buscaPorId();
	
	public abstract void buscaPorString();

	public abstract void visualizarBusca();
}
