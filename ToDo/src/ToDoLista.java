
import java.util.ArrayList;
import java.util.List;

public class ToDoLista {
    private List<ZadanieInterface> listaZadan = new ArrayList<>();
    private static ToDoLista instance;
    static int size = 0;


    private ToDoLista() {
    }

    public static ToDoLista getInstance() {
        if (instance == null) {
            instance = new ToDoLista();
        }

        return instance;
    }

    public void dodajDoListy(ZadanieInterface zadanie) {
        instance.listaZadan.add(zadanie);
        size++;
    }

    public int size() {
        return size;
    }

    public List<ZadanieInterface> czytajListe() {
        return instance.listaZadan;
    }



    public void usunZListy(int id) {
        for (int i = 0; i < instance.listaZadan.size(); i++) {
            if (id == instance.listaZadan.get(i).getID()) {
                instance.listaZadan.remove(instance.listaZadan.get(i).getID());
                size--;
            }
        }
    }
}
