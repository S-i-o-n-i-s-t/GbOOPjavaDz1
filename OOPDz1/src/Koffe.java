public class Koffe extends HotDrink implements Name{
    @Override
    public String clas() {
        return "Кофе";
    }

    public Koffe(String name, int cost, int temperature) {
        super(name, cost, temperature);
        this.clas();
    }

    @Override
    public String toString() {
        return String.format("$s Наименование - %s. Цена = %d. Подается при температуре = %d ",clas(),name, cost, temperature);
    }
}
