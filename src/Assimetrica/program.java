package Assimetrica;

import java.util.Scanner;

public class program {
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		boolean qtd = true;
		Scanner sc = new Scanner(System.in);
		String msg = "IsAqUe sAnToS PaiXao";
		int keyPublic;
		
		
		ChavePrivada privateKey;
		ChavesPublicas publicKeys;
		KeyCriptDescript keyCriptDescript;
		Criptografia cript;
		
		System.out.println("Mensagem:  ");
		msg = sc.nextLine();
		System.out.println("Informe uma chave privada: ");
		privateKey = new ChavePrivada(sc.nextInt());
		while(true) {
			System.out.println("Informe uma chave publica: ");
			int k = sc.nextInt();
			publicKeys = new ChavesPublicas(k);
			privateKey.addKey(publicKeys);
			
			System.out.println("Deseja continuar? (s/n)");
			String opc = sc.next();
			if(opc.equalsIgnoreCase("n")) {
				break;
			}
		}
		
		System.out.println("Chaves públicas:");
		for(int i = 0; i < privateKey.sizeKey(); i ++) {
			System.out.println(" Index: ["+ i + "] " + "Chave pública: " + privateKey.getKey(i).getKey());
		}
		System.out.println("Informe o indíce da chave pública para Criptografar: ");
		int chave = sc.nextInt();
		
		keyCriptDescript = new KeyCriptDescript(privateKey, chave);

		cript = new Criptografia(privateKey,chave,msg);
		System.out.println(cript.getMensagemCript());

		
		
		
		
		
		
		
	}
}
