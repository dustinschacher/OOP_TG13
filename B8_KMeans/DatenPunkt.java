package B8_KMeans;

public class DatenPunkt {
    int x;
    int y;

    public DatenPunkt(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "DatenPunkt [x=" + x + ", y=" + y + "]\n";
    }

}
