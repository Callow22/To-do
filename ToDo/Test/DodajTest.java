import org.junit.Assert;
import org.junit.Test;


public class DodajTest {
    ToDoLista lista=ToDoLista.getInstance();
    Zadanie zadanie=new Zadanie("Projekt","Studia");

    @Test
    public void test(){
        Assert.assertEquals(0,lista.size(),0);
        lista.dodajDoListy(zadanie);
        Assert.assertEquals(1,lista.size(),0);

    }
}
