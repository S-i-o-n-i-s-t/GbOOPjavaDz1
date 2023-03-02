public class Worker {
    private String name;
    private int salary;

    public Worker(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return String.format("Имя работника - %s. Зарплата на 100км пути $d", name, salary);
    }
}
