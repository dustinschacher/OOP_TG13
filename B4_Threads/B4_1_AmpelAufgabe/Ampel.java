package B4_Threads.B4_1_AmpelAufgabe;

import java.util.Scanner;

public class Ampel {
    public static void main(String[] args) {

        ErzeugeAmpel a = new ErzeugeAmpel("a1", 2000);
        ErzeugeAmpel b = new ErzeugeAmpel("a2", 3000);
        a.start();
        b.start();


        Scanner s = new Scanner(System.in);


        while(true) {

            int Eingabe = s.nextInt();

            if(Eingabe == 1) {
                a.stop();
                b.stop();
            }
        }
    }
}
