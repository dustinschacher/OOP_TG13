package B4_Threads.B4_1_AmpelAufgabe;

public class ErzeugeAmpel implements Runnable{

    String name;
    int aktZustand;
    int wait;
    Thread t;
    int Zustand = 1;
    

    private static final int Rot = 0;
    private static final int RotGelb = 1;
    private static final int Gelb = 2;
    private static final int Gruen = 3;
    
    public ErzeugeAmpel(String name, int wait) {
        this.name = name;
        this.wait = wait;
        t = new Thread(this);
    }
    
    public void start() {
        t.start();
    }
    
    public void stop() {
        t.interrupt();
    }
    
    
    private boolean isInterrupted(){
        return t.isInterrupted();
    }
    
    
    @Override
    public void run() {
        while(!t.isInterrupted()) {
        
        switch(Zustand) {
        case Rot:
            System.out.println(name + ": Rot");
            Zustand = RotGelb;
        break;
        case RotGelb:
            System.out.println(name + ": RotGelb");
            
            Zustand = Gelb;
        break;
        case Gelb:
            System.out.println(name + ": Gelb");
            
            Zustand = Gruen;
        break;
        case Gruen:
            System.out.println(name + ": Gruen");
            
            Zustand = Rot;
        break;
        }
        try {
            Thread.sleep(wait);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            stop();
            e.printStackTrace();
        }
        }

        
        
        
    }
    
}