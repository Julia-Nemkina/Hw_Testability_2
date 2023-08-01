public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weightKg = 69;
        double highMetres = 1.68;
        int index = service.calculate(weightKg, highMetres);
        System.out.println(index);
    }
}
