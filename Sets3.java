import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Sets3 {

    public static void main(String[] args) {
        
        Set<Integer> erstesSet = new HashSet<Integer>();
        erstesSet.addAll(Arrays.asList(new Integer[] {1, 2, 3, 5, 0 }));
        Set<Integer> zweitesSet = new HashSet<Integer>();
        zweitesSet.addAll(Arrays.asList(new Integer[] {1, 3, 4, 5, 6, 7, 5}));

        System.out.println(erstesSet);
        System.out.println(zweitesSet);

        Set<Integer> union = new HashSet<Integer>(erstesSet); //Zusammengeführt
        union.addAll(zweitesSet);

        System.out.print("Beide Sets zusammengeführt ergibt:");
        System.out.println(union);

        Set<Integer> schnittmenge = new HashSet<Integer>(erstesSet); //Schnittmenge
        schnittmenge.retainAll(zweitesSet);

        System.out.print("Die Schnittmenge beider Sets ist:");
        System.out.println(schnittmenge);

        Set<Integer> differenz = new HashSet<Integer>(erstesSet); //Differenz
        differenz.removeAll(zweitesSet);

        System.out.print("Diese Elemente sind nicht im zweiten Set vorhanden:");
        System.out.println(differenz);

    }
    
}
