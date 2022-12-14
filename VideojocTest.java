import org.junit.jupiter.api.Test;

<<<<<<< HEAD
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
=======
import static org.junit.jupiter.api.Assertions.*;

class VideojocTest {

    public static final String EDAT_PEGI = "PEGI 12";
    public static final String NOM_VIDEOJOC = "Return To The Monkye Island";

    @Test
    void getUsuarisQueHanConsultat() {
    }

    @Test
    void getNom() {
        Videojoc testGame = new Videojoc("Makako");
        assertEquals("Makako",testGame.getNom());
    }

    @Test
    void setNom() {
        Videojoc setGame = new Videojoc("LOL");
        setGame.setNom("lolsito");
        assertEquals(setGame.getNom(), "lolsito");
    }

    @Test
    void getGenere() {
        Videojoc testGenere = new Videojoc(NOM_VIDEOJOC);
        assertEquals("acció", "acció");
    }

    @Test
    void setGenere() {
        Videojoc setGame = new Videojoc(NOM_VIDEOJOC);
        setGame.setGenere("acció");
        assertEquals("accrió", setGame.getGenere());
    }

    @Test
    void getNumeroJugadors() {
        Videojoc testNumJug = new Videojoc(NOM_VIDEOJOC);
        assertEquals(1000, 20000);
    }

    @Test
    void setNumeroJugadors() {
        Videojoc setGame = new Videojoc(NOM_VIDEOJOC);
        setGame.setNumeroJugadors(10000);
        assertEquals(10000, setGame.getNumeroJugadors());
    }

    @Test
    void getPreu() {
        Videojoc testPreu = new Videojoc(NOM_VIDEOJOC);
        assertEquals(20.5, 20.5);
    }

    @Test
    void setPreu() {
        Videojoc setGame = new Videojoc(NOM_VIDEOJOC);
        setGame.setPreu(10);
        assertEquals(10, setGame.getPreu());
    }

    @Test
    void getPlataformes() {
        Videojoc tetstPlataformes = new Videojoc(NOM_VIDEOJOC);
        assertEquals("plataformes", "plataformes");
    }

    @Test
    void setPlataformes() {
        Videojoc setGame = new Videojoc(NOM_VIDEOJOC);
        setGame.setPlataformes("plataformes");
        assertEquals("plataformes", setGame.getPlataformes());
    }

    @Test
    void getAmbientacio() {
        Videojoc testAmbientacio = new Videojoc(NOM_VIDEOJOC);
        assertEquals("desert", "desert");
    }

    @Test
    void setAmbientacio() {
        Videojoc setAmbientacio = new Videojoc(NOM_VIDEOJOC);
        setAmbientacio.setAmbientacio("Castell");
        assertEquals("Castell", setAmbientacio.getAmbientacio());
    }

    @Test
    void getEdatRecomanadaPEGI() {
        Videojoc testEdadPEGI = new Videojoc(NOM_VIDEOJOC);
        assertEquals("12", "12");
    }

    @Test
    void setEdatRecomanadaPEGI() {
        Videojoc setPEGI = new Videojoc(NOM_VIDEOJOC);
        setPEGI.setEdatRecomanadaPEGI("PEGI 12");
        assertEquals(EDAT_PEGI, setPEGI.getEdatRecomanadaPEGI());
    }

    @Test
    void getContingutEspecificPEGI() {
        Videojoc testContingutPEGI = new Videojoc(NOM_VIDEOJOC);
        assertEquals("Violencia", "Violencia");
    }

    @Test
    void setContingutEspecificPEGI() {
        Videojoc setContignutsPEGI = new Videojoc(NOM_VIDEOJOC);
        setContignutsPEGI.setContingutEspecificPEGI("Violencia");
        assertEquals("Violencia", setContignutsPEGI.getContingutEspecificPEGI());
    }

    @Test
    void getRequisits() {
        Videojoc testRequisits = new Videojoc(NOM_VIDEOJOC);
        assertEquals("ordinador", "portatil");
    }

    @Test
    void setRequisits() {
        Videojoc setReq = new Videojoc(NOM_VIDEOJOC);
        setReq.setRequisits("portatil");
        assertEquals("portatil", setReq.getRequisits());
    }

    @Test
    void getComentaris() {
    }
}
>>>>>>> a2b0edbd4d149af36b3ccbe5ab217e1948ac793f
