// packagescoped

/*
 * Objektorientierte Programmierung (OOP) in Java
 * Enthält: Klassen, Objekte, Kapselung, Vererbung, Polymorphismus, Abstraktion, Schnittstellen
 */

// 5️⃣ Hauptklasse (Main-Methode)
public class Oop1 {
    public static void main(String[] args) {
        Auto bmw = new Auto("BMW", 150);
        bmw.beschleunigen(50);
        bmw.bremsen(20);
        bmw.anzeigen();

        ElektroAuto tesla = new ElektroAuto("Tesla", 200);
        tesla.beschleunigen(80);
        tesla.aufladen();
        tesla.anzeigen();
    }
}

// 1️⃣ Abstrakte Klasse (Abstraktion)
abstract class Fahrzeug {
    protected String marke;
    protected int geschwindigkeit;

    public Fahrzeug(String marke) {
        this.marke = marke;
        this.geschwindigkeit = 0;
    }

    public abstract void beschleunigen(int wert);
    public abstract void bremsen(int wert);

    public void anzeigen() {
        System.out.println(marke + " fährt mit " + geschwindigkeit + " km/h");
    }
}

// 2️⃣ Schnittstelle (Interface)
interface Elektrisch {
    void aufladen();
}

// 3️⃣ Vererbung und Polymorphismus
class Auto extends Fahrzeug {
    private int ps;

    public Auto(String marke, int ps) {
        super(marke);
        this.ps = ps;
    }

    @Override
    public void beschleunigen(int wert) {
        geschwindigkeit += wert;
        System.out.println(marke + " beschleunigt auf " + geschwindigkeit + " km/h");
    }

    @Override
    public void bremsen(int wert) {
        geschwindigkeit -= wert;
        if (geschwindigkeit < 0) geschwindigkeit = 0;
        System.out.println(marke + " bremst auf " + geschwindigkeit + " km/h");
    }
}

// 4️⃣ Implementierung eines Interfaces
class ElektroAuto extends Auto implements Elektrisch {
    private int batteriestand;

    public ElektroAuto(String marke, int ps) {
        super(marke, ps);
        this.batteriestand = 100;
    }

    @Override
    public void aufladen() {
        batteriestand = 100;
        System.out.println(marke + " ist vollständig aufgeladen!");
    }
}
