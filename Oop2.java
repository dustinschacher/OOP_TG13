/*
 * Methoden überladen (Overloading) vs. Methoden überschreiben (Overriding) in Java
 */

public class Oop2 {
    public static void main(String[] args) {
        // Demonstration von Methoden-Überladung
        Rechner rechner = new Rechner();
        System.out.println("Addition von 2 Zahlen: " + rechner.addiere(5, 10));
        System.out.println("Addition von 3 Zahlen: " + rechner.addiere(5, 10, 15));
        System.out.println("Addition von 2 Gleitkommazahlen: " + rechner.addiere(5.5, 2.3));
        
        // Demonstration von Methoden-Überschreibung
        Tier meinTier = new Tier();
        meinTier.geraeuschMachen();
        
        Hund meinHund = new Hund();
        meinHund.geraeuschMachen(); // Überschriebene Methode wird aufgerufen
    }
}

// 1️⃣ Methoden-Überladung (Overloading) - gleiche Methodenname, aber unterschiedliche Parameter
class Rechner {
    // Addition mit zwei Zahlen
    public int addiere(int a, int b) {
        return a + b;
    }
    
    // Addition mit drei Zahlen
    public int addiere(int a, int b, int c) {
        return a + b + c;
    }
    
    // Addition mit Gleitkommazahlen
    public double addiere(double a, double b) {
        return a + b;
    }
}

// 2️⃣ Methoden-Überschreibung (Overriding) - Methode aus der Elternklasse in der Kindklasse überschreiben
class Tier {
    public void geraeuschMachen() {
        System.out.println("Das Tier macht ein Geräusch.");
    }
}

class Hund extends Tier {
    @Override
    public void geraeuschMachen() {
        System.out.println("Der Hund bellt: Wuff Wuff!");
    }
}
