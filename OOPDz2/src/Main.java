import java.util.Collections;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        warehouse.addWarehouse(new Sony(30_000, 24))
                .addWarehouse(new Sony(28_899,15))
                .addWarehouse(new microsoft(40_321, 26));





        System.out.println(warehouse.getaLaptops());

        System.out.println("Ваш выбор");
        warehouse.getAlaptop(20_000);

        System.out.println("-------------------------");
        warehouse.deleteWarehouse(20_000);

        Iterator<ALaptop> iter = warehouse.aLaptops.iterator();
        while (iter.hasNext()){
           System.out.println(iter.next());
        }

        Sony sony = new Sony(14_243, 10);
        Iterator<String> iter2 = sony;
        while (iter2.hasNext()){
            System.out.println(iter2.next());
        }

        System.out.println("-------------------------");

        microsoft micro = new microsoft( 2_234,23);

        Iterator<String> iteratorMicro = micro;
        while (iteratorMicro.hasNext()){
            System.out.println(iteratorMicro.next());
        }
























        NumAlpatop numAlpatop = new NumAlpatop() {
            @Override
            public void numAlpatop() {
                System.out.println("Привет лекция!");
            }
        };
        numAlpatop.numAlpatop();





    }
}