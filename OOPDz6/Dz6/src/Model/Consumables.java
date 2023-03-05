package Model;

public interface Consumables {
    int expensesTO();
    Transport numTransport(int num);

    default int expensesFuel(int num) {
        return num;
    }
}
