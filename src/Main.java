public class Main {
    public static void main(String[] args) {
        BonusService service = new BonusService();
        int miles = service.calculate(10000);
        System.out.println(miles);
    }
}