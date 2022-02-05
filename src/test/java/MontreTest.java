import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MontreTest {

    @Test
    void getHeures() {
        assertEquals(10, 10);
    }

    @Test
    void getMin() {
        assertEquals(30, 30);
    }

    @Test
    void heure() {
    }

    @Test
    void min() {
    }

    void avance() {
        Montre montre = new Montre(6, 15);
        montre.avance();
        assertEquals(16, montre.getMin());
    }
}