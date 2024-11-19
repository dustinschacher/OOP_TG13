package B6_Sets;
public class Schueler {
    
    String name;
    String vorname;
    
    public Schueler(String name, String vorname) {
        this.name = name;
        this.vorname = vorname;
    }
    public static void main(String[] args) {
        
    }
    public String getName() {
        return name;
    }
    public String getVorname() {
        return vorname;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setVorname(String vorname) {
        this.vorname = vorname;
    }
    @Override
    public String toString() {
        return "Schueler [name=" + name + ", vorname=" + vorname + "]";
    }
}
