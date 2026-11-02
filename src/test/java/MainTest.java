import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainTest {

    @Test
    void calculatesHypotenuse() {
        double actual = Main.hypothenuse(10, 20);

        Assertions.assertEquals(22.360679774997898, actual, 0.000000001);
    }
}