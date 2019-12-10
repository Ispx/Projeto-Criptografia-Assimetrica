package CriptografiaDeCesarUmParaMuitos;

import java.util.Scanner;

public class program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean b = true;
		Scanner sc = new Scanner(System.in);
		
		ChavePrivada privateKey = new ChavePrivada();
		ChavesPublicas publicKeys  = new ChavesPublicas();
		Criptografia cript = new Criptografia();
		KeyCriptDescript k; // = new KeyCriptDescript();
		publicKeys.setKey(5);
		
		privateKey.addKey(publicKeys);
		k = new KeyCriptDescript(0);
		System.out.println(k.getKeyCriptDescript());
		System.out.println(privateKey.getKey(0).getKey());
		
		sc.close();
	}
	
	
	

}
