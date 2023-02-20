import java.util.Iterator;

public class microsoft extends ALaptop implements Firm, Iterator<String> {

    @Override
    public String firm() {
        return "microsoft";
    }



    public microsoft(int cost, int monitorDiameter) {
        super(cost, monitorDiameter);
        this.firm();

    }

    @Override
    public int NumAlpatop() {
        return 2;
    }

    @Override
    public String toString() {
        return String.format("Фирма - %s Cтоимость = %d Диаметр монитора = %d",firm() ,cost, monitorDiameter);
    }


    int item;

    @Override
    public boolean hasNext() {
        return item ++ <3;
    }

    @Override
    public String next() {
        switch (item){
                case 1:
                    return String.format("Название фирмы %s",item);
                case 2:
                    return String.format("Cтоимость %d",cost);
                case 3:
                    return String.format("Диаметр монитора %d",monitorDiameter);
        };
        return null;
    }
}
