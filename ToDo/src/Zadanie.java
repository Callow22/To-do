
public class Zadanie extends AbstractZadanie implements ZadanieInterface {
    static int id = 0;
    private int id_zadania;
    private String nazwa_zadania;
//    private double cena_zadania;
    private String kategoria;

  //  public Zadanie(String nazwa, double cena) {}
    public Zadanie(String nazwa, String kategoria) {
        id_zadania = id;
        nazwa_zadania = nazwa;
 //       cena_zadania = cena;
        this.kategoria = kategoria;
        id++;
    }

    public int getID() {
        return id_zadania;
    }

    public String getNazwa() {
        return  nazwa_zadania;
    }

 //   public double getCena() {
 //       return cena_zadania;
 //   }


    @Override
    public String getKategoria() {
        return kategoria;
    }

 //   @Override
 //   public void edytuj(String nazwa) {
 //       this. nazwa_zadania = nazwa;
 //       this.cena_zadania = cena;
 //   }


    @Override
    public boolean isNil() {
        return false;
    }
}
