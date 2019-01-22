
public class Zadanie extends AbstractZadanie implements ZadanieInterface {
    static int id = 0;
    private int id_zadania;
    private String nazwa_zadania;
    private String kategoria;

    public Zadanie(String nazwa, String kategoria) {
        id_zadania = id;
        nazwa_zadania = nazwa;
        this.kategoria = kategoria;
        id++;
    }

    public int getID() {
        return id_zadania;
    }

    public String getNazwa() {
        return  nazwa_zadania;
    }



    @Override
    public String getKategoria() {
        return kategoria;
    }


    @Override
    public boolean isNil() {
        return false;
    }
}
