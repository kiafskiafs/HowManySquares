import ru.netology.sqr.HowManySquares.services.SQRService;

public class Main {
    public static void main(String[] args) {
        SQRService service = new SQRService();
        System.out.println(service.calcSqr(200, 300));
    }
}
