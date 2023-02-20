public class Produkt implements Comparable<Produkt>{
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

    @Override
    public String toString() {
        return String.format("Наименование - %s. Цена = %d " ,name, cost);
    }

    @Override
    public int compareTo(Produkt o) {
        return Integer.compare(this.cost, o.cost);
        //        if (this.cost > o.cost){
//            return 1;
//        } else if (this.cost < o.cost) {
//            return -1;
//        }
//        else {
//            return 0;}
    }
}
