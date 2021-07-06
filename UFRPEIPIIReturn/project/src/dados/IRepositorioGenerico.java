package dados;

import java.util.List;

public interface IRepositorioGenerico<T>{

	
	 void salvar(T obj) throws Exception;
	    
	 List<T> listar();
	    
	 void deletar(T obj) throws Exception;

	 void update(T novoObj) throws Exception;
	
}
