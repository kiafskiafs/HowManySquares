import org.junit.jupiter.api.Test;
import ru.netology.sqr.HowManySquares.services.SQRService;

public class SQRServiceTest {
    private Object args;

    @Test
    public void normalValue() {
        SQRService service = new SQRService();
        System.out.println(service.calcSqr(200, 300));
    }

    @Test
    public void negativeNumbers() {
        SQRService service = new SQRService();
        System.out.println(service.calcSqr(-50, -1));
    }

    @Test
    public void boundaryValueUnderBorder() {
        SQRService service = new SQRService();
        System.out.println(service.calcSqr(99, 9802));
    }

    @Test
    public void boundaryValueOnBorder() {
        SQRService service = new SQRService();
        System.out.println(service.calcSqr(100, 9801));
    }

    @Test
    public void boundaryValueOverBorder() {
        SQRService service = new SQRService();
        System.out.println(service.calcSqr(101, 9800));
    }
}