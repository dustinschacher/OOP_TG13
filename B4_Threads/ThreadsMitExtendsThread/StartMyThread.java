package B4_Threads.ThreadsMitExtendsThread;

import java.util.Scanner;

public class StartMyThread {
	
	public static void main(String[] args) {
		//beginn main Thread
		System.out.println("Main Thread gestartet");
		
		//Thread Objekt erzeugen
		MyThread a = new MyThread("a",30);
		MyThread x = new MyThread("x",100);
		
		//Thread nebenläufig starten
		a.start(); //ruft nebenläufig die run() Methode auf
		x.start();
		
		System.out.println("Main Thread zuende");

	}
}