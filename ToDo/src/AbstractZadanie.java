public abstract class AbstractZadanie implements ZadanieInterface {
    protected int id_zadania;
    protected String nazwa_zadania;
    protected double cena_zadania;
    protected String kategoria;

    public abstract boolean isNil();

    public abstract String getNazwa();
    public abstract int getID();
    public abstract double getCena();
    public abstract String getKategoria();
    public abstract void edytuj(String nazwa, double cena);

}
