import static org.junit.jupiter.api.Assertions.*;

class RecursionTest {
    Recursion r = new Recursion();

    @org.junit.jupiter.api.Test
    void rec() {
        assertEquals(70, r.rec(5,5));
    }
}