import java.util.Iterator;

public abstract class ALaptop{ //Ноутбук
    protected int cost;
    protected int monitorDiameter;

    public ALaptop(int cost, int monitorDiameter) {
        this.cost = cost;
        this.monitorDiameter = monitorDiameter;
    }
//
//    public void setQuantity(int quantity) {
//        this.quantity = quantity;
//    }
//
    public int getCost() {
        return cost;
    }
    public abstract int NumAlpatop();
}
