import java.util.ArrayList;
import java.util.List;
public class VendingtMachine {

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

}
