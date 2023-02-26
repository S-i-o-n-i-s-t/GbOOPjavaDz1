public class RussCar extends Auto implements Manufacturer{
    public RussCar(String marka, String collor, int numer, int dateCreation) {
        super(marka, collor, numer, dateCreation);
    }

    @Override
    public String manufacturer() {
        return "Russiya";
    }

    @Override
    public String toString() {
        return String.format("Страна производитель %s Марка - %s. Цвет - %s. Номер - %d. Год выпуска - %d",manufacturer() , marka, collor, numer, dateCreation);
    }
}
