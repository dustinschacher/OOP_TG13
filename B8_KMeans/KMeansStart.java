package B8_KMeans;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class KMeansStart {

    public static void main(String[] args) {
        List<DatenPunkt> daten = initDaten();
        List<Centroid> centers = initCentroids();
        centers = kMeans(daten, centers);
        System.out.println(centers);
    }

    private static List<Centroid> kMeans(List<DatenPunkt> daten, List<Centroid> centers) {



        //Ermittle für alle Datenpunkte die Abstände
        Map<Double, Centroid> aListe = new TreeMap<>();
        double abstand;
        for (DatenPunkt d : daten) {
            for (Centroid c : centers) {
                abstand = getAbstand(d, c);
                aListe.put(abstand, c);

            }
            List<Centroid> cListe = new ArrayList<>(aListe.values());
            Centroid c = cListe.get(0);
            c.addDatenPunkt(d);
            aListe.clear();
            cListe.clear();
            cListe = null;
        }

        return centers;
    }

    private static double getAbstand(DatenPunkt d, Centroid c) {
        return (d.x - c.x) * (d.x - c.x) + (d.y - c.y) * (d.y - c.y);

    }

    private static List<Centroid> initCentroids() {
        List<Centroid> c = new ArrayList<>();
        c.add(new Centroid(5, 4, "A"));
        c.add(new Centroid(1, 3, "B"));
        c.add(new Centroid(7, 4, "C"));
        return c;
    }

    private static List<DatenPunkt> initDaten() {
        List<DatenPunkt> d = new ArrayList<>();
        d.add(new DatenPunkt(1, 8));
        d.add(new DatenPunkt(2, 7));
        d.add(new DatenPunkt(3, 9));
        d.add(new DatenPunkt(1, 5));
        d.add(new DatenPunkt(1, 6));
        d.add(new DatenPunkt(1, 7));
        d.add(new DatenPunkt(1, 3));
        return d;

    }
}