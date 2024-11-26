import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Lol1 {

    public static void main(String[] args) {
        List<String> singenListe = Arrays.asList("BMW","Mercedes","VW","Audi","Tesla","Kia");
        List<String> konstanzListe = Arrays.asList("Ford","VW","Hyundai","BMW","Mercedes","Audi");
        Set<String> singen = new HashSet<>();
        singen.addAll(singenListe);
        Set<String> konstanz = new HashSet<>();
        konstanz.addAll(konstanzListe);
        System.out.println(singen);
        System.out.println(konstanz);
        Set<String> schnittmenge = new HashSet<>();
        schnittmenge.addAll(singenListe);
        schnittmenge.retainAll(konstanzListe);
        System.out.println(schnittmenge);
        Set<String> differenz = new HashSet<>();
        differenz.addAll(singenListe);
        differenz.removeAll(konstanzListe);
        System.out.println(differenz);
    }
}