import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class AppTest {
    @Test
    public void testAdd() {
        assertEquals(7, App.add(3, 4));
    }
}
