import exceptions.rectangle.RectangleArgumentException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class RectangleTest {
    @Test
    void areaShouldReturnCorrectAreaForValidWidthAndHeight() throws RectangleArgumentException {
        // Arrange
        double expectedArea = 24.75;
        Rectangle rectangle = new Rectangle(4.5, 5.5);

        // Act
        double receivedArea = rectangle.area();

        // Assert
        assertEquals(expectedArea, receivedArea);
    }

    @Test
    void constructorShouldThrowRectangleArgumentExceptionForNegativeWidth() {
        // Arrange

        // Act

        // Assert
        assertThrows(RectangleArgumentException.class, () -> new Rectangle(-4, 5));
    }

    @Test
    void constructorShouldThrowRectangleArgumentExceptionForNegativeHeight() {
        // Arrange

        // Act

        // Assert
        assertThrows(RectangleArgumentException.class, () -> new Rectangle(4, -5));
    }

    @Test
    void constructorShouldThrowRectangleArgumentExceptionForNegativeWidthAndHeight() {
        // Arrange

        // Act

        // Assert
        assertThrows(RectangleArgumentException.class, () -> new Rectangle(-4, -5));
    }

    @Test
    void constructorShouldThrowRectangleArgumentExceptionForZeroWidth() {
        // Arrange

        // Act

        // Assert
        assertThrows(RectangleArgumentException.class, () -> new Rectangle(0, 5));
    }

    @Test
    void constructorShouldThrowRectangleArgumentExceptionForZeroHeight() {
        // Arrange

        // Act

        // Assert
        assertThrows(RectangleArgumentException.class, () -> new Rectangle(4, 0));
    }

    @Test
    void constructorShouldThrowRectangleArgumentExceptionForZeroWidthAndHeight() {
        // Arrange

        // Act

        // Assert
        assertThrows(RectangleArgumentException.class, () -> new Rectangle(0, 0));
    }

}
