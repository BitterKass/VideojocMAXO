import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class VideojocTest {

    @Test
    void testGetNom() {
        Videojoc testJoc= new Videojoc("Beyond Good and Evil");
        assertEquals(testJoc.getNom(), "Beyond Good and Evil");
    }

    @Test
    void testSetNom() {
        Videojoc testJoc = new Videojoc("Beyond Good and Evil");
        String Jade = "Beyond Good and Evil";
        testJoc.setNom(Jade);
        //assertEquals(Jade, testJoc.getNom());
        assert (testJoc.getNom() == Jade);
    }
}
