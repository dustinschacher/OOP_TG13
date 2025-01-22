public class KMeans {
    static class Point {
        double x,y;

        Point(double x, double y) {
            this.x = x;
            this.y = y;
        }
        double distance(Point other) {
            return
        Math.sqrt(Math.pow(this.x - other.x, 2) + Math.pow(this.y - other.y, 2));
        }
        @Override
        public String toString() {
            return "("+ x + ", " + y + ")";
        }
    }
}