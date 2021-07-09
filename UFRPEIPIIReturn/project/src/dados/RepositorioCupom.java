package dados;

import java.util.HashMap;
import java.util.Map;

import model.Cupom;

public class RepositorioCupom  {

	Map<String,Cupom> cupoms = new HashMap<String, Cupom>();
	
	public void salvar(Cupom cupom) throws Exception{
		if(!cupoms.containsValue(cupom))cupoms.put(cupom.getNumero(), cupom);
		else throw new Exception("O Cupom Já Existe");
	}

	public void update(Cupom cupom) throws Exception{
		if (cupoms.containsKey(cupom.getNumero())) cupoms.replace(cupom.getNumero(), cupom);
	}
	
	public void deletar(Cupom cupom) throws Exception{
		if (cupoms.containsKey(cupom.getNumero()))cupoms.remove(cupom.getNumero(), cupom);
	}
	
	/*public Cupom ler(Integer numero) {
		return cupoms.get(numero);
	}*/
	
	public Cupom ler(String numero) {
		return cupoms.get(numero);
	}

}
