public class Moped extends Transport implements NameTransport{

    public Moped(int speed, int fuelConsumption) {
        super.speed = speed;
        super.fuelConsumption = fuelConsumption;
    }

    public Moped(int speed, int fuelConsumption, Worker worker) {
        super.speed = speed;
        super.fuelConsumption = fuelConsumption;
        super.worker = worker;
    }

    @Override
    public String name() {
        return "Мопед";
    }

    @Override
    public String toString() {
        return String.format("Транспорт - %s Скорость транспорта - %d. Затраты на работника - %d Работник - %s",name(), speed, fuelConsumption,worker);
    }
}
