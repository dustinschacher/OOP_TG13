import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class KNearestNeighbors {

    private int k;

    public KNearestNeighbors(int k) {
        this.k = k;
    }

    // Calculate the Euclidean distance between two points
    private double calculateDistance(double[] point1, double[] point2) {
        double sum = 0.0;
        for (int i = 0; i < point1.length; i++) {
            sum += Math.pow(point1[i] - point2[i], 2);
        }
        return Math.sqrt(sum);
    }

    // Predict the class of a given point
    public String predict(double[] point, List<double[]> data, List<String> labels) {
        List<Neighbor> neighbors = new ArrayList<>();

        // Calculate distance from the given point to all other points
        for (int i = 0; i < data.size(); i++) {
            double distance = calculateDistance(point, data.get(i));
            neighbors.add(new Neighbor(distance, labels.get(i)));
        }

        // Sort neighbors by distance
        Collections.sort(neighbors, Comparator.comparingDouble(n -> n.distance));

        // Get the k nearest neighbors
        List<String> kNearestLabels = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            kNearestLabels.add(neighbors.get(i).label);
        }

        // Determine the most common class among the k nearest neighbors
        String prediction = kNearestLabels.stream()
            .reduce((a, b) -> Collections.frequency(kNearestLabels, a) > Collections.frequency(kNearestLabels, b) ? a : b)
            .orElse(null);

        return prediction;
    }

    // Helper class to store distance and label
    private static class Neighbor {
        double distance;
        String label;

        Neighbor(double distance, String label) {
            this.distance = distance;
            this.label = label;
        }
    }

    public static void main(String[] args) {
        List<double[]> data = new ArrayList<>();
        List<String> labels = new ArrayList<>();

        // Example data
        data.add(new double[]{2.0, 3.0});
        data.add(new double[]{1.0, 1.0});
        data.add(new double[]{4.0, 5.0});
        labels.add("Class A");
        labels.add("Class B");
        labels.add("Class A");

        KNearestNeighbors knn = new KNearestNeighbors(3);
        double[] pointToClassify = {3.0, 4.0};
        String predictedClass = knn.predict(pointToClassify, data, labels);
        System.out.println("Predicted class: " + predictedClass);
    }
}
