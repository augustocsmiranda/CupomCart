package dados;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import model.Funcionario;

public class RepositorioGenerico<T> implements IRepositorioGenerico<T> {
	
	protected List<T> elementos;	

	@Override
	public void salvar(T obj) throws Exception {
		for(T objeto:elementos) {
			if (objeto.equals(objeto))throw new Exception();
		}
		if (obj != null)elementos.add(obj);
		else throw new Exception("Dados inválidos");		
	}

	@Override
	public List<T> listar() {
		return this.elementos;
	}

	@Override
	public void deletar(Object obj) throws Exception {
		if (this.elementos.contains(obj)) {
            this.elementos.remove(this.elementos.indexOf(obj));
        } else {
            throw new Exception();
        }
        		
	}

	@Override
	public void update(Object novoObj) throws Exception {
		// TODO Auto-generated method stub
		
	}
	
	

	

}
