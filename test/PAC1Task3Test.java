import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PAC1Task3Test {
    @Test
    public void testProduct() {
        assertEquals(42, PAC1Task3.product(6, 7)); // Cambiando expected a != 42 se traza el valor de error, tb a o b
    }
}
