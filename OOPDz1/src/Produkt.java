public class Produkt {
    protected String name;
    protected int cost;
    public Produkt(String name, int cost) {
        this.name = name;
        this.cost = cost;
    }

    public Produkt(){}

    public String getName() {
        return name;
    }

    public int getCost() {
        return cost;
    }

    @Override
    public String toString() {
        return String.format("Наименование - %s. Цена = %d " ,name, cost);
    }
}
