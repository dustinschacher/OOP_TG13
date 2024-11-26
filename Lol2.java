import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class Lol2 {
    public static void main(String[] args) {
        String strAlphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"; //a)
        System.out.println(strAlphabet);

        char[] alphabetArray = strAlphabet.toCharArray(); //b)
        for (char c : alphabetArray) {
            System.out.print(c + " ");
        }

        LinkedList<Character> alphabetList = new LinkedList<>(); //c) "Für jedes Zeichen c im Array alphabetArray, füge dieses Zeichen in die alphabetList ein."
        for (char c : alphabetArray) {
            alphabetList.add(c);
        }

        HashMap<Integer, Character> ziffern = new HashMap<>();  //d)
        for (int i = 0; i <= 9; i++) {
            char c = (char) ('0' + i);
            ziffern.put(i, c);
        }
        System.out.println();
        System.out.println("HashMap: " + ziffern);

        List<Character> alphabetMitZiffern = new ArrayList<>(alphabetList); //e)
        for (int i = 0; i <= 9; i++) {
            alphabetMitZiffern.add(ziffern.get(i));
        }
        System.out.println("Alphabet als Liste: " + alphabetList); //f)
        System.out.println("Alphabet mit Ziffern: " + alphabetMitZiffern);
        }

    }
