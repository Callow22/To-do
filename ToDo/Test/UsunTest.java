import org.junit.jupiter.api.Test;
import org.junit.Assert;

public class UsunTest {
    String nazwa[]={"IO projekt", "Kupic mleko"};
    String kategorie[]={"Studia","Dom"};
    ToDoLista lista=ToDoLista.getInstance();
    Zadanie zadanie=new Zadanie("IO proejkt", "Studia");
    Zadanie zadanie1=new Zadanie("Kupic mleko", "Dom");

    @Test
    public void test(){
        lista.dodajDoListy(zadanie);
        lista.dodajDoListy(zadanie1);
        Assert.assertEquals(2,lista.size(),0);
        lista.usunZListy(0);
        Assert.assertEquals(1,lista.size(),0);
    }
}
