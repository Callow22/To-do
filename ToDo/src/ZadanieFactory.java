public class ZadanieFactory {
    public ZadanieInterface getType(boolean isNil, String nazwa, double cena, String kategoria) {

        if(isNil == false) {
            return new Zadanie(nazwa, cena, kategoria);
        }
        else if(isNil == true) {
            return new NullZadanie();
        }

        return null;
    }
}
