package Model;

public class Moped extends Transport implements Consumables{
    //public Moped() {
    //}
    @Override
    public int expensesTO() {
        return 2500;
    }
    public int expensesFuel() {
        return super.expensesFuel(50);
    }
    @Override
    public Transport numTransport(int num){
        super.num = num;
        super.name = "Мопед";
        super.maxSpeed = 80;
        super.quantityTransport++;
        return this;
    }
    @Override
    public String toString() {
        return String.format("%s Всего ТС = %d. Расходы на ТО %d. Расход топлива - %d. Максимальная скорость - %d. Номер транспорта %d", name, quantityTransport, expensesTO(),expensesFuel(), maxSpeed, num);
    }
}
