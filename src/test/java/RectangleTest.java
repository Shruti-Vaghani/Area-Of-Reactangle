import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RectangleTest {
    @Test
    void areaShouldReturnCorrectAreaForValidLengthAndWidth() {
        Rectangle rectangle = new Rectangle(4.5, 5.5);
        double area = rectangle.area();
        assertEquals(24.75, area);
    }
}
