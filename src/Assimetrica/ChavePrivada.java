package Assimetrica;

import java.util.ArrayList;
import java.util.List;

public class ChavePrivada {
	
	
	private int keyPrivate;
	
	public ChavePrivada(int keyPrivate) {
		this.keyPrivate = keyPrivate;
	}
	
	
	private List<ChavesPublicas> keyPublic = new ArrayList<>();
	
	public void addKeyPublic(ChavesPublicas key) {
		keyPublic.add(key);
	}
	public void remKey(ChavesPublicas key) {
		keyPublic.remove(key);
	}
	public int sizeKeysPublics() {
		return keyPublic.size();
	}


	public ChavesPublicas getKeyPublic(int i) {
		return keyPublic.get(i);
	}
	public List<ChavesPublicas> getKeysPublics(){return keyPublic ; }
	public int getKeyPrivate() {
		return this.keyPrivate;
	}

	public void setKeyPrivate(int keyPrivate) {
		this.keyPrivate = keyPrivate;
	}
	
	
	

}
