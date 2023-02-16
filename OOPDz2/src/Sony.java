public class Sony extends ALaptop implements Firm{


    @Override
    public String firm() {
        return "Sony";
    }



    public Sony(int cost, int monitorDiameter) {
        super(cost, monitorDiameter, monitorDiameter);
        this.firm();

    }



    @Override
    public String toString() {
        return String.format("Фирма - %s Cтоимость = %d Диаметр монитора = %d",firm() ,cost, monitorDiameter);
    }

}
