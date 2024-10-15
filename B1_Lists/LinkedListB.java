package B1_Lists;
import java.util.LinkedList;

public class LinkedListB {
    public static void main(String[] args) {
        // create linkedlist
    LinkedList<String> animals = new LinkedList<>();

    //Elemente hinzufügen
    animals.add("Hund");
    animals.add("Katze");
    animals.add("Maus");
    System.out.println("LinkedList: " + animals); //Liste ausgeben
    System.out.println(animals.peek()); //Erster Eintrag (Hund) ausgeben
    }
    
}