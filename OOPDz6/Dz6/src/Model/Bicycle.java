package Model;

public class Bicycle extends Transport implements Consumables{
    @Override
    public int expensesTO() {
        return 500;
    }

    @Override
    public Transport numTransport(int num) {
        super.num = num;
        super.name = "Велосипед";
        super.maxSpeed = 30;
        super.quantityTransport++;
        return this;
    }
    @Override
    public String toString() {
        return String.format("%s Всего ТС = %d. Расходы на ТО %d. Максимальная скорость - %d. Номер транспорта %d", name, quantityTransport, expensesTO(), maxSpeed, num);
    }

}
