import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonneTest {

     Personne pers = new Personne("Theresia");
     Montre m = new Montre( 9, 25);


     @Test
     void porterMontre(){
          pers.porter(m);
          assertNotNull(pers.tool);

     }

     @Test
     void enleverMontrer(){
          pers.retirer();
          assertNull(pers.tool);
     }
     @Test
     void afficherheure (){
          assertEquals ("9h25min", pers.afficheHeure());
     }
}