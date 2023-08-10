public class BmiService {
    public int calculate(double weightKg, double highMeters) {
        double index = weightKg / (highMeters * highMeters);
        return (int) index;
    }
}
