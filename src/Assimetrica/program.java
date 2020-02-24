package Assimetrica;

import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class program {
	public static void main(String[] args) {
		
		

		Scanner sc = new Scanner(System.in);
		String msg;
		ChavePrivada privateKey ;
		KeyCriptDescript keyCriptDescript;
		Criptografia cript;


		
		System.out.println("Mensagem:  ");
		msg = sc.nextLine();
		System.out.println("Informe uma chave privada: ");
		privateKey = new ChavePrivada(sc.nextInt());
		while(true) {
			System.out.println("Informe uma chave publica: ");
			int k = sc.nextInt();
			privateKey.addKeyPublic(new ChavesPublicas(k));
			
			System.out.println("Deseja continuar? (s/n)");
			String opc = sc.next();
			if(!opc.equalsIgnoreCase("s")) {
				break;
			}
		}
		
		System.out.println("Chaves publicas:");
		AtomicInteger i = new AtomicInteger();
		privateKey.getKeysPublics().forEach(x->  System.out.println(i.getAndIncrement() + " - " + x.getKey()));

		System.out.println("Informe o indice da chave publica para Criptografar: ");
		int index = sc.nextInt();
		cript = new Criptografia(privateKey,index,msg);
		System.out.println(cript.Criptografia());
		System.out.println(cript.Descriptografia(privateKey.getKeyPrivate()));

		
		
		
		
		
		
		
	}
}
