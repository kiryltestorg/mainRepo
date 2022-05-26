import org.example.repo;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test1 {
    @Test
    void justAnExample() {
        repo.repoA();
        assertEquals(10, 10);
    }
}
