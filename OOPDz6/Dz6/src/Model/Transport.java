package Model;

public abstract class Transport implements Consumables{
    protected int num;
    protected String name;
    protected int maxSpeed;
    protected static int quantityTransport = 0;

    @Override
    public int expensesTO() {
        return 0;
    }

    @Override
    public Transport numTransport(int num) {
        return null;
    }

}
