import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Warehouse{ // Склад
    protected List<ALaptop> aLaptops = new ArrayList<>();
    public Warehouse addWarehouse(ALaptop aLaptop) {
        aLaptops.add(aLaptop);
        return this;
    }
    public void getAlaptop(int actor) {
        for (ALaptop item : aLaptops) {
            if (actor == item.getCost()) {
                System.out.println(item);
            }
        }
    }
    public void deleteWarehouse(int coin){
        Iterator<ALaptop> iter = aLaptops.iterator();
        while (iter.hasNext()){
            if (iter.next().getCost() == coin) {
                iter.remove();
            }
        }
    }
    public List<ALaptop> getaLaptops () {
        return aLaptops;
    }
}
