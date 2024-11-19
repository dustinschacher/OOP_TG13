import java.util.Set;
import java.util.HashSet;

public class Sets {

    public static void main(String[] args) {

        Set<String> mitarbeiterSet = new HashSet<>();
            mitarbeiterSet.add("Alex");  
            mitarbeiterSet.add("Paul");
            mitarbeiterSet.add("Michael");
            System.out.println(mitarbeiterSet); //Sortierte Liste der Elemente nach Buchstaben
            System.out.println("Du hast so viele Mitarbeiter im Team: " + mitarbeiterSet.size()); //Anzahl Elemente geadded
            System.out.println("Ist Paul Teil des Teams? " + mitarbeiterSet.contains("Paul")); //Sucht nach Element Paul (true oder false)
            mitarbeiterSet.remove("Alex"); //Löscht Alex
            System.out.println(mitarbeiterSet);
            
            if (mitarbeiterSet.contains("Paul")) {
                System.out.println("Paul ist dabei");
                
            }

    }       
}