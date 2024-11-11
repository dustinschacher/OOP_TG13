package B1_Lists;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.LinkedHashMap;

public class Maps {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        
        // Elemente hinzufügen
        map.put("Apfel", 1);
        map.put("Banane", 2);
        map.put("Orange", 3);
        
        // Wert abrufen
        System.out.println("Wert für 'Banane': " + map.get("Banane"));
        
        // Alle Schlüssel und Werte durchlaufen
        for (String key : map.keySet()) {
            System.out.println(key + ": " + map.get(key));
        }
        
        // Schlüssel entfernen
        map.remove("Apfel");
        System.out.println("Nach Entfernen: " + map);
    
    
   
        // Elemente hinzufügen
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("Banane", 2);
        treeMap.put("Apfel", 1);
        treeMap.put("Orange", 3);
        
        // Alle Schlüssel und Werte in sortierter Reihenfolge durchlaufen
        for (String key : treeMap.keySet()) {
            System.out.println(key + ": " + treeMap.get(key));
        }
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();
        
        // Elemente hinzufügen
        linkedHashMap.put("Banane", 2);
        linkedHashMap.put("Apfel", 1);
        linkedHashMap.put("Orange", 3);
        
        // Alle Schlüssel und Werte in der Einfügereihenfolge durchlaufen
        for (String key : linkedHashMap.keySet()) {
            System.out.println(key + ": " + linkedHashMap.get(key));
        }
    }
}
