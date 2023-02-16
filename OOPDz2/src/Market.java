import java.util.ArrayList;
import java.util.List;

public class Market implements Service, Konsol{
    {
        System.out.println("Здравствуйте, как ваше имя");
    }
    private String klient= skan.next();;
    private List<String> klients = new ArrayList<>();

   // @Override
    public void clientRecord() {
        int prov = 0;
        for (String item: klients) {
            if (item.equals(klient)){
                prov +=1;
            }
        }
        if (prov == 0) {
            klients.add(klient);
        }
    }

    @Override
    public void customerChoice() {
        System.out.println("Сделайте свой заказ");
    }

    @Override
    public void purchaseHistory() {
        System.out.println("Досвидания");
    }
    public void Market(){
        clientRecord();
        customerChoice();
        purchaseHistory();
    }

}
