import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ParkTaxi<T> implements Iterator<T> {
    private List<T> parkTaxi = new ArrayList<>();
    public void addAuto(T auto){
        parkTaxi.add(auto);
    }

    public List<T> getParkTaxi() {
        return parkTaxi;
    }



    int item;
    @Override
    public boolean hasNext() {
        return item < parkTaxi.size();
    }

    @Override
    public T next() {
        return parkTaxi.get(item++);
    }
}
