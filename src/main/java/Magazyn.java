import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Magazyn {


    private List<Pracownik> pracownikList = new ArrayList<Pracownik>();
    private List<Produkt> produktList = new ArrayList<Produkt>();


    public void dodajProdukt(Produkt produkt) {
        produktList.add(produkt);


    }

    public void usunProdukt(String nazwa) {
        for (Produkt p : produktList) {
            if (p.getName().equalsIgnoreCase(nazwa)) {
                produktList.remove(p);
                break;
            }
        }

    }

}