package repositorios;

import java.util.HashMap;
import java.util.Map;

import model.Guiche;



public class RepositorioGuiche   {

	Map<Integer,Guiche> guiches = new HashMap<Integer, Guiche>();	

	public void salvar(Guiche guiche) throws Exception {
		if (!guiches.containsValue(guiche))guiches.put(guiche.getIdentificador(), guiche);
		else throw new Exception("O funcionário já existe");
	}

	
	public void update(Guiche guiche) throws Exception {
		if (guiches.containsKey(guiche.getIdentificador())) guiches.replace(guiche.getIdentificador(), guiche);
		else salvar(guiche);
	}

	
	public void deletar(Guiche guiche) throws Exception {
		if(guiches.containsKey(guiche.getIdentificador()))guiches.remove(guiche.getIdentificador(), guiche);
		else throw new Exception ("O funcionário não existe no repositório");
	}

	
	public Guiche ler(Integer numero) {
		return guiches.get(numero);
	}
}
