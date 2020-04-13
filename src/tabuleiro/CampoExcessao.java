package tabuleiro;

public class CampoExcessao extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	//Construtor para repassar a mensagem para o construtor RunTimeException
	public CampoExcessao(String smg) {
		super(smg);
	}

	

}
