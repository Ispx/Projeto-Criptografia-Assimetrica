package Assimetrica;

import java.util.ArrayList;

public class ChavePrivada {
	
	
	private int key;
	
	public ChavePrivada(int key) {
		this.key = key;
	}
	
	
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

	//Sobre carga do m�todo getKey
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
