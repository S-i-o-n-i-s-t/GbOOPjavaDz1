import java.util.ArrayList;
import java.util.List;

public class Warehouse{ // Склад
    protected List<ALaptop> aLaptops = new ArrayList<>();
    public Warehouse addWarehouse(ALaptop aLaptop) {
        aLaptops.add(aLaptop);
        return this;
    }

    public void deleteWarehouse(int actor) {
        for (ALaptop item : aLaptops) {
            if (actor == item.getCost()) {
                System.out.println(item);
            }
        }
    }
    public List<ALaptop> getaLaptops () {
        return aLaptops;
    }

}
