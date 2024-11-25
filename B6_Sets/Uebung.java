package B6_Sets;
import java.util.Set;
import java.util.Arrays;
import java.util.HashSet;
public class Uebung {

    public static void main(String[] args) {
        Set<String> singen = new HashSet<>();
        singen.addAll(Arrays.asList(new String[] {"BMW","Mercedes","VW","Audi","Tesla","Kia"}));
        System.out.println(singen);
        
        Set<String> konstanz = new HashSet<>();
        konstanz.addAll(Arrays.asList(new String[] {"Ford","VW","Hyundai","BMW","Mercedes","Audi"}));
        System.out.println(konstanz);

        Set<String> schnittmenge = new HashSet<>();
        schnittmenge.addAll(singen);
        schnittmenge.retainAll(konstanz);
        System.out.println(schnittmenge);
        
        Set<String> differenz = new HashSet<>(singen);
        differenz.removeAll(konstanz);
        System.out.println(differenz);


    }
}
