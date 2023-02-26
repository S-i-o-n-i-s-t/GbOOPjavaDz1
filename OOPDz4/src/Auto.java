import java.util.Comparator;
import java.util.Iterator;

public class Auto implements Comparable<Auto>{
    protected String marka;
    protected String collor;
    protected int numer;
    protected int dateCreation;

    public Auto(String marka, String collor, int numer, int dateCreation) {
        this.marka = marka;
        this.collor = collor;
        this.numer = numer;
        this.dateCreation = dateCreation;
    }

    @Override
    public String toString() {
        return String.format("Марка - %s. Цвет - %s. Номер - %d. Год выпуска - %d", marka, collor, numer, dateCreation);
    }

    @Override
    public int compareTo(Auto o) {
        return Integer.compare(this.dateCreation, o.dateCreation);
    }
}
