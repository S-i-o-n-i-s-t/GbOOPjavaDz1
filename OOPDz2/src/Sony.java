import java.util.Iterator;
import java.util.function.Consumer;

public class Sony extends ALaptop implements Firm, Iterator<String> {


    @Override
    public String firm() {
        return "Sony";
    }


    public Sony(int cost, int monitorDiameter) {
        super(cost, monitorDiameter);
        this.firm();
    }

    @Override
    public int NumAlpatop() {
        return 1;
    }

    @Override
    public String toString() {
        return String.format("Фирма - %s Cтоимость = %d Диаметр монитора = %d",firm() ,cost, monitorDiameter);
    }


    // Итератор

    private int index;
    @Override
    public boolean hasNext() {
        return index++ <3;
    }
    @Override
    public String next() {
        switch (index){
            case 1:
                return String.format("Название фирмы %s", firm());
            case 2:
                return String.format("Стоимость изделия %d", cost);
            case 3:
                return String.format("Диаметр монитора %d", monitorDiameter);
        }
        return null;
    }
}
