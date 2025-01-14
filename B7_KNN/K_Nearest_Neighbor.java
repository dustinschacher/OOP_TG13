import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class K_Nearest_Neighbor {

    public static int k = 5;
    public static ArrayList<Obj> Daten = new ArrayList<>();

    public static void main(String[] args) {
        Data_init();
        Obj oTD = new Obj(5,7);

        NearestNeighbor(oTD);
    }
    public static void NearestNeighbor(Obj oTD)
    {
        for (int i = 0; i < Daten.size(); i++) {
            Map<Double,Obj> distances = new TreeMap<>();
            distances.put(distance(Daten.get(i),oTD),Daten.get(i));
            System.out.println(distances.keySet());
        }
    }
    public static double distance(Obj o, Obj oTD)
    {
        return (oTD.x-o.x)*(oTD.x-o.x)+(oTD.y-o.y)*(oTD.y-o.y);
    }
    public static void Data_init()
    {
        Obj o0 = new Obj(5,3,1);
        Obj o1 = new Obj(2,10,1);
        Obj o2 = new Obj(4,10,1);
        Obj o3 = new Obj(10,8,1);
        Obj o4 = new Obj(5,10,1);
        Obj o5 = new Obj(2,2,1);
        Obj o6 = new Obj(2,5,1);
        Obj o7 = new Obj(5,9,1);
        Obj o8 = new Obj(6,1,1);
        Obj o9 = new Obj(4,2,1);
        Daten.add(o0);
        Daten.add(o1);
        Daten.add(o2);
        Daten.add(o3);
        Daten.add(o4);
        Daten.add(o5);
        Daten.add(o6);
        Daten.add(o7);
        Daten.add(o8);
        Daten.add(o9);
    }
}