package Assimetrica;

import java.util.ArrayList;

public class KeyCriptDescript{

	private int keyCriptDescript;
	
	public KeyCriptDescript() {

	}
	
	
	public KeyCriptDescript(ChavePrivada privateKey, int position) {
		this.keyCriptDescript = privateKey.getKey(position).getKey() + privateKey.getKey();
	}

	
	public int getKeyCriptDescript() {
		return keyCriptDescript;
	}


	


	
	
	

}
