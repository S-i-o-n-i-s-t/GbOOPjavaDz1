public class Tea extends HotDrink implements Name{
    @Override
    public String clas() {
        return "Чай";
    }
    public Tea(String name, int cost, int temperature) {
        super(name, cost, temperature);
        this.clas();
    }

    @Override
    public String toString() {
        return String.format("%s Наименование - %s. Цена = %d. Подается при температуре = %d ",clas() ,name, cost, temperature);
    }

}
