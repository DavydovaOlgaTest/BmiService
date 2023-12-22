public class BmiService {
    public int calculate(int weightKg, double growthMeter) {
        double index;
        index = (weightKg / (growthMeter * growthMeter));
        return (int) index;
    }
}
