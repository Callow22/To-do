import org.junit.Assert;
import org.junit.Test;

public class ZadanieTest {
    String nazwy[]={"Zakupy", "Projekt"};
    String kategorie[]={"Praca", "Dom"};

    Zadanie zadanie=new Zadanie(nazwy[0],kategorie[0]);
    Zadanie zadanie1=new Zadanie(nazwy[1],kategorie[1]);

    @Test
    public void zadanieTest(){
        Assert.assertEquals(nazwy[0],zadanie.getNazwa());
        Assert.assertEquals(kategorie[0],zadanie.getKategoria());
        Assert.assertEquals(nazwy[1],zadanie1.getNazwa());
        Assert.assertEquals(kategorie[1],zadanie1.getKategoria());
    }

}
