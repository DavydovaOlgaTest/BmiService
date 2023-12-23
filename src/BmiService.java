public class BmiService {
    public int calculate(int weightKg, double growthMeter) {
        double index = (weightKg / (growthMeter * growthMeter));
        return (int) index;
    }
}
/* double index = weightKg / growthMeter / growthMeter;
return (int) index;git 
 */