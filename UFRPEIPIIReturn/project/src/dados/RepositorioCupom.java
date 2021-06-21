package dados;


import java.util.HashMap;
import java.util.Map;

import model.Cupom;

public class RepositorioCupom  {

	Map<Integer,Cupom> cupons = new HashMap<Integer, Cupom>();	

	public void salvar(Cupom cupom) throws Exception {
		if (!cupons.containsValue(cupom))cupons.put(cupom.getId(), cupom);
		else throw new Exception("O cupom já existe");
	}

	
	public void update(Cupom cupom) throws Exception {
		if (cupons.containsKey(cupom.getId())) cupons.replace(cupom.getId(), cupom);
		else salvar(cupom);
	}

	
	public void deletar(Cupom cupom) throws Exception {
		if(cupons.containsKey(cupom.getId()))cupons.remove(cupom.getId(), cupom);
		else throw new Exception ("O cupom não existe no repositório");
	}

	
	public Cupom ler(int id) {
		return cupons.get(id);
	}
	

}
