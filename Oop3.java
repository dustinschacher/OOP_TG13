/*
 * Klassenattribute vs. Objektattribute in Java
 * - Klassenattribute (static): Gehören zur Klasse, für alle Objekte gleich
 * - Objektattribute (Instanzvariablen): Gehören zu einem einzelnen Objekt
 */

public class Oop3 {
    public static void main(String[] args) {
        // Erstellung von Objekten
        Fahrzeug auto1 = new Fahrzeug("BMW");
        Fahrzeug auto2 = new Fahrzeug("Audi");

        // Zugriff auf Objektattribute
        System.out.println("Auto 1: " + auto1.getMarke());
        System.out.println("Auto 2: " + auto2.getMarke());
        
        // Jedes Fahrzeug hat seine eigene Geschwindigkeit
        auto1.beschleunigen(50);
        auto2.beschleunigen(30);
        
        // Zugriff auf das Klassenattribut (static)
        System.out.println("Anzahl der Fahrzeuge: " + Fahrzeug.getAnzahlFahrzeuge());
    }
}


class Fahrzeug {
    // 🔹 Klassenattribut (static) → gehört zur Klasse, nicht zu einem einzelnen Objekt
    public static int anzahlFahrzeuge = 0;
    
    // 🔹 Objektattribute (Instanzvariablen) → individuell für jedes Objekt
    private final String marke;
    private int geschwindigkeit;

    // Konstruktor (wird bei der Objekterstellung aufgerufen)
    public Fahrzeug(String marke) {
        this.marke = marke;
        this.geschwindigkeit = 0;
        anzahlFahrzeuge++; // Erhöht die Anzahl der erstellten Fahrzeuge
    }

    // Getter-Methode für das Objektattribut "marke"
    public String getMarke() {
        return marke;
    }
    
    // Methode zur Änderung der Geschwindigkeit
    public void beschleunigen(int wert) {
        geschwindigkeit += wert;
        System.out.println(marke + " beschleunigt auf " + geschwindigkeit + " km/h");
    }

    // 🔹 Statische Methode → gehört zur Klasse, nicht zum Objekt
    public static int getAnzahlFahrzeuge() {
        return anzahlFahrzeuge;
    }
}
