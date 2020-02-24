package Assimetrica;


public class KeyCriptDescript{

	private int keyCriptDescript;

	public KeyCriptDescript(ChavePrivada privateKey, int position) {
		this.keyCriptDescript = privateKey.getKeyPublic(position).getKey() + privateKey.getKeyPrivate();
	}

	
	public int getKeyCriptDescript() {
		return keyCriptDescript;
	}


	


	
	
	

}
