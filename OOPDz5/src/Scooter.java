public class Scooter extends Transport implements NameTransport{

    public Scooter(int speed, int fuelConsumption) {
        super.speed = speed;
        super.fuelConsumption = fuelConsumption;

    }
    @Override
    public String name() {
        return "Самокат";
    }

    @Override
    public String toString() {
        return String.format("Транспорт - %s Скорость транспорта - %d. Затраны на работника %d",name(), speed, fuelConsumption);
    }
}
