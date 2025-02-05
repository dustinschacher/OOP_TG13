package B8_KMeans;

import java.util.ArrayList;
import java.util.List;

public class Centroid extends DatenPunkt {
    String name;
    List<DatenPunkt> dpListe;

    public Centroid(int x, int y, String name) {
        super(x, y);
        this.name = name;
        dpListe = new ArrayList<>();

    }
    public void addDatenPunkt(DatenPunkt datenpunkt) {
        dpListe.add(datenpunkt);

    }
    public void removeAll() {
        dpListe.clear();
    }
    @Override
    public String toString() {
        return "Centroid [name=" + name + "x="+x+"y="+y+", dpListe=" + dpListe + "]\n";
    }
    public boolean getNewCenter() {
        int xNeu, yNeu;
        int sumX=0, sumY=0;
        for (DatenPunkt datenPunkt : dpListe) {
            sumX += datenPunkt.x;
            sumY += datenPunkt.y;
            
        }
        xNeu = sumX / dpListe.size();
        yNeu = sumY / dpListe.size();
        if(xNeu == x && yNeu == y) {
            return false;
        }
        else {
            x = xNeu;
            y = yNeu;
            return true;
        }
        
    }
}
