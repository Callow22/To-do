public class NullZadanie extends AbstractZadanie implements ZadanieInterface {

    public NullZadanie() {
    }

    @Override
    public boolean isNil() {
        return true;
    }

    @Override
    public String getNazwa() {
        return "OBJECT IS NULL";
    }

    @Override
    public int getID() {
        return -1;
    }

    @Override
    public double getCena() {
        return -1.0;
    }

    @Override
    public String getKategoria() {
        return "OBJECT IS NULL";
    }

    @Override
    public void edytuj(String nazwa, double cena) {
        this.nazwa_zadania = nazwa;
        this.cena_zadania = cena;
    }
}
