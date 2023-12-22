public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double growthMeter = 1.87;
        int weightKg = 98;
        int index = service.calculate(weightKg, growthMeter);
        System.out.println("Индекс массы тела: " + index + " кг/кв.м");

        System.out.println();
        System.out.println("Мой ИМТ при росте 163 см и весе в 61 кг ");
        System.out.println("Мой индекс массы тела: " + service.calculate(61,1.63) + "кг/кв.м");
    }
}
