import java.util.HashMap;
import java.util.Map;

public class UebungMaps {
    public static void main(String[] args) {
        
        Map<String, String> bundeslaender = new HashMap<>();
        bundeslaender.put("Baden-Württemberg", "Stuttgart");
        bundeslaender.put("Bayern", "München");
        bundeslaender.put("Berlin", "Berlin");
        bundeslaender.put("Bremen", "Bremen");
        bundeslaender.put("Saarland", "Saarbrücken");
        bundeslaender.put("Rheinland-Pfalz", "Mainz");
        bundeslaender.put("NRW", "Düsseldorf");
        bundeslaender.put("Mecklenburg-Vorpommern", "Schwerin");
        bundeslaender.put("Sachsen", "Dresden");
        bundeslaender.put("Sachsen-Anhalt", "Magdeburg");
        bundeslaender.put("Niedersachsen", "Hannover");
        bundeslaender.put("Thüringen", "Erfurt");
        bundeslaender.put("Hamburg", "Hamburg");
        bundeslaender.put("Hessen", "Wiesbaden");
        bundeslaender.put("Brandenburg", "Potsdam");
        bundeslaender.put("Schleswig-Holstein", "Kiel");

        for (Map.Entry <String,String> bund : bundeslaender.entrySet()) {
            System.out.println(bund.getKey() + " - " + bund.getValue());
            
        }
    
    }
}
