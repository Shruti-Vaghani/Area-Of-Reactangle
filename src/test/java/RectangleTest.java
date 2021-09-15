import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RectangleTest {
    @Test
    void areaShouldReturnCorrectAreaForValidWidthAndHeight() {
        // Arrange
        double expectedArea = 24.75;
        Rectangle rectangle = new Rectangle(4.5, 5.5);

        // Act
        double receivedArea = rectangle.area();

        // Assert
        assertEquals(expectedArea, receivedArea);
    }

    @Test
    void areaShouldReturnZeroForNegativeWidth() {
        // Arrange
        double expectedArea = 0;
        Rectangle rectangle = new Rectangle(-4.5, 5.5);

        // Act
        double receivedArea = rectangle.area();

        // Assert
        assertEquals(expectedArea, receivedArea);
    }

    @Test
    void areaShouldReturnZeroForNegativeHeight() {
        // Arrange
        double expectedArea = 0;
        Rectangle rectangle = new Rectangle(4.5, -5.5);

        // Act
        double receivedArea = rectangle.area();

        // Assert
        assertEquals(expectedArea, receivedArea);
    }

    @Test
    void areaShouldReturnZeroForNegativeWidthAndHeight() {
        // Arrange
        double expectedArea = 0;
        Rectangle rectangle = new Rectangle(-4.5, -5.5);

        // Act
        double receivedArea = rectangle.area();

        // Assert
        assertEquals(expectedArea, receivedArea);
    }

    @Test
    void areaShouldReturnZeroForZeroWidth() {
        // Arrange
        double expectedArea = 0;
        Rectangle rectangle = new Rectangle(0, 5.5);

        // Act
        double receivedArea = rectangle.area();

        // Assert
        assertEquals(expectedArea, receivedArea);
    }

    @Test
    void areaShouldReturnZeroForZeroHeight() {
        // Arrange
        double expectedArea = 0;
        Rectangle rectangle = new Rectangle(4.5, 0);

        // Act
        double receivedArea = rectangle.area();

        // Assert
        assertEquals(expectedArea, receivedArea);
    }

    @Test
    void areaShouldReturnZeroForZeroWidthAndHeight() {
        // Arrange
        double expectedArea = 0;
        Rectangle rectangle = new Rectangle(0, 0);

        // Act
        double receivedArea = rectangle.area();

        // Assert
        assertEquals(expectedArea, receivedArea);
    }

}
