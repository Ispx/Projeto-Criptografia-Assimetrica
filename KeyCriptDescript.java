package CriptografiaDeCesarUmParaMuitos;

import java.util.ArrayList;

public class KeyCriptDescript extends ChavePrivada{

	private int keyCriptDescript;
	
	public KeyCriptDescript() {
		
	}

	public KeyCriptDescript(int indexPublicKey) {
		super();
		this.keyCriptDescript = getKey(indexPublicKey).getKey();
	}

	
	public int getKeyCriptDescript() {
		return keyCriptDescript;
	}


	
	
	

}
