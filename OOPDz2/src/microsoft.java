public class microsoft extends ALaptop implements Firm{

    @Override
    public String firm() {
        return "microsoft";
    }



    public microsoft(int cost, int monitorDiameter) {
        super(cost, monitorDiameter, monitorDiameter);
        this.firm();

    }

    @Override
    public String toString() {
        return String.format("Фирма - %s Cтоимость = %d Диаметр монитора = %d",firm() ,cost, monitorDiameter);
    }
}
