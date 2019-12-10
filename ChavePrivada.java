package CriptografiaDeCesarUmParaMuitos;

import java.util.ArrayList;

public class ChavePrivada {
	
	private int key;
	protected ArrayList<ChavesPublicas> keys = new ArrayList<>();
	
	public void addKey(ChavesPublicas key) {
		keys.add(key);
	}
	public void remKey(ChavesPublicas key) {
		keys.remove(key);
	}
	public int sizeKey() {
		return keys.size();
	}
	
	//Sobre carga do método getKey
	public ChavesPublicas getKey(int i) {
		return keys.get(i);
	}
	
	public int getKey() {
		return this.key;
	}

	public void setKey(int key) {
		this.key = key;
	}
	
	
	

}
