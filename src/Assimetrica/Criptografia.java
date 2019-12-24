 package Assimetrica;

public class Criptografia extends KeyCriptDescript{

	private String mensagemCript;
	private String mensagemDesript;
	private Letters letters = new Letters();
	private ChavePrivada privateKey;
	private KeyCriptDescript keyCriptDescript;
	
	
	public Criptografia(String mensagemCript, ChavePrivada privateKey,
			KeyCriptDescript keyCriptDescript) {
		super();
		
	}

	public Criptografia(ChavePrivada privateKey, int position, String mensagem) {
		keyCriptDescript = new KeyCriptDescript(privateKey, position);
		String codification = "";
		for(int i = 0; i < mensagem.length(); i ++) {
			
			if(mensagem.substring(i,i+ 1).equals(" ")) {
				codification = codification + " ";
			}
			
			else if(letters.letters.indexOf(mensagem.substring(i,i+1).toLowerCase()) + keyCriptDescript.getKeyCriptDescript() >= letters.size() ){
				
				int calculo = (letters.letters.indexOf(mensagem.substring(i,i+1).toLowerCase()) + keyCriptDescript.getKeyCriptDescript() - (letters.size()));
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
	
	
}
