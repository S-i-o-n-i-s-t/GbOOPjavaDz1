import java.util.Iterator;

public abstract class ALaptop implements Iterator<Object> { //Ноутбук
    protected int quantity;
    protected int cost;
    protected int monitorDiameter;

    public ALaptop(int cost, int monitorDiameter, int diameter) {
        this.cost = cost;
        this.monitorDiameter = monitorDiameter;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getCost() {
        return cost;
    }

    int index;

    @Override
    public boolean hasNext() {
        return index ++ <3;
    }

    @Override
    public String next() {
        return null;
    }


    //public ALaptop(int quantity, int cost, int monitorDiameter) {
    //    this.quantity = quantity;
    //    this.cost = cost;
    //    this.monitorDiameter = monitorDiameter;
    //}
}
