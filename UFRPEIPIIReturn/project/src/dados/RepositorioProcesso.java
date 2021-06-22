package dados;

import java.util.HashMap;
import java.util.Map;

import model.Processo;

public class RepositorioProcesso   {

	
	Map<String,Processo> processos = new HashMap<String, Processo>();	

	public void salvar(Processo processo) throws Exception {
		if (!processos.containsValue(processo))processos.put(processo.getNumero(), processo);
		else throw new Exception("O processo em quest�o j� existe no sistema");
	}

	
	public void update(Processo processo) throws Exception {
		if (processos.containsKey(processo.getNumero())) processos.replace(processo.getNumero(), processo);
		else salvar(processo);
	}

	
	public void deletar(Processo processo) throws Exception {
		if(processos.containsKey(processo.getNumero()))processos.remove(processo.getNumero(), processo);
		else throw new Exception ("O processo n�o existe no reposit�rio");
	}

	
	public Processo ler(String numero) {
		return processos.get(numero);
	}
	

}
