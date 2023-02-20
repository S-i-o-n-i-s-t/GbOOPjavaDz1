import java.util.Comparator;

public class ProduktComporator implements Comparator<Produkt> {
    @Override
    public int compare(Produkt o1, Produkt o2) {
        return Integer.compare(o1.cost, o2.cost);
    }
}
