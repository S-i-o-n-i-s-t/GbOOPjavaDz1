import java.util.Iterator;

public class Koffe extends HotDrink implements Name, Iterator<String> {
    @Override
    public String clas() {
        return "Кофе";
    }

    public Koffe(String name, int cost, int temperature) {
        super(name, cost, temperature);
        this.clas();
    }

    @Override
    public String toString() {
        return String.format("$s Наименование - %s. Подается при температуре = %d Цена = %d.",clas(),name,  temperature, cost);
    }
    int item;
    @Override
    public boolean hasNext() {
        return item++ < 4;
    }

    @Override
    public String next() {
        switch (item) {
            case 1:
                return String.format("Напиток - %s", clas());
            case 2:
                return String.format("Наименование - %s", name);
            case 3:
                return String.format("Подается при температуре = %d", temperature);
            case 4:
                return String.format("Цена = %d", cost);
        }
        return null;
    }
}
