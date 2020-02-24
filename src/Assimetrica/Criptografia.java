 package Assimetrica;

public class Criptografia extends KeyCriptDescript{

	private Letters letters = new Letters();
	private String mensagem;

	public Criptografia(ChavePrivada privateKey, int position, String mensagem) {
		super(privateKey, position);
		this.mensagem = mensagem;
	}

	public String Criptografia() {
		String codification = "";
		for(int i = 0; i < getMensagem().length(); i ++) {
			
			if(getMensagem().substring(i,i+ 1).equals(" ")) {
				codification = codification + " ";
			}
			
			else if(letters.letters.indexOf(getMensagem().substring(i,i+1).toLowerCase()) + getKeyCriptDescript() >= letters.size() ){
				
				int calculo = (letters.letters.indexOf(getMensagem().substring(i,i+1).toLowerCase()) + getKeyCriptDescript() - (letters.size()));
				codification = codification + letters.letters.get(calculo);
			}
			
			else {
				codification = codification + letters.letters.get(letters.letters.indexOf(mensagem.substring(i,i+1).toLowerCase()) + getKeyCriptDescript());
			}			
		}
		
		return codification;
		
	}

	public String Descriptografia(int privateKey){

		String descCodification = "";
		for(int i = 0; i < Criptografia().length(); i ++) {

			if(Criptografia().substring(i,i+ 1).equals(" ")) {
				descCodification = descCodification + " ";
			}

			else if(letters.letters.indexOf(Criptografia().substring(i,i+1).toLowerCase()) - getKeyCriptDescript() < 0){

				int calculo = (letters.letters.indexOf(Criptografia().substring(i,i+1).toLowerCase()) - getKeyCriptDescript()) + letters.size();
				descCodification = descCodification + letters.letters.get(calculo);
			}

			else {
				descCodification = descCodification + letters.letters.get(letters.letters.indexOf(Criptografia().substring(i,i+1).toLowerCase()) - getKeyCriptDescript());
			}
		}

		return descCodification;

	}



	public String getMensagem() {
		return this.mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
	
	
	
	
	
}
