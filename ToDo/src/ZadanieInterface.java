public interface ZadanieInterface {
    public boolean isNil();
    public int getID();
    public String getNazwa();
    public double getCena();
    public String getKategoria();
    public void edytuj(String nazwa, double cena);
}
