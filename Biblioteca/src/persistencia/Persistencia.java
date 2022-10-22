package persistencia;

import java.io.IOException;

import entidade.Entidade;

public abstract class Persistencia {
	public abstract void inserir(Entidade entidade) throws IOException;
	public abstract void alterar(Entidade entidade1, Entidade entidade2);
	public abstract void excluir(Entidade entidade);
	public abstract void buscaPorId() ;
	public abstract void buscaPorString();
	public abstract void visualizar();
	public abstract void visualizarBusca();

}
