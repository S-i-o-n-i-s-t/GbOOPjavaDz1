public class ForeignCar extends Auto implements Manufacturer{
    public ForeignCar(String marka, String collor, int numer, int dateCreation) {
        super(marka, collor, numer, dateCreation);
    }

    @Override
    public String manufacturer() {
        return "Иномарка";
    }
    @Override
    public String toString() {
        return String.format("Страна производитель %s Марка - %s. Цвет - %s. Номер - %d. Год выпуска - %d",manufacturer() , marka, collor, numer, dateCreation);
    }
}
