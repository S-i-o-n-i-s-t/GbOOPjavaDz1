import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class VendingtMachine implements Iterator<Produkt>{

    protected List<Produkt> produkts = new ArrayList<>();

    public VendingtMachine tragingAutomatList(Produkt produkt){
        produkts.add(produkt);
        return this;
    }
    public List<Produkt> getProdukts() {
        return produkts;
    }

    public void getProduct(String name){
        for (Produkt item: produkts) {
            if(item.getName().equals(name)){
                System.out.println(item);
            }
        }
    }

    int item = -1;
    @Override
    public boolean hasNext() {
        return item++ < produkts.size()-1;
    }

    @Override
    public Produkt next() {

        return produkts.get(item);
    }

}
