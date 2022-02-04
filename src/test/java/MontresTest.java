import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MontresTest {

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



    @Test
    void avance(){
        Montres montre =new montre(5,6);
        montre.avance();
        assertEquals(7,montre.getHeures);
    }
}