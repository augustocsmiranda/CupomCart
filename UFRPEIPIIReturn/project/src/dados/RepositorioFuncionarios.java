package dados;

import java.util.HashMap;
import java.util.Map;

import model.Funcionario;


public class RepositorioFuncionarios  {

	Map<String,Funcionario> funcionarios = new HashMap<String, Funcionario>();	

	public void salvar(Funcionario funcionario) throws Exception {
		if (!funcionarios.containsValue(funcionario))funcionarios.put(funcionario.getCpf(), funcionario);
		else throw new Exception("O funcionário já existe");
	}

	
	public void update(Funcionario funcionario) throws Exception {
		if (funcionarios.containsKey(funcionario.getCpf())) funcionarios.replace(funcionario.getCpf(), funcionario);
		else salvar(funcionario);
	}

	
	public void deletar(Funcionario funcionario) throws Exception {
		if(funcionarios.containsKey(funcionario.getCpf()))funcionarios.remove(funcionario.getCpf(), funcionario);
		else throw new Exception ("O funcionário não existe no repositório");
	}

	
	public Funcionario ler(String cpf) {
		return funcionarios.get(cpf);
	}
	

}
