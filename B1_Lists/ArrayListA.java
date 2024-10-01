package B1_Lists;
import java.util.ArrayList;
public class ArrayListA {
    public static void main(String[] args) {
        ArrayList<Integer> primzahlen = new ArrayList<>();


        primzahlen.add(2);
        primzahlen.add(3);
        primzahlen.add(5);

        System.out.println(primzahlen);

        primzahlen.remove(2);

        for (Integer i : primzahlen) {
            System.out.println(i);
        }
        System.out.println(primzahlen.contains(3));
    } 
}
