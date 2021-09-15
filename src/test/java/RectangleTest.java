import exceptions.rectangle.RectangleAreaUpperLimitException;
import exceptions.rectangle.RectangleArgumentException;
import exceptions.rectangle.RectanglePerimeterUpperLimitException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class RectangleTest {
    @Test
    void areaShouldReturnCorrectAreaForValidWidthAndHeight() throws RectangleArgumentException, RectangleAreaUpperLimitException {
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

    @Test
    void areaShouldThrowRectangleAreaUpperLimitExceptionIfAreaOverflowsTheDoubleLimit() throws RectangleArgumentException {
        // Arrange
        var width = Double.MAX_VALUE - 10;
        var height = Double.MAX_VALUE - 20;
        var rectangle = new Rectangle(width, height);

        // Act


        // Assert
        assertThrows(RectangleAreaUpperLimitException.class, rectangle::area);
    }

    @Test
    void perimeterShouldReturnCorrectPerimeterForValidInput() throws RectangleArgumentException, RectanglePerimeterUpperLimitException {
        // Arrange
        var rectangle = new Rectangle(4.25, 5);
        var expectedPerimeter = 18.5;

        // Act
        var perimeterReturned = rectangle.perimeter();

        //Assert
        assertEquals(expectedPerimeter, perimeterReturned);
    }

    @Test
    void perimeterShouldThrowRectanglePerimeterUpperLimitException() throws RectangleArgumentException {
        // Arrange
        var width = Double.MAX_VALUE;
        var height = 2;
        var rectangle = new Rectangle(width, height);

        // Act

        // Assert
        assertThrows(RectanglePerimeterUpperLimitException.class, rectangle::perimeter);
    }
}
