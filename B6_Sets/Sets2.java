package B6_Sets;
import java.util.HashSet;
import java.util.Set;

public class Sets2 {
    public static void main(String[] args) {
        Set<Schueler> schueler = new HashSet<>();
        Schueler s1 = (new Schueler("Meier", "Max"));
        Schueler s2 = (new Schueler("Max", "Meier"));
        schueler.add(s1);
        schueler.add(s2);
        schueler.remove(s1);

        for (Schueler s : schueler) {
            System.out.println(s.getName());
            
        }
    }
}
