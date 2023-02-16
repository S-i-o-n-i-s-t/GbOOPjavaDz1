import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        warehouse.addWarehouse(new Sony(20_000, 14))
                .addWarehouse(new Sony(28_899,15))
                .addWarehouse(new microsoft(40_321, 22));
        System.out.println(warehouse.getaLaptops());
        warehouse.deleteWarehouse(20_000);
        Market market = new Market();
        market.Market();





    }
}