package CriptografiaDeCesarUmParaMuitos;

public class Criptografia {

	private String mensagemCript;

	private Caracters letters = new Caracters();
	private ChavePrivada privateKey = new ChavePrivada();
	private KeyCriptDescript keyCriptDescript = new KeyCriptDescript();
	
	public void Criptografia(int indexPublicKey, String mensagem) {
		//keyCriptDescript.KeyCriptDescript(indexPublicKey);
		String codification = "";
		for(int i = 0; i < mensagem.length(); i ++) {
			
			if(mensagem.substring(i,i+1).equals(" ")) {
				codification = codification + " ";
				
			}
			
			else if(letters.letters.indexOf(mensagem.substring(i,i+1)) + keyCriptDescript.getKeyCriptDescript() >= letters.size() ){
				
				int calculo = letters.letters.indexOf(mensagem.substring(i,i+1)) + keyCriptDescript.getKeyCriptDescript() - (letters.size()-1);
				codification = codification + letters.letters.get(calculo);
			}
			
			else {
				codification = codification + letters.letters.get(letters.letters.indexOf(mensagem.substring(i,i+1)) + keyCriptDescript.getKeyCriptDescript());
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
