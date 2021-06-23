package excecoes;

public class CampoInvalidoException extends Exception{
	
	private static final long serialVersionUID = 6452276390416179223L;

	public CampoInvalidoException(String campo) {
		System.out.printf("O campo %s possui valor inválido.", campo );
	}

}
