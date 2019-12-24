package Assimetrica;

public class Descriptografia {

	private String mensagemDesCript;

	private Letters letters = new Letters();
	private ChavePrivada privateKey;
	private KeyCriptDescript keyCriptDescript = new KeyCriptDescript();
	/*
	public void Descriptografia(String mensagemCript) {
		String Descodification = "";
		for(int i = 0; i < mensagemCript.length(); i ++) {
			
			if(mensagemCript.substring(i,i+1).equals(" ")) {
				Descodification = Descodification + " ";
			
			}
			
			else if(letters.letters.indexOf(mensagemCript.substring(i,i+1)) - keyCriptDescript.getKeyCriptDescript() < 0 ){
				
				int calculo = (letters.size() + (letters.letters.indexOf(mensagemCript.substring(i,i+1)) - keyCriptDescript.getKeyCriptDescript() - 1));
				Descodification = Descodification + letters.letters.get(calculo);
			}
			
			else {
				Descodification = Descodification + letters.letters.get(letters.letters.indexOf(mensagemCript.substring(i,i+1)) - keyCriptDescript.getKeyCriptDescript()); 
			}
		}
		
		setMensagemDesCript(Descodification);
	}
*/
	public String getMensagemDesCript() {
		return this.mensagemDesCript;
	}

	public void setMensagemDesCript(String mensagemDesCript) {
		this.mensagemDesCript = mensagemDesCript;
	}

	

}
