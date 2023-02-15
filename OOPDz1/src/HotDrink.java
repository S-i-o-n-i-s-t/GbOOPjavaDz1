
// 1 Создать наследника реализованного класса ГорячийНапиток с дополнительным полем int температура.

public class HotDrink extends Produkt{
    protected int temperature;

    public HotDrink(String name, int cost, int temperature) {
        super(name, cost);
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return String.format("Наименование - %s. Цена = %d. Подается при температуре = %d ",name, cost, temperature);
    }

}
