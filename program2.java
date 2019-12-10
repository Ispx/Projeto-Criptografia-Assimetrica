package CriptografiaDeCesarUmParaMuitos;

import java.util.Scanner;

public class program2 {
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		boolean b = true;
		Scanner sc = new Scanner(System.in);
		
		ChavePrivada privateKey = new ChavePrivada();
		ChavesPublicas publicKeys  = new ChavesPublicas();
		Criptografia cript = new Criptografia();
		KeyCriptDescript keyCriptDescript = new KeyCriptDescript();
		

		System.out.println("Escreva uma mensagem: ");
		String mensagem = sc.nextLine();
		
		System.out.print("Adicione uma chave privada: = ");
		privateKey.setKey(sc.nextInt());
		
		while(b == true) {
				
			System.out.print("Adicione uma chave publica: = ");
				
			publicKeys.setKey(sc.nextInt());
			keyCriptDescript.addKey(publicKeys);
				
			System.out.print("Deseja continuar (S/N)? = ");
			String str = sc.next();
				
			if(str.equalsIgnoreCase("s")) {
				publicKeys = new ChavesPublicas();
					
			}
			else {
				b = false;
			}		
		}
				
		
		for(int i = 0; i < privateKey.sizeKey(); i ++) {
			System.out.println("Chave publica [" + (i) + "] : " + keyCriptDescript.getKey(i).getKey());
		}
		System.out.println("Informe a chave publica para Criptografar a mensagem: ");
		int indexPublicKey = sc.nextInt();
		keyCriptDescript.setKeyCriptDescript(indexPublicKey);
		cript.Criptografia(indexPublicKey,mensagem);
		System.out.println("Mensagem criptografada: " + cript.getMensagemCript());
		
		
		
		
		
		
	}
}
