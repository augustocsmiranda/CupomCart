package dados;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import model.Funcionario;

public class RepositorioGenerico<T> implements IRepositorioGenerico<T> {
	
	protected List<T> elementos;	

	   public RepositorioGenerico( ) {
	        this.elementos = new ArrayList<>();
	    }
	
	@Override
	public void salvar(T novoObj) throws Exception {
		 if (!this.elementos.contains(novoObj)) {
	            this.elementos.add(novoObj);
	        } else throw new Exception("Dados inválidos");	        
		 }
	

	@Override
	public List<T> listar() {
		return Collections.unmodifiableList(this.elementos);
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
		  if (this.elementos.contains(novoObj)) {
	            int index = this.elementos.indexOf(novoObj);
	            this.elementos.set(index, (T) novoObj);
	        } else {
	            throw new Exception();
	        }		
	}
	
	
//	public void salvar(Funcionario funcionario) throws Exception {
//		if (!elementos.contains(funcionario))elementos.put(funcionario.getCpf(), funcionario);
//		else throw new Exception("O funcionário já existe");
//	}
//
//	
//	public void update(Funcionario funcionario) throws Exception {
//		if (elementos.contains(funcionario.getCpf())) elementos.replace(funcionario.getCpf(), funcionario);
//		else salvar(funcionario);
//	}
//
//	
//	public void deletar(Funcionario funcionario) throws Exception {
//		if(funcionarios.containsKey(funcionario.getCpf()))funcionarios.remove(funcionario.getCpf(), funcionario);
//		else throw new Exception ("O funcionário não existe no repositório");
//	}
//
//	
//	public Funcionario ler(String cpf) {
//		return funcionarios.get(cpf);
//	}

	

}
