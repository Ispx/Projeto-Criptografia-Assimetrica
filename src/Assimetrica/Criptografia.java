 package Assimetrica;

public class Criptografia extends KeyCriptDescript{

	private String mensagemCript;

	private Letters letters = new Letters();
	private ChavePrivada privateKey;
	private KeyCriptDescript keyCriptDescript;
	private String mensagem;
	


	public Criptografia(ChavePrivada privateKey, int position, String mensagem) {
		super(privateKey, position);
		this.mensagem = mensagem;
		keyCriptDescript = new KeyCriptDescript(privateKey,position);
	}

	public void Criptografia() {
		String codification = "";
		for(int i = 0; i < getMensagem().length(); i ++) {
			
			if(getMensagem().substring(i,i+ 1).equals(" ")) {
				codification = codification + " ";
			}
			
			else if(letters.letters.indexOf(getMensagem().substring(i,i+1).toLowerCase()) + keyCriptDescript.getKeyCriptDescript() >= letters.size() ){
				
				int calculo = (letters.letters.indexOf(getMensagem().substring(i,i+1).toLowerCase()) + keyCriptDescript.getKeyCriptDescript() - (letters.size()));
				codification = codification + letters.letters.get(calculo);
			}
			
			else {
				codification = codification + letters.letters.get(letters.letters.indexOf(mensagem.substring(i,i+1).toLowerCase()) + keyCriptDescript.getKeyCriptDescript());
			}			
		}
		
		setMensagemCript(codification);
		
	}

	public String getMensagemCript() {
		return this.mensagemCript;
	}

	public void setMensagemCript(String mensagemCript) {
		this.mensagemCript = mensagemCript;
	}

	public String getMensagem() {
		return this.mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
	
	
	
	
	
}
