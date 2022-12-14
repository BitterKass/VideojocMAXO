import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class UsuariTest {
    Usuari testUsuer = new Usuari ( "Xavi");
    int id = 0;

    public static void setNom(String nom) {
    }

    @Test
    void getNickname() {
        assertEquals(testUsuer.getNickname(), "Xavi");
    }

    @Test
    void getIdentificador() {
        this.id = 1;
        testUsuer.getIdentificador();
        assertEquals(testUsuer.getIdentificador(), "Xavi#0001");
    }
}