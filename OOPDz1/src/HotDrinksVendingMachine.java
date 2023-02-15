import java.util.List;

// 2 Создать класс ГорячихНапитковАвтомат реализующий интерфейс ТорговыйАвтомат
public class HotDrinksVendingMachine implements TradingAutomat{
    Produkt drink = new Produkt();
    private String name = scanner.next();

    public void hotDrinksVend(List<Produkt> produkts){
        int item = scanner.nextInt();
        drink = (produkts.get(item));
    }

    public String getName() {
        return name;
    }

    public String getDrink() {
        return String.format("Ваш выбор: %s",drink);
    }
}
